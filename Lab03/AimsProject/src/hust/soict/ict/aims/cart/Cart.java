package hust.soict.ict.aims.cart;
import java.util.ArrayList;

import hust.soict.ict.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrder[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;

	public boolean addDigitalVideoDisc(DigitalVideoDisc dvd) {
		if (qtyOrdered >= 20)
			return false;
		qtyOrdered++;
		itemsOrder[qtyOrdered] = dvd;
		return true;
	}

	public boolean addDigitalVideoDisc(ArrayList<DigitalVideoDisc> dvdList) {
		int qty = dvdList.size();
		if (qtyOrdered >= 20 - qty + 1)
			return false;
		for (DigitalVideoDisc dvd : dvdList) {
			qtyOrdered++;
			itemsOrder[qtyOrdered] = dvd;
		}
		return true;
	}

	public boolean addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		int qty = dvdList.length;
		if (qtyOrdered >= 20 - qty + 1)
			return false;
		for (DigitalVideoDisc dvd : dvdList) {
			qtyOrdered++;
			itemsOrder[qtyOrdered] = dvd;
		}
		return true;
	}

	public boolean addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered >= 19)
			return false;
		qtyOrdered++;
		itemsOrder[qtyOrdered] = dvd1;
		qtyOrdered++;
		itemsOrder[qtyOrdered] = dvd2;
		return true;
	}

	public boolean removeDigitalVideoDisc(DigitalVideoDisc dvd) {
		if (qtyOrdered <= 1)
			return false;
		int idx = -1;
		for (int i = 1; i <= qtyOrdered; i++) {
			if (dvd.getTitle().compareTo(itemsOrder[i].getTitle()) == 0) {
				idx = i;
			}
		}
		if (idx == -1)
			return false;
		for (int i = idx + 1; i <= qtyOrdered; i++) {
			itemsOrder[i - 1] = itemsOrder[i];
		}
		itemsOrder[qtyOrdered] = null;
		qtyOrdered--;
		return true;
	}

	public void prtOrder() {
		float sum=0f;
		for (int i = 1; i <= qtyOrdered; i++) {
			System.out.println(itemsOrder[i].toString());
			sum+=itemsOrder[i].getCost();
		}
		System.out.println("TOTAL : "+sum +" $");
		
	}

	public void searchById(int id) {
		int count = 0;
		for (int i = 1; i <= qtyOrdered; i++) {
			if (itemsOrder[i].getId() == id) {
				System.out.println(itemsOrder[i]);
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
		for (int i = 1; i <= qtyOrdered; i++) {
			if (itemsOrder[i].isMatch(title)) {
				System.out.println(itemsOrder[i]);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.err.println("There is no item has title = " + title + " in your cart");
		}
	}
}
