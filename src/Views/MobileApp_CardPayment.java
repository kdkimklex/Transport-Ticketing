/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import static Models.ExternalPaymentValidator.paymentMethod;
import Models.TransactionRecord;
import Controllers.TransactionList;
import static Views.MobileApp_CreateToken.Deserialize;
import static Views.MobileApp_CreateToken.file;
import javax.swing.UIManager;

/**
 *
 * @author piumi
 */
public class MobileApp_CardPayment extends javax.swing.JFrame {
    


    /**
     * Creates new form Card
     */
    public MobileApp_CardPayment() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cardNo = new javax.swing.JTextField();
        PIN = new javax.swing.JTextField();
        exdate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setText("Card Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("PIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("Expiry Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Buy Token");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));
        getContentPane().add(cardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 108, -1));
        getContentPane().add(PIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 108, -1));
        getContentPane().add(exdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 108, -1));

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 3, 24)); // NOI18N
        jLabel1.setText("Enter Card Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ka1 (1).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(293, 626));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         String cardnumber = cardNo.getText();
         String pin = PIN.getText();
         String expirydate = exdate.getText();
         
         paymentMethod(cardnumber,pin,expirydate);
         
         
         this.dispose();
         
           //deserialize transaction details
        TransactionList <TransactionRecord> recArr = null;
        recArr = new TransactionList <TransactionRecord>();
        recArr = (TransactionList <TransactionRecord>) Deserialize(file);

        for (int i = 0; i < recArr.size(); i++) {
            TransactionRecord temp = (TransactionRecord) recArr.get(i);
            
                
               MobileApp_CreateToken.jTextField1.setText(String.valueOf(temp.getSource()));
               MobileApp_CreateToken.jTextField2.setText(String.valueOf(temp.getDestination()));
               MobileApp_CreateToken.jTextField3.setText(String.valueOf(temp.getDate()));
               MobileApp_CreateToken.jTextField4.setText(String.valueOf(temp.getTime()));
               MobileApp_CreateToken.jTextField5.setText(String.valueOf(temp.getVehicle()));
               MobileApp_CreateToken.jTextField6.setText(String.valueOf(temp.getCost()));
               MobileApp_CreateToken.jTextField7.setText(String.valueOf(temp.getAccountID()));
               MobileApp_CreateToken.jTextField8.setText(String.valueOf(temp.getSerialNo()));
            }
          
         
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new MobileApp_Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
                new MobileApp_CardPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PIN;
    private javax.swing.JTextField cardNo;
    private javax.swing.JTextField exdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}