/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.Vector;

/**
 *
 * @author piumi
 * @param <Account>
 */
public class AccountList <Account> extends Vector<Account>  {
    
    
    private static final long serialVersionUID = 1L;
    
    
    //call methods in the super class

    /**
     *
     */
    public AccountList()
        {
            super();
        }

    /**
     *
     * @param account
     * @return
     */
    //add account details
    public boolean addPaymentList(Account account) {
		return this.add(account);
	}

    /**
     *
     * @param account
     * @return
     */
    //remove account details
    public boolean removePayment(Account account) {
		return this.remove(account);		
	}

  
    
 
}
