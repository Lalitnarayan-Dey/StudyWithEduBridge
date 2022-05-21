package com.sort;

public class Student implements Comparable<Student>{
	public Integer id;
	public String name;
	public Integer age;
	
	Student(Integer id,String name,Integer age){
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student studentObject) {
		
//		return age.compareTo(studentObject.age);
		if(age==studentObject.age) {
			return 0;
		}
		else if(age>=studentObject.age)
		return 1;
		
		else {
			return -1;
		}
	}
	
	

}
