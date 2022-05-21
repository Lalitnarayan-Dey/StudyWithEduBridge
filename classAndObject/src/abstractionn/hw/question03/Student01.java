package abstractionn.hw.question03;

class Student01 extends Marks{
	public int subjectOneMark;
	public int subjectTwoMark;
	public int subjectThreeMark;
	
	public int securedMarks;
	//public final int TOTALMARK = 300;
	float percentage;

	Student01(int subjectOneMark, int subjectTwoMark, int subjectThreeMark){
		this.subjectOneMark =subjectOneMark;
		this.subjectTwoMark = subjectTwoMark;
		this.subjectThreeMark = subjectThreeMark;
	}
	
//	@Override
//	public String toString() {
//		return "Cat [subjectOneMark=" + subjectOneMark + ", subjectTwoMark=" + subjectTwoMark
//				+ ", subjectThreeMark=" + subjectThreeMark + "]";
//	}
	
	@Override
	public float getPercentage() {
		securedMarks = subjectOneMark+subjectTwoMark+subjectThreeMark;
		System.out.println("1st student secured marks  ("+securedMarks+") from 3 subject");
		percentage = securedMarks/3;
		return percentage;
		
	}
 }
