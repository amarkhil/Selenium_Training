package Third_code;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int student = 46;
		if(student >= 90 && student <=100) {
			System.out.println("The student grade is A");
		}else if(student>=80 && student<90) {
			System.out.println("The student grade is B");
		}else if(student>=70 && student<80) {
			System.out.println("The student grade is C");
		}else if(student>=60 && student<70) {
			System.out.println("The student grade is D");
		}else if(student>=50 && student<60) {
			System.out.println("The student grade is E");
		}else {
			System.out.println("Coding is done");
		}
	}

}
