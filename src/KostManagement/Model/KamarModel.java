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
import javax.swing.JTextField;

/**
 *
 * @author linggap
 */
public class KamarModel {
    private String kodeKamar;
    
    public String setKodeKamar() {
        try {
            KoneksiDB koneksi = new KoneksiDB();
            Connection conn = koneksi.getKoneksi();
            Statement stt = (Statement) conn.createStatement();
            String sql = "SELECT kd_kamar FROM t_kamar ORDER BY kd_kamar DESC LIMIT 1 "; // ambil data pertama secara desc
            ResultSet result = stt.executeQuery(sql); 
            while (result.next()) {                
                String kd_kamar = result.getString("kd_kamar"); 
                int tempAngka = Integer.parseInt(kd_kamar.substring(2, kd_kamar.length()));
                tempAngka++;
                kodeKamar = kd_kamar.substring(0,2) +(tempAngka < 10 ? "0" : "") + tempAngka;               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return kodeKamar;
    }
    
    public String[] setNotifikasi() {
         String[] ket = new String[100];
        int i = 0;
        try {
            KoneksiDB koneksi = new KoneksiDB();
            Connection conn = koneksi.getKoneksi();
            Statement stt = (Statement) conn.createStatement();
            String sql = "SELECT * FROM t_kamar WHERE tgl_habis BETWEEN NOW() AND DATE_ADD(NOW(), INTERVAL 7 DAY)";
            ResultSet result = stt.executeQuery(sql);
            while (result.next()) {                
                String kdKamar = result.getString("kd_kamar");
                ket[i] = kdKamar;
                i++;
            }    
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return ket;
    }
    
}
