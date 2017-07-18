/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KostManagement.Controller;

import KostManagement.KoneksiDB;
import java.sql.Connection;
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
    
    public int ubahData() {
        int result = 0;
        
        return result;
    }
    
    public int hapusData() {
        int result = 0;
        
        return result;
    }
}
