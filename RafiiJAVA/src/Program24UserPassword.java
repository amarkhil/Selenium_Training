import java.util.Scanner;
public class Program24UserPassword {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String user, pass;
		System.out.print("Enter Your User Name: ");
		user = in.next();
		System.out.print("Enter Your Password: ");
		pass = in.next();
		if(user.equals("Ahmad") && (pass.equals("Amarkhil"))){
			System.out.println("Welcome to Facebook");
		}else {
			System.out.println("Incorrect Login");
		}
		}
			
		
	}
	