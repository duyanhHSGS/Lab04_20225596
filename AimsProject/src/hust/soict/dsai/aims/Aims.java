package hust.soict.dsai.aims;

import java.util.Vector;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.io.File;
public class Aims {
    public static void main(String[] args) {
//    	Vector<DigitalVideoDisc> storeDvds = new Vector<>();
////		debugging process 	
////    	File file = new File("data.txt");
////      System.out.println("Absolute Path: " + file.getAbsolutePath());
//
//        Cart anOrder = new Cart();
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Disk 1", "Categ1", 300);
//        storeDvds.add(dvd1);
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Disk 2", "Categ2", "Director1",180, 300);
//        storeDvds.add(dvd2);
//        // adding more disc using this way is not comfortable
//        // i used reading in a text file should be cleaner & more comfortable
//        
//        try {
//        	BufferedReader br = new BufferedReader(
//        			new FileReader("data.txt"));
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] dvdInfo = line.split(",");
//                DigitalVideoDisc dvd;
//                if (dvdInfo.length == 1) {
//                    dvd = new DigitalVideoDisc(dvdInfo[0]);
//                } else if (dvdInfo.length == 3) {
//                    dvd = new DigitalVideoDisc(dvdInfo[0], dvdInfo[1], Float.parseFloat(dvdInfo[2]));
//                } else if (dvdInfo.length == 5) {
//                    dvd = new DigitalVideoDisc(
//                        dvdInfo[0],
//                        dvdInfo[1],
//                        dvdInfo[2],
//                        Integer.parseInt(dvdInfo[3]),
//                        Float.parseFloat(dvdInfo[4]) 
//                    );
//                   // add more disc using method implemented in the dvd class
//                } else {
//                    continue; //skip unreadable lines
//                }
//                storeDvds.add(dvd);
//            }
//            br.close();
//        } catch (IOException e) {
//            e.printStackTrace(); //in case it failed
//        }
//        System.out.println("Listing all disks in the store:");
//        for ( int i =0 ; i < storeDvds.size() ; i++) {
//            System.out.println( "storeDvds[" + i + "] : Title: " + storeDvds.get(i).getTitle());
//        }
//        System.out.println("Listing completed");
//        // storeDvds was initiated successfully
//        
//        // ordering
//        anOrder.addDigitalVideoDisc(dvd2);
//        anOrder.addDigitalVideoDisc(storeDvds.get(0));
//        anOrder.addDigitalVideoDisc(storeDvds.get(0));
//        anOrder.addDigitalVideoDisc(storeDvds.get(1));
//        anOrder.addDigitalVideoDisc(storeDvds.get(6));
//        anOrder.addDigitalVideoDisc(storeDvds.get(15));
//        anOrder.addDigitalVideoDisc(storeDvds.get(2));
//        anOrder.addDigitalVideoDisc(storeDvds.get(3));
//        anOrder.addDigitalVideoDisc(storeDvds.get(4));
//        anOrder.addDigitalVideoDisc(dvd1);
//        anOrder.addDigitalVideoDisc(dvd2);
//        anOrder.addDigitalVideoDisc(storeDvds.get(0));
//        anOrder.addDigitalVideoDisc(storeDvds.get(0));
//        anOrder.addDigitalVideoDisc(storeDvds.get(1));
//        anOrder.addDigitalVideoDisc(storeDvds.get(6));
//        anOrder.addDigitalVideoDisc(storeDvds.get(15));
//        anOrder.addDigitalVideoDisc(storeDvds.get(2));
//        //the output starts returning (almost full) messages
//        anOrder.addDigitalVideoDisc(storeDvds.get(3));
//        anOrder.addDigitalVideoDisc(storeDvds.get(4));
//        anOrder.addDigitalVideoDisc(dvd1);
//        //cart full here
//        anOrder.addDigitalVideoDisc(dvd1);
//        //returning (cannot add more)
//        System.out.println("Total cost: "+ anOrder.totalCost() + " dollar(s)");
//        anOrder.removeDigitalVideoDisc(storeDvds.get(1));
//        //remove "Disk 2" from the cart
//        anOrder.removeDigitalVideoDisc(storeDvds.get(18));
//        //remove "Disk 19" from the cart
//        //returning (not exits) message
//        System.out.println("Total cost: "+ anOrder.totalCost() + " dollar(s)");
    }
}