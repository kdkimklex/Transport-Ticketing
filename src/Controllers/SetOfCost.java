/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.JourneyCost;
import java.io.Serializable;

/**
 *
 * @author piumi
 */
public class SetOfCost implements Serializable {
    
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
    public JourneyCost journeycost;

    /**
     *
     * @param source
     * @param destination
     * @param date
     * @param time
     * @param journeycost
     */
    //constructor
    public SetOfCost(String source,String destination,String date,String time,JourneyCost journeycost)
     {
         //initialize variables
         this.source=source;
         this.destination=destination;
         this.date=date;
         this.time=time;
         this.journeycost=journeycost;

     
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
     * @return transport type
     */
    public String getTransportType() {
		return journeycost.transportType;
	}

    /**
     *
     * @return cost
     */
    public double getCost() {
		return journeycost.cost;
	}


        
                 
 }
 
 