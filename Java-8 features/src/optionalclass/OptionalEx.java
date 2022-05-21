package optionalclass;

import java.util.Optional;

public class OptionalEx {
	public static void main(String[] args) {
		
		String[] string = new String[10];
//		string[5] = "TEST";
		
		Optional<String> opt = Optional.ofNullable(string[5]);
		System.out.println(opt);
		
		if(opt.isPresent()) {
			
			String lowerCase = string[5].toLowerCase();
			System.out.println("1 element is present : "+lowerCase);
		}
		else {
			System.out.println("Value is not there. at 5th position");
		}
	}

}
