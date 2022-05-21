package classAndObject.Methods;

import java.util.Scanner;

public class OverloadingMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos : ");
		int a = sc.nextInt();
		int b =sc.nextInt();
		
		System.out.println("Enter three nos : ");
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		float z = sc.nextFloat();
		OverloadingMethod obj = new OverloadingMethod();
		obj.add(a, b);
		obj.add(x, y, z);
		sc.close();
	}
	public void add(int a,int b) {
		System.out.println("Addition of twon nos : "+a+b);
	}
	public void add(float a,float b,float c) {
		float addOf3 = a+b+c;
		System.out.println("Addition of three nos : "+addOf3);
	}

}
