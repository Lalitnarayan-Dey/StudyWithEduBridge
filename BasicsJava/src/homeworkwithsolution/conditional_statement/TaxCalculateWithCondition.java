package homeworkwithsolution.conditional_statement;

import java.util.Scanner;

public class TaxCalculateWithCondition {
	public static void main(String[] args) {
		
		float taxAmount;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your salary here : ");
		int salary = sc.nextInt();
		if(salary<=15000) {
			 taxAmount =salary*0.1f; 
			 System.out.println("Your Tax amount : "+taxAmount);	
			System.out.println("Net salary after deducting the tax amount : "+(salary-taxAmount));
		}
		else {
			taxAmount = salary*0.15f;
			System.out.println("Your Tax amount : "+taxAmount);
			System.out.println("Net salary after deducting the tax amount : "+(salary-taxAmount));
			
		}
		sc.close();
	}
}
