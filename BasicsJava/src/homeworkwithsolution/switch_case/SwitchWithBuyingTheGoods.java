package homeworkwithsolution.switch_case;

import java.util.Scanner;

public class SwitchWithBuyingTheGoods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("************************************************\n");
		System.out.println("Enter following codes with respective products.");
		System.out.println("Computer Stationary =====> [ 1 ]");
		System.out.println("Fixed Disk          =====> [ 2 ]");
		System.out.println("Computers           =====> [ 3 ]\n");
		System.out.println("**************************************************");
		float discount = 0 ;
		float finalAmount = 0;
		float price = 0;
		
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("You choose 'Computer Stationary' ");
				System.out.println("Enter price : ");
				price = sc.nextFloat();	
				if(price > 500) {
					discount = price*0.1f;
					finalAmount = price-discount;
				}
				else if(price >=300 && price< 500){
					discount = price*0.08f;
					finalAmount = price-discount;
				}
				else if(price <300) {
					discount = price*0.02f;
					finalAmount = price-discount;
				}
				break;
			case 2:
				System.out.println("You choose 'Fixed Disk' ");
				System.out.println("Enter price : ");
				price = sc.nextFloat();	
				if(price >=2000) {
					 discount = price*0.1f;
					 finalAmount = price-discount;
				}
				else if(price >=1500 && price<2000) {
					 discount = price*0.05f;
					 finalAmount = price-discount;
				}
				else if(price < 1500) {
					 discount = price*0.0f;
					 finalAmount = price-discount;
					 
				}
				break;
			case 3:
				System.out.println("You choose 'Computers' ");
				System.out.println("Enter price : ");
				price = sc.nextFloat();	
				if(price >=5000) {
					 discount = price*0.1f;
					 finalAmount = price-discount;
				}
				else if(price >=2500 && price<5000) {
					 discount = price*0.05f;
					 finalAmount = price-discount;
				}
				else if(price < 2500) {
					 discount = price*0.0f;
					 finalAmount = price-discount;
					 
				}
				break;
			default:
				System.out.println("Please , choose valid input.");
				break;
		}
		System.out.println("Hurray ! You get the discount : "+discount);
		System.out.println("Final puchase amount after deducting the discount is : " + finalAmount);
		
		
		sc.close();
	}

}
