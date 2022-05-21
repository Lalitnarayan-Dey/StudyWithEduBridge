package lamdain_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaInComparator {
	public static void main(String[] args) {
		ArrayList< Product> list = new ArrayList<Product>();
		list.add(new Product(101,"Laptop",50000f));
		list.add(new Product(102,"AC",45000f));
		list.add(new Product(103,"LCD-TV",25000f));
		list.add(new Product(104,"Cooler",12000f));
		list.add(new Product(105,"MI- Note10_Mobile",20000));
		list.add(new Product(106,"I-Phone 13 pro max",75000));
		
		Collections.sort(list, (p1,p2) -> {
			return p1.productName.compareTo(p2.productName);
		});
		
		list.forEach(product -> System.out.println(product));
	}

}
