package Second_code;

public class Arithmatic_operators {
int button = 60;
static int option = 6000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int firstNumber = 10;
			int secondNumber = 60;
			int thNumber = 15;
			int total = firstNumber+secondNumber+thNumber;
			
			float thirdNumber = 60.6f;
			float forthNumber = 666.6f;
			double totalNumber = thirdNumber + forthNumber;
			System.out.println(totalNumber);
			System.out.println("this is global static variable: "+option);
		System.out.println("Sum of First Number and Second Number is Equal to: "+total);
multiplication();	
division();
	}
	public static void multiplication() {
		int a = 60;
		int b = 80;
		int c = a*b;
		System.out.println(c);
		System.out.println("this is global for multiplication: "+option);
	}
	public static void division() {
		int a = 25;
		int b = 5;
		int c = a/b;
		System.out.println(c);
		System.out.println("this is global variable for division: "+option);
minus();		
	}
	public static void minus() {
		int a = 25;
		int b = 5;
		int c = a-b;
		System.out.println(c);
	}
}
