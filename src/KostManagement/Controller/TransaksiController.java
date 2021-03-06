/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KostManagement.Controller;

import KostManagement.KoneksiDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author linggap
 */
public class TransaksiController {
    private Connection conn;
    private String sql;
    
    
    public DefaultTableModel tampilSemuaData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Transaksi");
        model.addColumn("Tanggal");
        model.addColumn("Nama Pelanggan");
        model.addColumn("Total");
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement)conn.createStatement();
            sql = "SELECT `t_transaksi`.`kd_transaksi` , `t_transaksi`.`tgl_bayar` , `t_pelanggan`.`nama_lengkap` , `det_transaksi`.`total` "
                    + "FROM `det_transaksi` "
                    + "INNER JOIN `t_transaksi` ON (`det_transaksi`.`kd_transaksi` = `t_transaksi`.`kd_transaksi`) "
                    + "INNER JOIN `t_pelanggan` ON (`det_transaksi`.`kd_pelanggan` = `t_pelanggan`.`kd_pelanggan`)"
                    + "ORDER BY kd_transaksi DESC"; 
            ResultSet result = stt.executeQuery(sql);
            while (result.next()) {
                model.addRow(new Object[] {
                    result.getString(1),
                    result.getString(2),
                    result.getString(3),
                    "Rp. "+ result.getString(4)
                });
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return model;
    }
    
    public DefaultTableModel tampilDataTerakhir() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Transaksi");
        model.addColumn("Tanggal");
        model.addColumn("Nama Pelanggan");
        model.addColumn("Total");
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement)conn.createStatement();
            sql = "SELECT `t_transaksi`.`kd_transaksi` , `t_transaksi`.`tgl_bayar` , `t_pelanggan`.`nama_lengkap` , `det_transaksi`.`total` "
                    + "FROM `det_transaksi` "
                    + "INNER JOIN `t_transaksi` ON (`det_transaksi`.`kd_transaksi` = `t_transaksi`.`kd_transaksi`) "
                    + "INNER JOIN `t_pelanggan` ON (`det_transaksi`.`kd_pelanggan` = `t_pelanggan`.`kd_pelanggan`) "
                    + "WHERE t_transaksi.tgl_bayar = (SELECT MAX(tgl_bayar) FROM t_transaksi)"
                    + "ORDER BY kd_transaksi DESC"; 
            ResultSet result = stt.executeQuery(sql);
            while (result.next()) {
                model.addRow(new Object[] {
                    result.getString(1),
                    result.getString(2),
                    result.getString(3),
                    "Rp. "+ result.getString(4)
                });
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return model;
    }
    
    public int cariKodeTransaksi(String kodeTransaksi) {
        int result = 0;
        
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement) conn.createStatement();
            sql = "SELECT `t_transaksi`.`kd_transaksi` , `t_transaksi`.`tgl_bayar` , `t_pelanggan`.`nama_lengkap` , `det_transaksi`.`total` "
                    + "FROM `det_transaksi` "
                    + "INNER JOIN `t_transaksi` ON (`det_transaksi`.`kd_transaksi` = `t_transaksi`.`kd_transaksi`)"
                    + "INNER JOIN `t_pelanggan` ON (`det_transaksi`.`kd_pelanggan` = `t_pelanggan`.`kd_pelanggan`)"
                    + "WHERE t_transaksi.kd_transaksi LIKE '"+kodeTransaksi+"'%"
                    + "ORDER BY kd_transaksi DESC";
            result = stt.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        return result;
    }
}
