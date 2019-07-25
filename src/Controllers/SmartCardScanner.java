/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.TransactionRecord;
import Views.EntryGate_SelectGate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author piumi
 */
public class SmartCardScanner {
    
    /**
     *
     * @param SerialNo
     */
    //method to Scan Ticket
    public static void ScanTicket(String SerialNo)
    {
           
        TransactionList <TransactionRecord> recArr = null;     //initialize recArr
        recArr = new TransactionList <TransactionRecord>();     //create new recArr
        recArr = (TransactionList <TransactionRecord>) Deserialize(file);     //deserialize file

         for (int i = 0; i < recArr.size(); i++) {
            TransactionRecord temp = (TransactionRecord) recArr.get(i);
                    
           if (SerialNo.equals(String.valueOf(temp.getSerialNo()))) {

                JOptionPane.showMessageDialog(null, "Scanning Successfull!");
                //new GateAccountDetails(temp).setVisible(true);
              
                new EntryGate_SelectGate().setVisible(true);
                EntryGate_SelectGate.acc1.setText(String.valueOf(temp.getAccountID()));
                
            }             
            else {
                    JOptionPane.showMessageDialog(null, "Invalid Serial Number !");
               
                }
    
        }
    
    }
    
   
    
    TransactionList <TransactionRecord> gate = new TransactionList <TransactionRecord>();

    /**
     *
     */
    public static final File file = new File("TransactionRecord.txt");

    /**
     *
     * @param filename
     * @return
     */
    //method to deserialize transaction record file
    public static TransactionList Deserialize(File filename) {

        TransactionList d_arraylist = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            d_arraylist = (TransactionList) ois.readObject();
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
    
    
    
}
