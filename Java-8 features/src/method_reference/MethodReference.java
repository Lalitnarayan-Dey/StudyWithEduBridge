package method_reference;

import java.util.ArrayList;

public class MethodReference {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Core Java");
		list.add("Advance Java");
		list.add("MySQL");
		list.add("Hibernate");
		list.add("JUnit");
		
		list.forEach(System.out::println);   // This is the method_reference
	}
}
