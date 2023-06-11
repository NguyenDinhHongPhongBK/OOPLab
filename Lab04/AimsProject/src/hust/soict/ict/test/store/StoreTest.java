package hust.soict.ict.test.store;
import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Donkihote", "Humour", "Nguyen Dinh Hong Phong", 87, 24.95f);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladin");
		
		store.addMedia(dvd1, dvd2, dvd3, dvd4);
		store.removeMedia(dvd5);

		store.print(); 
		
	}
}
