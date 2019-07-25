/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controllers.Topup_Account;




/**
 *
 * @author piumi
 */
public class Card extends Topup_Account{    
    
    /**
     *
     * @param paymentType
     * @param topup_amount
     */
    public Card(String paymentType, String topup_amount) {
        super(paymentType, topup_amount);
    }
    
    @Override
    public void IsSuccessfull()
    {     
         
         

    }
 
}