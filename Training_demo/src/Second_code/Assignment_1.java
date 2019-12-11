package Second_code;
/*1.Declare tow global variable and Create the new method other than main method for each arithmetic operator; just to assume two numbers and do 
    following calculations:
	i.addition
	ii.subtraction
	iii.multilplication
	iv.division
	*/
public class Assignment_1 {
	static int global = 100;
	static int local = 50;
	int nonStatic = 10;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A = global+local;
		System.out.println("global plus local is Equal to: "+A);
subtraction();
multiplication();
division();
	}
public static void subtraction() {
		
		int A = global-local;
		System.out.println("global minus local is Equal to: "+A);
}
public static void multiplication() {
		
		int A = global*local;
		System.out.println("global multiply by local is equal to: "+A);
}
public static void division() {
		
		int A = global/local;
		System.out.println("global divid by local is Equal to: "+A);
}
}
