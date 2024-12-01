package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	public Book() {};
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public String toString() {
	    return "Book - " + getTitle() +
	           " - " + (getCategory() != null ? getCategory() : "Unknown Category") +
	           " - " + getAuthors().toString() +
	           ": " + getCost() + " $";
	}

}