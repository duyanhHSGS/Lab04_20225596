package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private ArrayList <Media> itemsOrdered 
	= new ArrayList<> ( MAX_NUMBER_ORDERED );
	
	public void addMedia(Media media) {
		if (itemsOrdered.size() == MAX_NUMBER_ORDERED) {
			System.out.println("Cannot add more to cart, your cart is full!");
			return;
		}
		itemsOrdered.add(media);
		System.out.println("Item (" + media.getTitle() + ") was added to your cart successfully!");
		if (itemsOrdered.size() >= MAX_NUMBER_ORDERED - 2) {
			System.out.println("Your cart is almost full! (" + itemsOrdered.size() + "/" + MAX_NUMBER_ORDERED + ")");
		}
	}
	public void removeMedia(Media media) {
		if (itemsOrdered.remove(media)) {
			System.out.println("Item (" + media.getTitle() + ") was removed from cart successfully!");
		} else {
			System.out.println("The item was not found in the cart!");
		}
	}
	public float totalCost() {
		float total = 0;
		for (Media media : itemsOrdered) {
			total += media.getCost();
		}
		return total;
	}

// implementing print feature:
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < itemsOrdered.size(); i++) {
			Media media = itemsOrdered.get(i);
			System.out.println((i + 1) + ". " + media);
		}
		System.out.println("Total cost: " + totalCost() + " $");
		System.out.println("***************************************************");
	}
// implementing search feature:
	public void searchById(int id) {
		boolean found = false;
		for (Media media : itemsOrdered) {
			if (media.getId() == id) {
				System.out.println("Media Found: " + media);
				found = true;
			}
		}
		if (!found) {
			System.out.println("No media found with ID: " + id);
		}
	}
	public void searchByTitle(String title) {
		boolean found = false;
		for (Media media : itemsOrdered) {
			if (media.getTitle() != null && media.getTitle().equalsIgnoreCase(title)) {
				System.out.println("Media Found: " + media);
				found = true;
			}
		}
		if (!found) {
			System.out.println("No media found with title: " + title);
		}
	}
}