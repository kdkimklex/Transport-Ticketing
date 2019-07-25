/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import static Models.ExternalPaymentValidator.paymentMethod;
import static Models.ExternalPaymentValidator.verifycard;
import java.awt.Toolkit;
import javax.swing.UIManager;

/**
 *
 * @author DELL
 */
public class ExitGate_VerifyCard extends javax.swing.JFrame {

    /**
     * Creates new form VerifyCard
     */
    public ExitGate_VerifyCard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        cardNo = new javax.swing.JTextField();
        PIN = new javax.swing.JTextField();
        exdate = new javax.swing.JTextField();
        Cardverify_ = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 180, 80, 25);

        cardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNoActionPerformed(evt);
            }
        });
        cardNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cardNoKeyTyped(evt);
            }
        });
        getContentPane().add(cardNo);
        cardNo.setBounds(460, 280, 160, 20);

        PIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PINKeyTyped(evt);
            }
        });
        getContentPane().add(PIN);
        PIN.setBounds(460, 340, 160, 20);

        exdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exdateActionPerformed(evt);
            }
        });
        exdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                exdateKeyTyped(evt);
            }
        });
        getContentPane().add(exdate);
        exdate.setBounds(460, 390, 160, 20);

        Cardverify_.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cardverify_.setText("Card Verify");
        Cardverify_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cardverify_ActionPerformed(evt);
            }
        });
        getContentPane().add(Cardverify_);
        Cardverify_.setBounds(370, 440, 120, 25);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Enter PIN");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(230, 340, 120, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Expire Date");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(230, 390, 120, 22);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter Card Number");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(230, 280, 160, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Card Details");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 220, 250, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 150, 560, 360);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/P8.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -20, 900, 640);

        setSize(new java.awt.Dimension(916, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cardverify_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cardverify_ActionPerformed
        // TODO add your handling code here:

        String cardnumber = cardNo.getText();
        String pin = PIN.getText();
        String expirydate = exdate.getText();

        verifycard(cardnumber,pin,expirydate);

        this.dispose();

    }//GEN-LAST:event_Cardverify_ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       new EntryGate_ScanTicket().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNoActionPerformed

    private void exdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exdateActionPerformed

    private void cardNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNoKeyTyped
        // TODO add your handling code here:
         try {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c)) {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_cardNoKeyTyped

    private void PINKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PINKeyTyped
        // TODO add your handling code here:
         try {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c)) {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_PINKeyTyped

    private void exdateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exdateKeyTyped
      
    }//GEN-LAST:event_exdateKeyTyped

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
            java.util.logging.Logger.getLogger(ExitGate_VerifyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExitGate_VerifyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExitGate_VerifyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExitGate_VerifyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try{
             UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
         }
         catch(Exception e){
             e.printStackTrace();
         }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExitGate_VerifyCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cardverify_;
    private javax.swing.JTextField PIN;
    private javax.swing.JTextField cardNo;
    private javax.swing.JTextField exdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
