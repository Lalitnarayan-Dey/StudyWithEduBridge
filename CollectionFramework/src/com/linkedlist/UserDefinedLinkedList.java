package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class UserDefinedLinkedList {
	public static void main(String[] args) {
		
		
		LinkedList<Employee> linkdList = new LinkedList<>();
	
		linkdList.add(new Employee(101,"X",15000));
		linkdList.add(new Employee(102,"Y",15000));
		linkdList.add(new Employee(103,"Z",15000));
		linkdList.add(new Employee(104,"A",15000));
		
		
		System.out.println("For using For-Each Loop . . . ");
		for(Employee list:linkdList) {
			System.out.println(list);
		}
		
		System.out.println("\nUsing Iterator . . . ");
		Iterator iteratorForLinkedList = linkdList.iterator();
		while(iteratorForLinkedList.hasNext()) {
			Employee employee = (Employee)iteratorForLinkedList.next();
			System.out.println(employee);
		}
	
	}

}
