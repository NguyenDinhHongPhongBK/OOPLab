package hust.soict.ict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
//	private static int nbDigitalVideoDiscs = 0;
//
//	public DigitalVideoDisc(int id) {
//		super(id);
//		nbDigitalVideoDiscs++;
//		id = nbDigitalVideoDiscs;
//	};
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public DigitalVideoDisc(String title) {
		super(title);
	}

//	public boolean isMatch(String tit) {
//		if (this.getTitle().equals(tit)) {
//			return true;
//		}
//		return false; 
//	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
				
				
//				"[" + this.getTitle() + "] - " + "[" + this.getCategory() + "] - " + "[$ " + this.getDirector() + "] - " + "[" + this.getLength() + "] : " + "["
//				+ this.getCost() + "]" ;
	}
}
