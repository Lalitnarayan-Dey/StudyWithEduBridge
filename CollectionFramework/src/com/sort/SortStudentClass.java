package com.sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortStudentClass {
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(101,"Lalit",24));
		studentList.add(new Student(105,"Biswa",22));
		studentList.add(new Student(103,"Rocky",23));
		studentList.add(new Student(104,"Yash",25));
		studentList.add(new Student(102,"Narayan",22));
		studentList.add(new Student(101,"Ram",20));
		
		
		System.out.println("Sorting by Comparable Interface");
		Collections.sort( studentList);
		
		for(Student element : studentList) {
			System.out.println(element+"\n");
		}
	}

}
