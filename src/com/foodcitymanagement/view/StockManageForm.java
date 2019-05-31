/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.view;

import com.foodcitymanagement.controller.ItemController;
import com.foodcitymanagement.dto.Item;
import java.awt.Component;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class StockManageForm extends javax.swing.JFrame {

    double amount = 0;

    /**
     * Creates new form StockManageForm
     */
    public StockManageForm() {
        try {
            initComponents();
            loadTablr();
            updateRowHeights();
        } catch (SQLException ex) {
            Logger.getLogger(StockManageForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StockManageForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(StockManageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtStockSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        black = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(0, 51, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("_");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 40, 30));

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("X");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 40, 30));

        txtStockSearch.setFont(new java.awt.Font("Jura", 0, 18)); // NOI18N
        txtStockSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStockSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockSearchActionPerformed(evt);
            }
        });
        getContentPane().add(txtStockSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 250, 50));

        jLabel1.setFont(new java.awt.Font("Jura", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Stock Manage");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1360, 90));

        stockTable.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemCode", "ItemName", "ItemPrice", "ItemQuntity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stockTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stockTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(stockTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 117, 1290, 560));

        btnDelete.setBackground(new java.awt.Color(51, 51, 51));
        btnDelete.setFont(new java.awt.Font("Jura", 1, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Reload");
        btnDelete.setContentAreaFilled(false);
        btnDelete.setOpaque(true);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 690, 140, 50));

        jLabel2.setFont(new java.awt.Font("Jura", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Stock :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 689, 130, 60));

        lblTotal.setFont(new java.awt.Font("Jura", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 690, 390, 50));

        black.setBackground(new java.awt.Color(102, 102, 102));
        black.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        black.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/foodcitymanagement/icon/5256514-blur-wallpaper.jpg"))); // NOI18N
        getContentPane().add(black, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        this.dispose();


    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtStockSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockSearchActionPerformed
        try {
            String text = txtStockSearch.getText();

            Item searchItem = ItemController.searchItem(text);
            if (searchItem != null) {
                DefaultTableModel dtm = (DefaultTableModel) stockTable.getModel();

                dtm.setRowCount(0);

                String[] dr = {searchItem.getCode(), searchItem.getDescription(), Double.toString(searchItem.getUnitPrice()), Double.toString(searchItem.getQtyOnHand())};
                dtm.addRow(dr);
                totalP();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StockManageForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StockManageForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_txtStockSearchActionPerformed

    private void stockTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockTableKeyPressed

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked

        try {
            loadTablr();
            updateRowHeights();
        } catch (SQLException ex) {
            Logger.getLogger(StockManageForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StockManageForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(StockManageForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        totalP();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(StockManageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockManageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockManageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockManageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockManageForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel black;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable stockTable;
    private javax.swing.JTextField txtStockSearch;
    // End of variables declaration//GEN-END:variables
 private void loadTablr() throws SQLException, ClassNotFoundException, RemoteException {
        DefaultTableModel dtm = (DefaultTableModel) stockTable.getModel();
        ArrayList<Item> allItem = ItemController.getAllItems();
        dtm.setRowCount(0);
        if (allItem != null) {
            for (Item allItem1 : allItem) {
                String[] dr = {allItem1.getCode(), allItem1.getDescription(), Double.toString(allItem1.getUnitPrice()), Double.toString(allItem1.getQtyOnHand())};
                dtm.addRow(dr);
            }

        }
    }

    private void updateRowHeights() {
        for (int row = 0; row < stockTable.getRowCount(); row++) {
            int rowHeight = stockTable.getRowHeight();

            for (int column = 0; column < stockTable.getColumnCount(); column++) {
                Component comp = stockTable.prepareRenderer(stockTable.getCellRenderer(row, column), row, column);
                rowHeight = Math.max(rowHeight, comp.getPreferredSize().height);
            }

            stockTable.setRowHeight(row, rowHeight);
        }
    }

    private void totalP() {
        for (int i = 0; i < stockTable.getRowCount(); i++) {
            amount = amount + ((Double.parseDouble((String) stockTable.getValueAt(i, 2))) * (Double.parseDouble((String) stockTable.getValueAt(i, 3))));
        }
        lblTotal.setText(amount + "");
        amount = 0;
    }
}
