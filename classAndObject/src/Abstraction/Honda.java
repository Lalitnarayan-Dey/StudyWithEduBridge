package Abstraction;

public class Honda extends Bike {
	
	
	public static void main(String[] args) {
		
		
	
		
//		Honda h = new Honda();
		Bike b = new Honda();  // Up_Casting => Creating object of child class with reference of parent class
	b.run();
	b.print();
	}
	
	public void run() {
		System.out.println("R u n n i n g . . . ");
	}
//	private void print() {
//		System.out.println("P r i n t i n g . . .");
//	}
//	
}
