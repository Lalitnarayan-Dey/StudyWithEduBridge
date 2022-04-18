package homeworkwithsolution.conditional_statement;

import java.util.Scanner;

public class FindMaxNumber {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter three number to find greater one : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c= sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A = "+a+" is greater among ["+a+","+b+","+c+"]");
		}
		else if(b>a && b>c) {
			System.out.println("B = "+b+"  is greater among ["+a+","+b+","+c+"]");
		}
		else {
			System.out.println("C = "+c+" is greater among ["+a+","+b+","+c+"]");
			
		}
		
		sc.close();
		
	}

}
