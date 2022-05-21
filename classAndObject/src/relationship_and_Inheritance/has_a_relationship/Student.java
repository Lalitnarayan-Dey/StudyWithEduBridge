package relationship_and_Inheritance.has_a_relationship;

public class Student {
	int id;
	String name;
	MyDate dob;
	public Student() {
		id=101;
		name = "Ram";
		dob = new MyDate();
	}
	public Student(int id,String name,MyDate dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	public void disp() {
		System.out.println("Id : "+id);
		System.out.println("Name :"+name);
		dob.display();
	}
	public static void main(String[] args) {
		
		Student p = new Student();
		p.disp();
		
		Student p2 = new Student(102,"Lalit",new MyDate(11,12,2000));
		p2.disp();
	}

}
