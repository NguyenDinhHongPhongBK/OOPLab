package hust.soict.ict.test.disc;
import hust.soict.ict.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		swap(jungleDVD, cinderellaDVD);
		
		WrapperDVD d1 = new WrapperDVD(jungleDVD);
		WrapperDVD d2 = new WrapperDVD(cinderellaDVD);
		System.out.println("jugle dvd title : " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title : " + cinderellaDVD.getTitle());

		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title : " + jungleDVD.getTitle());
		
		swap2(d1, d2);
		System.out.println("jugle dvd title : " + d1.digitalVideoDisc.getTitle());
		System.out.println("cinderella dvd title : " + d2.digitalVideoDisc.getTitle());


	}

	public static void swap(Object o1, Object o2) {
		Object temp = o1;
		o1 = o2;
		o2 = temp;
	}
	
	public static void swap2(WrapperDVD d1,WrapperDVD d2) {
		DigitalVideoDisc temp = d1.digitalVideoDisc;
		d1.digitalVideoDisc = d2.digitalVideoDisc;
		d2.digitalVideoDisc = temp;
	}

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitleString = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitleString);
	}

}
