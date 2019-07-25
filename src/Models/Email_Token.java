/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controllers.Token;
import Views.MobileApp_Email;

/**
 *
 * @author piumi
 */
public class Email_Token extends Token {

    String AccountID;
    String EmailID;

    /**
     *
     * @param AccountID
     * @param EmailID
     */
    public Email_Token(String AccountID, String EmailID) {
        this.AccountID = AccountID;
        this.EmailID = EmailID;
    }

    /**
     *
     * @return
     */
    public String getAccountID() {
        return AccountID;
    }

    /**
     *
     * @param AccountID
     */
    public void setAccountID(String AccountID) {
        this.AccountID = AccountID;
    }

    /**
     *
     * @return
     */
    public String getEmailID() {
        return EmailID;
    }

    /**
     *
     * @param EmailID
     */
    public void setEmailID(String EmailID) {
        this.EmailID = EmailID;
    }
    
    
    
    @Override
    public void createToken() {
        
        new MobileApp_Email().setVisible(true);
    }

   
   }
    

