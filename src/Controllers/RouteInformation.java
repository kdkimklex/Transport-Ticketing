/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

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
public class RouteInformation implements Serializable {
    
   private static final long serialVersionUID = 1L;
     
    /**
     *
     * @param routeList
     * @throws IOException
     */
   //serialize Payment file
    public static void serializeObject(PaymentList<PaymentManager> routeList) throws IOException{
		
		FileOutputStream fos = new FileOutputStream(new File("Payment.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(routeList);
		oos.flush();
		oos.close();
	}
	
    /**
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    //deserialize Payment file
    public static PaymentList<PaymentManager> deserializeObject() throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(new File("Payment.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		PaymentList<PaymentManager> routeList = (PaymentList<PaymentManager>)ois.readObject();
		ois.close();
		return routeList;
	}

    /**
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    //method to get all journeys
    public PaymentList<PaymentManager> searchJourneys() throws IOException, ClassNotFoundException
    {
        PaymentList<PaymentManager> List = deserializeObject();
        return List;
    }

   
    


}
