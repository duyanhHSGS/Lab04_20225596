package hust.soict.dsai.aims.media;

public abstract class Media {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	public Media() {
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
	// override the original method 
	public boolean equals(Object anotherObject) {
		if (this == anotherObject) return true; // save time
		if (anotherObject instanceof Media) {
			Media media = (Media) anotherObject;
			return this.getTitle().equals(media.getTitle());
		}
		return false;
	}
}
