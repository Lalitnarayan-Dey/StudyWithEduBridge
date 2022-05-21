package map.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableMap {
	public static void main(String[] args) {
		
		Hashtable<Integer, Book> hashTableObject = new Hashtable<Integer, Book>();
		
		hashTableObject.put(10001, new Book(111, "Java", "Abc", "pqr",20));
		hashTableObject.put(10012, new Book(111, "Rich Dad poor Dad", "acc", "yyy",200));
		hashTableObject.put(1003, new Book(111, "Power of your subconscious mind", "ccc", "ppp",205));
		hashTableObject.put(10005, new Book(111, "MySQL", "Abc", "pqr",20));
		
		for (Map.Entry<Integer, Book> eachBook : hashTableObject.entrySet()) {
			
			int key = eachBook.getKey();
			Book value =   eachBook.getValue();
			
			System.out.println(key+" Details,");
			System.out.println(value);
//			System.out.println(eachBook.getKey()+",  "+eachBook.getValue());
		}
	}

}
