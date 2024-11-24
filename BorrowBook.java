/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Auriga
 */
public class BorrowBook extends javax.swing.JFrame {

    private ManageData manageData;
    private int selectedRow = -1;
    
    public BorrowBook() {
        try {
            manageData = new ManageData(); // Initialize the data handling class
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage());
            System.exit(1);
        }

        initComponents();
        loadDataToTable();
        setupTableSelectionListener();
        addEnterKeyListener(BookIDF, MemberIDF);
    }
    
    private void loadDataToTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            manageData.loadBorrows(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
        }
    }
    
    private void setupTableSelectionListener() {
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) { 
                    selectedRow = jTable1.getSelectedRow(); 
                }
            }
        });
    }
    
    private void addEnterKeyListener(javax.swing.JTextField source, javax.swing.JTextField target) {
        source.addActionListener(e -> target.requestFocus());
    }

    private void ClearFields() {
        BookIDF.setText("");
        MemberIDF.setText("");
        BorrowDateF.setDate(null);
        DueDateF.setDate(null);
        jTable1.clearSelection(); 
        selectedRow = -1;
    }

    private boolean isBorrowExists(String bookID, String memberID) throws SQLException {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
        String existingBookID = model.getValueAt(i, 0).toString(); 
        String existingMemberID = model.getValueAt(i, 1).toString(); 
        if (existingBookID.equals(bookID) && existingMemberID.equals(memberID)) {
            return true;
        }
    }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BookIDF = new javax.swing.JTextField();
        MemberIDF = new javax.swing.JTextField();
        BorrowDateF = new com.toedter.calendar.JDateChooser();
        DueDateF = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(BookIDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 330, -1));
        getContentPane().add(MemberIDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 330, -1));
        getContentPane().add(BorrowDateF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 330, -1));
        getContentPane().add(DueDateF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 330, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book ID", "Member ID", "BorrowDate", "DueDate"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 367, -1, 97));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        jLabel1.setText("Book ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel2.setText("Due Date");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLabel3.setText("Member ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabel4.setText("Borrow Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Borrow Books");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\shaku\\Pictures\\Screenshots\\Screenshot 2024-11-24 134638.png")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd"); // Format yang sesuai untuk database

        String bookID = BookIDF.getText();
        String memberID = MemberIDF.getText();
        String borrowDate = dFormat.format(BorrowDateF.getDate());
        String dueDate = dFormat.format(DueDateF.getDate());

        try {
            if (isBorrowExists(bookID, memberID)) {
                manageData.updateBorrow(bookID, memberID, borrowDate, dueDate);
                JOptionPane.showMessageDialog(null, "Data successfully updated.");
            } else {
                manageData.saveBorrow(bookID, memberID, borrowDate, dueDate);
                manageData.decreaseBookStock(bookID);
                JOptionPane.showMessageDialog(null, "Data successfully saved.");
            }
            loadDataToTable();
            ClearFields();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error saving data: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int selectedRow = jTable1.getSelectedRow();
            if (selectedRow >= 0) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                String BookID = model.getValueAt(selectedRow, 0).toString();
                String MemberID = model.getValueAt(selectedRow, 1).toString();
                String BorrowDate = model.getValueAt(selectedRow, 2).toString();
                String DueDate = model.getValueAt(selectedRow, 3).toString();

                BookIDF.setText(BookID);
                MemberIDF.setText(MemberID);
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
                try {
                    BorrowDateF.setDate(dFormat.parse(BorrowDate));
                    DueDateF.setDate(dFormat.parse(DueDate));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error parsing date: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row to edit.");
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selectedRow = jTable1.getSelectedRow(); 
            if (selectedRow >= 0) { 
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                String BookID = model.getValueAt(selectedRow, 0).toString(); 
                String MemberID = model.getValueAt(selectedRow, 1).toString(); 

                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    try {
                        manageData.deleteBorrow(BookID, MemberID);

                        model.removeRow(selectedRow);
                        JOptionPane.showMessageDialog(null, "Record deleted successfully.");
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error deleting record: " + e.getMessage());
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row to delete.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ClearFields();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookIDF;
    private com.toedter.calendar.JDateChooser BorrowDateF;
    private com.toedter.calendar.JDateChooser DueDateF;
    private javax.swing.JTextField MemberIDF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
