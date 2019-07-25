/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Controllers.SetOfOffers;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author piumi
 * @param <offer>
 */

    public class OfferList<offer> extends Vector<SetOfOffers> implements Serializable {
        
        private static final long serialVersionUID = 1L;

    //call methods in the super class

    /**
     *
     */
    public OfferList()
        {
            super();
        }

    /**
     *
     * @param offer
     * @return
     */
    //add offers
    public boolean addRouteList(SetOfOffers offer) {
		return this.add(offer);
	}

    /**
     *
     * @param offer
     * @return
     */
    //remove offers
    public boolean removeRoute(SetOfOffers offer) {
		return this.remove(offer);		
	}
    
}
