package homeworkwithsolution.take_input_fromuser;
import java.util.Scanner;
public class CalculatePercentage {
	public static void main(String[] args) {
		
//		System.out.println("***************Program 4 calculating percentage of three subjects.**************\n\n");
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the Total Marks of three subjects : ");
//		int fullMark = sc.nextInt();
//		
		int fullMark = 300 ;
		System.out.println("Enter the first subject mark : ");
		int fstSubMark = sc.nextInt();
		
		System.out.println("Enter the second subject mark : ");
		int scndSubMark = sc.nextInt();
		
		System.out.println("Enter the Third subject mark : ");
		int thrdSubMark = sc.nextInt();
		
		sc.close();
		float securedMarks = fstSubMark+scndSubMark+thrdSubMark;
		
		float percentOfMarks = securedMarks / fullMark * 100 ;
		
		System.out.println("Percentage of ('"+fullMark/100 +"') subjects is : "+percentOfMarks);
	
		
	}
}
