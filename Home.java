/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

/**
 *
 * @author Auriga
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Members = new javax.swing.JButton();
        Books = new javax.swing.JButton();
        Borrows = new javax.swing.JButton();
        Returns = new javax.swing.JButton();
        Stats = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Members.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Members.setIcon(new javax.swing.ImageIcon("C:\\Users\\shaku\\Pictures\\Screenshots\\Screenshot 2024-11-24 141943.png")); // NOI18N
        Members.setText("Members");
        Members.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MembersActionPerformed(evt);
            }
        });
        getContentPane().add(Members, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 83, 200, -1));

        Books.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Books.setIcon(new javax.swing.ImageIcon("C:\\Users\\shaku\\Pictures\\Screenshots\\Screenshot 2024-11-24 142005.png")); // NOI18N
        Books.setText("Books");
        Books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooksActionPerformed(evt);
            }
        });
        getContentPane().add(Books, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 200, -1));

        Borrows.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Borrows.setIcon(new javax.swing.ImageIcon("C:\\Users\\shaku\\Pictures\\Screenshots\\Screenshot 2024-11-24 142013.png")); // NOI18N
        Borrows.setText("Borrow Book");
        Borrows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowsActionPerformed(evt);
            }
        });
        getContentPane().add(Borrows, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        Returns.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Returns.setIcon(new javax.swing.ImageIcon("C:\\Users\\shaku\\Pictures\\Screenshots\\Screenshot 2024-11-24 142027.png")); // NOI18N
        Returns.setText("Return Book");
        Returns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnsActionPerformed(evt);
            }
        });
        getContentPane().add(Returns, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 200, -1));

        Stats.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Stats.setIcon(new javax.swing.ImageIcon("C:\\Users\\shaku\\Pictures\\Screenshots\\Screenshot 2024-11-24 142037.png")); // NOI18N
        Stats.setText("Statistics");
        Stats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatsActionPerformed(evt);
            }
        });
        getContentPane().add(Stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 200, -1));

        Logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\shaku\\Pictures\\Screenshots\\Screenshot 2024-11-24 142051.png")); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\shaku\\Pictures\\Wallpaper.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void MembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MembersActionPerformed
        new NewMember().setVisible(true);
    }//GEN-LAST:event_MembersActionPerformed

    private void BooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooksActionPerformed
        new NewBook().setVisible(true);
    }//GEN-LAST:event_BooksActionPerformed

    private void BorrowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowsActionPerformed
        new BorrowBook().setVisible(true);
    }//GEN-LAST:event_BorrowsActionPerformed

    private void ReturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnsActionPerformed
        new ReturnBook().setVisible(true);
    }//GEN-LAST:event_ReturnsActionPerformed

    private void StatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatsActionPerformed
        new Statistic().setVisible(true);
    }//GEN-LAST:event_StatsActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Books;
    private javax.swing.JButton Borrows;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Members;
    private javax.swing.JButton Returns;
    private javax.swing.JButton Stats;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
