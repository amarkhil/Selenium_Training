import java.util.Scanner;
public class Program12 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
				System.out.print("input your first number: ");
				
				int number1 = input.nextInt();
				
				System.out.print("input your second number: ");
				
				int number2 = input.nextInt();
				if(number1 == number2)
					System.out.printf("%d ==%d\n",number1,number2);
				if(number1 != number2)
					System.out.printf("%d != %d\n",number1,number2);
				if(number1 > number2)
					System.out.printf("%d > %d\n",number1,number2);
				if(number1 < number2)
					System.out.printf("%d < %d\n",number1,number2);
				if(number1 >= number2)
					System.out.printf("%d  >= %d\n",number1,number2);
				if(number1 <= number2)
					System.out.printf("%d <= %d\n",number1,number2);
				
				
				
		
	}
}
