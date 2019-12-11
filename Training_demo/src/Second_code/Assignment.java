package Second_code;
/*1.Declare tow number and Create the new method other than main method for each arithmetic operator; just to assume two numbers and do 
    following calculations:
	i.addition
	ii.subraction
	iii.multilplication
	iv.division
*/

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 25;
		int B = 10;
		int C = A+B;
		System.out.println("A plus B is Equal to: "+C);
subtraction();
multiplication();
division();

	}
	public static void subtraction() {
		
		int A = 25;
		int B = 10;
		int C = A-B;
		System.out.println("A minus B is Equal to: "+C);
		
	}
	public static void multiplication() {
		int A = 25;
		int B = 10;
		int C = A*B;
		System.out.println("A multiply by B is Equal to: "+C);
	}
	public static void division() {
		double A = 25;
		double B = 10;
		double C = A/B;
		System.out.println("A divid by B is Equal to: "+C);
	}
}
