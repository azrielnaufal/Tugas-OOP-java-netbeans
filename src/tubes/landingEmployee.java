
package tubes;

import connect.connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class landingEmployee extends javax.swing.JFrame {

    public landingEmployee() {
        initComponents();
    }
    public landingEmployee(String nama, String id) {
        initComponents();
        jLabel_nama_lengkap_answer.setText(nama);
        jLabel_id_pegawai_answer.setText(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_goback = new javax.swing.JButton();
        jLabel_selamat_datang = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_nama_lengkap = new javax.swing.JLabel();
        jLabel_id_pegawai = new javax.swing.JLabel();
        jLabel_nama_lengkap_answer = new javax.swing.JLabel();
        jLabel_id_pegawai_answer = new javax.swing.JLabel();
        jButton_nambah_menu = new javax.swing.JButton();
        jButton_hapus_menu = new javax.swing.JButton();
        jButtonpergi_keMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_goback.setText("Go back");
        jButton_goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_gobackActionPerformed(evt);
            }
        });

        jLabel_selamat_datang.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel_selamat_datang.setText("Selamat Datang");

        jLabel_nama_lengkap.setText("Nama Lengkap :");

        jLabel_id_pegawai.setText("id pegawai :");

        jLabel_nama_lengkap_answer.setText("......");

        jLabel_id_pegawai_answer.setText("......");

        jButton_nambah_menu.setText("Nambah Menu");
        jButton_nambah_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nambah_menuActionPerformed(evt);
            }
        });

        jButton_hapus_menu.setText("Hapus Menu");
        jButton_hapus_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hapus_menuActionPerformed(evt);
            }
        });

        jButtonpergi_keMenu.setText("Pergi ke menu");
        jButtonpergi_keMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpergi_keMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel_selamat_datang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton_goback)
                            .addGap(55, 55, 55))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_id_pegawai)
                                    .addComponent(jLabel_nama_lengkap))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_nama_lengkap_answer)
                                    .addComponent(jLabel_id_pegawai_answer)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_hapus_menu)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_nambah_menu)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonpergi_keMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(222, 222, 222))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel_selamat_datang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nama_lengkap)
                    .addComponent(jLabel_nama_lengkap_answer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_id_pegawai)
                    .addComponent(jLabel_id_pegawai_answer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_nambah_menu)
                    .addComponent(jButton_hapus_menu)
                    .addComponent(jButtonpergi_keMenu))
                .addGap(74, 74, 74)
                .addComponent(jButton_goback)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_gobackActionPerformed
        this.dispose();
        loginEmployeeJframe emp = new loginEmployeeJframe();
        emp.setVisible(true);
    }//GEN-LAST:event_jButton_gobackActionPerformed

    private void jButton_nambah_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nambah_menuActionPerformed
        Jframe_nambah_menu addMenu = new Jframe_nambah_menu();
        addMenu.setVisible(true);
    }//GEN-LAST:event_jButton_nambah_menuActionPerformed

    private void jButton_hapus_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hapus_menuActionPerformed
        JFrame_hapusMenu hap = new JFrame_hapusMenu();
        hap.setVisible(true);
    }//GEN-LAST:event_jButton_hapus_menuActionPerformed

    private void jButtonpergi_keMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpergi_keMenuActionPerformed
        this.dispose();
        menuJframe menu = new menuJframe();
        menu.setVisible(true);
    }//GEN-LAST:event_jButtonpergi_keMenuActionPerformed

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
            java.util.logging.Logger.getLogger(landingEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(landingEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(landingEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(landingEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new landingEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_goback;
    private javax.swing.JButton jButton_hapus_menu;
    private javax.swing.JButton jButton_nambah_menu;
    private javax.swing.JButton jButtonpergi_keMenu;
    private javax.swing.JLabel jLabel_id_pegawai;
    private javax.swing.JLabel jLabel_id_pegawai_answer;
    private javax.swing.JLabel jLabel_nama_lengkap;
    private javax.swing.JLabel jLabel_nama_lengkap_answer;
    private javax.swing.JLabel jLabel_selamat_datang;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
