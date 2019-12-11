//fahrenheit to celsius degree

import java.util.Scanner;

public class Program28 {

	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	System.out.print("input a Degree in fahrenhiet: ");
	double fahrenheit = input.nextDouble();
	double celsius =((5* (fahrenheit -32))/9.0);
	System.out.println(fahrenheit + "Degree Fahrenhiet is equal to "+celsius+"in Celsius");
}
}
