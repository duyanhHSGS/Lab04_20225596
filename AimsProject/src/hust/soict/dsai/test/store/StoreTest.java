package hust.soict.dsai.test.store;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a new Store
        Store store = new Store();

        try {
        	BufferedReader br = new BufferedReader(
        			new FileReader("data.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] dvdInfo = line.split(",");
                DigitalVideoDisc dvd;
                if (dvdInfo.length == 1) {
                    dvd = new DigitalVideoDisc(dvdInfo[0]);
                } else if (dvdInfo.length == 3) {
                    dvd = new DigitalVideoDisc(dvdInfo[0], dvdInfo[1], Float.parseFloat(dvdInfo[2]));
                } else if (dvdInfo.length == 5) {
                    dvd = new DigitalVideoDisc(
                        dvdInfo[0],
                        dvdInfo[1],
                        dvdInfo[2],
                        Integer.parseInt(dvdInfo[3]),
                        Float.parseFloat(dvdInfo[4]) 
                    );
                   // add more disc using method implemented in the dvd class
                } else {
                    continue; //skip unreadable lines
                }
                store.addDVD(dvd);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace(); //in case it failed
        }
        store.displayStore(); // test the display method, it works fine
        store.removeDVD(0); // not found
        store.displayStore();
        store.removeDVD(14); // disk 14 removed
        store.displayStore();
    }
    
}
