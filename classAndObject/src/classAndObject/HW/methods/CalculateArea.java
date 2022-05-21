package classAndObject.HW.methods;

import java.util.Scanner;

public class CalculateArea {
	float radius,length,breadth,sqLength,height,width;
	float areaOfCircle,areaOfRectangle,areaOfSquare,areaOfTringle;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		CalculateArea obj = new CalculateArea();
		obj.getAreaOfCircle();
		obj.getAreaOfRectangle();
		System.out.println("Area of square is :"+obj.getAreaOfSquare());
		System.out.println("Area of tringle is :"+obj.getAreaOfTringle());
		;
		
	}
	
	public void getAreaOfCircle() {
		System.out.println("Enter the radius of the circle : ");
		radius = sc.nextFloat();
		areaOfCircle = 3.141f*radius*radius;
		System.out.println("Area of circle is :"+areaOfCircle);		
	}
	public void getAreaOfRectangle() {
		System.out.println("Enter the length & breadth of rectangle : ");
		length = sc.nextFloat();
		breadth = sc.nextFloat();
		areaOfRectangle =length * breadth;
		System.out.println("Area of rectangle is :"+areaOfRectangle);		
	}
	public float getAreaOfSquare() {
		System.out.println("Enter the length of the square : ");
		length = sc.nextFloat();
	//	breadth = sc.nextFloat();
		areaOfSquare =length * length;
		return areaOfSquare;		
	}
	public float getAreaOfTringle() {
		System.out.println("Enter the height & width of tringle : ");
		height = sc.nextFloat();
		width = sc.nextFloat();
		areaOfTringle =height * width;
		return areaOfTringle;		
	}
	

}
