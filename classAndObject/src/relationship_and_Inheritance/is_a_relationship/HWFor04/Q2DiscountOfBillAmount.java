package relationship_and_Inheritance.is_a_relationship.HWFor04;
import relationship_and_Inheritance.has_a_relationship.Person;

public class Q2DiscountOfBillAmount extends Q2Customer{
	float finalAmount;
	float discount=0;
	public Q2DiscountOfBillAmount() {
		super();
		this.discount = billAmount *0.10f;
		this.finalAmount = billAmount-discount;
	}
	public Q2DiscountOfBillAmount(Person person,String prodName,int qty,float price) {
		super( person, prodName, qty, price);
//		this.finalAmount = billAmount-discount;
	}
	public void calculateDiscount() {
//		System.out.println(price);
		if(price >= 20000f) {
			discount = billAmount * 0.15f;
		}
		else if(price >= 15000f && price<20000f) {
			discount = billAmount *0.10f;
		}
		else if(price>=10000f && price <15000f) {
			discount = billAmount* 0.07f;
		}
		else {
			discount = billAmount;
		}
	}
	public void display() {
		super.display();
		finalAmount = billAmount-discount;
		System.out.println("Discount     : "+discount);
		System.out.println("Final amount : "+finalAmount);
		
		
	}
	public static void main(String[] args) {
		Q2DiscountOfBillAmount o = new Q2DiscountOfBillAmount();
		o.calculateBillAmount();
		o.calculateDiscount();
		o.display();
		System.out.println("****************************************");
	
	}
}
