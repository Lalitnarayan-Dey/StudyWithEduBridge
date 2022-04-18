package basics.conditional_statement.switchcase;

import java.util.Scanner;

public class CalculateAreaUsingSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose a value between '1 to 3'");
		System.out.println("For getting the area : ");
		int value = sc.nextInt();
		
		switch(value){
		case 1:
		System.out.println("Enter radius of the circle : ");
		float radius = sc.nextFloat();
		
		float areaOfRadius = 3.141f*radius*radius;
		System.out.println("Area of Circle is : "+areaOfRadius);
		break;
		
		case 2:
			System.out.println("Enter base & height of the tringle: ");
			float base = sc.nextFloat();
			float height = sc.nextFloat();
			
			float areaOfTringle = 0.5f*base*height;
			System.out.println("Area of tringle is : "+areaOfTringle);
			
			break;
		
		case 3:
			System.out.println("Enter length & breadth of the Rectangle : ");
			float length = sc.nextFloat();
			float breadth = sc.nextFloat();
			
			float areaOfRectangle = length*breadth;
			System.out.println("Area of tringle is : "+areaOfRectangle);
			
			break;
			
		default:
			System.out.println("Please choose valid option : ");
			
		}
		sc.close();

	}

}
