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
import javax.swing.JOptionPane;

/**
 *
 * @author linggap
 */
public class PelangganModel {
    private String kodePelanggan;
    
    public String setKodePelanggan() {
        try {
            KoneksiDB koneksi = new KoneksiDB();
            Connection conn = koneksi.getKoneksi();
            Statement stt = (Statement) conn.createStatement();
            String sql = "SELECT kd_kamar FROM t_pelanggan ORDER BY kd_pekanggan DESC LIMIT 1 "; // ambil data pertama secara desc
            ResultSet result = stt.executeQuery(sql); 
            while (result.next()) {                
                String kd_pelanggan = result.getString("kd_pelanggan"); 
                int tempAngka = Integer.parseInt(kd_pelanggan.substring(3, kd_pelanggan.length()));
                tempAngka++;
                
                if (isBetween(tempAngka, 1, 9)) {
                    kodePelanggan = kd_pelanggan.substring(0,3) + "000" + tempAngka;
                } else if (isBetween(tempAngka, 10, 99)){
                    kodePelanggan = kd_pelanggan.substring(0,3) + "00" + tempAngka;
                } else if (isBetween(tempAngka, 100, 999)) {
                    kodePelanggan = kd_pelanggan.substring(0,3) + "0" + tempAngka;
                } else {
                    kodePelanggan = kd_pelanggan.substring(0,3) + "" + tempAngka;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return kodePelanggan;
    }
    
    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }
}
