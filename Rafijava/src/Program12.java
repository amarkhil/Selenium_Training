import java.util.Scanner;
public class Program12 {

	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		int number1;
		int number2;
		
		System.out.print("input first number:");
		number1 = input.nextInt();
		
		System.out.print("input second number:");
		number2 = input.nextInt();
		
		if(number1 == number2);
		System.out.printf("%d ==%d\n", number1,number2);
		
		if(number1 != number2);
		System.out.printf("%d != %d\n",number1, number2);
		
		if(number1 < number2)
		System.out.printf("%d < %d\n",number1, number2);
		
		if(number1 > number2)
		System.out.printf("%d > %d\n", number1, number2);
		
		if(number1 <= number2)
		System.out.printf("%d <= %d\n", number1, number2);
		
		if(number1 >= number2)
		System.out.printf("%d => %d\n", number1,number2);
		
		
		
	}
}
