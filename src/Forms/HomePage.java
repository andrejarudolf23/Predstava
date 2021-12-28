package Forms;

import Classes.Globals;
import Classes.User;


public class HomePage extends javax.swing.JFrame {
    User user;

    public HomePage() {
        initComponents();
        user = new User(Globals.loggedUserId);
        labelWelcome.setText("Dobrodosli " + user.getFirstName());

        if(!user.isAdmin()) {
            btnZakaziPredstavu.setVisible(false);
        }
        
        displayRole();        
    }
    
    private void displayRole() {
        if(!user.isAdmin()){
            comboRole.setVisible(false);
            btnSetRole.setVisible(false);
        }
        else {
            fillComboRole();
        }              
    }
    
    private void fillComboRole() {
        comboRole.removeAllItems();
        comboRole.addItem("Administrator");
        comboRole.addItem("Korisnik");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelWelcome = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        btnSetRole = new javax.swing.JButton();
        btnRezervacijaKarata = new javax.swing.JButton();
        btnPregledRezervacija = new javax.swing.JButton();
        btnZakaziPredstavu = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pocetna strana");

        labelWelcome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSetRole.setText("Promeni rolu");
        btnSetRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetRoleActionPerformed(evt);
            }
        });

        btnRezervacijaKarata.setText("Rezervisi kartu za predstavu");
        btnRezervacijaKarata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRezervacijaKarataActionPerformed(evt);
            }
        });

        btnPregledRezervacija.setText("Pregled vasih rezervacija");
        btnPregledRezervacija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPregledRezervacijaActionPerformed(evt);
            }
        });

        btnZakaziPredstavu.setText("Zakazi novu predstavu");
        btnZakaziPredstavu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZakaziPredstavuActionPerformed(evt);
            }
        });

        btnLogout.setText("Odjavi se");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSetRole, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPregledRezervacija, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRezervacijaKarata, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnZakaziPredstavu, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSetRole)
                .addGap(44, 44, 44)
                .addComponent(btnRezervacijaKarata)
                .addGap(27, 27, 27)
                .addComponent(btnPregledRezervacija)
                .addGap(41, 41, 41)
                .addComponent(btnZakaziPredstavu)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetRoleActionPerformed
        if(comboRole.getSelectedItem().toString() == "Administrator") {
            btnZakaziPredstavu.setVisible(true);
        }
        else {
            btnZakaziPredstavu.setVisible(false);
        }
    }//GEN-LAST:event_btnSetRoleActionPerformed

    private void btnRezervacijaKarataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRezervacijaKarataActionPerformed
        // TODO add your handling code here:
        dispose();
        NovaRezervacija novaRezForm = new NovaRezervacija();
        novaRezForm.setVisible(true);
        
    }//GEN-LAST:event_btnRezervacijaKarataActionPerformed

    private void btnPregledRezervacijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPregledRezervacijaActionPerformed
        // TODO add your handling code here:
        dispose();
        PregledRezervacija pregledRezForm = new PregledRezervacija();
        pregledRezForm.setVisible(true);
    }//GEN-LAST:event_btnPregledRezervacijaActionPerformed

    private void btnZakaziPredstavuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZakaziPredstavuActionPerformed
        // TODO add your handling code here:
        dispose();
        NewPredstava newPredstavaForm = new NewPredstava();
        newPredstavaForm.setVisible(true);
    }//GEN-LAST:event_btnZakaziPredstavuActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        Globals.loggedUserId = 0;
        dispose();
        LoginForm login = new LoginForm();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPregledRezervacija;
    private javax.swing.JButton btnRezervacijaKarata;
    private javax.swing.JButton btnSetRole;
    private javax.swing.JButton btnZakaziPredstavu;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JLabel labelWelcome;
    // End of variables declaration//GEN-END:variables
}
