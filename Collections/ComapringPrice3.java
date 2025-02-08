package Collections;

import java.util.Comparator;

public class ComapringPrice3 implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {

		
		int idComparison=Integer.compare(o2.id,o1.id);
		if(idComparison==0) {
			return o2.Category.compareTo(o1.Category);
		}
		return idComparison;
	}

	
}
