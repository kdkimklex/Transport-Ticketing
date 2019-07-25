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
 * @param <Cost>
 */
public class PaymentList<Cost> extends Vector<Cost> {
    
    private static final long serialVersionUID = 1L;

    //call methods in the super class

    /**
     *
     */
    public PaymentList()
        {
            super();
        }

    /**
     *
     * @param cost
     * @return
     */
    //add payment details
    public boolean addPaymentList(Cost cost) {
		return this.add(cost);
	}

    /**
     *
     * @param cost
     * @return
     */
    //remove payment details
    public boolean removePayment(Cost cost) {
		return this.remove(cost);		
	}

    
 
    }
 
