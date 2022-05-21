package classAndObject.Methods;

import java.util.Scanner;

public class ParameterMethodWithReturn {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter two number : ");
		int a= sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		ParameterMethodWithReturn obj =new ParameterMethodWithReturn();
		int addition = obj.add(a, b);
		System.out.println("Addition is : "+addition);
		System.out.println("Subtraction is : "+obj.sub(a, b));
		}
	
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}
	public int sub(int a, int b) {
		int c=a-b;
		return c;
	}

}
