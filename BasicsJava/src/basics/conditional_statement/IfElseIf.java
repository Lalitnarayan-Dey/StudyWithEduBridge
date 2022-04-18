package basics.conditional_statement;
import java.util.*;


public class IfElseIf {
	public static void main(String[] args) {
		
		float p,c,m, total,percentage;
		
		System.out.println("Enter marks of three subjects physics, chemistry & math : ");
		Scanner sc = new Scanner(System.in);
		
		p = sc.nextFloat();
		c = sc.nextFloat();
		m = sc.nextFloat();
		
		total = p+c+m;
		percentage = total/3;
		
		System.out.println("Total : "+total);
		System.out.println("Percentage"+percentage);
		
		if(p<35 || c<35 || m<35) {
			System.out.println("Fail because You secured < 35 in one subject");
		}
		else {
			if(percentage >=75) {
				System.out.println("Distinct");
			}
			else if(percentage >=60) {
				System.out.println("First Class");
			}
			else if(percentage >=45) {
				System.out.println("Second Class");
			}
			else if(percentage >=35) {
				System.out.println("Pass Class");
			}
			else{
				System.out.println("Failed due to total percentage");
			}
		}
		
		sc.close();
		
	}

}
