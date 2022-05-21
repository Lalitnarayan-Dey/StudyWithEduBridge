package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {

//			Create object of TreeMap class.
		TreeMap<Integer, CustomerDetails> treeMap = new TreeMap<Integer, CustomerDetails>();
		
//			Add element in the TreeMap object
		treeMap.put(401, new CustomerDetails(40001,"PQR"));
		treeMap.put(201, new CustomerDetails(20001,"XYZ"));
		treeMap.put(301, new CustomerDetails(30001,"ABC"));
		
		
		for(Map.Entry<Integer, CustomerDetails> each : treeMap.entrySet()) {
			System.out.println(each.getKey()+"  "+each.getValue());
		}
	}

}
