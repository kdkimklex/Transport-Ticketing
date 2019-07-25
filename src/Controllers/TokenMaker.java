/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Controllers.Token;
import Models.Card_Token;
import Models.Email_Token;
import Models.Mobile_Token;

/**
 *
 * @author piumi
 */
public class TokenMaker {
    
    //declare token variables
    private Token mobile;
    private Token email;
    private Token card;
    String Tokencard_Id;
    String AccountID;
    String MobileNoID;
    String EmailID;

    /**
     *
     */
    public TokenMaker() {
       //initialize variables
      mobile = new Mobile_Token(AccountID,MobileNoID);
      email = new Email_Token(AccountID,EmailID);
      card = new Card_Token(Tokencard_Id);
      
   }
//methods calling subclass methods

    /**
     *
     */
   public void createMobileToken(){
      mobile.createToken();
   }

    /**
     *
     */
    public void createEmailToken(){
      email.createToken();
   }

    /**
     *
     */
    public void createCardToken(){
      card.createToken();
   }
}
