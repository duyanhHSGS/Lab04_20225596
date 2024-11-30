package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	public int getId() {
		return id;
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
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}	
	// update this thing so the following constructors overload this
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title) {
        this(title, null, null, 0, 0.0f);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this(title, category, null, 0, cost); 
    }
    public String toString() {
        return "DVD - " + title + 
               " - " + (category != null ? category : "Unknown") +
               " - " + (director != null ? director : "Unknown") +
               " - " + (length > 0 ? length + " mins" : "Unknown Length") +
               ": " + cost + " $";
    }
    public boolean isMatch(String title) {
        return this.title != null && this.title.equalsIgnoreCase(title);
    }
}

	
