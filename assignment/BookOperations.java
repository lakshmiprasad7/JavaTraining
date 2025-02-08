package assignment;

public interface BookOperations {
	void addBook();
	void displayLibrary();
	boolean checkAvailability(String ISBN);
	void searchBook(String Title);
	void removeBook(String ISBN);

}
