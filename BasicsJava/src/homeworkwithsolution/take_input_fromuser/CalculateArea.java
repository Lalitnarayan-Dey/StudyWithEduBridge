package homeworkwithsolution.take_input_fromuser;
import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
//		System.out.println("==========================This program only for calculating the area==================\n");
		
	
		Scanner scan = new Scanner(System.in);
//		System.out.println("********************Area of Circle***********************\n");
		double pi = 3.141;
		System.out.println("\nEnetr radius of the circle : ");
		double radius = scan.nextDouble() ;
		
		double areaOfCircle = pi*radius*radius;
		System.out.println("Area of circle is : "+areaOfCircle);
				
//		System.out.println("********************End of area Circle***********************\n");
		
//		System.out.println("********************Area of rectangle************************\n");
		System.out.println("\nEnter length of the recatngle");
		double length = scan.nextDouble();
		System.out.println("Enter breadth of the recatngle");
		double breadth = scan.nextDouble();
		
		System.out.println("Area of rectangle is : "+length*breadth);
		
//		System.out.println("********************END Area of rectangle************************\n");
		
//		System.out.println("********************Area of Tringle************************\n");
		System.out.println("\nEnter Base of the tringle");
		double base = scan.nextDouble();
		System.out.println("Enter Height of the tringle");
		double height = scan.nextDouble();
		
		System.out.println("Area of Tringle is : "+0.5*base*height);
		
//		System.out.println("********************END Area of Tringle************************\n");
		
		scan.close();
	}

}
