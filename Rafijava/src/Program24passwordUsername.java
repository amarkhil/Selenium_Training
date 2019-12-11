
import java.util.Scanner;

public class Program24passwordUsername {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String user, pass;
		System.out.print("input your username: ");
		user = input.next();
		System.out.print("enter your password: ");
		pass = input.next();
		if (user.equals("Ahmad") &&(pass.equals("Amarkhil"))) {
			
			System.out.println("Welcome to facebook");
		}else {
				System.out.println("Incorrect Login");
				
				
			}
		}
	}


