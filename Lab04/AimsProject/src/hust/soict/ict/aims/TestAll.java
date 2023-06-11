package hust.soict.ict.aims;

import java.util.Scanner;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.media.Book;
import hust.soict.ict.aims.media.CompactDisc;
import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Media;
import hust.soict.ict.aims.store.Store;

public class TestAll {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int menuRequest, storeRequest, mediaDetailRequest,updateStoreRequest,cartRequest, filterRequest, sortCartRequest ;
		Store store = new Store();
		Cart cart = new Cart();
		
		do {
			AimsUtils.showMenu();
			do {
				menuRequest = (new Scanner(System.in)).nextInt();
				if(menuRequest <0 || menuRequest>3)
					System.out.print("Try again : ");
			} while (menuRequest <0 || menuRequest>3);
			if(menuRequest == 0) {
				System.err.println("Log out");break;
			}
			else if(menuRequest == 1) {
				do {
					AimsUtils.storeMenu();
					do {
						storeRequest = (new Scanner(System.in)).nextInt();
						if(storeRequest < 0 || storeRequest > 3)
							System.out.print("Try again : ");
					} while (storeRequest < 0 || storeRequest > 4);
					if(storeRequest == 0) break;
					else if(storeRequest == 1) {
						System.out.print("Enter title : ");
						String title = (new Scanner(System.in)).nextLine();
						Boolean aBoolean = store.FindByTitle(title);
						if(aBoolean == false) {
							System.err.println("Cannot find media name "+title);
						}
						else {
							do {
								AimsUtils.mediaDetailsMenu();
								do {
									mediaDetailRequest = (new Scanner(System.in)).nextInt();
									if(mediaDetailRequest < 0 || mediaDetailRequest > 2)
										System.out.print("Try again : ");
								} while (mediaDetailRequest < 0 || mediaDetailRequest > 2);
								if(mediaDetailRequest == 0) break;
								else if(mediaDetailRequest == 1) {
									Media a = store.GetByTitle(title);
									if(a == null) {
										System.err.println("Cannot add item that has title = "+title);
									}
									else {
										cart.addMedia(a);
									}
								}
								else if(mediaDetailRequest == 2) {
									Media a = store.GetByTitle(title);
									if(a == null) {
										System.err.println("Cannot add item that has title = "+title);
									}
									else {
										if(a instanceof DigitalVideoDisc != true || a instanceof CompactDisc != true) {
											System.err.println("Book cannot play");
										}
										else {
											if(a instanceof DigitalVideoDisc) {
												((DigitalVideoDisc)a).play();
											}
											if(a instanceof CompactDisc) {
												((CompactDisc)a).play();
											}
										}
									}
								}
							} while (mediaDetailRequest >= 0 && mediaDetailRequest <= 2);
						}
					}
				} while (storeRequest >= 0 && storeRequest <= 4);
			}
			else if(menuRequest == 2) {
				do {
					System.out.print("You want to go back (0), add (1) or remove (2) : ");
					do {
						updateStoreRequest =new Scanner(System.in).nextInt();
						if(updateStoreRequest <0 || updateStoreRequest > 2) {
							System.out.print("Try again : ");
						}
					} while (updateStoreRequest <0 || updateStoreRequest > 2);
					if(updateStoreRequest == 1) {
						System.out.println("Enter title to add : ");
						String title = new Scanner(System.in).nextLine();
						Book book = new Book(title);
						store.addMedia(book);
					}
					else if (updateStoreRequest == 2) {
						System.out.println("Enter title to remove : ");
						String title = new Scanner(System.in).nextLine();
						store.removeMedia(title);
					}
					else if(updateStoreRequest == 0) {
						break;
					}
				}while(updateStoreRequest <=2 && updateStoreRequest >=0);
			}
			else if(menuRequest == 3) {
				store.toString();
				do {
					AimsUtils.cartMenu();
					do {
						cartRequest = new Scanner(System.in).nextInt();
						if(cartRequest >5 || cartRequest <0) {
							System.out.println("Try again : ");
						}
					}while(cartRequest >5 || cartRequest <0);
					
					if(cartRequest == 0) break;
					else if(cartRequest == 1 ) {
						do {
							System.out.print("You want to go back (0), filter by id (1) or filter by title (2) : ");
							filterRequest = new Scanner(System.in).nextInt();
						}while(filterRequest < 0 || filterRequest >2);
						if(filterRequest == 0) break;
						else if(filterRequest == 1) {
							System.out.print("Enter id to search : ");
							int id = new Scanner(System.in).nextInt();
							cart.searchById(id); 
						}
						else if(filterRequest == 2) {
							System.out.print("Enter title to search : ");
							String title = new Scanner(System.in).nextLine();
							cart.searchByTitle(title);
						}
					}
					else if(cartRequest == 2) {
						do {
							System.out.print("You want to go back (0), sort by title (1) or sort by cost (2) : ");
							sortCartRequest = new Scanner(System.in).nextInt();
						}while(sortCartRequest < 0 || sortCartRequest >2);
						if(sortCartRequest == 0) break;
						else if(sortCartRequest == 1) {
							cart.sortByTitle();
						}
						else if(sortCartRequest == 2) {
							cart.sortByCost();
						}
						else {
							System.err.println("This feature is maintained");
						}
					}
				}while(cartRequest <=5 || cartRequest >=0);
			}
		} while (menuRequest>=0 && menuRequest<=3 );
	}
}
