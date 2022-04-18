package homeworkwithsolution.take_input_fromuser;

import java.io.*;

public class CalculateAreaUsingBufferedReader {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("++++++++++++++This is for CIRCLE +++++++++++++++\n");
		System.out.println("Enter the radius of the circle : ");
		float pi = 3.141f;
		float radius = Float.parseFloat(reader.readLine());
		
		System.out.println("Area of radius is : "+pi*radius*radius);
		
		System.out.println("\n++++++++++++++++This is for Rectangle++++++++++++++++++");
		
		System.out.println("Enter the length : ");
		float length = Float.parseFloat(reader.readLine());
		System.out.println("Enetr the breadth : ");
		float breadth = Float.parseFloat(reader.readLine());
		
		System.out.println("Area of rectangle is : "+length*breadth);
		
		System.out.println("\n++++++++++++++++This is for Tringle++++++++++++++++++");
		
		System.out.println("Enter the Base  : ");
		float base = Float.parseFloat(reader.readLine());
		System.out.println("Enetr the Height : ");
		float height = Float.parseFloat(reader.readLine());
		
		System.out.println("Area of rectangle is : "+0.5*base*height);
		
		
		
	}

}
