package homeworkwithsolution.take_input_fromuser;
import java.util.Scanner;

public class CalculateSalaryWithTAX {
	public static void main(String[] args) {
		
		System.out.println("***************This program for calculate salary after deduction of '12%' interest**********\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Salary : ");
		float salary = sc.nextFloat();
		
		float totalIntersetAmount = salary*0.12f;
		
		float netSalary = salary - totalIntersetAmount ; 
		
		System.out.println("12% of salary is : "+totalIntersetAmount);
		
		System.out.println("After deduction  12% TAX from your net salary ( "+salary+" - "+totalIntersetAmount+" )  is : "+netSalary);
		sc.close();
	}

}
