package Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductApp {

	public static void main(String[] args) {
		var products=List.of(new Product("Mobile","electronics",10000),
				new Product("honey", "grocery",100.0),
				new Product("Cooker","kitchenware",1000.00),
				new Product("Rose","Flower",50.0)
				
				);
	var filtered=products.stream().filter(Product->Product.getPrice()>5000.0 && Product.getPrice()<=50000).collect(Collectors.toList());
	var sorting=products.stream().sorted(Comparator.comparingDouble(Product::getPrice))
			.collect(Collectors.toList());
	System.out.println(filtered);
sorting.forEach(pro->System.out.println(pro));
	}

}
