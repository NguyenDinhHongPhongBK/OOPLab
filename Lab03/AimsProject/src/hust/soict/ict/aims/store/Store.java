package hust.soict.ict.aims.store;
import hust.soict.ict.aims.disc.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc itemsInStore[] =  new DigitalVideoDisc[100];
	private int quantity = 0;
	
	public void addDVD(DigitalVideoDisc ... dvds) {
		for (DigitalVideoDisc dvd : dvds) {
			quantity ++;
			itemsInStore[quantity] = dvd;
		}
	}
	
	public void removeDVD(String title) {
		if (quantity <= 1) {
			System.err.println("Cannot remove");
			return;
		}
			
		int idx = -1;
		for (int i = 1; i <= quantity; i++) {
			if (itemsInStore[i].isMatch(title)) {
				idx = i;
			}
		}
		if (idx == -1) {
			System.err.println("There is no items name "+title);
			return;
		}
		for (int i = idx + 1; i <= quantity; i++) {
			itemsInStore[i - 1] = itemsInStore[i];
		}
		itemsInStore[quantity] = null;
		quantity--;
	}
	
	public void removeDVD(int id) {
		if (quantity <= 1) {
			System.err.println("Cannot remove");
			return;
		}
			
		int idx = -1;
		for (int i = 1; i <= quantity; i++) {
			if (itemsInStore[i].getId() == id) {
				idx = i;
			}
		}
		if (idx == -1) {
			System.err.println("There is no items has id = "+id);
			return;
		}
		for (int i = idx + 1; i <= quantity; i++) {
			itemsInStore[i - 1] = itemsInStore[i];
		}
		itemsInStore[quantity] = null;
		quantity--;
	}
	
	public void print() {
		for (int i = 1; i <= quantity; i++) {
			System.out.println(itemsInStore[i].toString());
		}
	}
}
