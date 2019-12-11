import java.util.Scanner;

public class Program34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float timeSeconds;
		float mps, kph, mph;
		System.out.print("Enter Distance in Meter: ");
		float distance = scanner.nextFloat();
		System.out.print("Enter hour: ");
		float hr = scanner.nextFloat();
		System.out.print("Enter Minutes: ");
		float min = scanner.nextFloat();
		System.out.print("Enter Second: ");
		float sec = scanner.nextFloat();
		
		timeSeconds = (hr*3600) + (min*60) +sec;
		
		mps = distance/timeSeconds;
		kph = (distance/1000.0f) / (timeSeconds/3600.0f);
		mph = kph/1.609f;
		
		System.out.println("Your Speed in meter/second is " +mps);
		System.out.println("Your speed in km/h is "+kph);
		System.out.println("your speed in mile/h is " +mph);
		scanner.close();
	}
}
