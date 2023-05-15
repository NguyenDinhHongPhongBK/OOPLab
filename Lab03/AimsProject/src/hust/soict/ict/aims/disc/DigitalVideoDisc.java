package hust.soict.ict.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	
	private static int nbDigitalVideoDiscs = 0;

	public int getId() {
		return id;
	}

	public DigitalVideoDisc() {
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}; 

	public DigitalVideoDisc(String title) {
		this();
		setTitle(title);
	}
	public DigitalVideoDisc(String title, String category) {
		this(title);
		this.category = category;
	}

	public DigitalVideoDisc(String title, String category, String director) {
		this(title, category);
		this.director = director;
	}

	public DigitalVideoDisc(String title, String category, String director, int length) {
		this(title, category, director);
		this.length = length;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this(title, category, director, length);
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		this(title, category);
		this.cost = cost;
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

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public boolean isMatch(String tit) {
		if(this.getTitle().equals(tit)) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + title + "] - " + "[" + category + "] - "+ "[" + director + "] - " + "[" + length + "] : " + "[" + cost + "] $" ;
	}
}