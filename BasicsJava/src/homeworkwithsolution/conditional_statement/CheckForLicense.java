package homeworkwithsolution.conditional_statement;

import java.util.Scanner;

public class CheckForLicense {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age to check the eligibility criteria for 'License'");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("Congrats!! You are eligibe for Licence : ");
		}
		else
			System.out.println("Sorry !! You are not eligible for the Licence.Beacuse you are less than '18' ");
		
		sc.close();
	}

}
