package abstractionn.hw.question04;


public class SubClassTest {
	public static void main(String[] args) {
	SubClass subclassObject = new SubClass();  //Here constructor will call 
	subclassObject.a_method();  // here abstract method call from subclass
	subclassObject.non_abstractMethod();	//Here non_abstract method call
	
	}

}
