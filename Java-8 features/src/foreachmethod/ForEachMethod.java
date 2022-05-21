package foreachmethod;

import java.util.ArrayList;

public class ForEachMethod {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Core Java");
		list.add("Advance Java");
		list.add("MySQL");
		list.add("Hibernate");
		list.add("JUnit");
		
		list.forEach(string ->System.out.println(string));
	}

}
