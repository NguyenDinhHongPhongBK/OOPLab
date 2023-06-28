package hust.soict.ict.aims.media;

import java.util.Comparator;

import hust.soict.ict.utils.comparator.MediaComparatorByCostTitle;
import hust.soict.ict.utils.comparator.MediaComparatorByTitleCost;

public abstract class Media {
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	private static int nbDigitalVideoDiscs = 0;

	private int id;
	private String title;
	private String category;
	private float cost;
	
	public Media() {
		super();
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
	};

	public Media(int id) {
		this();
		this.id = id;
	}
	
	public Media(int id, String title, String category, float cost) {
		this(id);
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public Media(String title) {
		this();
		this.title = title;
	}
	
	public Media(String title, String category, float cost) {
		this(title);
		this.category = category;
		this.cost = cost;
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
	
	public boolean isMatch(String tit) {
		if (this.getTitle().equals(tit)) {
			return true;
		}
		return false;
	} 
	
	@Override
	public boolean equals(Object a) {
		if(a instanceof Media != true) {
			return false; 
		}
		return this.getTitle().equals(((Media) a).getTitle());
	}
	
	@Override
	public String toString() {
		return "[" + id + "] - " + "[" + title + "] - " + "[" + category + "] - " + "[$ "
				+ cost + "]";
	}
	
	
	
	
	
	
	
}
