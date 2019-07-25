/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.User;
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
public class Account implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    //declare variables
    String accID;
    String card;
    String balance;
    User user;
    String tokenbalance;
    String tokenid;

    /**
     *
     */
    public static  DynamicJourney dynamicjourney= new DynamicJourney("ds","sd","2018.8.20","2");
    
    /**
     *
     * @param accID
     * @param tokenid
     * @param card
     * @param balance
     * @param tokenbalance
     * @param dynamicjourney
     */
    public Account(String accID,String tokenid, String card, String balance, String tokenbalance,DynamicJourney dynamicjourney) {
        //initialize variables
        this.accID = accID;
        this.tokenid= tokenid;
        this.card = card;
        this.balance = balance;
        this.tokenbalance=tokenbalance;
        this.dynamicjourney= dynamicjourney;
        


    }
    
    /**
     *
     * @return accID
     */
    public String getaccID() {
      return accID;
    }
    
    /**
     *
     * @param accID
     */
    public void setaccID(String accID){
            this.accID = accID;
    }

    /**
     *
     * @return
     */
    public String gettokenid() {
        return tokenid;
    }

    /**
     *
     * @param tokenid
     */
    public void settokenid(String tokenid) {
        this.tokenid = tokenid;
    }

    /**
     *
     * @return card
     */
    public String getcard() {
      return card;
    }
    
    /**
     *
     * @param card
     */
    public void setcard(String card){
            this.card = card;
    }

    /**
     *
     * @return balance
     */
    public String getbalance() {
      return balance;
    }
    
    /**
     *
     * @param balance
     */
    public void setbalance(String balance){
            this.balance = balance;
    }

    /**
     *
     * @return
     */
    public String gettokenbalance() {
        return tokenbalance;
    }
    
    /**
     *
     * @param tokenbalance
     */
    public void setttokenbalance(String tokenbalance) {
        this.tokenbalance = tokenbalance;
    }

    /**
     *
     * @return
     */
    public String getSource () {
      return dynamicjourney.source;
    }

    /**
     *
     * @return
     */
    public String getDestination () {
      return dynamicjourney.destination;
    }

    /**
     *
     * @return
     */
    public String getDate () {
      return dynamicjourney.date;
    }
    
    /**
     *
     * @return
     */
    public String getTime () {
      return dynamicjourney.time;
    }
    
   
     static int getDynamicID() {
        return dynamicjourney.DynamicId;
     }
   
   
     
    
     
      @Override
    public String toString() {
     
          String s="Account ID : "+ accID +"Token ID :" +tokenid+" Card : "+card+" Balance : "+balance+
                 "TokenCard_Balance:"+tokenbalance+" DynamicjourneyId : "+ this.dynamicjourney.DynamicId;
          return s;
     }


     private static class Serialization {
         
         //serialization method
	
	public static void serializeObject(AccountList<Account> accountList) throws IOException{
		
		FileOutputStream fos = new FileOutputStream(new File("Account.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(accountList);
		oos.flush();
		oos.close();
	}
        
	//deserialization method
	public static AccountList<Account> deserializeObject() throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(new File("Account.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		AccountList<Account> accountList = (AccountList<Account>)ois.readObject();
		ois.close();
		return accountList;
	}

}  

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
          DynamicJourney d1= new DynamicJourney("ds","sd","2018.8.20","2");
    

          
            Account A1 = new Account("1","T01", "111111111", "0", "10",d1);

           
            
                 
	AccountList<Account> accountList = new AccountList<Account>();
		accountList.add(A1);

          

		try {
			Account.Serialization.serializeObject(accountList);

			for (Account account : Account.Serialization.deserializeObject()) {
				System.out.println(account);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}


