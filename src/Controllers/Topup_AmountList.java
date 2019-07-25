/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.Vector;

/**
 *
 * @author Kanchi
 * @param <Topup_AccountBalance>
 */
public class Topup_AmountList<Topup_AccountBalance> extends Vector<Topup_AccountBalance> {
    
    private static final long serialVersionUID = 1L;

    //call methods in the super class

    /**
     *
     */
    public Topup_AmountList()
        {
            super();
        }

    /**
     *
     * @param payment
     * @return
     */
    public boolean addPaymentList(Topup_AccountBalance payment) {
		return this.add(payment);
	}

    /**
     *
     * @param payment
     * @return
     */
    public boolean removePayment(Topup_AccountBalance payment) {
		return this.remove(payment);		
	}

}

