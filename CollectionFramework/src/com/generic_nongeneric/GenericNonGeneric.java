package com.generic_nongeneric;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericNonGeneric {
	public static void main(String[] args) {
		
//		Non-Generic ArrayList
		ArrayList list = new ArrayList();
		list.add("Hello");
		list.add(10.0f);
		list.add(9);
		list.add('c');
		
		System.out.println(list);
		
//		Generic Arraylist
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Java");
		list2.add("Html");
		list2.add("CSS");
		list2.add("JS");
//		l2.add(1);    // We cannot add integer type because we declare the type of list.
		
		System.out.println(list2);
		
		//By using iterator
		Iterator<String> iterator = list2.iterator();
		System.out.println("Using Iterator__");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Using for-each loop
		System.out.println("\nUsing For-each loop__");
		for(String eachString : list2) {
			System.out.println(eachString);
		}
//		Create another list 
		ArrayList<String> list3 = new ArrayList<String>();
		list2.add("MySQL");
		list2.add("Postgree");
		list2.add("Oracle");
		list2.add("Mongo-DB");
		
//		Adding all elements in list2
		
		list2.addAll(list3);
		
		System.out.println("\nprint elements after adding the elements of another list.");
		for(String eachElement:list2) {
			
			System.out.print(eachElement+", ");
		}
		
//		Removing the elements of list3 from list2
		list2.removeAll(list3);
		
		System.out.println("\nRemove all list3 element : ");
		Iterator<String> iterator2 = list2.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next()+" ");
		}
		
		
	}

}
