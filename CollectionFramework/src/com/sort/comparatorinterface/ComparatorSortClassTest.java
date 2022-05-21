package com.sort.comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorSortClassTest {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(10001, "Lalit", 24, 25000f));
		employee.add(new Employee(10002, "Abhiram", 40,55000f));
		employee.add(new Employee(10001, "Ravi",40, 20000f));
		employee.add(new Employee(10001, "Bisw",20, 19000f));
		
		System.out.println("Sorting According to :- age. \n");
		Collections.sort(employee,new AgeComparator());
		
		for(Employee element: employee) {
			System.out.println(element);
		}
		
		System.out.println("\nSorting according to :- name.\n");
		
		Collections.sort(employee, new NameComparator());
		
		for(Employee element : employee) {
			System.out.println(element);
		}
		
	}

}
