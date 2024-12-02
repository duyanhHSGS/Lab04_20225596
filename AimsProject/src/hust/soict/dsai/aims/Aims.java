package hust.soict.dsai.aims;

import java.util.ArrayList;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
//import hust.soict.dsai.aims.media.Track;
//import hust.soict.dsai.aims.store.Store;

public class Aims {
    public static void main(String[] args) {
    	ArrayList<Media> mediaList = new ArrayList<>();
    	
		mediaList.add(new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f));
		mediaList.add(new Book("Harry Potter and the Philosopher's Stone", "Fantasy", 10.99f, "J.K. Rowling"));
		mediaList.add(new CompactDisc("Greatest Hits", "Music", "Various Directors", 60, 15.0f, "Various Artists"));
		
		for (Media media : mediaList) { 
			// Step 4: Print out the information using toString() 
			System.out.println(media);
		}
    }
}
