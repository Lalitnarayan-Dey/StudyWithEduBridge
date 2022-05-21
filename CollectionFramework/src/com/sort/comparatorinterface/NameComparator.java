package com.sort.comparatorinterface;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee object1, Employee object2) {
		return object1.name.compareTo(object2.name);
	}
	
}
