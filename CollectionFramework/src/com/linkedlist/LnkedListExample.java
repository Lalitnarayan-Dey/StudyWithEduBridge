package com.linkedlist;

import java.util.LinkedList;

public class LnkedListExample {
	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.add("Java");
		linkedList.add("MySql");
		linkedList.add("hibernate");
		linkedList.add(null);
		linkedList.add("Java");
		
		System.out.println(linkedList);
		
		for(String element : linkedList) {
			System.out.print(element+" ");
		}
	}

}
