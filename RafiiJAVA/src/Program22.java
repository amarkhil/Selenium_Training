import java.util.*;
public class Program22 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter a word: ");
		
		String word = in.nextLine();
		word=word.trim();
		String result = "";
		char[] ch=word.toCharArray();
		for(int i = ch.length - 1; i>=0; i--) {
			
			
			
			result += ch[i];
		}
		System.out.println("Reverse Word: " +result.trim());
		
	}
}
