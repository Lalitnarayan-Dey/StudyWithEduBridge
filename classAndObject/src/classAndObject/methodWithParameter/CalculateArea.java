package classAndObject.methodWithParameter;

import java.util.Scanner;

public class CalculateArea {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		CalculateArea obj = new CalculateArea();
		
		
		System.out.println("Enter the radius of the circle : ");
		int r = sc.nextInt();
		obj.getAreaOfCircle(r);
		
		System.out.println("\nEnter the length & breadth of rectangle : ");
		float length =sc.nextFloat();
		float breadth =sc.nextFloat();
		obj.getAreaOfRectangle( length, breadth);
		
		System.out.println("\nEnter the length of the square : ");
		float length1 =sc.nextFloat();
		System.out.println("Area of square is :"+obj.getAreaOfSquare(length1));
		
		System.out.println("\nEnter the height & width of tringle : ");
		float height =sc.nextFloat();
		float width = sc.nextFloat();
		System.out.println("Area of tringle is :"+obj.getAreaOfTringle(height,width));
		
		sc.close();
		
	}
	public void getAreaOfCircle(int radius) {	
		float areaOfCircle = 3.141f*radius*radius;
		System.out.println("Area of circle is :"+areaOfCircle);		
	}
	public void getAreaOfRectangle(float l,float b) {
		
		float areaOfRectangle =l * b;
		System.out.println("Area of rectangle is :"+areaOfRectangle);		
	}
	
	public float getAreaOfSquare(float l) {
		 float areaOfSquare =l * l;
		return areaOfSquare;		
	}
	public float getAreaOfTringle(float h,float w) {
	
		float areaOfTringle =0.5f * h * w;
		return areaOfTringle;		
	}
	

}
