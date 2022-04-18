package homeworkwithsolution.do_whileloop;

import java.util.Scanner;

public class CalculateAreaUsingDoWhile {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice ;
		float area,radius,base,height,length,breadth;
		
		do {
			System.out.println("Please choose a value between '1(circle) / 2(Tringle) / 3(Rectangle)'");
			System.out.println("For getting the area : ");
			int value = sc.nextInt();
			
			switch(value){
			case 1:
			System.out.println("Enter radius of the circle : ");
			 radius = sc.nextFloat();
			
			 area = 3.141f*radius*radius;
			System.out.println("Area of Circle is : "+area);
			break;
			
			case 2:
				System.out.println("Enter base & height of the tringle: ");
				 base = sc.nextFloat();
				 height = sc.nextFloat();
				
				 area = 0.5f*base*height;
				System.out.println("Area of tringle is : "+area);
				
				break;
			
			case 3:
				System.out.println("Enter length & breadth of the Rectangle : ");
				 length = sc.nextFloat();
				 breadth = sc.nextFloat();
				
				 area = length*breadth;
				System.out.println("Area of tringle is : "+area);
				
				break;
				
			default:
				System.out.println("Please choose valid option : ");
				
			}
			System.out.println("Do you want to continue ? (y/n)");
			 choice = sc.next().charAt(0);
		}while(choice == 'y' || choice== 'Y');
//		System.out.println("choice = "+choice);
		sc.close();

		
	}
}
