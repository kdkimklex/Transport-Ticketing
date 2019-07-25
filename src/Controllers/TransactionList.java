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
 * @param <TransactionRecord>
 */
public class TransactionList <TransactionRecord> extends Vector<TransactionRecord> {
    
       
    private static final long serialVersionUID = 1L;
    
    //call methods in the super class

    /**
     *
     */
    public TransactionList()
        {
            super();
        }

    /**
     *
     * @param TR
     * @return
     */
    //add transaction record
    public boolean addUserList(TransactionRecord TR) {
		return this.add(TR);
	}

    /**
     *
     * @param TR
     * @return
     */
    //remove transaction record
    public boolean removeUser(TransactionRecord TR) {
		return this.remove(TR);		
	}

    
}
