/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controllers.CardList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author piumi
 */
public class CardDetails implements Serializable {
    
    //Static variable which holds an instance of the CardDetails class
    private static CardDetails uniqueInstance = new CardDetails();
    
    //Make the constructor private to prevent creation of objects of CardDetails class
    private CardDetails(){}
    
    //Call this method to get the already created instance (No any other instance will be created)

    /**
     *
     * @return
     */
    public static CardDetails getInstance(){
        
        return uniqueInstance;
    }
    
    private static final long serialVersionUID = 1L;
      
    //declare variables
  private String cardNumber;
  private String pin;
  private String cardHoldersName;
  private String expiryDate;

    /**
     *
     * @param cardNumber
     * @param pin
     * @param cardHoldersName
     * @param expiryDate
     */
   //constructor
    public CardDetails(String cardNumber,String pin,String cardHoldersName,String expiryDate) {
        
        //initialize variables
        this.cardNumber=cardNumber;
        this.pin=pin;
        this.cardHoldersName=cardHoldersName;
        this.expiryDate=expiryDate;
         
    }
   
    /**
     *
     * @return card number
     */
    public String getCardNumber() {
		return cardNumber;
	}

    /**
     *
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
        
    /**
     *
     * @return pin
     */
    public String getpin() {
		return pin;
	}

    /**
     *
     * @param pin
     */
    public void setpin(String pin) {
		this.pin = pin;
	}
        
    /**
     *
     * @return card holders name
     */
    public String getcardHoldersName() {
		return cardHoldersName;
	}

    /**
     *
     * @param cardHoldersName
     */
    public void setcardHoldersName(String cardHoldersName) {
		this.cardHoldersName = cardHoldersName;
	}
        
    /**
     *
     * @return expire date
     */
    public String getExpiryDate() {
		return expiryDate;
	}

    /**
     *
     * @param ExpiryDate
     */
    public void setExpiryDate(String ExpiryDate) {
		this.expiryDate = expiryDate;
	}
       
     @Override
    public String toString() {
     
         return "Card Number : "+ cardNumber +" PIN : "+pin+" Expiry Date : "+expiryDate+" Card Holder : "+cardHoldersName;
     }
     
     private static class Serialization {
	
        // serialization code
	public static void serializeObject(CardList<CardDetails> cardList) throws IOException{
		
		FileOutputStream fos = new FileOutputStream(new File("Card.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cardList);
		oos.flush();
		oos.close();
	}
	//deserialization code
	public static CardList<CardDetails> deserializeObject() throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(new File("Card.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		CardList<CardDetails> cardList = (CardList<CardDetails>)ois.readObject();
		ois.close();
		return cardList;
	}

}          

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
            CardDetails c1 = new CardDetails("111111111","111","Harry","1-8-2018") ;
//            CardDetails c2 = new CardDetails("222222222","222","Kate","6-5-2020") ;
//            CardDetails c3 = new CardDetails("333333333","333","Paul","2-9-2019") ;
      
	CardList<CardDetails> cardList = new CardList<CardDetails>();
		cardList.add(c1);
//		cardList.add(c2);
//		cardList.add(c3);
         

		try {
			CardDetails.Serialization.serializeObject(cardList);

			for (CardDetails cost : CardDetails.Serialization.deserializeObject()) {
				System.out.println(cost);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
		
 
 
 
}
