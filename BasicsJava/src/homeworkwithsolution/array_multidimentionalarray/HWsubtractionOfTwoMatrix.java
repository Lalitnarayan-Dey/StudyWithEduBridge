package homeworkwithsolution.array_multidimentionalarray;

import java.util.Scanner;

public class HWsubtractionOfTwoMatrix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int rows ,columns;
		
		System.out.println("Enter the size of matrix (rows & columns): ");
		 rows = sc.nextInt();
	     columns = sc.nextInt();
	     
	      int[][] firstMatrix = new int[rows][columns];
	      int[][] secondMatrix = new int[rows][columns];
	      int[][] subtractionOfMatrix = new int[rows][columns];
	      
	      
	      System.out.println("Enter the "+rows*columns+" elements of first matrix : ");
	      for(int i=0;i<rows;i++) {
	    	  for(int j=0;j<columns;j++) {
	    		  firstMatrix[i][j] = sc.nextInt();
	    	  }
	      }
	      System.out.println("Enter the "+rows*columns+" elements of second matrix");
	      for(int i=0;i<rows;i++) {
	    	  for(int j=0;j<columns;j++) {
	    		  secondMatrix[i][j] =sc.nextInt();
	    	  }
	      }
	      
/*	      System.out.println("1st matrix : ");
	      for(int i=0;i<rows;i++) {
	    	  for(int j=0;j<columns;j++) {
	    		  System.out.print(firstMatrix[i][j]);
	    	  }
	    	  System.out.println();
	      }
*/	      
//	      SUBTRACTION OPERATION
	      for(int i=0;i<rows;i++) {
	    	  for(int j=0;j<columns;j++) {
	    		  subtractionOfMatrix[i][j] = firstMatrix[i][j]-secondMatrix[i][j];
	    	  }
	      }
	      
//	      PRINT SUMMATION
	      System.out.println("Subtraction of two matrix is :");
	      for(int i=0;i<rows;i++) {
	    	  for(int j=0;j<columns;j++) {
	    		  System.out.print(subtractionOfMatrix[i][j]+"\t");
	    	  }
	    	  System.out.println();
	      }
	      
		
		
		sc.close();
	}

}
