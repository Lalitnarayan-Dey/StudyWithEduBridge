package abstractionn.hw.question03;

import java.util.Scanner;

public class PercentageTest {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks of 3 subjects  for first student . . .  ");
	int forFirstStudent1= sc.nextInt();
	int forFirstStudent2= sc.nextInt();
	int forFirstStudent3= sc.nextInt();
	
	Student01 student1 = new Student01(forFirstStudent1, forFirstStudent2, forFirstStudent3) ;
		float percentage = student1.getPercentage();
		System.out.println("1st student get the "+percentage+" % percent in 3 subject.");
		
		System.out.println("\nEnter the marks of 4 subject for second student . . . ");
		int for2ndStudent1= sc.nextInt();
		int for2ndStudent2= sc.nextInt();
		int for2ndStudent3= sc.nextInt();
		int for2ndStudent4= sc.nextInt();
		
		Student02 student2 = new Student02(for2ndStudent1, for2ndStudent2, for2ndStudent3, for2ndStudent4);	
		float percentageOf2ndStudent = student2.getPercentage();
		System.out.println("2nd student get the "+percentageOf2ndStudent+" % percent in 4 subject.");
	}

}
