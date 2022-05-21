package lamdaExpression;

interface SingleExpression {
	public String sayHello(String string);
}
public class LamdaWithSingleExp {
	public static void main(String[] args) {
		SingleExpression single = (name) ->{
			return "Hello "+name ;
		};
		System.out.println(single.sayHello("Lalit"));
	}

}
