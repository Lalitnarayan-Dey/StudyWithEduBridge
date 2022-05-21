package com.sort.comparatorinterface;

public class Employee {
	
	Integer id;
	String name;
	Integer age;
	Float salary;

	
	
	public Employee(Integer id, String name, Integer age, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	

}
