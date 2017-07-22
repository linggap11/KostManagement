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
public class FasilitasController {
    private Connection conn;
    private String sql;
    
    public DefaultTableModel tampilData() {
        DefaultTableModel model = new DefaultTableModel();
        
        return model;
    }
    
    public int tambahData(String kodeFasilitas, String nama, String biayaTambahan, int stok) {
        int result = 0;
        
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement) conn.createStatement();
            sql = "INSERT INTO t_fasilitas VALUES('"+kodeFasilitas+"', '"+nama+", '"+biayaTambahan+"', '"+stok+"')";        
            result = stt.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
    
    public int ubahData(String kodeFasilitas, String nama, int biayaTambahan, int stok) {
        int result = 0;
        
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement)conn.createStatement();
            sql = "UPDATE FROM t_fasilitas SET nama = '"+nama+"', biaya_tambahan = '"+biayaTambahan+"', stok = '"+stok+"'"
                    + "WHERE kd_fasilitas = '"+kodeFasilitas+"'";
            result = stt.executeUpdate(sql); 
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
    
    public int hapusData(String kodeFasilitas) {
        int result = 0;
        
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement)conn.createStatement();
            sql = "DELETE FROM t_fasilitas WHERE kd_fasilitas = '"+kodeFasilitas+"' ";
            result = stt.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
    
    
    
}
