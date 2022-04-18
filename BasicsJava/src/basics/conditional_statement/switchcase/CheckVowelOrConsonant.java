package basics.conditional_statement.switchcase;

import java.util.Scanner;

public class CheckVowelOrConsonant {

	public static void main(String[] args) {
		
		char choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter a charcter to check vowel or consonant : ");
			String ch = sc.next();
			
			switch(ch) {
			
			case ("a"):
				System.out.println(ch+" is Vowel ");
				break;
			case ("A"):
				System.out.println(ch+" is Vowel ");
				break;
			case ("e"):
				System.out.println(ch+" is Vowel ");
				break;
			case ("E"):
				System.out.println(ch+" is Vowel ");
				break;
			case ("i"):
				System.out.println(ch+" is Vowel ");
				break;
			case ("I"):
				System.out.println(ch+" is Vowel ");
				break;
			case ("o"):
				System.out.println(ch+" is Vowel ");
				break;
			case ("O"):
				System.out.println(ch+" is Vowel ");
				break;
			case ("u"):
				System.out.println(ch+" is Vowel ");
				break;
			case ("U"):
				System.out.println(ch+" is Vowel ");
				break;
			
			default:
				System.out.println(ch + " is Consonant");
				break;
				
			
			}
			
			System.out.println("Do you want to continue to check ? (y/n)");
			choice = sc.next().charAt(0);
		}
		while(choice =='y' || choice == 'Y');
		sc.close();

	}

}
