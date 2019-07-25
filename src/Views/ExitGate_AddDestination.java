/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Controllers.DynamicJourney;
import static Controllers.DynamicJourney.addDestinationstop;
import static Controllers.DynamicJourney.checkjourneycomplete;
import Controllers.JourneyList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author DELL
 */
public class ExitGate_AddDestination extends javax.swing.JFrame {
    
    /* 
    Journeylist<Dynamic_journey> journeylist = new Journeylist<Dynamic_journey>();
     
      public static final File file1 = new File("journey.txt");
    //deserilalising 
       public static Journeylist deserialize(File filename) {

        Journeylist d_arraylist = null;
        try {
            FileInputStream fis = new FileInputStream("journey.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            d_arraylist = (Journeylist) ois.readObject();
            fis.close();
            System.out.println("Deserialized");
            System.out.println(d_arraylist);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return d_arraylist;
    }
    */
    
    
    /**
     * Creates new form AddDestination
     */
    public ExitGate_AddDestination() {
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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Destinationbox = new javax.swing.JComboBox<>();
        AddDestination_ = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 220, 70, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Destination :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 320, 90, 30);

        Destinationbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select destination", "Bristol", "Leeds", "Sheffield", "Oxford", "Liverpool", " " }));
        Destinationbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinationboxActionPerformed(evt);
            }
        });
        getContentPane().add(Destinationbox);
        Destinationbox.setBounds(480, 320, 134, 20);

        AddDestination_.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddDestination_.setText("Add Destination");
        AddDestination_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDestination_ActionPerformed(evt);
            }
        });
        getContentPane().add(AddDestination_);
        AddDestination_.setBounds(390, 430, 160, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TRAVEL ANYWHERE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 230, 440, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Account ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(570, 220, 70, 17);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(650, 220, 80, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 210, 570, 320);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/P9.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -10, 900, 620);

        setSize(new java.awt.Dimension(915, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddDestination_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDestination_ActionPerformed
        // TODO add your handling code here:
        
      
       String destination = Destinationbox.getSelectedItem().toString();
        if(Destinationbox.getSelectedItem().equals(" Bristol") || Destinationbox.getSelectedItem().equals("Leeds")||Destinationbox.getSelectedItem().equals("Sheffield")
                || Destinationbox.getSelectedItem().equals("Oxford") || Destinationbox.getSelectedItem().equals("Liverpool"))
        {
          new ExitGate_Discount().setVisible(true);
           addDestinationstop(destination);
           checkjourneycomplete(destination);
       
          ExitGate_Discount.jTextField1.setText(this.jTextField1.getText());
          this.dispose();
        }

        }
         
          JourneyList <DynamicJourney> records = new JourneyList <DynamicJourney>();
          
        public static final File file = new File("Journey.txt");
          public void serialize(JourneyList journey){
        try{
          
           FileOutputStream fos = new FileOutputStream(file);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(journey);
            fos.close();
            System.out.println("Serialized");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
          }
          
         public JourneyList deserialize(File file){
        
         JourneyList b_arraylist = null;
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
           
          
            b_arraylist = (JourneyList)(JourneyList)ois.readObject();
            fis.close();
            System.out.println("Deserialized");
            System.out.println(b_arraylist);
        }
            
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } 
        catch(ClassCastException ex2){
            ex2.printStackTrace();
        }
       
        return b_arraylist;
     
        
     //  for (int i = 0; i < joureny.size(); i++) {
    //        Dynamic_journey temp = (Dynamic_journey) joureny.get(i);
             //   if (destination_stop.equals(temp.getdestination())) {
                 
                //  GateAccountDetails.destinationbox.setText(String.valueOf(temp.getdestination()));
                  
                 // JOptionPane.showMessageDialog(null, "CompletenJourney.. Thank you..");
          //  }
         
        }
 //   }
      
       

  /*  new PaymentObject().setVisible(true);
        
        Journeylist<Dynamic_journey> joureny = null;        //initialize offerArr
        joureny = new Journeylist<Dynamic_journey>();       //create new offerArr
        joureny = (Journeylist<Dynamic_journey>) deserialize(file1);
        for (int i = 0; i < joureny.size(); i++) {
            Dynamic_journey temp = (Dynamic_journey) joureny.get(i);
                if (destination_stop.equals(temp.getdestination())) {
                  
                  GateAccountDetails.destinationbox.setText(String.valueOf(temp.getdestination()));
           }
    }//GEN-LAST:event_AddDestination_ActionPerformed
*/
    private void DestinationboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinationboxActionPerformed
        // TODO add your handling code here:
         String destination_stop = Destinationbox.getSelectedItem().toString();
    }//GEN-LAST:event_DestinationboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            new ExitGate_Stop_journey().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
   // }
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
            java.util.logging.Logger.getLogger(ExitGate_AddDestination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExitGate_AddDestination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExitGate_AddDestination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExitGate_AddDestination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
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
                new ExitGate_AddDestination().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDestination_;
    private javax.swing.JComboBox<String> Destinationbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
