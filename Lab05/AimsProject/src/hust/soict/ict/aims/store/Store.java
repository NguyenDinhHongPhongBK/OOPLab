package hust.soict.ict.aims.store;
import java.util.ArrayList;

import hust.soict.ict.aims.media.Media;


public class Store {	
	private ArrayList<Media> itemsInStore = new ArrayList<Media>(100);
	
	
	public void addMedia(Media ... mediaList) {
		for (Media m : mediaList) { 
			if(!itemsInStore.contains(m))
				itemsInStore.add(m);
		}
	}
	
	public void removeMedia(Media ...mediaList) {
		for (Media m : mediaList) {
			if(itemsInStore.contains(m))
				itemsInStore.remove(m);
		}
	}
	
	public void removeMedia(String title) {
		for (Media m : itemsInStore) {
			if(m.getTitle().equals(title))
				itemsInStore.remove(m);break;
		}
	}
	
	public boolean FindByTitle(String title) {
		if(itemsInStore.size() == 0) return false;
		for(Media media : itemsInStore) {
			if(media.getTitle().equals(title)) {
				media.toString();
				return true;
			}
		}
		return false;
	}
	
	public Media GetByTitle(String title) {
		for(Media media : itemsInStore) {
			if(media.getTitle().equals(title)) {
				media.toString();
				return media;
			}
		}
		return null;
	}
	
	public void print() {
		for (int i = 0; i < itemsInStore.size(); i++) {
			System.out.println(itemsInStore.get(i).toString());
		}
	}
	
	@Override
	public String toString() {
		String storeString = "";
		for(Media a : itemsInStore) {
			storeString += a.toString()+"/n";
		}
		return storeString;
	}
}
