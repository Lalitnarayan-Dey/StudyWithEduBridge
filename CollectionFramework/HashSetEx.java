package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> set = new TreeSet<String>();
		set.add("Raj");
		set.add("Ravi");
		set.add("Meena");
		set.add("Sai");
		set.add("Sai");
		//set.add(null);
		
		for (String string : set) {
			System.out.println(string);
		}
	}

}
