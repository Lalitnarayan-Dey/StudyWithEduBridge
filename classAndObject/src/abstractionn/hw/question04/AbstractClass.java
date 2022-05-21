package abstractionn.hw.question04;

 abstract class AbstractClass {
	 public AbstractClass() {
		System.out.println("This is constructor of abstract class . ");
	}
	 public abstract void a_method();
	 public void  non_abstractMethod() {
		 System.out.println("This is a normal method of abstract class . ");
	 }
}
