package map;

import java.util.HashMap;
import java.util.Map;

public class CustomeHashSetTest {
	
	public static void main(String[] args) {
		Map<Integer, CustomerDetails> map = new HashMap<Integer, CustomerDetails>();
		
		CustomerDetails customer1 = new CustomerDetails(101,"Lalit");
		CustomerDetails customer2 = new CustomerDetails(1002,"Ram");
		CustomerDetails customer3 = new CustomerDetails(1003,"Abhi");
		CustomerDetails customer4 = new CustomerDetails(103,"Jeet");
		CustomerDetails customer5 = new CustomerDetails(105,"Narayan");
		
		map.put(100, new CustomerDetails(111,"XYZ"));
		
		map.put(1,customer1);
		map.put(2,customer2);
		map.put(20,customer5);
		map.put(13,customer4);
		map.put(8,customer3);
		
		
		for(Map.Entry<Integer, CustomerDetails> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
	}

}
