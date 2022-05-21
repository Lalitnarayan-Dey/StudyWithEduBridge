package classAndObject.stringOperation;

public class StringOperation {

	public static void main(String[] args) {
		 String s1 = "Welcome";
		 String s2 = "    Hello ";
		 String s5 = "This is example of split()";
		 
		//charAt() method
		 System.out.println("charAt(5) :"+s1.charAt(5));
		 System.out.println("charAt(5) : "+s2.charAt(5));
		 System.out.println("*********************************");
		 
		 //length()
		 System.out.println("Length of s1 :"+s1.length());
		 System.out.println("Length of s2 :"+s2.length());
		 System.out.println("*********************************");
		 
		 //concat()
		 
		 System.out.println("Concat() : "+s1.concat(" to my world!!"));
		 System.out.println(s1);
		 
		 System.out.println("Before concat : "+s2);
		 s2 = s2.concat("World !!!");
		 System.out.println("After concat : "+s2);
		 System.out.println("*********************************");
		 
		 //subString
		 
		 System.out.println("substring() : "+s2.substring(5));
		 System.out.println("substring() : "+s2.substring(5,7));
		 System.out.println("*********************************");
		 
//		 toUpperCase
		 System.out.println("toUpperCase() : "+s1.toUpperCase());
		 System.out.println("*********************************");
		 
//		 toLoweCase()
		 System.out.println("toLowerCase() : "+s2.toLowerCase());
		 System.out.println("*********************************");
			//isEmpty
		 System.out.println("isEmpty() : "+s1.isEmpty());
		 System.out.println("*********************************");
//		 replace
		 System.out.println("replace('l','o') : "+s1.replace('l','o'));
		 System.out.println("*********************************");
//		 equals
		 System.out.println("equals(s2) : "+s1.equals(s2));
		 System.out.println("*********************************");
//		 equalIgnoreCase
		 System.out.println("equalsIgnoreCase(s2) : "+s1.equalsIgnoreCase(s2));
		 System.out.println("*********************************");
		 
//		 trim
		 System.out.println("Before trim() : "+s2);
		 System.out.println("Before Trim() length : "+s2.length());
		 s2 = s2.trim();
		 System.out.println("Before trim() : "+s2);
		 System.out.println("After Trim() length : "+s2.length());
		 System.out.println("*********************************");
		 
		 //Split()
		 String[] splitArr=s5.split("");
		 
		 System.out.println(s5.length());
		 for(int i=0;i<s5.length();i++) {
			 System.out.print(splitArr[i]+" ");
		 }
	}

	

}
