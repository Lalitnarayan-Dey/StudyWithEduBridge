package com.sort.comparatorinterface;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employeeObject1, Employee employeeObject2) {
		
		return employeeObject1.age.compareTo(employeeObject2.age);
		
	}

}
