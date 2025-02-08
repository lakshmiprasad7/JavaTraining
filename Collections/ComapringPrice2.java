package Collections;

import java.util.Comparator;

public class ComapringPrice2 implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {

		
		int nameComparison=o2.productName.compareTo(o1.productName);
		if(nameComparison==0) {
			return Double.compare(o2.productPrice,o1.productPrice);
		}
		return nameComparison;
	}

	
}
