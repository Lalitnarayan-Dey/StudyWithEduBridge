package relationship_and_Inheritance.is_a_relationship;

import relationship_and_Inheritance.has_a_relationship.MyDate;
import relationship_and_Inheritance.has_a_relationship.Person;

//This is the Employee class
public class SingleLevelInheritsnce extends Person {
	float workingDays, perDaySalary,salary;
	
	
	public static void main(String[] args) {
		SingleLevelInheritsnce o = new SingleLevelInheritsnce();
		o.calculateSalary();
		o.disp();
		System.out.println("********************************");
		SingleLevelInheritsnce o2 = new SingleLevelInheritsnce(10011,"Lalit",new MyDate(1,1,2000),28f,2250f);
		o2.calculateSalary();
		o2.disp();
	
	}
	//////////////////////////////////////////////////////
	public SingleLevelInheritsnce() {
		super();
		workingDays = 23;
		perDaySalary = 2225;
	}
	public SingleLevelInheritsnce(int id,String name,MyDate dob,float workingDays,float perDaySalary) {
		super(id, name, dob);
		this.workingDays =workingDays;
		this.perDaySalary = perDaySalary;
	}
	public void calculateSalary() {
		salary = workingDays * perDaySalary ; 
	}
	public void disp() {
//		System.out.println("\n-------------------------------------------------\n");
		super.display();
		System.out.println("Salary : "+salary+" Rs");
//		System.out.println("\n++++++++++++++++++++++++++++++");
		
	}
	
}
