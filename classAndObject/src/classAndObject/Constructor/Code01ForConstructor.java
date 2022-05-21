package classAndObject.Constructor;

import java.util.Scanner;

public class Code01ForConstructor {
	float l, b;
	public Code01ForConstructor() {
		this.l = 15;
		this.b= 12;
		
	}
	
	public Code01ForConstructor(float l ,float b) {
		this.l =l;
		this.b = b ;
	}
	public void area() {
		float a = l* b;
		System.out.println("Area of rectangle is :"+a);
	}
	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		Code01ForConstructor obj = new Code01ForConstructor();
		obj.area();
		System.out.println("Enter length & breadth : ");
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		Code01ForConstructor obj2 = new Code01ForConstructor(l,b);
		obj2.area();

	}

}
