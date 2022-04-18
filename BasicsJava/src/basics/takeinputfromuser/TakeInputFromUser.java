package basics.takeinputfromuser;
import java.util.*;

public class TakeInputFromUser {
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 values.");
		try {
			a = sc.nextInt();
			b=sc.nextInt();
		
			sc.close();
			
			c = a+b ; 
			System.out.println("Addition of given two number is : a("+a+") + b("+b+") = "+c);
		}
		catch(Exception e) {
			System.out.println("You must need to enter integer values.");
		}
		finally {
			sc.close();
		}
	}
}
