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
public class PelangganController {
    private Connection conn;
    private String sql;
            
    public DefaultTableModel tampilData() {
        DefaultTableModel model = new DefaultTableModel();
        
        return model;
    }
    
    public int tambahData(String kodePelanggan, String nama, char jk, String alamat, String pekerjaan, String tglSewa) {
        int result = 0;
        
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement) conn.createStatement();
            sql = "INSERT INTO t_pelanggan VALUES('"+kodePelanggan+"', '"+nama+"', '"+jk+"', '"+alamat+"', '"+pekerjaan+"', '"+tglSewa+"',)";
            result = stt.executeUpdate(sql);                    
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
    
    public int ubahData(String kodePelanggan, String nama, char jk, String alamat, String pekerjaan, String tgl_sewa) {
        int result = 0;
        
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement) conn.createStatement();
            sql = "UPDATE FROM t_pelangga SET nama_lengkap='"+nama+"', jenis_kelamin='"+jk+"' alamat_asal='"+alamat+"', pekerjaan='"+pekerjaan+"', tgl_sewa='"+tgl_sewa+"' "
                    + "WHERE kd_pelanggan='"+kodePelanggan+"'";
            result = stt.executeUpdate(sql);                    
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
    
    public int hapusData(String kodePelanggan) {
        int result = 0;
        
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement) conn.createStatement();
            sql = "DELETE FROM t_pelanggan WHERE kd_pelanggan='"+kodePelanggan+"' ";
            result = stt.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
}
