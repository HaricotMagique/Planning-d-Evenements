/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vva;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Fanilo
 */
public class JFConnexion extends javax.swing.JFrame {

    /**
     * Creates new form Connexion
     */
    private Connection conn;
    DonneesAnimation SQLManager;
    public JFConnexion() throws SQLException {
        initComponents();
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vva2", "root", "");
        SQLManager = new DonneesAnimation();
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
        jtfLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfMotDePasse = new javax.swing.JTextField();
        jbtConnexion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Login:");

        jtfLogin.setText("nomTest.prenomTest");
        jtfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLoginActionPerformed(evt);
            }
        });

        jLabel2.setText("Mot de passe:");

        jtfMotDePasse.setText("mdpTest");
        jtfMotDePasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMotDePasseActionPerformed(evt);
            }
        });

        jbtConnexion.setText("Connexion");
        jbtConnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtConnexionActionPerformed(evt);
            }
        });

        jLabel3.setText("CONNEXION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfMotDePasse)
                    .addComponent(jtfLogin))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtConnexion)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel3)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jbtConnexion)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConnexionActionPerformed
        try {
            
            String login = jtfLogin.getText();
            String motDePasse = jtfMotDePasse.getText();
            Compte c = SQLManager.chargerCompte(login, motDePasse);
            if(c == null)
            {
                JOptionPane.showMessageDialog(null, "Erreur: Le compte spécifié n'existe pas, ou les identifiants sont incorrects.");
            }
            else
            {
                JFMenu m = new JFMenu(c);
                m.setLocationRelativeTo(null);
                m.setVisible(true);
                this.dispose();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(JFConnexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtConnexionActionPerformed

    private void jtfMotDePasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMotDePasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMotDePasseActionPerformed

    private void jtfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLoginActionPerformed

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
            java.util.logging.Logger.getLogger(JFConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JFConnexion j = new JFConnexion();
                    j.setLocationRelativeTo(null);
                    j.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFConnexion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtConnexion;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfMotDePasse;
    // End of variables declaration//GEN-END:variables
}
