package classAndObject.Methods;

import java.util.Scanner;

public class OverloadingMethodWithArea {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OverloadingMethodWithArea obj = new OverloadingMethodWithArea();	
		
		System.out.println("Enter length and breadth of the rectangle : ");
		float length = sc.nextFloat();
		float breadth =sc.nextFloat();
		
		float areaOfRectangle = obj.area(length, breadth);
		System.out.println("Area of rectangle is : "+areaOfRectangle);
		
		System.out.println("Enter height and width of the Tringle : ");
		double height = sc.nextFloat();
		double width = sc.nextFloat();
		
		double areaOfTringle=obj.area(height, width);
		String formattedareaOfTringle=String.format("%.0f", areaOfTringle);
		
		System.out.println("Area of rectangle is : "+areaOfTringle);
		System.out.println(formattedareaOfTringle);
		
		sc.close();
	}
	
	public float area(float a,float b) {
		float areaOfRectangle = a*b;
		return areaOfRectangle;
	}
	public double area(double a,double b ) {
		double areaOfTringle = 0.5*a*b;
		return areaOfTringle;
	}

}
