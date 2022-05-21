package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Ajay");
		deque.offer("Meera");
		deque.offer("Ashmit");
		deque.offerLast("Saloni");
		deque.offerFirst("Nupur");
		
		for (String string : deque) {
			System.out.println(string);
		}
		
		System.out.println("\nremoving 1st element : ");
		deque.pollFirst();
		for (String string : deque) {
			System.out.println(string);
		}
		
		System.out.println("\nremoving last element : ");
		deque.pollLast();
		for (String string : deque) {
			System.out.println(string);
		}
		
	}

}
