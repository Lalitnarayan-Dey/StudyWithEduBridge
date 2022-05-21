package com.arraylist;

public class Employee {
	int id;
	String name;
	float salary;
	
	public Employee(int id, String name,float salary){
		this.id=id;
		this.name=name;
		this.salary =salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
