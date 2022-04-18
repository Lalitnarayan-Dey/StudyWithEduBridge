package homeworkwithsolution.do_whileloop;

import java.util.Scanner;

public class CheckVowelOrConsonantUsingDoWhileLoop {

	public static void main(String[] args) {
		
		System.out.println("Enter a charcter to check vowel or consonant : ");
		Scanner sc = new Scanner(System.in);
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
		sc.close();

	}

}
