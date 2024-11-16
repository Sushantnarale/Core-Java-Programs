package CollectionComparatorExample;

import java.util.Comparator;

public class ProductSortByPrice implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getSalary()>o2.getSalary()) {
			return 1;
		}
		else if(o1.getSalary()<o2.getSalary()) {
			return -1;
		}
		else {
			return 0;
		}
		}
}
