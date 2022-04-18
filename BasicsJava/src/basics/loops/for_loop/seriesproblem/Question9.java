package basics.loops.for_loop.seriesproblem;

public class Question9 {
	public static void main(String[] args) {
		System.out.println("1*2 + 1*3 + 1*4 ... +n*n = ?");
		int range = 6 ;
		int sum =0;
		for(int i=1;i<=range;i++) {
			System.out.print(i +"*"+(i+1));
			
			sum+=(i*(i+1));
			
			
			if(i<range) {
				System.out.print(" + ");
				
			}
		}
		System.out.print(" = "+sum);
//		float sum=0;
//		int range = 5;
//		for(float i=1;i<=range;i++)
//		{
//			System.out.print(i + "*" +(i+1));
//			sum = sum+(i*(i+1));
//			if(i<range);
//			{
//				System.out.print(" + ");
//			}
//			
//		}
//		System.out.print(" = " +sum);
//			

		

	}
}
