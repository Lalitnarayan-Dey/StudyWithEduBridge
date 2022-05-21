package stringjoiner;

import java.util.StringJoiner;

public class StringJoinerEx {
	public static void main(String[] args) {
//		Using first constructor i,e- delimiter
		StringJoiner joiner = new StringJoiner(", ");
//		Setting the empty value to an object
		joiner.setEmptyValue("null");
		System.out.println(joiner);
		
		joiner.add("Ram");
		joiner.add("Krishna");
		joiner.add("Lalit");
		joiner.add("Abhiram");
		joiner.add("Sai");
		
		System.out.println("Using delimiter : "+joiner);
//		Using 2nd constructor delimiter,suffix, prefix
		
		StringJoiner joiner2 = new StringJoiner("- ", "[", "]");
		
		joiner2.add("X");
		joiner2.add("Y");
		joiner2.add("Z");
		joiner2.add("A");
		System.out.println("Using delimiter , prefix and suffix : "+joiner2);
		
//		Merge two objects into a single object.
		StringJoiner merge = joiner.merge(joiner2);
		System.out.println("After merging two object  : "+merge);
	
//		Checking length ofthe object/string
		System.out.println("Length of the joined object : "+merge.length());
	
//		Convert object to string by using toString().
		String string = joiner.toString();
		
		char ch = string.charAt(11);
		System.out.println("Character at position 10 : "+ch);
		
	}
}
