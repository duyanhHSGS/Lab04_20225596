package hust.soict.dsai.aims.cart;
import java.util.Vector;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private int qtyOrdered = 0;
	private Vector <DigitalVideoDisc> itemOrdered 
	= new Vector<> ( MAX_NUMBER_ORDERED );
	
	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBER_ORDERED) {
			System.out.println("Cannot add more to cart, your cart is full!");
			return;
		}
		itemOrdered.add(disc);
		qtyOrdered++;
		System.out.println("Disc (" + disc.getTitle()+ ") was added to your cart sucessfully!");
		if (qtyOrdered >= MAX_NUMBER_ORDERED-2) {
			System.out.println("Your cart is almost full! (" + qtyOrdered + "/" + MAX_NUMBER_ORDERED + ")");
		}
	}
	
	// this overload the previous method
//	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
//	    for (DigitalVideoDisc disc : dvdList) {
//	        addDigitalVideoDisc(disc); // reuse the previous method
//	    }
//	}
	// this overload the pre-previous method 
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	    System.out.println("Adding two discs to the cart... Waiting");
	    addDigitalVideoDisc(dvd1); 
	    addDigitalVideoDisc(dvd2); 
	}
	//using varargs
	public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
	    for (DigitalVideoDisc dvd : dvds) {
	        addDigitalVideoDisc(dvd); // Reuse the single-disc addition method
	    }
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	    if (itemOrdered.remove(disc)) {
	        qtyOrdered--;
	        System.out.println("Disc  (" + disc.getTitle()+ ")  was removed from cart successfully!");
	    } else {
	        System.out.println("The disc was not found in the cart!");
	    }
	}
	public float totalCost() {
		float total=0;
		for (int i=0; i<itemOrdered.size(); i++) {
			total+= itemOrdered.get(i).getCost();
		}
		return total;
	}
// implementing print feature:
	public void print() {
	    System.out.println("***********************CART***********************");
	    System.out.println("Ordered Items:");
	    for (int i = 0; i < itemOrdered.size(); i++) {
	        DigitalVideoDisc disc = itemOrdered.get(i);
	        System.out.println((i + 1) + ". " + disc);
	    }
	    System.out.println("Total cost: " + totalCost() + " $");
	    System.out.println("***************************************************");
	}
// implementing search feature:
	public void searchById(int id) {
	    boolean found = false;
	    for (DigitalVideoDisc disc : itemOrdered) {
	        if (disc.getId() == id) {
	            System.out.println("DVD Found: " + disc);
	            found = true;
	            break;
	        }
	    }
	    if (!found) {
	        System.out.println("No DVD found with ID: " + id);
	    }
	}
	public void searchByTitle(String title) {
	    boolean found = false;
	    for (DigitalVideoDisc disc : itemOrdered) {
	        if (disc.isMatch(title)) {
	            System.out.println("DVD Found: " + disc);
	            found = true;
	        }
	    }
	    if (!found) {
	        System.out.println("No DVD found with title: " + title);
	    }
	}
}