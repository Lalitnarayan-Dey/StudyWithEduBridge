package abstractionn.hw.question03;

public class Student02 extends Marks{
	public int subjectOneMark;
	public int subjectTwoMark;
	public int subjectThreeMark;
	public int subjectFourMark;
	
	public int securedMarks;
	//public final int TOTALMARK = 300;
	float percentage;

	Student02(int subjectOneMark, int subjectTwoMark, int subjectThreeMark,int subjectFourMark){
		this.subjectOneMark =subjectOneMark;
		this.subjectTwoMark = subjectTwoMark;
		this.subjectThreeMark = subjectThreeMark;
		this.subjectFourMark = subjectFourMark;
	}
	
//	@Override
//	public String toString() {
//		return "Cat [subjectOneMark=" + subjectOneMark + ", subjectTwoMark=" + subjectTwoMark
//				+ ", subjectThreeMark=" + subjectThreeMark + "]";
//	}
	
	@Override
	public float getPercentage() {
		securedMarks = subjectOneMark+subjectTwoMark+subjectThreeMark+subjectFourMark;
		System.out.println("2nd student secured marks  ("+securedMarks+") from 4 subject");
		percentage = securedMarks/4;
		return percentage;
		
	}

}
