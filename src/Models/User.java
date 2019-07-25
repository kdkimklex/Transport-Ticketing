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
public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;

    
    //declare variables
    int UserID;
    String UserName;
    String UserAddress;
    String UserCity;
    String UserPostCode;
    String UserEmail;
    String UserPassword;
    
    private static int UserCount = 0;
    

    /**
     *
     * @param name
     * @param address
     * @param city
     * @param postcode
     * @param email
     * @param password
     */
    // constructor
    public User(String name, String address, String city, String postcode, String email, String password) {
       // initialize variables
            UserName = name;
            UserAddress = address;
            UserCity=city;
            UserPostCode=postcode;
            UserEmail = email;
            UserPassword = password; 
            UserID=++UserCount;
    }

    /**
     *
     * @return user id
     */
    public int getID() {
      return UserID;
    }
    
    /**
     *
     * @param UserName
     */
    public void setName(String UserName){
            this.UserName = UserName;
    }
    
    /**
     *
     * @return user name
     */
    public String getName() {
        return UserName;
    }

    /**
     *
     * @param UserEmail
     */
    public void setEmail(String UserEmail){
            this.UserEmail = UserEmail;
    }
    
    /**
     *
     * @return email
     */
    public String getEmail() {
        return UserEmail;
    }
    
    /**
     *
     * @param UserPassword
     */
    public void setPassword(String UserPassword){
            this.UserPassword = UserPassword;
    }
    
    /**
     *
     * @return password
     */
    public String getPassword() {
        return UserPassword;
    }
    
    /**
     *
     * @param UserAddress
     */
    public void setAddress(String UserAddress){
            this.UserAddress = UserAddress;
    }
    
    /**
     *
     * @return address
     */
    public String getAddress() {
        return UserAddress;
    }

    /**
     *
     * @param UserCity
     */
    public void setCity(String UserCity){
            this.UserCity = UserCity;
    }
    
    /**
     *
     * @return city
     */
    public String getCity() {
        return UserCity;
    }
    
    /**
     *
     * @param UserPostCode
     */
    public void setPostCode(String UserPostCode){
            this.UserPostCode = UserPostCode;
    }
    
    /**
     *
     * @return postcode
     */
    public String getPostCode() {
        return UserPostCode;
    }
    
    /**
     *
     * @param UserCount
     */
    public void setUserCount(int UserCount) {
        User.UserCount = UserCount;
    }
    
    /**
     *
     * @return user count
     */
    public static int getUserCount() {
            return UserCount;
    }
     
//       @Override
//    public String toString() {
//     
//         return " User ID: "+ UserID +" Name : "+UserName+" Address : "+UserAddress+" City : "+UserCity+"Post Code :"+
//                 UserPostCode+" Email :"+UserEmail+"Password :"+UserPassword;
//     }
     
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


