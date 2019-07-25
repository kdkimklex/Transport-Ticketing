/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.Vector;

/**
 *
 * @author piumi
 * @param <User>
 */
public class UserList <User> extends Vector<User>{
    
   
    private static final long serialVersionUID = 1L;
    
   
    //call methods in the super class

    /**
     *
     */
    public UserList()
        {
            super();
        }

    /**
     *
     * @param user
     * @return
     */
    //method to add user
    public boolean addUserList(User user) {
		return this.add(user);
	}

    /**
     *
     * @param user
     * @return
     */
    //method to delete user
    public boolean removeUser(User user) {
		return this.remove(user);		
	}
}
