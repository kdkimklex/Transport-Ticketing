/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author piumi
 * @param <CardDetails>
 */
public class CardList <CardDetails> extends Vector<CardDetails> implements Serializable {
 
      
    private static final long serialVersionUID = 1L;

   //call methods in the super class

    /**
     *
     */
    public CardList()
        {
            super();
        }

    /**
     *
     * @param card
     * @return
     */
    //add card details
    public boolean addPaymentList(CardDetails card) {
		return this.add(card);
	}

    /**
     *
     * @param card
     * @return
     */
    // remove card details
    public boolean removePayment(CardDetails card) {
		return this.remove(card);		
	}

    
    }
 
    

