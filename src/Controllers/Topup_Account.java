/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.Serializable;

/**
 *
 * @author Kanchi
 */
public class Topup_Account implements Serializable {

    private static final long serialVersionUID = 1L;

    //declare variables
    String paymentType;
    String topup_amount;
    
    /**
     *
     * @param paymentType
     * @param topup_amount
     */
    public Topup_Account(String paymentType,String topup_amount)
    {
        
  
        this.topup_amount=topup_amount;
        this.paymentType=paymentType;
        
    }
    
    /**
     *
     * @return
     */
    public String getpaymentType() {
		return paymentType;
	}

    /**
     *
     * @param paymentType
     */
    public void setpaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
  
    /**
     *
     * @return
     */
    public String gettopup_amount() {
		return topup_amount;
	}

    /**
     *
     * @param topup_amount
     */
    public void settopup_amount(String topup_amount) {
		this.topup_amount = topup_amount;
	}

    /**
     *
     */
    public void IsSuccessfull()
    {
        
    }
    
           @Override
    public String toString() {
     
         return " Payment Type : "+paymentType+" Amount : "+topup_amount;
                
     }


    
    

}
