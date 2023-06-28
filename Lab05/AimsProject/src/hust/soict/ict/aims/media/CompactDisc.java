package hust.soict.ict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	String artist;
	ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		super();
	}
	
	public CompactDisc(String title, String category, float cost, String artist) {
		super(title, category, cost);
		this.artist = artist;
	}
	public CompactDisc(String title,String category,String director,int length,float cost, String artist) {
		super(title, category, director,length,cost);
		this.artist = artist;
	}
	
	public boolean addTrack(Track t) { 
		for(Track track : tracks) {
			if(track.getTitle().equals(t.getTitle()))
				return false;
		}
		tracks.add(t);
		return true;
	}
	
	public boolean addTrack(String title, int length) {
		Track t = new Track(title, length);
		for(Track track : tracks) {
			if(track.getTitle().equals(title))
				return false;
		}
		tracks.add(t);
		return true;
	}
	
	public boolean removeTrack(Track t) {
		int k = -1;
		for(int i = 0; i<tracks.size();i++) {
			if(tracks.get(i).getTitle().equals(t.getTitle())) {
				k = i; break;
			}
		}
		if(k == -1) return false;
		tracks.remove(k);
		return true;
	}
	
	public boolean removeTrack(String title) {
		int k = -1;
		for(int i = 0; i<tracks.size();i++) {
			if(tracks.get(i).getTitle().equals(title)) {
				k = i; break;
			}
		}
		if(k == -1) return false;
		tracks.remove(k);
		return true;
	}
	
	public int getLength() {
		int sum = 0;
		for(Track track : tracks) {
			sum+=track.getLength();
		}
		return sum;
	}
	
	public void play() {
		for (Track track : tracks) {
			track.play();
		}
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "- [" + this.artist + "]";
	}
}
















