package classAndObject.Methods;

import java.util.Scanner;

public class ParameterMethodWithoutReturn {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter two number : ");
		int a= sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		ParameterMethodWithoutReturn obj =new ParameterMethodWithoutReturn();
		obj.add(a, b);
		obj.sub(a, b);
		}
	
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("Addition is : "+c);
	}
	public void sub(int a, int b) {
		int c=a-b;
		System.out.println("Subtraction is : "+c);
	}

}
