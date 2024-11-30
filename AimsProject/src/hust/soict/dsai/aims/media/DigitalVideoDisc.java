package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
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

	