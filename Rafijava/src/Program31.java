import java.util.Scanner;

public class Program31 {

	public static void main(String[] Strings) {
		double minuteInYear = 60 * 24 *365;
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of Minutes: ");
		double min = input.nextDouble();
		long years = (long)(min/minuteInYear);
		int days = (int)(min/60/24) %365;
		
		System.out.println((int)min+  " minutes is approximately " + years+ " Years and " + days +" days ");
		
	}
}
