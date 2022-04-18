package homeworkwithsolution.take_input_fromuser;

import java.io.*;

public class CalculateSalaryWithTAXWithBufferedReader {
	public static void main(String[] args) throws IOException{
		
		System.out.println("***************This program for calculate salary after deduction of '12%' interest**********\n");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Your Salary : ");
		float salary =Float.parseFloat(reader.readLine());
		
		float totalIntersetAmount = salary*0.12f;
		
		float netSalary = salary - totalIntersetAmount ; 
		
		System.out.println("12% of salary is : "+totalIntersetAmount);
		
		System.out.println("After deduction  12% TAX from your net salary ( "+salary+" - "+totalIntersetAmount+" )  is : "+netSalary);
		
	}

}
