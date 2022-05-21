package relationship_and_Inheritance.has_a_relationship;

import java.util.Scanner;

public class Customer {
	int id;
	String name;
	Address ad;
	
	public Customer() {
		this.id = 101;
		this.name="Lalit";
		ad = new Address();
	}
	public Customer(int id,String name,Address add) {
		this.id = id;
		this.name=name;
		this.ad = add;
	}
	
	public void display() {
		System.out.println("Customer id : "+id);
		System.out.println("Customer name : "+name);
		System.out.println("\t\tThese are the Address's datamembers:");
		ad.disp();
	}
	public static void main(String[] args) {
		Customer c = new Customer();
		c.display();
		System.out.println("+++++++++++++++++++++++++++++++");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id : ");
		int id = sc.nextInt();
		System.out.println("Enter your name : ");
		sc.next();// for getting the value of enter key fromm key board.
		String name = sc.nextLine();
		
		System.out.println("Enter Address Lane : ");
		int addLane = sc.nextInt();
		System.out.println("Enter your city name : ");
		String city = sc.next();
		System.out.println("Enter your state  : ");
		String state = sc.next();
		System.out.println("Enter your Country  : ");
		String country = sc.next();
		System.out.println("Enter your pin : ");
		int pin = sc.nextInt();
//		Address a = new Address(12,"bbsr","odisha","India",760007);
		Customer c2 = new Customer(id,name,new Address(addLane,city,state,country,pin));
		c2.display();
		
	}

}
//id,name,address(Address)