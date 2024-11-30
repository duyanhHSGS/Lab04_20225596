package hust.soict.dsai.aims.store;

import java.util.Vector;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private Vector<DigitalVideoDisc> itemsInStore;

    // Constructor to initialize the store with an empty Vector
    public Store() {
        itemsInStore = new Vector<>();
    }

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("DVD added to the store: " + dvd);
    }

    // Method to remove a DVD from the store by ID
    public void removeDVD(int id) {
        boolean found = false;
        for (int i = 0; i < itemsInStore.size(); i++) {
            if (itemsInStore.get(i).getId() == id) {
                System.out.println("DVD removed from the store: " + itemsInStore.get(i));
                itemsInStore.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    // Method to display all DVDs in the store
    public void displayStore() {
        System.out.println("*************** STORE INVENTORY ***************");
        if (itemsInStore.isEmpty()) {
            System.out.println("No items in the store.");
        } else {
            for (DigitalVideoDisc dvd : itemsInStore) {
                System.out.println(dvd);
            }
        }
        System.out.println("************************************************");
    }
}
