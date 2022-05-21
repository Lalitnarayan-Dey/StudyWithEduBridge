package parallelarraysorting;

import java.util.Arrays;

public class ArraySortingEx {
	public static void main(String[] args) {
		int[] a  = {12,76,67,45,90,87,37};
		
		System.out.println("Before parallel sorting : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
//		Parallel sorting of an array
		Arrays.parallelSort(a);
		
		System.out.println("\nAfter parallel soring");
		for(int i : a) {
			System.out.print(i+" ");
		}
	}

}
