package homeworkwithsolution.take_input_fromuser;
import java.util.Scanner;

public class CalculateSimpleInterest {

	public static void main(String[] args) {
		
		System.out.println("******************This Program only for claculate the 'Simple Interest' ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for p");
		double p = sc.nextFloat();
		System.out.println("Enter value for t");
		double t = sc.nextFloat();
		System.out.println("Enter value for r");
		double r = sc.nextFloat();
		
		sc.close();
		double simpleInterest = p*t*r/100;
		
		System.out.println("Your Simple Interest is : "+simpleInterest);
		
	}

}
