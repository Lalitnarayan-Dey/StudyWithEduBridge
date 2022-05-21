package classAndObject.HW.methods;

import java.util.Scanner;

public class CheckMultipleOption {
	
	
int number,choice;
char yesOrNo;
int digitCount,remainder,temp=0,reverse;
double sum=0, power;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char yesOrNoChoice;
		CheckMultipleOption obj = new CheckMultipleOption();
		do {
			obj.getData();
			int choice = obj.choice;			
			switch(choice ) {
			case(1):
				System.out.println("You choose '"+choice+"' to check even or odd :");
				obj.checkForEvenOdd();
				break;
			case(2):
				System.out.println("You choose '"+choice+"' to check +ve or -ve or zero :");
				obj.checkPositiveOrNegative();
				break;
			case(3):
				System.out.println("You choose '"+choice+"' to check Armstrong number :");
				obj.checkArmstrong();
				break;
			case(4):
				System.out.println("You choose '"+choice+"' to check Palindrome number :");
				obj.checkPalindrome();
				break;
			default:
				System.out.println("======================\nPlease choose valid option!!!\n======================\n");
			}
			System.out.println("Do you want to do more fun ? (y/n)");
			yesOrNoChoice = sc.next().charAt(0);
		}
		while(yesOrNoChoice =='y' || yesOrNoChoice =='Y');
		System.out.println("************ Thank You, Visit Again ************");
		sc.close();
	}
	public void getData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number. . . ");
		 number =sc.nextInt();		
		System.out.println("What operation do you want to performe :(Please insert 1-4 no.)...  \n 1. Check even/odd : \n 2. Check for +ve/-ve/zero : \n 3. Check Armstrong or not : \n 4. Check Palindrome or not :");
	    choice = sc.nextInt();    
	}
	
	public void checkForEvenOdd() {
		if(number%2==0) {
			System.out.println(number+": is even :");
		}
		else {
			System.out.println(number+": is odd");
		}		
	}
	
	public void checkPositiveOrNegative() {
		if(number>0)
			System.out.println(number+": is positive.");
		if(number <0)
			System.out.println(number+": is negative.");
		if(number == 0)
			System.out.println(number+": is zero.");
	}
	
	public void checkArmstrong() {
		int originalNumber = number;
		temp = number ;
		while(number>0) {
			number /=10; 
			digitCount++;
		}
		while(temp >0) {
			remainder =temp%10;
			power = Math.pow(remainder, digitCount);
			sum = sum+power;
			temp /=10;	
		}
		if(sum == originalNumber) {
			System.out.println(originalNumber+": is a Armstrong number. ");
		}
		else {
			System.out.println(originalNumber+": is not a Armstrong number. ");
		}
	}
	
	public void checkPalindrome() {
		int tempNumber = number;
		while(tempNumber>0) {
			remainder = tempNumber % 10;
			reverse = (reverse*10)+remainder;
			tempNumber = tempNumber/10;	
		}
		if(number == reverse) {
			System.out.println(number+": is Palindrome.");
		}
		else {
			System.out.println(number+": is not a palindrome.");
		}
	}

}
