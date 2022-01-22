
package tubes;

import connect.connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class JFrame_hapusMenu extends javax.swing.JFrame {

    public JFrame_hapusMenu() {
        initComponents();
        listmain();
        listdesert();
        listapetizer();
        listdrink();
    }
    public void listmain(){
        DefaultListModel temp = new DefaultListModel();
        try{
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select nama_mainCourse from maincourse");
            while (res.next()){
                String nm = res.getString(1);
                temp.addElement(nm);
                jList1.setModel(temp);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Tidak terhubung dengan server");
        }
    }
    
    public void listdesert(){
        DefaultListModel temp = new DefaultListModel();
        try{
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select nama_desert from desert");
            while (res.next()){
                String nm = res.getString(1);
                temp.addElement(nm);
                jList2.setModel(temp);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Tidak terhubung dengan server");
        }
    }
    
    public void listapetizer(){
        DefaultListModel temp = new DefaultListModel();
        try{
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select nama_apetizer from apetizer");
            while (res.next()){
                String nm = res.getString(1);
                temp.addElement(nm);
                jList3.setModel(temp);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Tidak terhubung dengan server");
        }
    }
    
    public void listdrink(){
        DefaultListModel temp = new DefaultListModel();
        try{
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select nama_drink from drink");
            while (res.next()){
                String nm = res.getString(1);
                temp.addElement(nm);
                jList4.setModel(temp);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Tidak terhubung dengan server");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_hapusMenu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_hapusMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_hapusMenu.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel_hapusMenu.setText("Hapus Menu");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList4);

        jLabel1.setText("main course");

        jLabel2.setText("apetizer");

        jLabel3.setText("desert");

        jLabel4.setText("drink");

        jButton_hapusMenu.setText("hapus menu");
        jButton_hapusMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hapusMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(jLabel_hapusMenu)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel4)
                        .addGap(74, 74, 74))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jButton_hapusMenu)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel_hapusMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton_hapusMenu)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        jList2.clearSelection();
        jList3.clearSelection();
        jList4.clearSelection();
//        String idx = jList1.getSelectedValue();
    }//GEN-LAST:event_jList1MouseClicked

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        jList1.clearSelection();
        jList3.clearSelection();
        jList4.clearSelection(); 
    }//GEN-LAST:event_jList2MouseClicked

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        jList1.clearSelection();
        jList2.clearSelection();
        jList4.clearSelection();
    }//GEN-LAST:event_jList3MouseClicked

    private void jList4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList4MouseClicked
        jList1.clearSelection();
        jList2.clearSelection();
        jList3.clearSelection();
    }//GEN-LAST:event_jList4MouseClicked

    private void jButton_hapusMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hapusMenuActionPerformed
        try {
        Statement statement =(Statement)connect.GetConnection().createStatement();
        String idx1 = jList1.getSelectedValue();
        String idx2 = jList2.getSelectedValue();
        String idx3 = jList3.getSelectedValue();
        String idx4 = jList4.getSelectedValue();
        //DELETE FROM `maincourse` WHERE nama_mainCourse = 'ribs eye';
            if (!(jList1.isSelectionEmpty())){
                statement.executeUpdate("DELETE FROM maincourse WHERE nama_mainCourse = " + "'" + idx1 + "';");
            }else if(!(jList2.isSelectionEmpty())){
                statement.executeUpdate("DELETE FROM desert WHERE nama_desert = " + "'" + idx2 + "';");
            }else if(!(jList3.isSelectionEmpty())){
                statement.executeUpdate("DELETE FROM apetizer WHERE nama_apetizer = " + "'" + idx3 + "';");
            }else if(!(jList4.isSelectionEmpty())){
                statement.executeUpdate("DELETE FROM drink WHERE nama_drink = " + "'" + idx4 + "';");
            }
            JOptionPane.showMessageDialog(rootPane, "menu berhasil dihapuskan");
            this.dispose();
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "gagal");
        }
    }//GEN-LAST:event_jButton_hapusMenuActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_hapusMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_hapusMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_hapusMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_hapusMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_hapusMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_hapusMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_hapusMenu;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
