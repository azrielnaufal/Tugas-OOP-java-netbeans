package tubes;

import connect.connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class loginEmployeeJframe extends javax.swing.JFrame {

    public loginEmployeeJframe(){
        initComponents();
        try {
            myEmployee = new employee();
            myEmployee.daftarAkun("emp-001","btc100k","Azriel Naufal Aulia");
            myEmployee.daftarAkun("emp-002","spada","Adhie Rachmatullah Sugiono");
            myEmployee.daftarAkun("emp-003","halo","Egi Shidqi Rabbani");
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "gagal menghubung database");
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backFromEmployee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Label_ID_pegawai = new javax.swing.JLabel();
        jTextField_idPegawai = new javax.swing.JTextField();
        jButton_logIn = new javax.swing.JButton();
        jLabel_password = new javax.swing.JLabel();
        jTextField_password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_daftar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Label_ID_pegawai_1 = new javax.swing.JLabel();
        jLabel_password_1 = new javax.swing.JLabel();
        jLabel_nama_1 = new javax.swing.JLabel();
        jTextField_idPegawai_1 = new javax.swing.JTextField();
        jTextField_password_1 = new javax.swing.JTextField();
        jTextField_nama_1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backFromEmployee.setText("go back");
        backFromEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backFromEmployeeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Login pegawai restoran");

        Label_ID_pegawai.setText("ID Pegawai :");

        jButton_logIn.setText("log in");
        jButton_logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logInActionPerformed(evt);
            }
        });

        jLabel_password.setText("password :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Or");

        jButton_daftar.setText("Daftar Sebagai Pegawai");
        jButton_daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_daftarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Sign Up Sebagai Pegawai");

        Label_ID_pegawai_1.setText("ID Pegawai :");

        jLabel_password_1.setText("password :");

        jLabel_nama_1.setText("Nama Lengkap :");

        jTextField_password_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_password_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_password)
                            .addComponent(Label_ID_pegawai))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addComponent(jLabel2))
                            .addComponent(jTextField_idPegawai, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addComponent(jTextField_password)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jButton_logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_nama_1)
                            .addComponent(jLabel_password_1)
                            .addComponent(Label_ID_pegawai_1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_idPegawai_1)
                            .addComponent(jTextField_password_1)
                            .addComponent(jTextField_nama_1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jButton_daftar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backFromEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(160, 160, 160))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(155, 155, 155)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(backFromEmployee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_ID_pegawai)
                            .addComponent(jTextField_idPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_password)
                            .addComponent(jTextField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jButton_logIn)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_ID_pegawai_1)
                    .addComponent(jTextField_idPegawai_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_password_1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_password_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_nama_1)
                    .addComponent(jTextField_nama_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton_daftar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backFromEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backFromEmployeeActionPerformed
        this.dispose();
        loginJframe login = new loginJframe();
        login.setVisible(true);
    }//GEN-LAST:event_backFromEmployeeActionPerformed

    private void jButton_logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logInActionPerformed
//        try {
//        Statement statement =(Statement)connect.GetConnection().createStatement();
//        ResultSet result=statement.executeQuery("select * from pegawai where " + "id_pegawai ='" + jTextField_idPegawai.getText() + "'");
//            if (result.next()){
//                if (jTextField_password.getText().equals(result.getString("password"))){
//                    String id_pegawai = jTextField_idPegawai.getText();
//                    String nama = result.getString("nama_pegawai");
//                    landingEmployee landEmp = new landingEmployee(nama, id_pegawai);
//                    landEmp.setVisible(true);
//                    this.dispose();
//                }else{
//                    JOptionPane.showMessageDialog(rootPane,"Password salah");
//                    jTextField_password.setText("");
//                    jTextField_idPegawai.requestFocus();
//                }
//            }else{
//                JOptionPane.showMessageDialog(rootPane,"User Tidak DItemukan");
//                jTextField_idPegawai.setText("");
//                jTextField_password.setText("");
//                jTextField_idPegawai.requestFocus();
//            }
//        }catch (Exception e){
//            JOptionPane.showMessageDialog(rootPane, "gagal menghubung database");
//        } 
          //===================================================================
        String idPegawai = jTextField_idPegawai.getText();
        String password = jTextField_password.getText();
        try {
            String hasil = myEmployee.checkAkun(idPegawai, password);
            if (hasil == "berhasil"){
                String nama = myEmployee.getNama_pegawai_db(idPegawai);
                new landingEmployee(nama, idPegawai);
                this.dispose();
            }else if (hasil == "password salah"){
                JOptionPane.showMessageDialog(rootPane,hasil);
                jTextField_password.setText("");
                jTextField_idPegawai.requestFocus();
            }else if (hasil == "user tidak ditemukan"){
                JOptionPane.showMessageDialog(rootPane,hasil);
                jTextField_idPegawai.setText("");
                jTextField_password.setText("");
                jTextField_idPegawai.requestFocus();
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "gagal menghubungkan database");
        }   
    }//GEN-LAST:event_jButton_logInActionPerformed

    private void jTextField_password_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_password_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_password_1ActionPerformed

    private void jButton_daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_daftarActionPerformed
        String id = jTextField_idPegawai_1.getText();
        String password = jTextField_password_1.getText();
        String nama = jTextField_nama_1.getText();
        try {
            myEmployee.daftarAkun(id, password, nama);
//            Statement statement =(Statement)connect.GetConnection().createStatement();
//            statement.executeUpdate("INSERT INTO pegawai VALUES " + "('" + id + "','" + password + "','" + nama + "')");  
            JOptionPane.showMessageDialog(rootPane, "pegawai berhasil registrasi");
            jTextField_idPegawai_1.setText("");
            jTextField_password_1.setText("");
            jTextField_nama_1.setText("");
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "gagal menghubungkan database");
        }        
    }//GEN-LAST:event_jButton_daftarActionPerformed

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
            java.util.logging.Logger.getLogger(loginEmployeeJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginEmployeeJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginEmployeeJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginEmployeeJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginEmployeeJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_ID_pegawai;
    private javax.swing.JLabel Label_ID_pegawai_1;
    private javax.swing.JButton backFromEmployee;
    private javax.swing.JButton jButton_daftar;
    private javax.swing.JButton jButton_logIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_nama_1;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_password_1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField_idPegawai;
    private javax.swing.JTextField jTextField_idPegawai_1;
    private javax.swing.JTextField jTextField_nama_1;
    private javax.swing.JTextField jTextField_password;
    private javax.swing.JTextField jTextField_password_1;
    // End of variables declaration//GEN-END:variables
    private employee myEmployee;
}
