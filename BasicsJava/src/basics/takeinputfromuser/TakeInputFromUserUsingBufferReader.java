package basics.takeinputfromuser;

import java.io.*;


public class TakeInputFromUserUsingBufferReader {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("a : ");
		int a = Integer.parseInt(reader.readLine());
		System.out.println("b : ");
		int b = Integer.parseInt(reader.readLine());
		
		int c = a+b;
		
		System.out.println("Sum is : "+c);
		
//		
	
		
	}

}
