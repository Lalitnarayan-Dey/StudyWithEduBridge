package relationship_and_Inheritance.is_a_relationship.HWFor04;

import relationship_and_Inheritance.has_a_relationship.MyDate;
import relationship_and_Inheritance.has_a_relationship.Person;

public class Q2Customer extends Person{
	String prodName;
	int qty;
	float price,billAmount;
	Person p;
//	MyDate d ;
	
	public Q2Customer() {
		super();
		this.prodName = "Mobile";
		this.qty =10;
		this.price=12200f;
	}
	public Q2Customer(Person p,String prodName,int qty,float price) {
		this.p = p;
		this.prodName= prodName;
		this.qty= qty;
		this.price = price;
		
	}
	
	public void calculateBillAmount() {
		billAmount = qty * price;
	}
	public void display() {
		System.out.println("+++++++++++++++++++B i l l  R e c i e p t +++++++++++++++++++++++++\n");
		super.display();
		System.out.println("Product name : "+prodName);
		System.out.println("Quantity     : "+qty);
		System.out.println("Price        : "+price);
		System.out.println("Bill_Amount  : "+billAmount);
	}
	public static void main(String[] args) {
		Q2Customer  c = new Q2Customer() ;
		c.calculateBillAmount();
		c.display();
		System.out.println("---------------------------------------------------------------------------\n");
		Q2Customer c2  = new Q2Customer(new Person(111, "Mahi",new MyDate(10,06,1987)),"TV",12,13500);
		c2.calculateBillAmount();
		c2.display();
		
	}
}
