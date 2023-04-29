import javax.sql.rowset.JoinRowSet;

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
	
	public void  prtOrder() {
		for(int i = 1; i <= qtyOrdered; i++) {
			System.out.println(itemsOrder[i].toString());
		}
	}
}
