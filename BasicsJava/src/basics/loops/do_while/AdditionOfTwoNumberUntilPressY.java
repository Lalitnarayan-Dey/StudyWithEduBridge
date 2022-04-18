package basics.loops.do_while;

import java.util.Scanner;

public class AdditionOfTwoNumberUntilPressY {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch ;
//		float p =3.2F;
		
		do {
			System.out.println("Enter 2 nos."); 
			int no1 = sc.nextInt();
			int no2 = sc.nextInt();
			
			System.out.println("Your addition is : "+(no1+no2));
			System.out.println("Do you want to continue ? (y/n)");
			
			 ch = sc.next().charAt(0);
			
		} while (ch == 'y'  || ch == 'Y');
		sc.close();
//		int x=11 & 9;
//		int y = x^3 ; 
//		System.out.println(y | 12);
		
//		System.out.println(a+b+c);
		}
}
