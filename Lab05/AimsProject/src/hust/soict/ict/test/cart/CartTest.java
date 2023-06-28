package hust.soict.ict.test.cart;
import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.media.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		cart.addMedia(dvd1, dvd2, dvd3);
		
		System.out.println("Test print");
		cart.prtOrder();
		
		System.out.println("\nTest search");
		cart.searchById(17);
		cart.searchById(2);
		cart.searchByTitle("Aladin");
		cart.searchByTitle("Aladind");
	}
}
