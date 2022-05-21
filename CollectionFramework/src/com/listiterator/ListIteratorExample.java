package com.listiterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Python");
		list.add("PHP");
		list.add("JavaScript");
		list.add("MySql");
		
		System.out.println("Traversing in forword direction...\n ");
		
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
		
			System.out.println(listIterator.next());
		}
		
		System.out.println("\nTraversing in backword direction...\n");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
