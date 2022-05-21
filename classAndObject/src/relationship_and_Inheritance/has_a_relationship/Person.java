package relationship_and_Inheritance.has_a_relationship;

import relationship_and_Inheritance.is_a_relationship.SingleLevelInheritsnce;

public class Person {
	int id;
	String name;
	MyDate dob;
	public Person() {
		id=101;
		name = "Narayan";
		dob = new MyDate();
	}
	public Person(int id,String name,MyDate dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	public void display() {
		System.out.println("Id     : "+id);
		System.out.println("Name   : "+name);
		dob.display();
	}
	public static void main(String[] args) {
		
//		Person p = new Person();
//		p.display();
		
		Person p2 = new Person(102,"Lalit",new MyDate(17,02,1998));
		p2.display();
	}

}
