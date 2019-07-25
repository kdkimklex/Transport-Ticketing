/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controllers.Token;
import Views.MobileApp_Mobile;

/**
 *
 * @author piumi
 */
public class Mobile_Token extends Token {
    
    String AccountID;
    String MobileNoID;

    /**
     *
     * @param AccountID
     * @param MobileNoID
     */
    public Mobile_Token(String AccountID, String MobileNoID) {
        this.AccountID = AccountID;
        this.MobileNoID = MobileNoID;
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
    public String getMobileNoID() {
        return MobileNoID;
    }

    /**
     *
     * @param MobileNoID
     */
    public void setMobileNoID(String MobileNoID) {
        this.MobileNoID = MobileNoID;
    }
    
 
   @Override
   public void createToken() {
       new MobileApp_Mobile().setVisible(true);

   }    
}
