package tubes;

import java.util.Random;
import connect.connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class confirmationOrder_Jframe extends javax.swing.JFrame {

    public confirmationOrder_Jframe() {
        initComponents();
    }
    public confirmationOrder_Jframe(String table, int jumlah, DefaultListModel temp1) {
        initComponents();
        jLabel_NomorMeja_answer.setText(table);
        Random rand = new Random();
        String order_temp = "order-" + rand.nextInt(10);
        jLabel_NomorOrder_answer.setText(order_temp);
        jLabel_HargaPesanan_answer.setText(String.valueOf(jumlah));
        double pajak = (0.1 * jumlah);
        jLabel_Pajak_answer.setText(String.valueOf(pajak));
        double total = pajak + jumlah;
        jLabel_Total_answwer.setText(String.valueOf(total));
        jList1.setModel(temp1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_orderConfirmation = new javax.swing.JLabel();
        jLabel_hiasan1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel_HargaPesanan = new javax.swing.JLabel();
        jLabel_HargaPesanan_answer = new javax.swing.JLabel();
        jLabel_Pajak = new javax.swing.JLabel();
        jLabel_Pajak_answer = new javax.swing.JLabel();
        jLabel_Total = new javax.swing.JLabel();
        jLabel_Total_answwer = new javax.swing.JLabel();
        jLabel_NomorOrder = new javax.swing.JLabel();
        jLabel_NomorMeja = new javax.swing.JLabel();
        jLabel_NomorOrder_answer = new javax.swing.JLabel();
        jLabel_NomorMeja_answer = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_Bayar = new javax.swing.JButton();
        jButton_kembaliOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_orderConfirmation.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel_orderConfirmation.setText("Konfirmasi Order :");

        jLabel_hiasan1.setText("---------------------------------------------------------------------");

        jScrollPane1.setViewportView(jList1);

        jLabel_HargaPesanan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_HargaPesanan.setText("Harga Pesanan  :");

        jLabel_HargaPesanan_answer.setText(".............");

        jLabel_Pajak.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_Pajak.setText("Pajak               :");

        jLabel_Pajak_answer.setText(".............");

        jLabel_Total.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_Total.setText("Total                :");

        jLabel_Total_answwer.setText(".............");

        jLabel_NomorOrder.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_NomorOrder.setText("Nomor Order    :");

        jLabel_NomorMeja.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_NomorMeja.setText("Nomor Meja     :");

        jLabel_NomorOrder_answer.setText(".............");

        jLabel_NomorMeja_answer.setText(".............");

        jButton_Bayar.setText("Bayar");

        jButton_kembaliOrder.setText("Kembali ke Order");
        jButton_kembaliOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_kembaliOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_HargaPesanan)
                                    .addComponent(jLabel_NomorMeja)
                                    .addComponent(jLabel_NomorOrder)
                                    .addComponent(jLabel_Pajak)
                                    .addComponent(jLabel_Total))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Total_answwer)
                                    .addComponent(jLabel_HargaPesanan_answer)
                                    .addComponent(jLabel_Pajak_answer)
                                    .addComponent(jLabel_NomorOrder_answer)
                                    .addComponent(jLabel_NomorMeja_answer)))))
                    .addComponent(jLabel_hiasan1)
                    .addComponent(jLabel_orderConfirmation))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_kembaliOrder)
                .addGap(18, 18, 18)
                .addComponent(jButton_Bayar)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel_orderConfirmation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_hiasan1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_NomorOrder)
                            .addComponent(jLabel_NomorOrder_answer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_NomorMeja)
                            .addComponent(jLabel_NomorMeja_answer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_HargaPesanan)
                            .addComponent(jLabel_HargaPesanan_answer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Pajak)
                            .addComponent(jLabel_Pajak_answer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Total)
                            .addComponent(jLabel_Total_answwer))
                        .addGap(29, 29, 29))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Bayar)
                    .addComponent(jButton_kembaliOrder))
                .addGap(21, 21, 21))
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

    private void jButton_kembaliOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_kembaliOrderActionPerformed
        this.dispose();
        menuJframe menu = new menuJframe();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton_kembaliOrderActionPerformed

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
            java.util.logging.Logger.getLogger(confirmationOrder_Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(confirmationOrder_Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(confirmationOrder_Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(confirmationOrder_Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new confirmationOrder_Jframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Bayar;
    private javax.swing.JButton jButton_kembaliOrder;
    private javax.swing.JLabel jLabel_HargaPesanan;
    private javax.swing.JLabel jLabel_HargaPesanan_answer;
    private javax.swing.JLabel jLabel_NomorMeja;
    private javax.swing.JLabel jLabel_NomorMeja_answer;
    private javax.swing.JLabel jLabel_NomorOrder;
    private javax.swing.JLabel jLabel_NomorOrder_answer;
    private javax.swing.JLabel jLabel_Pajak;
    private javax.swing.JLabel jLabel_Pajak_answer;
    private javax.swing.JLabel jLabel_Total;
    private javax.swing.JLabel jLabel_Total_answwer;
    private javax.swing.JLabel jLabel_hiasan1;
    private javax.swing.JLabel jLabel_orderConfirmation;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
