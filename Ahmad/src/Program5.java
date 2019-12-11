import java.util.Scanner;
public class Program5 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("input your first number: ");
	int a = input.nextInt();
	System.out.print("input your second number: ");
	int b = input.nextInt();
	int c = a/b;
	System.out.println();
	System.out.println("A divide by B is: "+c);
}
}
