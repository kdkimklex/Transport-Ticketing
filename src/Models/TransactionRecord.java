/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controllers.TransactionList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author piumi
 */
public class TransactionRecord implements Serializable{
    
     private static final long serialVersionUID = 1L;
    
     //declare variables
    long SerialNo;
    String AccountID; 
    String Source;
    String Dest;
    String Date;
    String Time;
    String Vehicle;
    String Total;
    String balance;
    String topup_amount;
    String Total_balance;
    
    /**
     *
     * @param AccountID
     * @param Source
     * @param Dest
     * @param Date
     * @param Time
     * @param Vehicle
     * @param Total
     */
    //constructor
    public TransactionRecord(String AccountID,String Source,String Dest,String Date,String Time,String Vehicle,String Total)
    {
            //initialize variables
            this.SerialNo=generateRandom(52);
            this.AccountID=AccountID;
            this.Source=Source;
            this.Dest=Dest;
            this.Date=Date;
            this.Time=Time;
            this.Vehicle=Vehicle;
            this.Total=Total;
         
    }
    
    /**
     *
     * @param balance
     * @param Total_balnce
     */
    public void Transactionrecord( String balance,String Total_balnce){
        
        this.balance=balance;
        this.Total_balance=Total_balance;
        
        
       
    }    

    
    

    /**
     *
     * @return serial no
     */
    public long getSerialNo() {
		return SerialNo;
	}

    /**
     *
     * @param SerialNo
     */
    public void setSerialNo(long SerialNo) {
		this.SerialNo= SerialNo;
	}

    /**
     *
     * @return account id
     */
    public String getAccountID() {
		return AccountID;
	}

    /**
     *
     * @param AccountID
     */
    public void setAccountID(String AccountID) {
		this.AccountID= AccountID;
	}
    
    /**
     *
     * @return source
     */
    public String getSource() {
		return Source;
	}

    /**
     *
     * @param Source
     */
    public void setSource(String Source) {
		this.Source = Source;
	}
        
    /**
     *
     * @return destination
     */
    public String getDestination() {
		return Dest;
	}

    /**
     *
     * @param Dest
     */
    public void setDestination(String Dest) {
		this.Dest = Dest;
	}
        
    /**
     *
     * @return time
     */
    public String getTime() {
		return Time;
	}

    /**
     *
     * @param Time
     */
    public void setTime(String Time) {
		this.Time = Time;
	}
        
    /**
     *
     * @return date
     */
    public String getDate() {
		return Date;
	}

    /**
     *
     * @param Date
     */
    public void setDate(String Date) {
		this.Date = Date;
	}

    /**
     *
     * @return vehicle
     */
    public String getVehicle() {
		return Vehicle;
	}

    /**
     *
     * @param Vehicle
     */
    public void setVehicle(String Vehicle) {
		this.Vehicle = Vehicle;
	}

    /**
     *
     * @return cost
     */
    public String getCost() {
		return Total;
	}

    /**
     *
     * @param Total
     */
    public void setCost(String Total) {
		this.Total = Total;
	}
    
    /**
     *
     * @return
     */
    public String get() {
		return balance;
	}

    /**
     *
     * @param balance
     */
    public void setbalance(String balance) {
		this.balance = balance;
	}
  
    /**
     *
     * @return
     */
    public String gettopup_amount() {
		return topup_amount;
	}

    /**
     *
     * @param topup_amount
     */
    public void settopup_amount(String topup_amount) {
		this.topup_amount = topup_amount;
	}
         
    /**
     *
     * @param prefix
     * @return
     */
    public static long generateRandom(int prefix) {
        Random rand = new Random();

        long x = (long)(rand.nextDouble()*100000000000000L);

        String s = String.valueOf(prefix) + String.format("%014d", x);
        return Long.valueOf(s);
    
         
        }
//     public String toString() {
//     
//      
//         return " Current Amout : "+balance+" topup_amount: "+topup_amount;
//     }

     
    
    private static class Serialization {
	
        //serialization code
	public static void serializeObject(TransactionList<TransactionRecord> TransactionList) throws IOException{
		
		FileOutputStream fos = new FileOutputStream(new File("topuptransactionrecord.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(TransactionList);
		oos.flush();
		oos.close();
	}
	//deserialization code
	public static TransactionList<TransactionRecord> deserializeObject() throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(new File("topuptransactionrecord.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		TransactionList<TransactionRecord> TransactionList = (TransactionList<TransactionRecord>)ois.readObject();
		ois.close();
		return TransactionList;
	}
        
         //method to get all transactionrecord
        public TransactionList<TransactionRecord> addTransactionRecord() throws IOException, ClassNotFoundException
    {
        TransactionList<TransactionRecord> List = deserializeObject() ;
        return List;
    }
    }
    
         
//      public static boolean getRecords()
//     {
//                    
//            TransactionList <TransactionRecord> recArr = null;
//            recArr = new TransactionList <TransactionRecord>();
//            recArr = (TransactionList <TransactionRecord>) Deserialize(file);
//
//           for (int i = 0; i < recArr.size(); i++) {
//            TransactionRecord temp = (TransactionRecord) recArr.get(i);
//           
//                jTextfield1.setText(String.valueOf(temp.getSource()));
//
//            }
//     }
//      
//       TransactionList <TransactionRecord>  offers = new TransactionList <TransactionRecord> ();
//    public static final File file = new File("TransactionRecord.txt");
//      
//      
//       public static TransactionList Deserialize(File filename) {
//
//        TransactionList d_arraylist = null;
//        try {
//            FileInputStream fis = new FileInputStream(filename);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//
//            d_arraylist = (TransactionList) ois.readObject();
//            fis.close();
//            System.out.println("Deserialized");
//            System.out.println(d_arraylist);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
//
//        return d_arraylist;
//    }

}