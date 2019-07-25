/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author piumi
 * @param <DynamicJourney>
 */
public class JourneyList<DynamicJourney> extends Vector<DynamicJourney> {

    private static final long serialVersionUID = 1L;
    //Eager Initialization - Singleton
    private static JourneyList ins = null;

    //call methods in the super class
    //Prevent object creation

    /**
     *
     */
    public JourneyList() {
        super();
    }

    //Create singleton object

    /**
     *
     * @return
     */
    public static JourneyList<Controllers.DynamicJourney> getInstance() {
        if (ins == null) {
            synchronized (JourneyList.class) {
                if (ins == null) {
                    FileInputStream fis = null;
                    try {
                        fis = new FileInputStream(new File("journey.txt"));
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        ins = (JourneyList<Controllers.DynamicJourney>) ois.readObject();
                        ois.close();
                        System.out.println("JourneyList Deserialized");
                        return ins;
                    } catch (FileNotFoundException ex) {
                    } catch (IOException | ClassNotFoundException ex) {
                    }
                    ins = new JourneyList();
                }
                
            }
        }
        return ins;
    }

    private static void serialize() {
      
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("journey.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ins);
            oos.flush();
            oos.close();
            System.out.println("JourneyList Serialized");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JourneyList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JourneyList.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(JourneyList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     *
     * @param journey
     * @return
     */
    //add account details
    public boolean addJourneyList(DynamicJourney journey) {
        boolean success = this.add(journey);
        serialize();
        return success;
    }

    /**
     *
     * @param journey
     * @return
     */
    //remove account details
    public boolean removeJourneyList(DynamicJourney journey) {
        boolean success = this.remove(journey);
        serialize();
        return success;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        JourneyList<Controllers.DynamicJourney> instance = getInstance();
        for (Controllers.DynamicJourney journey : instance) {
            System.out.println(journey);
        }
    }
}
