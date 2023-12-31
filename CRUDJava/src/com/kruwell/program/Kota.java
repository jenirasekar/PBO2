/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kruwell.program;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ThinkPad T440s
 */
public class Kota extends javax.swing.JFrame {
    private void kosongkan_form(){
        tfIdkota.setText(null);
        tfNamakota.setText(null);
    }

    private void tampilkan_data(){

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Kota ");
        model.addColumn("Nama Kota");

        try{
            int no = 1;
            String sql = "SELECT * FROM kota";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);


            while(res.next()){
                model.addRow(new Object[]{no++, res.getString(1),res.getString(2)});


            }
            tabelKota.setModel(model);


        }catch (SQLException e){
            System.out.println("Error :" + e.getMessage());
        }
    }
    /**
     * Creates new form Kota
     */
    public Kota() {
        initComponents();
            tampilkan_data();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfIdkota = new javax.swing.JTextField();
        tfNamakota = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKota = new javax.swing.JTable();
        tbTambah = new javax.swing.JButton();
        tbSimpan = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        tbBatal = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Data Kota");

        jLabel2.setText("ID Kota");

        jLabel3.setText("Nama Kota");

        tfIdkota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdkotaActionPerformed(evt);
            }
        });

        tfNamakota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamakotaActionPerformed(evt);
            }
        });

        tabelKota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelKota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKota);

        tbTambah.setText("Tambah Data");
        tbTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTambahActionPerformed(evt);
            }
        });

        tbSimpan.setText("Simpan");
        tbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpanActionPerformed(evt);
            }
        });

        tbEdit.setText("Edit");
        tbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditActionPerformed(evt);
            }
        });

        tbHapus.setText("Hapus");
        tbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapusActionPerformed(evt);
            }
        });

        tbBatal.setText("Batal");
        tbBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBatalActionPerformed(evt);
            }
        });

        tbKeluar.setText("Keluar");
        tbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfNamakota, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(134, 134, 134)
                                .addComponent(tfIdkota, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(tbTambah)
                        .addGap(18, 18, 18)
                        .addComponent(tbSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(tbEdit)
                        .addGap(18, 18, 18)
                        .addComponent(tbHapus)
                        .addGap(18, 18, 18)
                        .addComponent(tbBatal)
                        .addGap(18, 18, 18)
                        .addComponent(tbKeluar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfIdkota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNamakota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbTambah)
                    .addComponent(tbSimpan)
                    .addComponent(tbEdit)
                    .addComponent(tbHapus)
                    .addComponent(tbBatal)
                    .addComponent(tbKeluar))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfIdkotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdkotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdkotaActionPerformed

    private void tfNamakotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamakotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamakotaActionPerformed

    private void tbTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTambahActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_tbTambahActionPerformed

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO kota VALUES ('"+tfIdkota.getText()+"','"+tfNamakota.getText()+"')";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses Simpan Data Berhasil...");
            tampilkan_data();
            kosongkan_form();

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditActionPerformed
        // TODO add your handling code here:
        try{
            String sql="UPDATE kota SET id_kota = '"+tfIdkota.getText()+"',nama_kota='"+tfNamakota.getText()+"' WHERE id_kota = '"+tfIdkota.getText()+"'";
            java.sql.Connection conn= (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil....");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_tbEditActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM kota WHERE id_kota='"+tfIdkota.getText()+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil...");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_tbHapusActionPerformed

    private void tbBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBatalActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_tbBatalActionPerformed

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
        Home hm = new Home();
            hm.setVisible(true);
            hm.pack();
            hm.setLocationRelativeTo(null);
            hm.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }//GEN-LAST:event_tbKeluarActionPerformed

    private void tabelKotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKotaMouseClicked
        // TODO add your handling code here:
        int baris = tabelKota.rowAtPoint (evt.getPoint());
        String id_kota = tabelKota.getValueAt (baris, 1).toString();
        tfIdkota.setText(id_kota);

        String kota = tabelKota.getValueAt (baris, 2).toString();
        tfNamakota.setText(kota);
    }//GEN-LAST:event_tabelKotaMouseClicked

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
            java.util.logging.Logger.getLogger(Kota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kota().setVisible(true);
            }
        });
        
       Login lg = new Login();
            lg.setVisible(true);
            lg.pack();
            lg.setLocationRelativeTo(null);
            lg.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelKota;
    private javax.swing.JButton tbBatal;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JButton tbTambah;
    private javax.swing.JTextField tfIdkota;
    private javax.swing.JTextField tfNamakota;
    // End of variables declaration//GEN-END:variables
}
