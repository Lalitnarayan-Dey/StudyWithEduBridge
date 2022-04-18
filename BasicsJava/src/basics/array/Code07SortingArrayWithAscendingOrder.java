package basics.array;

public class Code07SortingArrayWithAscendingOrder {
	public static void main(String[] args) {
		int a[] = new int[] {12,4,15,3,9};
		int temp;
		
System.out.println("Before sorting array. ");
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		for(int i = 0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nAfter sorting array in Asscending order.");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
