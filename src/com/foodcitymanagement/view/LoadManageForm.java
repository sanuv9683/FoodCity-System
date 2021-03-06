/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.view;

import com.foodcitymanagement.controller.CustomerLoanController;
import com.foodcitymanagement.dto.CustomerLoan;
import java.awt.Component;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class LoadManageForm extends javax.swing.JFrame {

    /**
     * Creates new form LoadnManageForm
     */
    public LoadManageForm() {
        initComponents();
        try {
            loadTablr();
        } catch (SQLException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        updateRowHeights();
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
        jLabel1 = new javax.swing.JLabel();
        txtLoanDate = new javax.swing.JTextField();
        txtLoanId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCustID = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOrderID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtCusPaidOrAded = new javax.swing.JTextField();
        plus = new javax.swing.JLabel();
        minus = new javax.swing.JLabel();
        btnLoanDelete = new javax.swing.JButton();
        btnLoanUpdate = new javax.swing.JButton();
        btnLoanSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        loanTable = new javax.swing.JTable();
        black = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
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

        jLabel1.setFont(new java.awt.Font("Jura", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Loans Manage");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1360, -1));
        getContentPane().add(txtLoanDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 210, 40));

        txtLoanId.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        txtLoanId.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtLoanIdCaretUpdate(evt);
            }
        });
        txtLoanId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoanIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtLoanId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 330, 60));

        jLabel2.setFont(new java.awt.Font("Jura", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Loan ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 127, 120, 60));

        jLabel3.setFont(new java.awt.Font("Jura", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cust ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 217, 120, 60));

        txtCustID.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        getContentPane().add(txtCustID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 330, 60));

        txtCustomerName.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        getContentPane().add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 330, 60));

        jLabel5.setFont(new java.awt.Font("Jura", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 310, 60, 60));

        jLabel4.setFont(new java.awt.Font("Jura", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Order ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 390, 80, 60));

        txtOrderID.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        getContentPane().add(txtOrderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 330, 60));

        jLabel7.setFont(new java.awt.Font("Jura", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Amount");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 480, 80, 60));

        txtAmount.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        getContentPane().add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 330, 60));
        getContentPane().add(txtCusPaidOrAded, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 330, 60));

        plus.setFont(new java.awt.Font("Droid Sans", 1, 48)); // NOI18N
        plus.setForeground(new java.awt.Color(255, 0, 51));
        plus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus.setText("+");
        plus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        plus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusMouseClicked(evt);
            }
        });
        getContentPane().add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, -1, 30));

        minus.setFont(new java.awt.Font("Droid Sans", 1, 70)); // NOI18N
        minus.setForeground(new java.awt.Color(255, 0, 51));
        minus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus.setText("-");
        minus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusMouseClicked(evt);
            }
        });
        getContentPane().add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, 30, 30));

        btnLoanDelete.setBackground(new java.awt.Color(51, 51, 51));
        btnLoanDelete.setFont(new java.awt.Font("Droid Sans", 1, 20)); // NOI18N
        btnLoanDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnLoanDelete.setText("Delete");
        btnLoanDelete.setContentAreaFilled(false);
        btnLoanDelete.setOpaque(true);
        btnLoanDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoanDeleteMouseClicked(evt);
            }
        });
        getContentPane().add(btnLoanDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 670, 100, 50));

        btnLoanUpdate.setBackground(new java.awt.Color(51, 51, 51));
        btnLoanUpdate.setFont(new java.awt.Font("Droid Sans", 1, 20)); // NOI18N
        btnLoanUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnLoanUpdate.setText("Update");
        btnLoanUpdate.setContentAreaFilled(false);
        btnLoanUpdate.setOpaque(true);
        btnLoanUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoanUpdateMouseClicked(evt);
            }
        });
        getContentPane().add(btnLoanUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 670, 110, 50));

        btnLoanSearch.setBackground(new java.awt.Color(51, 51, 51));
        btnLoanSearch.setFont(new java.awt.Font("Droid Sans", 1, 20)); // NOI18N
        btnLoanSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnLoanSearch.setText("Search");
        btnLoanSearch.setContentAreaFilled(false);
        btnLoanSearch.setOpaque(true);
        btnLoanSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoanSearchMouseClicked(evt);
            }
        });
        getContentPane().add(btnLoanSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 670, 100, 50));

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setFont(new java.awt.Font("Jura", 1, 20)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 51, 51));
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
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 670, 760, 50));

        loanTable.setFont(new java.awt.Font("Droid Sans", 1, 18)); // NOI18N
        loanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LoanID", "CusID", "CusName", "OrderID", "Lend Date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        loanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(loanTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 117, 810, 540));

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

    private void txtLoanIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoanIdActionPerformed

        try {
            String loanID = txtLoanId.getText();
            CustomerLoan searchCustomerLoan = CustomerLoanController.searchCustomerLoan(loanID);
            if (searchCustomerLoan != null) {
                txtCustID.setText(searchCustomerLoan.getCusId());
                txtOrderID.setText(searchCustomerLoan.getOrderId());
                txtCustomerName.setText(searchCustomerLoan.getCusName());
                txtLoanDate.setText(searchCustomerLoan.getDate());
                txtAmount.setText(Double.toString(searchCustomerLoan.getAmount()));
                //txtLoanId.setText(searchCustomerLoan.getLoanId());

            } else {
                JOptionPane.showMessageDialog(this, "No Customer Loan");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtLoanIdActionPerformed

    private void plusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusMouseClicked
        double currentP = Double.parseDouble(txtAmount.getText());
        double paid_aded = Double.parseDouble(txtCusPaidOrAded.getText());
        double lastS = currentP + paid_aded;
        txtAmount.setText(Double.toString(lastS));
    }//GEN-LAST:event_plusMouseClicked

    private void minusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseClicked
        double currentP = Double.parseDouble(txtAmount.getText());
        double paid_aded = Double.parseDouble(txtCusPaidOrAded.getText());
        double lastS = currentP - paid_aded;
        txtAmount.setText(Double.toString(lastS));
    }//GEN-LAST:event_minusMouseClicked

    private void btnLoanDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoanDeleteMouseClicked
        try {
            String loanID = txtLoanId.getText();
            boolean deleteCustomerLoan = CustomerLoanController.deleteCustomerLoan(loanID);
            if (deleteCustomerLoan) {
                JOptionPane.showMessageDialog(this, "Succsesfully Deleted..!");
                txtLoanId.setText(null);
                txtCustID.setText(null);
                txtOrderID.setText(null);
                txtAmount.setText(null);
                txtCustomerName.setText(null);
            } else {
                JOptionPane.showMessageDialog(this, "Delete Faild..!");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoanDeleteMouseClicked

    private void btnLoanUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoanUpdateMouseClicked
        try {
            String loanID = txtLoanId.getText();
            String cusID = txtCustID.getText();
            String cusName = txtCustomerName.getText();
            String orderID = txtOrderID.getText();
            double amount = Double.parseDouble(txtAmount.getText());
            String loanDate = txtLoanDate.getText();

            CustomerLoan customerLoan = new CustomerLoan(loanID, cusID, cusName, orderID, loanDate, amount);
            boolean updateCustomerLoan = CustomerLoanController.updateCustomerLoan(customerLoan, loanID);
            if (updateCustomerLoan) {
                JOptionPane.showMessageDialog(this, "Update Completed");
                txtLoanId.setText(null);
                txtCustID.setText(null);
                txtOrderID.setText(null);
                txtAmount.setText(null);
                txtCustomerName.setText(null);
                txtLoanDate.setText(null);

            } else {
                JOptionPane.showMessageDialog(this, "Loan Update Faild");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnLoanUpdateMouseClicked

    private void btnLoanSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoanSearchMouseClicked
        try {
            String loanID = txtLoanId.getText();
            CustomerLoan searchCustomerLoan = CustomerLoanController.searchCustomerLoan(loanID);
            if (searchCustomerLoan != null) {
                txtCustID.setText(searchCustomerLoan.getCusId());
                txtOrderID.setText(searchCustomerLoan.getOrderId());
                txtAmount.setText(Double.toString(searchCustomerLoan.getAmount()));
                txtLoanDate.setText(searchCustomerLoan.getDate());
                txtCustomerName.setText(searchCustomerLoan.getCusName());
                txtLoanDate.setText(searchCustomerLoan.getDate());
                //txtLoanId.setText(searchCustomerLoan.getLoanId());

            } else {
                JOptionPane.showMessageDialog(this, "No Customer Loan");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoanSearchMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked

        try {
            loadTablr();
            updateRowHeights();
        } catch (SQLException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void loanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanTableMouseClicked
        int selectedRow = loanTable.getSelectedRow();

        txtLoanId.setText((String) loanTable.getValueAt(selectedRow, 0));

    }//GEN-LAST:event_loanTableMouseClicked

    private void txtLoanIdCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtLoanIdCaretUpdate
         try {
            String loanID = txtLoanId.getText();
            CustomerLoan searchCustomerLoan = CustomerLoanController.searchCustomerLoan(loanID);
            if (searchCustomerLoan != null) {
                txtCustID.setText(searchCustomerLoan.getCusId());
                txtOrderID.setText(searchCustomerLoan.getOrderId());
                txtCustomerName.setText(searchCustomerLoan.getCusName());
                txtLoanDate.setText(searchCustomerLoan.getDate());
                txtAmount.setText(Double.toString(searchCustomerLoan.getAmount()));
                //txtLoanId.setText(searchCustomerLoan.getLoanId());

            } else {
               // JOptionPane.showMessageDialog(this, "No Customer Loan");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoadManageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtLoanIdCaretUpdate

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
            java.util.logging.Logger.getLogger(LoadManageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadManageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadManageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadManageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadManageForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel black;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLoanDelete;
    private javax.swing.JButton btnLoanSearch;
    private javax.swing.JButton btnLoanUpdate;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable loanTable;
    private javax.swing.JLabel minus;
    private javax.swing.JLabel plus;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCusPaidOrAded;
    private javax.swing.JTextField txtCustID;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtLoanDate;
    private javax.swing.JTextField txtLoanId;
    private javax.swing.JTextField txtOrderID;
    // End of variables declaration//GEN-END:variables
 private void loadTablr() throws SQLException, ClassNotFoundException, RemoteException {
        DefaultTableModel dtm = (DefaultTableModel) loanTable.getModel();
        ArrayList<CustomerLoan> allLoans = CustomerLoanController.getAllCustomersLoan();
        dtm.setRowCount(0);
        if (allLoans != null) {

            for (CustomerLoan allLoan : allLoans) {
                Object[] dr = {allLoan.getLoanId(), allLoan.getCusId(), allLoan.getCusName(), allLoan.getOrderId(), allLoan.getDate(), allLoan.getAmount()};
                dtm.addRow(dr);
            }

        }
    }

    private void updateRowHeights() {
        for (int row = 0; row < loanTable.getRowCount(); row++) {
            int rowHeight = loanTable.getRowHeight();

            for (int column = 0; column < loanTable.getColumnCount(); column++) {
                Component comp = loanTable.prepareRenderer(loanTable.getCellRenderer(row, column), row, column);
                rowHeight = Math.max(rowHeight, comp.getPreferredSize().height);
            }

            loanTable.setRowHeight(row, rowHeight);
        }
    }
}
