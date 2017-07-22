
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KostManagement.Controller;

import KostManagement.KoneksiDB;
import com.sun.org.glassfish.external.arc.Stability;
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
        
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement)conn.createStatement();
            sql = "SELECT kd_kamar,luas_kamar,harga_bulanan FROM t_kamar ORDER BY kd_kamar ASC"; 
            ResultSet result = stt.executeQuery(sql);
            while (result.next()) {
                model.addRow(new Object[] {
                    result.getString("kd_kamar"),
                    result.getString("luas_kamar"),
                    result.getString("harga_bulanan")
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
    
    public int ubahData(String kodeKamar, String luasKamar, int biayaKamar) {
        int result = 0;
        
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement)conn.createStatement();
            sql = "UPDATE FROM t_kamar SET luas_kamar = '"+luasKamar+"', harga_bulanan= '"+biayaKamar+"' WHERE kd_kamar = '"+kodeKamar+"'";
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
}
