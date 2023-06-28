package hust.soict.ict.aims.media;

public class Track implements Playable {
	private  String title; 
	private int length;
	public Track() {
		super();
	}
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() { 
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void play() {
		System.out.println("Title : "+title+" ; "+"Length : "+length);
	}
	
	@Override
	public boolean equals(Object track) {
		if(track instanceof Track != true) {
			return false; 
		}
		return this.getTitle().equals(((Track) track).getTitle()) &&  this.getLength() == ((Track) track).getLength();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + this.title + "]" + "[" + this.length + "]";
	}
}
















