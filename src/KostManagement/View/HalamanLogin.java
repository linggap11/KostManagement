/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KostManagement.View;

import KostManagement.KoneksiDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author linggap
 */
public class HalamanLogin extends javax.swing.JFrame {

    /**
     * Creates new form Home41
     */
    public HalamanLogin() {
        initComponents();
        loader.hide();
        txtUsername.requestFocus();  
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLogin = new javax.swing.JPanel();
        panelKiri = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logokostan = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        panelKanan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        jCheckBoxTampilPassword = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        loader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainLogin.setBackground(new java.awt.Color(36, 47, 65));
        mainLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelKiri.setBackground(new java.awt.Color(0, 150, 136));
        panelKiri.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelKiriMouseDragged(evt);
            }
        });
        panelKiri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelKiriMousePressed(evt);
            }
        });
        panelKiri.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kost Management ");
        panelKiri.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, 20));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        panelKiri.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        panelKiri.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 220, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        panelKiri.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 270, 10));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        panelKiri.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jPanel9.setBackground(new java.awt.Color(0, 150, 136));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Transaksi Terakhir Pada");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));
        jPanel9.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, 10));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 58, 210, 20));

        jLabel11.setFont(new java.awt.Font("Hobo Std", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("KOST Ibu Tuti");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 170, -1));

        logokostan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataGambar/icons8_Home_52px_3.png"))); // NOI18N
        jPanel9.add(logokostan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, 50));
        jPanel9.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 120, 20));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Jl. Kenangan No. 29 Bandung Tlp (022) - 2126453 ");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        panelKiri.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 400, 130));

        mainLogin.add(panelKiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 550));

        panelKanan.setBackground(new java.awt.Color(36, 47, 65));
        panelKanan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelKananMouseDragged(evt);
            }
        });
        panelKanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelKananMousePressed(evt);
            }
        });
        panelKanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Login Admin");
        panelKanan.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 82, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("USERNAME");
        panelKanan.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 152, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("PASSWORD");
        panelKanan.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 222, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        panelKanan.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 212, 270, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        panelKanan.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 282, 270, 10));

        txtPassword.setBackground(new java.awt.Color(36, 47, 65));
        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        panelKanan.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 252, 270, 30));

        txtUsername.setBackground(new java.awt.Color(36, 47, 65));
        txtUsername.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setToolTipText("Username");
        txtUsername.setBorder(null);
        txtUsername.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        panelKanan.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 182, 270, 30));

        jCheckBoxTampilPassword.setBackground(new java.awt.Color(36, 47, 65));
        jCheckBoxTampilPassword.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxTampilPassword.setText("Tampilkan Password");
        jCheckBoxTampilPassword.setBorder(null);
        jCheckBoxTampilPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTampilPasswordActionPerformed(evt);
            }
        });
        panelKanan.add(jCheckBoxTampilPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 298, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 150, 136));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setBackground(new java.awt.Color(204, 204, 204));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(204, 204, 204));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        jPanel3.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        panelKanan.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 427, -1, -1));

        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataGambar/icons8-Delete-16.png"))); // NOI18N
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        panelKanan.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 20, -1));

        mainLogin.add(panelKanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 420, 550));

        loader.setBackground(new java.awt.Color(237, 233, 223));
        loader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataGambar/loading.gif"))); // NOI18N
        loader.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 180));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(52, 73, 94));
        jLabel6.setText("LOGGIN IN . . .");
        loader.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        mainLogin.add(loader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        getContentPane().add(mainLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 842, 551));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxTampilPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTampilPasswordActionPerformed
        if (jCheckBoxTampilPassword.isSelected()) {
            txtPassword.setEchoChar((char)0);
        } else {
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxTampilPasswordActionPerformed

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordFocusGained

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
        Connection conn;
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        
        try {
            KoneksiDB koneksi = new KoneksiDB();
            conn = koneksi.getKoneksi();
            Statement stt = (Statement) conn.createStatement();
            String sql ="SELECT `username`, `password` FROM `t_pemilik` WHERE username='"+username+"' AND password='"+password+"' ";
            ResultSet result = stt.executeQuery(sql);
            if (result.next()) {
                loader.show();
                panelKiri.hide();
                panelKanan.hide();
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        dispose();
                        new HalamanUtama().setVisible(true);
                    }
                }, 1000*3);
            } else {
                JOptionPane.showMessageDialog(null, "Username atau Password salah !");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed
    
    int xx, xy, a, b; 
    private void panelKiriMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelKiriMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_panelKiriMouseDragged

    private void panelKiriMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelKiriMousePressed
         xx = evt.getX();
         xy = evt.getY();
    }//GEN-LAST:event_panelKiriMousePressed

    private void panelKananMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelKananMousePressed
         a = evt.getX() + 418;
         b = evt.getY();
    }//GEN-LAST:event_panelKananMousePressed

    private void panelKananMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelKananMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - a, y - b);
    }//GEN-LAST:event_panelKananMouseDragged

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    
    int xMouse, yMouse;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HalamanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JCheckBox jCheckBoxTampilPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel loader;
    private javax.swing.JLabel logokostan;
    private javax.swing.JPanel mainLogin;
    private javax.swing.JPanel panelKanan;
    private javax.swing.JPanel panelKiri;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
