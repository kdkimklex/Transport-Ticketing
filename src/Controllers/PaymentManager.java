/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.JourneyCost;
import Models.Offer;
import Views.ExitGate_Discount;
import Views.MobileApp_ReservationDetails;
import static Views.MobileApp_ReservationDetails.Deserialize;
import static Views.MobileApp_ReservationDetails.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author piumi
 */
public class PaymentManager implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    //declare variables

    /**
     *
     */
    public SetOfCost setofcosts;

    /**
     *
     */
    public SetOfOffers setofoffers;
     
    /**
     *
     * @param setofcosts
     * @param setofoffers
     */
    //constructor
    public PaymentManager(SetOfCost setofcosts,SetOfOffers setofoffers)
     {
         //initialize variables
         this.setofcosts=setofcosts;
         this.setofoffers=setofoffers;
              
     }
     
    /**
     *
     * @return discount
     */
    
    public double getOffer() {
		return setofoffers.offer.discount;
	}
//   

    /**
     *
     * @return source
     */
         public String getSource() {
		return setofoffers.source;
	}

    /**
     *
     * @return destination
     */
    public String getDestination() {
		return setofoffers.destination;
	}

    /**
     *
     * @return time
     */
    public String getTime() {
		return setofoffers.time;
	}

    /**
     *
     * @return date
     */
    public String getDate() {
		return setofoffers.date;
	}

    /**
     *
     * @return account
     */
    public String getaccount() {
		return setofoffers.account;
	}
        
    /**
     *
     * @return transport type
     */
    public String getTransportType() {
		return setofcosts.journeycost.transportType;
	}

    /**
     *
     * @return cost
     */
    public double getCost() {
		return setofcosts.journeycost.cost;
	}

    
    
     @Override
    public String toString() {
     
         return "[Set Of Cost ]"+setofcosts+"\n[Set Of Offers ]"+setofoffers;
     }

     
    
    private static class Serialization {
	
        //serialization code
	public static void serializeObject(PaymentList<PaymentManager> paymentList) throws IOException{
		
		FileOutputStream fos = new FileOutputStream(new File("Payment.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(paymentList);
		oos.flush();
		oos.close();
	}
	//deserialization code
	public static PaymentList<PaymentManager> deserializeObject() throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(new File("Payment.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		PaymentList<PaymentManager> paymentList = (PaymentList<PaymentManager>)ois.readObject();
		ois.close();
		return paymentList;
	}
  
       
}          

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
            JourneyCost JC1 = new JourneyCost("1","Bus",2.0);
            JourneyCost JC2 = new JourneyCost("2","Tram",3.0);
            JourneyCost JC3 = new JourneyCost("3","Train",2.50);
            JourneyCost JC4 = new JourneyCost("4","Bus",1.0);
            JourneyCost JC5 = new JourneyCost("5","Train",2.50);

            SetOfCost SC1 = new SetOfCost("London","Sheffield","3-8-2018","4.50",JC1);
            SetOfCost SC2 = new SetOfCost("Cambridge","Leeds","2-8-2018","5.20",JC2);
            SetOfCost SC3 = new SetOfCost("Manchester","Oxford","2-9-2018","4.30",JC3);
            SetOfCost SC4 = new SetOfCost("Cambridge","Bristol","3-9-2018","2.30",JC4);
            SetOfCost SC5 = new SetOfCost("London","Liverpool","2-9-2018","4.30",JC3);
            
            Offer offer1 = new Offer("1","Route offer",0.20);
            Offer offer2 = new Offer("2","Good Transaction History",0.50);
            
            SetOfOffers SO1 = new SetOfOffers("London","Sheffield","3-8-2018","4.50","account1",offer1);
            SetOfOffers SO2 = new SetOfOffers("Cambridge","Leeds","2-8-2018","5.20","account2",offer1);
            SetOfOffers SO3 = new SetOfOffers("Manchester","Oxford","2-9-2018","4.30","account3",offer1);
            SetOfOffers SO4 = new SetOfOffers("Cambridge","Bristol","3-9-2018","4.30","account4",offer1);
            SetOfOffers SO5 = new SetOfOffers("London","Liverpool","2-9-2018","4.30","account5",offer1);
            
            PaymentManager PM1 = new PaymentManager(SC1,SO1);
            PaymentManager PM2 = new PaymentManager(SC2,SO2);
            PaymentManager PM3 = new PaymentManager(SC3,SO3);
            PaymentManager PM4 = new PaymentManager(SC4,SO4);
            PaymentManager PM5 = new PaymentManager(SC5,SO5);
            
             
            
	PaymentList<PaymentManager> paymentList = new PaymentList<PaymentManager>();
		paymentList.add(PM1);
		paymentList.add(PM2);
		paymentList.add(PM3);
                paymentList.add(PM4);
                paymentList.add(PM5);

		try {
			PaymentManager.Serialization.serializeObject(paymentList);

			for (PaymentManager cost : PaymentManager.Serialization.deserializeObject()) {
				System.out.println(cost);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
     
    /**
     *
     * @param Source
     * @param Dest
     * @param Date
     * @param Time
     */
    
    //method to check offers
    public static void checkOffers(String Source,String Dest,String Date,String Time){
     
        PaymentList<PaymentManager> offerArr = null;        //initialize offerArr
        offerArr = new PaymentList<PaymentManager>();       //create new offerArr
        offerArr = (PaymentList<PaymentManager>) Deserialize(file);  //deserialize file

        for (int i = 0; i < offerArr.size(); i++) {
            PaymentManager temp = (PaymentManager) offerArr.get(i);
            if (Source.equals(temp.getSource()) && Dest.equals(temp.getDestination())
                && Date.equals(temp.getDate()) && Time.equals(temp.getTime())) {

                MobileApp_ReservationDetails.offer.setText(String.valueOf(temp.getOffer()));

            }
        }

    }
    
    /**
     *
     * @param source
     * @param destination
     * @param Date
     * @param Time
     */
    public static void checkOffer(String source,String destination,String Date,String Time){
     
        PaymentList<PaymentManager> offerArr = null;        //initialize offerArr
        offerArr = new PaymentList<PaymentManager>();       //create new offerArr
        offerArr = (PaymentList<PaymentManager>) Deserialize(file);  //deserialize file

        for (int i = 0; i < offerArr.size(); i++) {
            PaymentManager temp = (PaymentManager) offerArr.get(i);
            if (source.equals(temp.getSource()) && destination.equals(temp.getDestination())
                && Date.equals(temp.getDate()) && Time.equals(temp.getTime())) {

               ExitGate_Discount.offerbox.setText(String.valueOf(temp.getOffer()));

            }
        }

    }
}

    
         
         
         
         
         
         
         
         
         
         
         
         
         