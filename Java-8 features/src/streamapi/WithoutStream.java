package streamapi;

import java.util.ArrayList;

public class WithoutStream {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Core Java");
		list.add("Advance Java");
		list.add("MySQL");
		list.add("Hibernate");
		list.add("JUnit");
		
		int count =0;
		for(String eachElement : list) {
			if(eachElement.length()<6) {
				count++;
			}
		}
		System.out.println("There are - ["+count+"] elements are present in the list with length < 6");
	}

}
