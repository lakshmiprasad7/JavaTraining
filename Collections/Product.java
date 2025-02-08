package Collections;

import java.util.Objects;

public class Product implements Comparable<Product> {
	int id;
	String productName;
	double productPrice;
	String Category;
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice + ", Category="
				+ Category + "]";
	}
	public Product(int id, String productName, double productPrice, String category) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		Category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, productName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && productName.equals(other.productName);
	}
	@Override
	public int compareTo(Product o) {
		
		
		
		return this.productName.compareTo(o.productName);
		
	
	}
	
	
	

	
	
	
	
}
