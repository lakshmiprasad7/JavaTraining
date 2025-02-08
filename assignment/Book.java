package assignment;

abstract class Book {
	
	protected String title;
	protected String author;
	protected String ISBN;
	protected double price;
	public Book(String title, String author, String ISBN, double price) {
		super();
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	public abstract void displayDetails();
	
	public String getTitle() {
		return title;
	}
	public String getISBN() {
		return ISBN;
	}

}
