package Collections;

import java.util.Scanner;
import java.util.TreeMap;

public class ShoppingCard {
//	private ArrayList<Product> cart=new ArrayList<>();
//	private Vector<Product> cart=new Vector<>();
//	private HashSet<Product> cart=new HashSet<>();
//	private TreeSet<Product> cart;
//	private LinkedHashSet<Product> cart=new LinkedHashSet<>();
//	private ArrayDeque<Product> cart=new ArrayDeque<>();
	private TreeMap<Integer,Product> cart2=new TreeMap<>();
	private Scanner sc=new Scanner(System.in);
//	public ShoppingCard() {
//		System.out.println("choose the sorting comparable:");
//		System.out.println("1.sort by category ,then price");
//		System.out.println("2.sort by name ,then price");
//		System.out.println("3.sort by id ,then category");
//		System.out.println("select the choice:");
//		int choice =sc.nextInt();
//		sc.nextLine();
//		if(choice==1) {
//			cart =new TreeSet<>(new ComapringCategoryPrice());
//		}else if(choice==2) {
//			cart =new TreeSet<>(new ComapringPrice2());
//		}else if(choice==3) {
//			cart=new TreeSet<>(new ComapringPrice3());
//			
//		}else {
//			System.out.println("Invalid choice ,u have choosed.");
//		}
//	}
	 public void addProduct() {
		 System.out.println("Enter the product Id:");
		 int id=sc.nextInt();
		 System.out.println("Enter the product Name:");
		 String productName=sc.next();
		 System.out.println("Enter the product Price:");
		 double productPrice=sc.nextDouble();
		 System.out.println("Enter product category (electronics,apparel,grocery,footwear):");
		 String category=sc.next();
//		 .offerLast(new Product(id,productName,productPrice,category));
		 Product newpro=new Product(id,productName,productPrice,category);
		 cart2.put(id, newpro );
		 System.out.println("Product added "+ productName + " to card");
	 }
	 public void removeProduct() {
		 System.out.println("Enter the product Id  to remove :");
		 int id=sc.nextInt();
//		 boolean removed=cart.removeIf(product->product.id==id);
		 if(cart2.remove(id)!=null) {
		 System.out.println("Product with removed successfully");
	 }else {
		 System.out.println("product with id is not found");
	 }
//		 if(cart.isEmpty()) {
//			 System.out.println("cart is empty");
//		 }else {
//			 Product removedProduct=cart.pollFirst();
//			 System.out.println("removed:"+removedProduct);
//		 }
	 }

		
		 
	 public void searchProduct() {
		 System.out.println("Enter the product id:");
		 int id=sc.nextInt();
		 Product pro=cart2.get(id);
		 if(pro!=null) {
			 System.out.println("product found :"+pro);
		 }else {
			 System.out.println("product not found.");
		 }

	 }

		public void checkOut() {
			if(cart2.isEmpty()) {
				System.out.println("cart is empty, add products before checkout.");
				return;
			}
			double totalBill = 0;
			for (Product list : cart2.values()) {
				totalBill += list.productPrice;

			}
//			while(!cart.isEmpty()) {
//				Product prod=cart.poll();
//				System.out.println(prod);
//			}
			double discount = calculateDiscount();
			double finalTotal = totalBill - discount;
			System.out.println("----CheckOut---");
			display();
			System.out.printf("Total :%.2f\n", totalBill);
			System.out.printf("Discount :%.2f\n", discount);
			System.out.printf("Final Total :%.2f\n", finalTotal);
			cart2.clear();
			System.out.println("check Out complete, cart is empty");
		}
		public double calculateDiscount() {
			double total = 0;
			for (Product product : cart2.values()) {
				double discount = 0;
				switch (product.getCategory().toLowerCase()) {
				case "electronics":
					discount = product.getProductPrice() * 0.10;
					break;

				case "apparel":
					discount = product.getProductPrice() * 0.05;
					break;
				case "grocery":
					discount = product.getProductPrice() * 0.02;
					break;

				case "Footwear":
					discount = product.getProductPrice() * 0.07;
					break;
				}
				total += discount;
			}
			return total;
		}
		public void display() {
			
			if (cart2.isEmpty()) {
				System.out.println("No products in cart available");
			} else {
				if (!cart2.isEmpty())
					for (Product list : cart2.values()) {
						System.out.println(list);
					}
			}
		}
	
	public void menu() {
		while(true) {
			System.out.println("E-commerce store");
			System.out.println("press1: Add Product");
			System.out.println("press2: Remove Product");
			System.out.println("press3: search Product");
			System.out.println("press4: checkOut Products with bill");
			System.out.println("press5: Display products");
			System.out.println("press6.Exit");
			System.out.print("Enter Choice:");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				addProduct();
				break;
			case 2:
				removeProduct();
				break;
			case 3:
				searchProduct();
				break;
			case 4:
				checkOut();
				break;
			case 5:
				display();
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
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ShoppingCard ca=new ShoppingCard();
		ca.menu();
		
	}

}
