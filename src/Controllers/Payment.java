/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.Serializable;

/**
 *
 * @author piumi
 */
public class Payment implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int paymentId;
    String paymentType;
    String paymentAmount;
    
     private static int paymentcount = 0;
    
    /**
     *
     * @param paymentType
     * @param paymentAmount
     */
    public Payment(String paymentType,String paymentAmount)
    {
        
        paymentId=++paymentcount;
        this.paymentAmount=paymentAmount;
        this.paymentType=paymentType;
        
    }
    
    /**
     *
     * @return
     */
    public int getpaymentId() {
            return paymentId;
	}

    /**
     *
     * @return
     */
    public String getpaymentType() {
		return paymentType;
	}

    /**
     *
     * @param paymentType
     */
    public void setpaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
  
    /**
     *
     * @return
     */
    public String getpaymentAmount() {
		return paymentAmount;
	}

    /**
     *
     * @param paymentAmount
     */
    public void setpaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

    /**
     *
     */
    public void IsSuccessfull()
    {
//        System.out.println("Success");
    }
    
           @Override
    public String toString() {
     
         return " Payment ID: "+ paymentId +" Payment Type : "+paymentType+" Amount : "+paymentAmount;
                
     }
     
//     private static class Serialization {
//	
//	public static void serializeObject(UserList<User> userList) throws IOException{
//		
//		FileOutputStream fos = new FileOutputStream(new File("User.txt"));
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(userList);
//		oos.flush();
//		oos.close();
//	}
//	
//	public static UserList<User> deserializeObject() throws IOException, ClassNotFoundException{
//		
//		FileInputStream fis = new FileInputStream(new File("User.txt"));
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		UserList<User> userList = (UserList<User>)ois.readObject();
//		ois.close();
//		return userList;
//	}
//
//}          
//
//     public static void main(String[] args) {
//        
//            User u1 = new User("Harry","34/2,Park Road","London","0002","harry@gmail.com","harry");
//            User u2 = new User("Peter","33/7,Castle Road","London","0002","peter@gmail.com","peter");
//            User u3 = new User("Ann","84/4,Mary Road","Leeds","0062","ann@gmail.com","ann");
//      
//	UserList<User> userList = new UserList<User>();
//		userList.add(u1);
//		userList.add(u2);
//		userList.add(u3);
//         
//
//		try {
//			User.Serialization.serializeObject(userList);
//
//			for (User user : User.Serialization.deserializeObject()) {
//				System.out.println(user);
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//
//	}
//	
		
 
 
 
}
