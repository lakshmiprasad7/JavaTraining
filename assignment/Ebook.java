package assignment;



public class Ebook extends Book {
	private double fileSize;
	public Ebook(String title, String author, String ISBN, double price,double fileSize) {
		super(title, author, ISBN, price);
		this.fileSize=fileSize;
	}
	@Override
	public void displayDetails() {
		System.out.println("EBOOk - Title:" + title + ",Author:" + author);
		System.out.println("ISBN:" + ISBN + ",Price:$" + price);
		System.out.println("File size:" + fileSize + "MB");
	}

	
  
	
	
	
}
