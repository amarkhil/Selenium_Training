import java.util.Scanner;
public class Program3 {

public static void main(String[] agrs)
{
	Scanner input = new Scanner(System.in);
	System.out.print("Input your first number: ");
	int num1 = input.nextInt();
	System.out.print("Input your second number: ");
	int num2 = input.nextInt();
	int sum = num1+num2;
	System.out.println("Sum: "+sum);
}
}
