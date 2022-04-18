package basics.array;

public class Code09TakeRollNoAndMarksANdSortingThemInDescendingOrder {
	public static void main(String[] args) {
		
		int[] rollNo = {1,2,3,4,5};
		int[] marks = {65,58,89,42,76};
		
		//For swapping the values 
		int temp1,temp2;
		
		for(int i=0;i<marks.length-1;i++) {
			for(int j =i;j<marks.length;j++) {
				if(marks[i] < marks[j]) {
					
//					It's only for sorting the marks
					temp1 = marks[i];
					marks[i]=marks[j];
					marks[j] = temp1;
					
//					It is for swap the rollNo
					temp2 = rollNo[i];
					rollNo[i]=rollNo[j];
					rollNo[j]=temp2;
				}
			}
		}
		
		//View the roll no on first line
		System.out.println("Descending of rollNo & Marks :");
		for(int i=0;i<rollNo.length;i++) {
			System.out.print(rollNo[i]+"   |  ");
		}
		

		System.out.println("\n-----------------------------------");
		//View the  marks in second line
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+"  |  ");
		}
	
		
	}
}
