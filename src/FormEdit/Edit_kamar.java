/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormEdit;

import KostManagement.Controller.KamarController;
import KostManagement.View.HalamanUtama;
import javax.swing.JOptionPane;



/**
 *
 * @author Afifp29
 */
public class Edit_kamar extends javax.swing.JFrame  {

    /**
     * Creates new form Edit_kamar
     */
    public Edit_kamar() {
        initComponents();
        HalamanUtama utm = new HalamanUtama();
        edit_kdkamar.setText(String.format(utm.getKodeKamar()));
        //edit_luaskamar.setText(String.format(utm.getluaskamar()));
       // edit_hargabulanan.setText(String.format(utm.getHargaKamar()));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        sidePane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edit_kdkamar = new javax.swing.JTextField();
        edit_luaskamar = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JLabel();
        edit_hargabulanan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(0, 150, 136));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Kamar");
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));
        jPanel9.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 130, 10));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Edit Data");
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        sidePane.setBackground(new java.awt.Color(36, 47, 65));
        sidePane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sidePaneMouseDragged(evt);
            }
        });
        sidePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sidePaneMousePressed(evt);
            }
        });
        sidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kode Kamar  :");
        sidePane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Luas Kamar");
        sidePane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga Bulanan :");
        sidePane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        sidePane.add(edit_kdkamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 100, -1));
        sidePane.add(edit_luaskamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 240, -1));

        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataGambar/icons8_Save_30px.png"))); // NOI18N
        btn_simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpanMouseClicked(evt);
            }
        });
        sidePane.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));
        sidePane.add(edit_hargabulanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DataGambar/icons8_Cancel_40px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        sidePane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 60, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidePane, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidePane, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int xx;
int xy;
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void sidePaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidePaneMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_sidePaneMouseDragged

    private void sidePaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidePaneMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_sidePaneMousePressed

    private void btn_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseClicked
        // TODO add your handling code here:
        String kodekam =  edit_kdkamar.getText();
        String luaskamar =  edit_luaskamar.getText();
        String harga = edit_hargabulanan.getText();
        KamarController kamar = new KamarController();
        kamar.ubahData(kodekam, luaskamar, harga);
    }//GEN-LAST:event_btn_simpanMouseClicked

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
            java.util.logging.Logger.getLogger(Edit_kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Edit_kamar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_simpan;
    private javax.swing.JTextField edit_hargabulanan;
    private javax.swing.JTextField edit_kdkamar;
    private javax.swing.JTextField edit_luaskamar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel sidePane;
    // End of variables declaration//GEN-END:variables

    
}
