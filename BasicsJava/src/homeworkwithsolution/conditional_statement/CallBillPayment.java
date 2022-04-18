package homeworkwithsolution.conditional_statement;

import java.io.*;

public class CallBillPayment {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter no. of calls that you made up : ");
		int count = Integer.parseInt(reader.readLine());
		
		if (count < 200) {
			System.out.println("Price per unit : ' Rs 1 '");
			count =count*1;
		}
		else {
			System.out.println("Price per unit : ' Rs 3 '");
		    count = count*3;
		
		}
		System.out.println("Total Bill Amount is : Rs"+count);

	}

}
