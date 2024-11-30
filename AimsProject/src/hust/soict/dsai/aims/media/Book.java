package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private int id;
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	public Book() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public void addAuthor(String authorName) {
	    if (!authors.contains(authorName)) {
	        authors.add(authorName);
	        System.out.println("Author " + authorName + " has been successfully added.");
	    } else {
	        System.out.println("Author " + authorName + " is already in the list.");
	    }
	}
	public void removeAuthor(String authorName) {
	    if (authors.contains(authorName)) {
	        authors.remove(authorName);
	        System.out.println("Author " + authorName + " has been successfully removed.");
	    } else {
	        System.out.println("Author " + authorName + " is not in the list.");
	    }
	}


}