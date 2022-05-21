package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		
		HashMap<Integer, String > hashMap = new HashMap<Integer, String>();
		hashMap.put(17, "Lalit");
		hashMap.put(12, "Abhiram");
		hashMap.put(33, "Rabi");
		hashMap.put(14, "Jeet");
		
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
