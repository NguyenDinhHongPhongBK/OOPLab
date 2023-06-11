package hust.soict.ict.aims;

import java.util.ArrayList;

import hust.soict.ict.aims.media.Book;
import hust.soict.ict.aims.media.CompactDisc;
import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Media;

public class TestMedia {
	public static void main(String[] args) {
		ArrayList<Media> mediae = new ArrayList<Media>();
		DigitalVideoDisc dvd = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		ArrayList<String> authors = new ArrayList<String>();
		authors.add("Phong");
		authors.add("Son");
		Book book = new Book("Phong's Adventure","novel", 30f, authors);
		CompactDisc cd = new CompactDisc("Ariscocratic Family","Comedy","Phong",300,34.45f,"Phong");
		mediae.add(dvd);
		mediae.add(book);
		mediae.add(cd);
		for(Media a:mediae) {
			System.out.println(a.toString());
		}
	}
}
