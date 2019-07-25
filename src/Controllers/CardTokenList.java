/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Kanchi
 * @param <Card_Token>
 */
public class CardTokenList <Card_Token> extends Vector<Card_Token> implements Serializable {
    
     private static final long serialVersionUID = 1L;

   //call methods in the super class

    /**
     *
     */
    public CardTokenList()
        {
            super();
        }

    
}
