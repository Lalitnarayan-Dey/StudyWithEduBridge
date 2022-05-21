package collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack = new Stack<String>();
		stack.push("Manas");
		stack.push("Paras");
		stack.push("Manasi");
		stack.push("Manva");
		
		System.out.println(stack);
		
		System.out.println("removing element : "+stack.pop());
		
		System.out.println(stack);
		
		System.out.println("searching element : "+stack.search("Manas"));
		
		System.out.println("searching element : "+stack.search("Raj"));
	}

}
