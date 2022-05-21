package exceptionExample;

public class NestedTryCatchBlock {
	public static void main(String[] args) {
		
		try {
			
				try {
					String s = null;
					System.out.println(s.length());
					
				} catch (NullPointerException e) {
					e.printStackTrace();
				}
				try {
					String str = "abc";
					System.out.println(Integer.parseInt(str));
				}catch(NumberFormatException e) {
					
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
