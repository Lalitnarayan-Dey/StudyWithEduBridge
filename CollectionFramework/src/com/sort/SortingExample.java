package com.sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
	public static void main(String[] args) {
		System.out.println("\n String List__\n");
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("PHP");
		list.add("JavaScript");
		list.add("MySql");
		
		
		Collections.sort(list);
		
		for(String eachElement:list) {
			System.out.println(eachElement);
		}
		
		System.out.println("\n Integer List__ \n");
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(87);
		list2.add(98);
		list2.add(2);
		list2.add(15);
		list2.add(45);
		
		Collections.sort(list2);
		for(Integer eachEle:list2) {
			System.out.println(eachEle);
		}

	}

}
