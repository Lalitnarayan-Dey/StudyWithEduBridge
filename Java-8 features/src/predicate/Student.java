package predicate;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static List<Student> getStudent() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "Lalit", 24));
		list.add(new Student(102, "Abhiram", 50));
		list.add(new Student(103, "Java", 30));
		list.add(new Student(104, "Biswa", 20));
		list.add(new Student(105, "Rocky", 22));

		return list;
	}

}
