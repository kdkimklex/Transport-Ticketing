/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CardDetails;
import Models.Card_Token;
import Views.TokenMachine_TopupAccount;
import Views.TokenMachine_TransactionRecord;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kanchi
 */
public class PaymentCard_Reader {

    /**
     *
     * @param cardnumber
     * @param pin
     */
    public static void cardpaymentMethod(String cardnumber,String pin) {


     if (cardnumber.isEmpty() || pin.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Please Fill All Fileds!");
        } else {
            CardList<CardDetails> cardlist = null;          //declare cardlist
            cardlist = new CardList<CardDetails>();        //create new card list
            cardlist = (CardList<CardDetails>) Deserialize(file);  //deserialize file

            try {
                boolean payment = false;

                for (int i = 0; i < cardlist.size(); i++) {
                    CardDetails temp = (CardDetails) cardlist.get(i);
                    if (cardnumber.equals(temp.getCardNumber()) && pin.equals(temp.getpin())) {
                        payment = true;
                        
                    }
                }
                if (payment == true) {
                    JOptionPane.showMessageDialog(null, "Verified card details");
                    
                        
                   
                        new TokenMachine_TransactionRecord().setVisible(true);
                     
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid card details");
                 
                }
            } catch (NullPointerException exc) {
                exc.printStackTrace();
            }
          
          }
        
    }

    /**
     *
     * @param tokenid
     */
    public static void checktokencard(String tokenid) {


     if (tokenid.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Please Fill All Fileds!");
        } else {
            CardTokenList<Card_Token> tokencardList = null;          //declare cardlist
            tokencardList = new CardTokenList<Card_Token>();        //create new card list
            tokencardList = (CardTokenList<Card_Token>) Deserializetoken(filetoken);  //deserialize file

            try {
                boolean payment = false;

                for (int i = 0; i < tokencardList.size(); i++) {
                    Card_Token temp = (Card_Token) tokencardList.get(i);
                    if (tokenid.equals(temp.getTokencard_Id())) {
                        payment = true;
                        
                    }
                }
                if (payment == true) {
                    JOptionPane.showMessageDialog(null, "Verified card ");
                    
                        
                   
                        new TokenMachine_TopupAccount().setVisible(true);
                     
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid card ");
                 
                }
            } catch (NullPointerException exc) {
                exc.printStackTrace();
            }
          
          }
        
    }
    
    CardTokenList<Card_Token> tokencardList = new CardTokenList<Card_Token>();
    CardList<CardDetails> cardList = new CardList<CardDetails>();

    /**
     *
     */
    public static final File file = new File("Card.txt");
    
    /**
     *
     */
    public static final File filetoken = new File("TokenCard.txt");

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

    /**
     *
     * @param filename
     * @return
     */
    public static CardTokenList Deserializetoken(File filename) {

         CardTokenList d_arraylist = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            d_arraylist = ( CardTokenList) ois.readObject();
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
