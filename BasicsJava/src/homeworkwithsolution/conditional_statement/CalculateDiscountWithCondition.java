package homeworkwithsolution.conditional_statement;

import java.util.Scanner;

public class CalculateDiscountWithCondition {
	public static void main(String[] args) {
		
		float discountAmount;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your purchase price here : ");
		int purchasePrice = sc.nextInt();
		if(purchasePrice >= 10000) {
			discountAmount = purchasePrice*0.1f; 
			 System.out.println("Your Discount amount is : "+ discountAmount);	
			System.out.println("Total purchase amount after deducting the discount : "+(purchasePrice-discountAmount));
		}
		else {
			discountAmount = purchasePrice*0.02f; 
			 System.out.println("Your Discount amount is : "+ discountAmount);	
			System.out.println("Total purchase amount after deducting the discount : "+(purchasePrice-discountAmount));
		}
		
		sc.close();
	}
}
