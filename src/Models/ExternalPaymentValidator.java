/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controllers.CardList;
import Views.ExitGate_OpenExitGate;
import Views.ExitGate_VerifyCard;
import Views.MobileApp_CardPayment;
import Views.MobileApp_CreateToken;
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
public class ExternalPaymentValidator {
    
    /**
     *
     * @param cardnumber
     * @param pin
     * @param expirydate
     */
    //create method to validate card
    public static void paymentMethod(String cardnumber,String pin,String expirydate) {


     if (cardnumber.isEmpty() || pin.isEmpty() || expirydate.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill All Fileds!");
            new MobileApp_CardPayment().setVisible(true);
        } else {
            CardList<CardDetails> cardlist = null;          //declare cardlist
            cardlist = new CardList<CardDetails>();        //create new card list
            cardlist = (CardList<CardDetails>) Deserialize(file);  //deserialize file

            try {
                boolean payment = false;

                for (int i = 0; i < cardlist.size(); i++) {
                    CardDetails temp = (CardDetails) cardlist.get(i);
                    if (cardnumber.equals(temp.getCardNumber()) && pin.equals(temp.getpin()) && expirydate.equals(temp.getExpiryDate())) {
                        payment = true;
                        
                    }
                }
                if (payment == true) {
                    JOptionPane.showMessageDialog(null, "Verified card details");
                    
                        new MobileApp_CreateToken().setVisible(true);
                      
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid card details");
                    new MobileApp_CardPayment().setVisible(true);
                }
            } catch (NullPointerException exc) {
                exc.printStackTrace();
            }
          
          }
        
    }
       //create method to validate card within ExitGate

    /**
     *
     * @param cardnumber
     * @param pin
     * @param expirydate
     */
      public static void verifycard(String cardnumber,String pin,String expirydate) {


     if (cardnumber.isEmpty() || pin.isEmpty() || expirydate.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill All Fileds!");
            new ExitGate_VerifyCard().setVisible(true);
        } else {
            CardList<CardDetails> cardlist = null;          //declare cardlist
            cardlist = new CardList<CardDetails>();        //create new card list
            cardlist = (CardList<CardDetails>) Deserialize(file);  //deserialize file

            try {
                boolean payment = false;

                for (int i = 0; i < cardlist.size(); i++) {
                    CardDetails temp = (CardDetails) cardlist.get(i);
                    if (cardnumber.equals(temp.getCardNumber()) && pin.equals(temp.getpin()) && expirydate.equals(temp.getExpiryDate())) {
                        payment = true;
                        
                    }
                }
                if (payment == true) {
                    JOptionPane.showMessageDialog(null, "Verified card details");
                    
                        new ExitGate_OpenExitGate().setVisible(true);
                      
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid card details");
                    new ExitGate_VerifyCard().setVisible(true);
                }
            } catch (NullPointerException exc) {
                exc.printStackTrace();
            }
          
          }
        
    }
   
    CardList<CardDetails> cardList = new CardList<CardDetails>();

    /**
     *
     */
    public static final File file = new File("Card.txt");

    /**
     *
     * @param filename
     * @return
     */
    public static CardList Deserialize(File filename) {

        CardList d_arraylist = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            d_arraylist = (CardList) ois.readObject();
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

    

