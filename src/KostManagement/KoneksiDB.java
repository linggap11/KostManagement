/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KostManagement;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author linggap
 */
public class KoneksiDB {
    public Properties myPanel, myLanguage;
    private String strPanelName;
    private Connection conn;
    
    public String setPanel(String panelName) {
        try {
            myPanel = new Properties();
            myPanel.load(new FileInputStream("lib/database.ini"));
            strPanelName = myPanel.getProperty(panelName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.exit(0);
        }
        return strPanelName;
    }
    
    public Connection getKoneksi() {
        String driver,database,username, password;
        
        driver = this.setPanel("DBDriver");
        database = this.setPanel("DBDatabase");
        username = this.setPanel("DBUsername");
        password = this.setPanel("DBPassword");
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(database, username, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.exit(0);
        }
        return conn;
    }
}
