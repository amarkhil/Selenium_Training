/*data types in java
there are two types of data

1.Primitive data type
Char
boolean
byte
short
int 
float
long
double

2.non primitive data type

classes
interface
arrays*/
import java.util.Scanner;
public class Program29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input an intger between 000 to 1000: ");
		int num = input.nextInt();
		int firstDigit = num %10;
		int remainingNumber = num /10;
		int secondDigit = remainingNumber %10;
	    remainingNumber = remainingNumber /10;
		int thirdDigit = remainingNumber %10;
		remainingNumber = remainingNumber /10;
		int forthDigit = remainingNumber %10;
		
		int sum = thirdDigit + secondDigit + firstDigit + forthDigit;
		System.out.println("The sum of all digit in "+num+" is: "+sum);
		
		
	}
}
