package Collections;

import java.util.Comparator;

public class ComapringCategoryPrice implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
//
////		
////		int categoryComparison=o1.Category.compareTo(o2.Category);
////		if(categoryComparison==0) {
//			
////		}
////		return categoryComparison;
////	}
		return Double.compare(o2.productPrice,o1.productPrice);
	
}
}
