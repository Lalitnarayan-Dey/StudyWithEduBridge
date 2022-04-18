package basics.array;

public class Code11ConcatenateTwoArray {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6};
		
		int length = a.length+b.length;
		
//		System.out.println(length);
		int[] ab = new int[length];
		
		int position =0;
		for(int i=0;i<a.length;i++) {
			
			ab[position] = i; 
			position++;
		}
		for(int i=0;i<b.length-1;i++) {
			
			ab[position] = i ; 
			position++;
		}
		
		System.out.println("after concatination operation :");
		for(int i =0;i<ab.length;i++) {
			System.out.print(ab[i]);
		}
	}
}
