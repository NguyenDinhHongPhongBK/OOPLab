package hust.soict.ict.aims;
import java.util.ArrayList;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Media;


public class Aims {
	public static void main(String[] args) {
		Cart anOrderCart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		//anOrderCart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		//anOrderCart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		//anOrderCart.addDigitalVideoDisc(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Assertion", "Animation", 12.99f);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Loo", "Science Fiction", 1.99f);
		
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("VietNam War", "Documentary","Nguyen Dinh Hong Phong",70, 16.99f);

		
		
		ArrayList<Media> dvdList = new ArrayList<Media>();
		dvdList.add(dvd1);
		dvdList.add(dvd2);
		
		//add DVD
		anOrderCart.addMedia(dvdList);
		anOrderCart.addMedia(dvd3);
		anOrderCart.addMedia(dvd3,dvd4,dvd5,dvd6);
		
		//remove DVD
		DigitalVideoDisc dvdTmp = new DigitalVideoDisc("Aladin");
		anOrderCart.removeMedia(dvdTmp);
		
		//print id
		System.out.println(dvd1.getId());
		System.out.println(dvd2.getId());
		
		//
		anOrderCart.prtOrder();
	
		
	}
}
