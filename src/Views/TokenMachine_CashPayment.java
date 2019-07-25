/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.Account;
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
 * @author piumi
 */
public class TokenMachine_CashPayment extends javax.swing.JFrame {

    /**
     * Creates new form Cash
     */
    public TokenMachine_CashPayment() {
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

        putcash = new javax.swing.JButton();
        accountid = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        putcash.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        putcash.setText("Put Cash");
        putcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putcashActionPerformed(evt);
            }
        });
        getContentPane().add(putcash);
        putcash.setBounds(340, 290, 200, 50);

        accountid.setForeground(new java.awt.Color(255, 255, 255));
        accountid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(accountid);
        accountid.setBounds(550, 220, 65, 23);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Account ID :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 220, 90, 17);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("<< Back ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(260, 220, 90, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 190, 430, 230);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/P8.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 600);

        setSize(new java.awt.Dimension(917, 643));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void putcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putcashActionPerformed
        new TokenMachine_TransactionRecord().setVisible(true);
        this.dispose();
        TokenMachine_TransactionRecord.accountid.setText(this.accountid.getText());
        
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
               
              
            }        // TODO add your handling code here:
    }//GEN-LAST:event_putcashActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new TokenMachine_TopupAccount().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
          
      UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
    }
       
        catch(Exception e)
	{
            e.printStackTrace();
        }
        //</editor-fold>
        
        //</editor-fold>
          


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TokenMachine_CashPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel accountid;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton putcash;
    // End of variables declaration//GEN-END:variables
}
