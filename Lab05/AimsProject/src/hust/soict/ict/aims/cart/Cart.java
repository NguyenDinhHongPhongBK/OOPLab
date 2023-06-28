package hust.soict.ict.aims.cart;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import hust.soict.ict.aims.media.Media;
import hust.soict.ict.utils.comparator.MediaComparatorByTitleCost;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrder = new ArrayList<Media>(MAX_NUMBERS_ORDERED);

//	public boolean addDigitalVideoDisc(DigitalVideoDisc dvd) {
//		if (qtyOrdered >= 20)
//			return false;
//		qtyOrdered++;
//		itemsOrder[qtyOrdered] = dvd;
//		return true;
//	}
//
//	public boolean addDigitalVideoDisc(ArrayList<DigitalVideoDisc> dvdList) {
//		int qty = dvdList.size();
//		if (qtyOrdered >= 20 - qty + 1)
//			return false;
//		for (DigitalVideoDisc dvd : dvdList) {
//			qtyOrdered++;
//			itemsOrder[qtyOrdered] = dvd;
//		}
//		return true;
//	}
//
//	public boolean addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
//		int qty = dvdList.length;
//		if (qtyOrdered >= 20 - qty + 1)
//			return false;
//		for (DigitalVideoDisc dvd : dvdList) {
//			qtyOrdered++;
//			itemsOrder[qtyOrdered] = dvd;
//		}
//		return true;
//	}
//
//	public boolean addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
//		if (qtyOrdered >= 19)
//			return false;
//		qtyOrdered++;
//		itemsOrder[qtyOrdered] = dvd1;
//		qtyOrdered++;
//		itemsOrder[qtyOrdered] = dvd2;
//		return true;
//	}
//
//	public boolean removeDigitalVideoDisc(DigitalVideoDisc dvd) {
//		if (qtyOrdered <= 1)
//			return false;
//		int idx = -1;
//		for (int i = 1; i <= qtyOrdered; i++) {
//			if (dvd.getTitle().compareTo(itemsOrder[i].getTitle()) == 0) {
//				idx = i;
//			}
//		}
//		if (idx == -1)
//			return false;
//		for (int i = idx + 1; i <= qtyOrdered; i++) {
//			itemsOrder[i - 1] = itemsOrder[i];
//		}
//		itemsOrder[qtyOrdered] = null;
//		qtyOrdered--;
//		return true;
//	}
	
	public void addMedia(ArrayList<Media> mediaList) {
		for (Media m : mediaList) {
			if(!itemsOrder.contains(m))
				itemsOrder.add(m);
		}
	}
	public void addMedia(Media ...mediaList) {
		for (Media m : mediaList) {
			if(!itemsOrder.contains(m)) {
				itemsOrder.add(m);				
			}
		}
	}
	
	public void removeMedia(Media ...mediaList) {
		for (Media m : mediaList) {
			if(itemsOrder.contains(m)) {
				itemsOrder.remove(m);			 	
			}
		}
	}

	public void prtOrder() {
		float sum=0f;
		for (int i = 0; i < itemsOrder.size(); i++) {
			System.out.println(itemsOrder.get(i).toString());
			sum+=itemsOrder.get(i).getCost();
		}
		System.out.println("TOTAL : "+sum +" $");
		
	}

	public void searchById(int id) {
		int count = 0;
		for (int i = 0; i < itemsOrder.size(); i++) {
			if (itemsOrder.get(i).getId() == id) {
				System.out.println(itemsOrder.get(i).toString());
				count++;
				break;
			}
		}
		if (count == 0) {
			System.err.println("There is no item has id = " + id + " in your cart");
		}
	}
	
	public void searchByTitle(String title) {
		int count = 0;
		for (int i = 0; i < itemsOrder.size(); i++) {
			if (itemsOrder.get(i).isMatch(title)) {
				System.out.println(itemsOrder.get(i).toString());
				count++;
				break;
			}
		}
		if (count == 0) {
			System.err.println("There is no item has title = " + title + " in your cart");
		}
	}
	
	public void sortByTitle() {
		itemsOrder.sort((o1,o2) -> o1.getTitle().compareTo(o2.getTitle()));
	}
	
	public void sortByCost() {
		itemsOrder.sort((o1,o2) -> o1.getCost() >= o2.getCost() ? 1 : -1);
	}
}
