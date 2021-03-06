
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
public class KamarController {
    private Connection conn;
    private String sql;
    
    
    public DefaultTableModel tampilData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Kamar");
        model.addColumn("Luas Kamar");
        model.addColumn("Biaya Bulanan");
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement)conn.createStatement();
            sql = "SELECT `kd_kamar`,`luas_kamar`,`harga_bulanan` FROM `t_kamar` ORDER BY kd_kamar ASC"; 
            ResultSet result = stt.executeQuery(sql);
            while (result.next()) {
                model.addRow(new Object[] {
                    result.getString(1),
                    result.getString(2),
                    result.getString(3)
                });
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return model;
    }
    
    public int tambahData(String kodeKamar, String luasKamar, int biayaKamar, String kodePemilik) {
        int result = 0;
        
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement)conn.createStatement();
            sql = "INSERT INTO t_kamar VALUES('"+kodeKamar+"', '"+luasKamar+"', '"+biayaKamar+"','"+kodePemilik+"',null)";
            result = stt.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        return result;
    }
    
    public int ubahData(String kodeKamar, String luasKamar, String biayaKamar) {
        int result = 0;
        
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement)conn.createStatement();
            sql = "UPDATE FROM t_kamar SET kd_kamar = '"+kodeKamar+"',luas_kamar = '"+luasKamar+"', harga_bulanan= '"+biayaKamar+"' WHERE kd_kamar = '"+kodeKamar+"'";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        return result;
    }
    
    public int hapusData(String kodeKamar) {
        int result = 0;
        
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement)conn.createStatement();
            sql = "DELETE FROM t_kamar WHERE kd_kamar = '"+kodeKamar+"' ";
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
    
    public int cariKodeKamar(String kodeKamar) {
        int result = 0;
        
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement) conn.createStatement();
            sql = "SELECT * FROM `t_fasilitas` WHERE `kd_fasilitas` LIKE ='"+kodeKamar+"%' OR ";
            result = stt.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        return result;
    }

    public int ubahData(String kodekam, String luaskamar, String harga, String p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
