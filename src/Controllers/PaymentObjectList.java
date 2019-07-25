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
 * @param <Payment>
 */
public class PaymentObjectList<Payment> extends Vector<Payment> {
    
    private static final long serialVersionUID = 1L;

    //call methods in the super class

    /**
     *
     */
    public PaymentObjectList()
        {
            super();
        }

    /**
     *
     * @param payment
     * @return
     */
    public boolean addPaymentList(Payment payment) {
		return this.add(payment);
	}

    /**
     *
     * @param payment
     * @return
     */
    public boolean removePayment(Payment payment) {
		return this.remove(payment);		
	}

}
