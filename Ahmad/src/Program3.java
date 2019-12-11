import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input your first number: ");
		String fname = input.next();
		System.out.print("input your last name: ");
		String lname = input.next();
		System.out.println();
		System.out.println("Hello\n"+fname+" "+lname);
	}
}
