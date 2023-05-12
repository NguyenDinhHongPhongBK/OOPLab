import java.util.ArrayList;

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
		
		
		ArrayList<DigitalVideoDisc> dvdList = new ArrayList<DigitalVideoDisc>();
		dvdList.add(dvd1);
		dvdList.add(dvd2);
		
		//add DVD
		anOrderCart.addDigitalVideoDisc(dvdList);
		anOrderCart.addDigitalVideoDisc(dvd3);
		anOrderCart.addDigitalVideoDisc(dvd3,dvd4,dvd5);
		
		//remove DVD
		DigitalVideoDisc dvdTmp = new DigitalVideoDisc("Aladin");
		anOrderCart.removeDigitalVideoDisc(dvdTmp);
		
		anOrderCart.prtOrder();
		
	}
}
