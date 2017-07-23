/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KostManagement.Model;

import KostManagement.KoneksiDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author linggap
 */
public class TransaksiModel {
    private Connection conn;
    private String sql;
    
    public String setTanggalTerakhir() {
        String tgl = "";
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement)conn.createStatement();
            sql = "SELECT MAX(tgl_bayar) FROM t_transaksi";
            ResultSet result = stt.executeQuery(sql);
            if (result.next()) {
                tgl = result.getString("MAX(tgl_bayar)");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return tgl;
    }
    
}
