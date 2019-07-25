/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Offer;
import java.io.Serializable;

/**
 *
 * @author piumi
 */
public class SetOfOffers implements Serializable  {

    private static final long serialVersionUID = 1L;
   
   //declare variables

    /**
     *
     */
    public String source;

    /**
     *
     */
    public String destination;

    /**
     *
     */
    public String date;

    /**
     *
     */
    public String time;

    /**
     *
     */
    public String account;

    /**
     *
     */
    public Offer offer;
 
    /**
     *
     * @param source
     * @param destination
     * @param date
     * @param time
     * @param account
     * @param offer
     */
    //constructor
    public SetOfOffers(String source,String destination,String date,String time,String account,Offer offer)
     {
         //initialize variables
         this.source=source;
         this.destination=destination;
         this.date=date;
         this.time=time;
         this.account=account;
         this.offer=offer;
     }

    /**
     *
     * @return source
     */
    public String getSource() {
		return source;
	}

    /**
     *
     * @param source
     */
    public void setSource(String source) {
		this.source = source;
	}
        
    /**
     *
     * @return destination
     */
    public String getDestination() {
		return destination;
	}

    /**
     *
     * @param destination
     */
    public void setDestination(String destination) {
		this.destination = destination;
	}
        
    /**
     *
     * @return time
     */
    public String getTime() {
		return time;
	}

    /**
     *
     * @param time
     */
    public void setTime(String time) {
		this.time = time;
	}
        
    /**
     *
     * @return date
     */
    public String getDate() {
		return date;
	}

    /**
     *
     * @param date
     */
    public void setDate(String date) {
		this.date = date;
	}

    /**
     *
     * @return account
     */
    public String getaccount() {
		return account;
	}

    /**
     *
     * @param account
     */
    public void setaccount(String account) {
		this.account = account;
	}

    /**
     *
     * @return offer
     */
    public double getOffer() {
		return offer.discount;
	}
         
    /**
     *
     * @param offer
     */
    public void setoffer(Offer offer) {
		this.offer = offer;
	}

}



	