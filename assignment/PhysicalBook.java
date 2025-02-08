package assignment;

public class PhysicalBook extends Book {
 private int stock;

public PhysicalBook(String title, String author, String ISBN, double price, int stock) {
	super(title, author, ISBN, price);
	this.setStock(stock);
}

@Override
public void displayDetails() {
	System.out.println("EBOOk - Title:" + title + ",Author:" + author);
	System.out.println("ISBN:" + ISBN + ",Price:" + price);
	System.out.println("Stock Available:" + stock );
}

public int getStock() {
	return stock;
}

public void setStock(int stock) {
	this.stock = stock;
}
 
}
