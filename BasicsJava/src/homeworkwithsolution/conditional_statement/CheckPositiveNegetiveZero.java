package homeworkwithsolution.conditional_statement;

import java.util.Scanner;

public class CheckPositiveNegetiveZero {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter three number to check positive or negative or zero : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == 0) {
			System.out.println("A is equals to zero : "+a+"=0");
		}
		else if(a>0) {
			System.out.println("number is positive : "+a+" > 0");
		}
		else if(a<0) {
			System.out.println("number is negative : "+a+" < 0");
		}
		
		if(b == 0) {
			System.out.println("A is equals to zero : "+b+"=0");
		}
		else if(b>0) {
			System.out.println("number is positive : "+b+" > 0");
		}
		else if(b<0) {
			System.out.println("number is negative : "+b+" < 0");
		}
		
		if(c == 0) {
			System.out.println("A is equals to zero : "+c+"=0");
		}
		else if(c>0) {
			System.out.println("number is positive : "+c+" > 0");
		}
		else if(c<0) {
			System.out.println("number is negative : "+c+" < 0");
		}
		
		sc.close();
	}
}
