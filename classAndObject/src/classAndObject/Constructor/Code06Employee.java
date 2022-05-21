package classAndObject.Constructor;

import java.util.Scanner;

public class Code06Employee {
	String eName;
	int eId,workingDays;
	float perDaySalary;
	public Code06Employee(){
		System.out.println("This is Default constructor,  ");
		this.eId = 101;
		this.eName = "Lalit";
		this.workingDays = 67;
		this.perDaySalary = 208.57f;
		
		
	}
	public Code06Employee(int eId,String eName,int workingDays ,float perDaySalary) {
		System.out.println("This is Parameterized constructor,  ");
		this.eId = eId;
		this.eName = eName;
		this.workingDays =workingDays;
		this.perDaySalary=perDaySalary;
	}
	public void printAndCalculateSalary() {
		
		float slary  = workingDays * perDaySalary;
		
		System.out.println("Name : "+eName);
		System.out.println("Id : "+eId);
		System.out.println("Working Days : "+workingDays);
		System.out.println("per day salary : "+perDaySalary);
		System.out.println("Yor salary is : "+slary);
		
	}
	public static void main(String[] args) {
		Code06Employee o = new Code06Employee();
		o.printAndCalculateSalary();
		System.out.println("*********");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee Id : ");
		int id = sc.nextInt();
		System.out.println("Enter employee name : ");
		String name = sc.next();
		System.out.println("Enter working days and perDay Salary : ");
		int wd = sc.nextInt();
		float pds = sc.nextFloat();
		
		Code06Employee o2 = new Code06Employee(id,name,wd,pds);
		o2.printAndCalculateSalary();
		
	}

}
