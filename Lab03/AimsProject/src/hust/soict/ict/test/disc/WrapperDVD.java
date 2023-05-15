package hust.soict.ict.test.disc;
import hust.soict.ict.aims.disc.DigitalVideoDisc;

public class WrapperDVD {
	public DigitalVideoDisc digitalVideoDisc;
	
	public WrapperDVD() {}
	public WrapperDVD(DigitalVideoDisc dvd) {
		this();
		this.digitalVideoDisc = dvd;
	}

}
