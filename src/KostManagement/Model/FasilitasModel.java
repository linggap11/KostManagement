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
public class FasilitasModel {
    private String kodeFasilitas;
    
    public String setKodeKamar() {
        try {
            KoneksiDB koneksi = new KoneksiDB();
            Connection conn = koneksi.getKoneksi();
            Statement stt = (Statement) conn.createStatement();
            String sql = "SELECT kd_kamar FROM t_fasilitas ORDER BY kd_fasilitas DESC LIMIT 1 "; // ambil data pertama secara desc
            ResultSet result = stt.executeQuery(sql); 
            while (result.next()) {                
                String kd_fasilitas = result.getString("kd_fasilitas"); 
                int tempAngka = Integer.parseInt(kd_fasilitas.substring(3, kd_fasilitas.length()));
                tempAngka++;
                kodeFasilitas = kd_fasilitas.substring(0,3) +(tempAngka < 10 ? "0" : "") + tempAngka;               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return kodeFasilitas;
    }
}
