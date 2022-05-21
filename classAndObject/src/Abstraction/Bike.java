package Abstraction;

abstract public class Bike {
	
	public Bike(){
		System.out.println("Constructor of abstract class.");
	}
	
	abstract public void run();
	
	public void print() {
		System.out.println("Non-abstract method of abstract class.");
	}


//	protected abstract void print();

}
