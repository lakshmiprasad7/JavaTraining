package assignment;

import java.util.Scanner;

public class BookManagementSystem {

	public static void main(String[] args) {
Library library=new Library();
Scanner sc =new Scanner(System.in);
while (true) {
	System.out.println("\n Book Management System");
	System.out.println("1. Add Book");
	System.out.println("2. Display Library");
	System.out.println("3. Check Availability");
	System.out.println("4. Search Book by title");
	System.out.println("5. Remove Book by ISBN");
	System.out.println("6.Exit");
	System.out.print("Enter Choice:");
	int choice = sc.nextInt();
	sc.nextLine();
	switch(choice) {
	case 1:
		library.addBook();
		break;
	case 2:
		library.displayLibrary();
		break;
	case 3:
		System.out.println("Enter the ISBN:");
		String ISBN=sc.nextLine();
		library.checkAvailability(ISBN);
		break;
	case 4:
		System.out.println("Enter the Title to search:");
		String title=sc.nextLine();
		library.searchBook(title);
		break;
	case 5:
		System.out.println("Enter the ISBN:");
		String ISBN1=sc.nextLine();
		library.removeBook(ISBN1);
		break;
	case 6:
		System.out.println("Existing System");
		sc.close();
		return;
		
	default:
		System.out.println("Invalid choice ,try again.");
	}
		
	}
}

}
