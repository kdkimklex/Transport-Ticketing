/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controllers.Token;
import Controllers.CardList;
import Controllers.CardTokenList;
import Views.MobileApp_Email;
import Views.TokenMachine_InsertToken;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



/**
 *
 * @author Kanchi
 */
public class Card_Token extends Token {         

    
     private static final long serialVersionUID = 1L;
    
    //declare variables
   String   Tokencard_Id;
   
    /**
     *
     * @param Tokencard_Id
     */
    public Card_Token(String Tokencard_Id ) {
        
        //initialize variables
        this.Tokencard_Id=Tokencard_Id;
        
         
    }
    
    /**
     *
     * @return
     */
    public String getTokencard_Id() {
		return Tokencard_Id;
	}

    /**
     *
     * @param Tokencard_Id
     */
    public void setTokencard_Id(String Tokencard_Id) {
		this.Tokencard_Id = Tokencard_Id;
	}
    
@Override
    public void createToken() {
        
        new TokenMachine_InsertToken().setVisible(true);
    }

   
    @Override
    
     public String toString() {
    return "Token_Card Number : "+ Tokencard_Id;
            }
     
      private static class Serialization {
	
        // serialization code
	public static void serializeObject(CardTokenList<Card_Token > cardList) throws IOException{
		
		FileOutputStream fos = new FileOutputStream(new File("TokenCard.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cardList);
		oos.flush();
		oos.close();
	}
	//deserialization code
	public static CardTokenList<Card_Token > deserializeObject() throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(new File("TokenCard.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		CardTokenList<Card_Token> cardList = (CardTokenList<Card_Token >)ois.readObject();
		ois.close();
		return cardList;
	}
         public static void main(String[] args) {
        
            Card_Token c1 = new Card_Token("T01") ;
           
	CardTokenList<Card_Token> cardList = new CardTokenList<Card_Token>();
		cardList.add(c1);
		
         

		try {
			Card_Token.Serialization.serializeObject(cardList);

			for (Card_Token cost : Card_Token.Serialization.deserializeObject()) {
				System.out.println(cost);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

} 
    
}
