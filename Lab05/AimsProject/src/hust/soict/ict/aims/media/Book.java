package hust.soict.ict.aims.media;

import java.util.ArrayList;

public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();
	
	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors; 
	}

	public Book() {
		super();
	}

	public Book(ArrayList<String> authors) {
		this.authors = authors;
	}
	public Book(String title) {
		super(title);
	}
	
	public Book(String title, String category, float cost, ArrayList<String> authors) {
		super(title, category, cost) ;
		this.authors = authors;
	}

	public boolean addAuthor(String authorName) {
		for(String a : authors) {
			if(a.equals(authorName))
				return false;
		}
		authors.add(authorName);
		return true;
	}
	
	public boolean removeAuthor(String authorName) {
		int k =-1;
		for(int i =0;i<authors.size();i++) {
			if(authors.get(i).equals(authorName)) {
				k = i;break;
			}
		}
		if(k == -1) return false;
		authors.remove(k);
		return true;
	}
	
	private String getAllAuthorName() {
		String nameString = "";
		for(int i = 0;i < authors.size();i++){
			if(i == 0)
				nameString += authors.get(i);
			else
				nameString += " - " +authors.get(i);
		}
		return nameString;
	}
	
	@Override
	public String toString() {
		return super.toString() +" - "+ "{"+getAllAuthorName()+"}" ;
	}
	
	
	
}
