/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Controllers.SetOfCost;
import java.io.Serializable;
import java.util.Vector;


/**
 *
 * @author piumi
 * @param <route>
 */
public class RouteList<route> extends Vector<SetOfCost> implements Serializable {
    
    private static final long serialVersionUID = 1L;

    //call methods in the super class

    /**
     *
     */
    public RouteList()
        {
            super();
        }

    /**
     *
     * @param route
     * @return
     */
    //add route details
    public boolean addRouteList(SetOfCost route) {
		return this.add(route);
	}

    /**
     *
     * @param route
     * @return
     */
    //remove route details
    public boolean removeRoute(SetOfCost route) {
		return this.remove(route);		
	}
}
