import java.util.Scanner;
public class Program33 {

	

		public static void main(String[] args) {
			long hours;
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the minutes: ");
			hours = in.nextLong();
			long minutes = hours / 60;
			System.out.println(minutes +" hours");
			
}
}