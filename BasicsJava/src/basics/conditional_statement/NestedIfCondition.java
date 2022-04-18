package basics.conditional_statement;

import java.util.Scanner;

public class NestedIfCondition {
	public static void main(String[] args) {
		
		float discount=0;
		float finalAmount = 0;
	
		System.out.println("Computer Stationary : 1");
		System.out.println("Fixed Disk : 2");
		System.out.println("Computers  : 3");
		
				Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the code for which product want to buy.");
		int val = sc.nextInt();

		if (val > 3 || val <1) {
			System.out.println("Enter valid input, please!!!");
			
		  } 
		else {
				if (val == 1) {
						System.out.println("[ You choose 'Computer Stationary' to buy ! ]");
						System.out.println("Please enter order amount : ");
						
						
						float orderAmount = sc.nextFloat();
		
						if (orderAmount >= 500) {
							 discount =orderAmount*0.12f; 
							 finalAmount = orderAmount-discount;
						} 
						else if (orderAmount >= 300 && orderAmount < 500) {
							 discount = orderAmount*0.08f;
							 finalAmount = orderAmount-discount;
						} 
						else if (orderAmount < 300 && orderAmount >=0) {
							 discount = orderAmount*0.02f;
							 finalAmount = orderAmount-discount;
						}
						
				 }
				
				else if(val == 2) {
						System.out.println("[ You choose 'Fixed Disk' to buy ! ] ");
						System.out.println("Please enter order amount : ");
						float orderAmount = sc.nextFloat();
						
						if(orderAmount >=2000) {
							 discount = orderAmount*0.1f;
							 finalAmount = orderAmount-discount;
						}
						else if(orderAmount >=1500 && orderAmount<2000) {
							 discount = orderAmount*0.05f;
							 finalAmount = orderAmount-discount;
						}
						else if(orderAmount < 1500) {
							 discount = orderAmount*0.0f;
							 finalAmount = orderAmount-discount;
							 
						}
						
				}
				else if(val == 3) {
						System.out.println("[ You choose 'Computers' to buy ! ]");
						System.out.println("Please enter order amount : ");
						float orderAmount = sc.nextFloat();
						
						if(orderAmount >=5000) {
							 discount = orderAmount*0.1f;
							 finalAmount = orderAmount-discount;
						}
						else if(orderAmount >=2500 && orderAmount<5000) {
							 discount = orderAmount*0.05f;
							 finalAmount = orderAmount-discount;
						}
						else if(orderAmount < 2500) {
							 discount = orderAmount*0.0f;
							 finalAmount = orderAmount-discount;
							 
						}
						
				}			
		}
		
		if(finalAmount == 0) {
//			System.out.println();
		}
		else if (discount == 0){
			System.out.println("Sorry ! You  didn't get any discount : "+discount);
			System.out.println("You must have to pay : " + finalAmount);
		}
		else {
		System.out.println("Hurray ! You get the discount : "+discount);
		System.out.println("Final puchase amount after deducting the discount is : " + finalAmount);
		}
		sc.close();
	}
}
