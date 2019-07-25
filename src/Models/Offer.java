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
public class Offer implements Serializable {
    
     private static final long serialVersionUID = 1L;
   
    //declare variables
    String offerID;
    String offercriteria;

    /**
     *
     */
    public double discount;
    
    /**
     *
     * @param offerID
     * @param offercriteria
     * @param discount
     */
    public Offer(String offerID,String offercriteria,double discount)
    
    {   //initialize variables
        this.offerID=offerID;
        this.offercriteria=offercriteria;
        this.discount=discount;
    }
    
    
      @Override
    public String toString() {
     
         return "Offer ID : "+ offerID +" Offer Criteria : "+offercriteria+"Discount"+discount;
     }
    
}
