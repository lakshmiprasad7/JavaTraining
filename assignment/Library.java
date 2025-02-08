package assignment;

import java.util.Scanner;

public class Library implements BookOperations {
	private static final int MAX_BOOKS=50;
	private Book[] books=new Book[MAX_BOOKS];
	private int bookCount=0;
	private Scanner sc=new Scanner(System.in);

	@Override
	public void addBook() {
		if (bookCount >= MAX_BOOKS) {
			System.out.println("library is full!");
			return;
		}
		System.out.println("Enter Title:");
		String title=sc.nextLine();
		System.out.println("Enter Author:");
		String author=sc.nextLine();
		System.out.println("Enter ISBN:");
		String ISBN=sc.nextLine();
		System.out.println("Enter Price:");
		double price=sc.nextDouble();
		System.out.println("Is this an Ebook?(yes/no):");
		String type=sc.nextLine();
		
		Book book;
		if(type.equalsIgnoreCase("yes")) {
			System.out.println("Enter the File size(MB):");
			double fileSize=sc.nextDouble();
			sc.nextLine();
			book=new Ebook(title,author,ISBN,price,fileSize);
		}else {
			System.out.println("Enter the stock Quantity:");
			int stock=sc.nextInt();
			sc.nextLine();
			book=new PhysicalBook(title,author,ISBN,price,stock);
		}
		books[bookCount++]=book;
		System.out.println("book added successfully!");
	}

	@Override
	public void displayLibrary() {
          if(bookCount==0) {
        	  System.out.println("Library is empty");
        	  return;
          }
          System.out.println("Library Collection:");
          for(int i=0;i<bookCount;i++) {
        	  books[i].displayDetails();
          }
	}

	@Override
	public boolean checkAvailability(String ISBN) {
		for(int i=0;i<bookCount;i++ ) {
			if(books[i].getISBN().equalsIgnoreCase(ISBN)) {
				System.out.println("Book with ISBN"+ISBN+"is available");
				books[i].displayDetails();
				return true;
			}
		}
		System.out.println("Book with ISBN "+ ISBN+"is not available");
		return false;
	}

	@Override
	public void searchBook(String Title) {
 boolean found =false;
 for(int i=0;i<bookCount;i++) {
	 if(books[i].getTitle().equalsIgnoreCase(Title)) {
		 books[i].displayDetails();
		 
		 found =true;
		 break;
		 
	 }
 }
		if(!found) {
			System.out.println("no book found with title:"+Title);
		}
	}

	@Override
	public void removeBook(String ISBN) {
     for(int i=0;i<bookCount;i++) {
    	 if(books[i].getISBN().equalsIgnoreCase(ISBN)) {
    		 System.out.println("removing Book:"+books[i].getTitle());
    		 for(int j=0;j<bookCount-1;j++) {
    			 books[j]=books[j+1];
    		 }
    		 books[--bookCount]=null;
    		 System.out.println("Book removed successfully.");
    		 return;
    	 }
     }
     System.out.println("Book with ISBN"+ISBN+ "not found.");
	}

}
