package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import com.linkedlist.Employee;

public class UserDefinedListExample {
	public static void main(String[] args) {
		
		ArrayList<Employee> emplyeeList = new ArrayList<>();
		emplyeeList.add(new Employee(101,"Lalit", 30000));
		emplyeeList.add(new Employee(102,"Jit", 25000));
		emplyeeList.add(new Employee(103,"Lit", 35000));
		emplyeeList.add(new Employee(101,"Rabi", 40000));
		emplyeeList.add(new Employee(101,"Guddu", 50000));
	
//		Using Iterator	
		System.out.println("Using Iterator...");
		Iterator<Employee> iteratorEmployee = emplyeeList.iterator();
		while(iteratorEmployee.hasNext()) {
//			System.out.println(iteratorEmployee.next());
			Employee employee=(Employee) iteratorEmployee.next();
			System.out.println(employee);
		}
		
//		Using For-Each 
		System.out.println("Using For-each...");
		for(Employee eachEmployee : emplyeeList) {
			System.out.println(eachEmployee);
		}
	
	
	
	}
}
