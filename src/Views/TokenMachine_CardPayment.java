/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.Account;
import static Controllers.PaymentCard_Reader.cardpaymentMethod;
import Controllers.Topup_Account;
import Controllers.AccountList;
import Controllers.Topup_AmountList;
import static Views.TokenMachine_TransactionRecord.Deserialize_T;
import static Views.TokenMachine_TransactionRecord.Deserialize_Top;
import static Views.TokenMachine_TransactionRecord.tfile;
import static Views.TokenMachine_TransactionRecord.tfile1;
import javax.swing.UIManager;

/**
 *
 * @author Kanchi
 */
public class TokenMachine_CardPayment extends javax.swing.JFrame {
    

    /**
     * Creates new form Insert_Card
     */
    public TokenMachine_CardPayment() {
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

        pin = new javax.swing.JTextField();
        cn = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        accountid = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);
        getContentPane().add(pin);
        pin.setBounds(430, 300, 160, 30);

        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        getContentPane().add(cn);
        cn.setBounds(430, 240, 160, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 373, 80, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PIN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 310, 120, 22);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Card Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 170, 230, 28);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Account ID :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(540, 120, 90, 17);

        accountid.setForeground(new java.awt.Color(255, 255, 255));
        accountid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(accountid);
        accountid.setBounds(630, 120, 65, 23);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Card Number");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(240, 250, 120, 22);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("<< Back ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(170, 120, 90, 25);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 90, 620, 350);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/P8.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 900, 590);

        setSize(new java.awt.Dimension(917, 621));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         String AccountID = accountid.getText();
         
         String cardnumber = cn.getText();
         String Pin = pin.getText();
 
         
         cardpaymentMethod(cardnumber,Pin);
         
         
         
         this.dispose();
         TokenMachine_TransactionRecord.accountid.setText(this.accountid.getText());
        
         // TODO add your handling code here:
         
            //deserialize transaction details
        AccountList <Account> recArr = null;
        recArr = new  AccountList <Account>();
        recArr = ( AccountList <Account>) Deserialize_T(tfile);

        for (int i = 0; i < recArr.size(); i++) {
            Account temp = (Account) recArr.get(i);
            
                
               TokenMachine_TransactionRecord.cuamount.setText(String.valueOf(temp.gettokenbalance()));
               
              
            }
        
           //deserialize topup_amount details
        Topup_AmountList <Topup_Account> recArr1 = null;
        recArr1 = new  Topup_AmountList<Topup_Account>();
        recArr1 = ( Topup_AmountList <Topup_Account>) Deserialize_Top(tfile1);

        for (int i = 0; i < recArr.size(); i++) {
            Topup_Account temp = (Topup_Account) recArr1.get(i);
            
                
               TokenMachine_TransactionRecord.topupamount.setText(String.valueOf(temp.gettopup_amount()));
               
              
            }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new TokenMachine_TopupAccount().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(TokenMachine_CardPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TokenMachine_CardPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TokenMachine_CardPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TokenMachine_CardPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TokenMachine_CardPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel accountid;
    public static javax.swing.JTextField cn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField pin;
    // End of variables declaration//GEN-END:variables
}
