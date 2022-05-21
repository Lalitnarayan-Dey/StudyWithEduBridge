package relationship_and_Inheritance.is_a_relationship.HWFor04;

import relationship_and_Inheritance.has_a_relationship.MyDate;
import relationship_and_Inheritance.has_a_relationship.Person;

public class Q1Student extends Person{
	int id;
	String name;
	Person p;
	
	int mark1,mark2,mark3,securedMark ; 
	float percentage=0,total=300;
	
	public Q1Student(){
		super();
		this.mark1 = 89;
		this.mark2 = 78;
		this.mark3 = 80;
		
	}
	public Q1Student(int id,String name,MyDate d,int mark1,int mark2,int mark3) {
		super(id, name,d);
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3 = mark3;
		
	}
	public void calculatePercentage() {
		securedMark = mark1+mark2+mark3;
		percentage = (securedMark/total)*100;
	}
	
	public void display() {
		super.display();
		System.out.println("Mark1 : "+mark1);
		System.out.println("Mark2 : "+mark2);
		System.out.println("Mark3 : "+mark3);
		System.out.println("Secured mark : "+securedMark);
		System.out.println("Percentage : "+percentage);
	}

	
	public static void main(String[] args) {
		Q1Student s = new Q1Student();
		s.calculatePercentage();
		s.display();
		
		System.out.println("******************************************************");
		
		Q1Student s2 = new Q1Student(10001,"Lalitnarayan Dey",new MyDate(17,02,1997),78,89,90);	
		s2.calculatePercentage();
		s2.display();
		
	}
	

}
