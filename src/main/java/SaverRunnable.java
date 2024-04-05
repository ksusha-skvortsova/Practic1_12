package com.mycompany.mavenproject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SaverRunnable implements Runnable {
    private final Plant plant;
    private final String path;

    public SaverRunnable(Plant plant, String path) {
        this.path = path;
        this.plant = plant;
    }
    
@Override
    public void run () {
        if(this.path != null && plant != null) {
            FileOutputStream fos;
            try {
            fos = new FileOutputStream ( this.path);
            ObjectOutputStream oos = new ObjectOutputStream ( fos) ;
            oos.writeObject ( plant) ;
            oos.close ();
            System.out.println ("Success serialization obj Plant");
            } catch (IOException ex) {
            System.out.println ("Error saving object to path: " + this.path);
            }
        }
    }  
}
