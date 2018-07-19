/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vva;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fanilo
 */
public class JFAffichageActivite extends javax.swing.JFrame {

    private DonneesAnimation d;
    private Connection conn;
    private ArrayList<Activite> arrayActivite;
    private DefaultListModel<Activite> modelActivite;
    private static Compte compte;
    private static javax.swing.JFrame pagePrecedente;
    public JFAffichageActivite(Compte compte, javax.swing.JFrame pagePrcdt) throws SQLException {
        initComponents();
        
        this.pagePrecedente = pagePrcdt;        
        this.compte = compte;
        
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vva2", "root", "");
        
        d = new DonneesAnimation();
        
        arrayActivite = d.chargerActivite();
        
        modelActivite = new DefaultListModel<Activite>();
        
        jLActivite.setModel(modelActivite);
        
        for(Activite a : arrayActivite)
        {
            modelActivite.addElement(a);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jLActivite = new javax.swing.JList<>();
        jlbLibelleActivite = new javax.swing.JLabel();
        jlbDescriptionActivite = new javax.swing.JLabel();
        jbtInscrire = new javax.swing.JButton();
        jbtDesinscrire = new javax.swing.JButton();
        jlbNombreInscrits = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlbLimiteInscrits = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtVoirHoraires = new javax.swing.JButton();
        jCBRetour = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLActivite.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLActiviteValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jLActivite);

        jlbLibelleActivite.setText("jLabel1");

        jlbDescriptionActivite.setText("jLabel2");

        jbtInscrire.setText("S'inscrire");
        jbtInscrire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInscrireActionPerformed(evt);
            }
        });

        jbtDesinscrire.setText("Se désinscrire");
        jbtDesinscrire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDesinscrireActionPerformed(evt);
            }
        });

        jlbNombreInscrits.setText("jLabel1");

        jLabel1.setText("/");

        jlbLimiteInscrits.setText("jLabel2");

        jLabel2.setText("Nombre de participants:");

        jbtVoirHoraires.setText("Horaires");
        jbtVoirHoraires.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtVoirHorairesActionPerformed(evt);
            }
        });

        jCBRetour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menu", "Page précédente" }));
        jCBRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBRetourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbLibelleActivite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jbtInscrire, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jbtDesinscrire))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlbNombreInscrits)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlbLimiteInscrits))
                            .addComponent(jlbDescriptionActivite)
                            .addComponent(jbtVoirHoraires))
                        .addGap(0, 123, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbLibelleActivite)
                            .addComponent(jCBRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jlbNombreInscrits)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbLimiteInscrits))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbDescriptionActivite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtVoirHoraires)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtInscrire)
                            .addComponent(jbtDesinscrire))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLActiviteValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLActiviteValueChanged
        
        try {
            
            compte.getId();
            
            Activite activiteSelectionnee = jLActivite.getSelectedValue();
            
            jlbLibelleActivite.setText(activiteSelectionnee.getLibelle());
            
            jlbDescriptionActivite.setText(activiteSelectionnee.getDescription());
            
            jlbNombreInscrits.setText(String.valueOf(activiteSelectionnee.getNombreInscrit()));
            
            jlbLimiteInscrits.setText(String.valueOf(activiteSelectionnee.getLimiteInscrit()));
            
            if(d.estInscrit(compte.getId(), activiteSelectionnee.getId()))
            {
                jbtInscrire.setEnabled(false);
                jbtDesinscrire.setEnabled(true);
            }
            else
            {
                jbtInscrire.setEnabled(true);
                jbtDesinscrire.setEnabled(false);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(JFAffichageActivite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLActiviteValueChanged

    private void jbtInscrireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInscrireActionPerformed
        try {
            
            Activite a = jLActivite.getSelectedValue();
            
            d.ajouterUnInscrit(a.getLibelle(), compte.getId());
            
            int nombreInscrits = Integer.parseInt(jlbNombreInscrits.getText());
            
            int nombreInscritsIncrement = nombreInscrits + 1;
            
            jlbNombreInscrits.setText(String.valueOf(nombreInscritsIncrement));
            
            jbtInscrire.setEnabled(false);
            
            jbtDesinscrire.setEnabled(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(JFAffichageActivite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtInscrireActionPerformed

    private void jbtDesinscrireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDesinscrireActionPerformed
        try {
            
            Activite a = jLActivite.getSelectedValue();
            
            d.supprimerUnInscrit(a.getLibelle(), compte.getId());
            
            int nombreInscrits = Integer.parseInt(jlbNombreInscrits.getText());
            
            int nombreInscritsDecrement = nombreInscrits - 1;
            
            jlbNombreInscrits.setText(String.valueOf(nombreInscritsDecrement));
            
            jbtInscrire.setEnabled(true);
            
            jbtDesinscrire.setEnabled(false);
            
        } catch (SQLException ex) {
            Logger.getLogger(JFAffichageActivite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtDesinscrireActionPerformed

    private void jbtVoirHorairesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtVoirHorairesActionPerformed
        Activite a = jLActivite.getSelectedValue();
        
        JFHorairesActivite jframe = new JFHorairesActivite(compte, a);
        
        jframe.setVisible(true);
    }//GEN-LAST:event_jbtVoirHorairesActionPerformed

    private void jCBRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBRetourActionPerformed
        if(jCBRetour.getSelectedItem() == "Page précédente")
        {
            this.pagePrecedente.setLocationRelativeTo(null);
            this.pagePrecedente.setVisible(true);
            this.dispose();
        }
        else
        {
            JFMenu jFM = new JFMenu(compte);
            jFM.setLocationRelativeTo(null);
            jFM.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jCBRetourActionPerformed

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
            java.util.logging.Logger.getLogger(JFAffichageActivite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAffichageActivite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAffichageActivite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAffichageActivite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFAffichageActivite(compte, pagePrecedente).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFAffichageActivite.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCBRetour;
    private javax.swing.JList<Activite> jLActivite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtDesinscrire;
    private javax.swing.JButton jbtInscrire;
    private javax.swing.JButton jbtVoirHoraires;
    private javax.swing.JLabel jlbDescriptionActivite;
    private javax.swing.JLabel jlbLibelleActivite;
    private javax.swing.JLabel jlbLimiteInscrits;
    private javax.swing.JLabel jlbNombreInscrits;
    // End of variables declaration//GEN-END:variables
}
