package classAndObject.Methods;

import java.util.Scanner;

public class TaskEmployee {
	
	String empName;
	int empCode;
	float basicSalary, allowance, grossSalary, tax, netSalary;
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name ,Employee Code, and Basic Salary : ");
		empName = sc.nextLine();
		empCode = sc.nextInt();
		basicSalary = sc.nextFloat();
		
		sc.close();
		
	}
	public void allow() {
		allowance = 0.55f * basicSalary;
	}
	public void gross() {
		grossSalary = basicSalary+allowance;
	}
	public void tax() {
		tax = 0.12f * grossSalary;
	}
	public void net() {
		netSalary = grossSalary-tax;
	}
	public void disp() {
		System.out.println("***************************************");
		System.out.println("Your Employee Code : "+empCode);
		System.out.println("\nEmployee Name : "+empName);
		System.out.println("\nBasic Salary : "+basicSalary+"Rs");
		System.out.println("\ntax : "+tax+"Rs");
		System.out.println("\nNet Salary : "+netSalary+"Rs");
		System.out.println("***************************************");
	}
	
	public static void main(String[] args) {
		TaskEmployee obj = new TaskEmployee();
		obj.accept();
		obj.allow();
		obj.gross();
		obj.tax();
		obj.net();
		obj.disp();
		
		
	}
	

}
