package basics.loops.while_loop;

import java.util.Scanner;

public class Code05CheckArmstrongNumber {

	public static void main(String[] args) {
            int digit=0, remainder;
            double sum =0;
             
            Scanner sc  = new Scanner(System.in);
            System.out.println("Enter a number to check Armstrong or not. ");
            int originalNumber = sc.nextInt();
            sc.close();
            int unchngedVal = originalNumber;
            int tempNumber = originalNumber ;
            
            while(originalNumber > 0) {
            	originalNumber = originalNumber /10;
            	digit++;
            }
            while (tempNumber > 0)
            {
                remainder = tempNumber % 10;
                double power = Math.pow(remainder, digit);
                sum = (sum+power);
                tempNumber =tempNumber/ 10;
            }
            if(sum == unchngedVal)
            System.out.println(sum+" is a ArmStrong number.");
            
            else
            	System.out.println(unchngedVal+" is not a ArmStrong number.");
	}
}
