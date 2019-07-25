/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author piumi
 */
public class JourneyCost implements Serializable{
    
private static final long serialVersionUID = 1L;

    //declare variables

    /**
     *
     */
    public String RouteID;

    /**
     *
     */
    public String transportType;

    /**
     *
     */
    public double cost;
               
    /**
     *
     * @param RouteID
     * @param transportType
     * @param cost
     */
    //constructor
    public JourneyCost(String RouteID,String transportType,double cost) {
                       //initialize variables
			this.RouteID = RouteID;
                        this.transportType=transportType;
		        this.cost=cost;
                        
		 
		}
 
    @Override
    public String toString() {
     
         return "Route ID : "+ RouteID +"Transport Type : "+ transportType+" Cost : "+cost+"]";
     }
		
}

