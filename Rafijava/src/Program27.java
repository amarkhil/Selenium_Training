//how to convert from inches to meter

import java.util.Scanner;
public class Program27 {

	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.print("input a value for in: ");
		double inch = in.nextDouble();
		double meters = inch *0.0254;
		System.out.println(inch+ "inch is: "+meters+"meters");
		
	}
}

