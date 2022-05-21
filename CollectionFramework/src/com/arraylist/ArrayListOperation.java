package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperation {
	public static void main(String[] args) {
		
//		Generic Arraylist

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Java");
		list2.add("Html");
		list2.add("CSS");
		list2.add("JS");
//		l2.add(1);    // We cannot add integer type because we declare the type of list.

		System.out.println(list2);

		// By using iterator
		Iterator<String> iterator = list2.iterator();
		System.out.println("Using Iterator__");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Using for-each loop
		System.out.println("\nUsing For-each loop__");
		for (String eachString : list2) {
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
		for (String eachElement : list2) {

			System.out.print(eachElement + ", ");
		}

//		Removing the elements of list3 from list2
		list2.removeAll(list3);

		System.out.println("\nRemove all list3 element : ");
		for(String list:list2) {
			System.out.println(list);
		}

	}
}
