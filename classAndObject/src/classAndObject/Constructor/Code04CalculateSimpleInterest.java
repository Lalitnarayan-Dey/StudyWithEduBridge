package classAndObject.Constructor;

import java.util.Scanner;

public class Code04CalculateSimpleInterest {
	float principalAmount,time,rateOfInt;
	public Code04CalculateSimpleInterest(){
		System.out.print("This is Default constructor,  ");
		this.principalAmount = 10000.0f;
		this.time=3.5f;
		this.rateOfInt = 5.68f;
	}
	public Code04CalculateSimpleInterest(float p,float t,float r) {
		this.principalAmount = p;
		this.time = t;
		this.rateOfInt = r;
	}
	public void calculateSimpleInt() {
		float si = principalAmount*time*rateOfInt;
		System.out.println("SimpleInterest is : "+si);
	}
	public static void main(String[] args) {
		Code04CalculateSimpleInterest o = new Code04CalculateSimpleInterest();
		o.calculateSimpleInt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for p");
		float p = sc.nextFloat();
		System.out.println("Enter value for t");
		float t = sc.nextFloat();
		System.out.println("Enter value for r");
		float r = sc.nextFloat();
		
		Code04CalculateSimpleInterest o2 = new Code04CalculateSimpleInterest(p,t,r);
		o2.calculateSimpleInt();
	}

}
