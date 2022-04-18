package homeworkwithsolution.take_input_fromuser;
import java.io.*;


public class CalculatePercentageUsingBufferedReader {
	public static void main(String[] args) throws IOException{
		
		System.out.println("***************Program 3 calculating percentage of three subjects.**************\n\n");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("Enter the Total Marks of three subjects : ");
		int fullMark = 300;
		
		System.out.println("Enter the first subject mark : ");
		int fstSubMark = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter the second subject mark : ");
		int scndSubMark = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter the Third subject mark : ");
		int thrdSubMark = Integer.parseInt(reader.readLine());
		
		
		float securedMarks = fstSubMark+scndSubMark+thrdSubMark;
		
		float percentOfMarks = securedMarks / fullMark * 100 ;
		
		System.out.println("Percentage of ('"+fullMark/100 +"') subjects is : "+percentOfMarks);
	
		
	}
}
