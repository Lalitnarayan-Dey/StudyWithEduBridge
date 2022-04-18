package homeworkwithsolution.take_input_fromuser;
import java.io.*;


public class CalculateSimpleInterestUsingBufferedReader {

	public static void main(String[] args) throws IOException{
		
		System.out.println("******************This Program only for claculate the 'Simple Interest' ");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value for p");
		float p =Float.parseFloat(reader.readLine());
		System.out.println("Enter value for t");
		float t = Float.parseFloat(reader.readLine());
		System.out.println("Enter value for r");
		float r = Float.parseFloat(reader.readLine());
		
		
		float simpleInterest = p*t*r/100;
		
		System.out.println("Your Simple Interest is : "+simpleInterest);
		
	}

}
