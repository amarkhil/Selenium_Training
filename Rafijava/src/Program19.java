//print numbers between 1 to 100 which are dividible by 3, 5 & both.
public class Program19 {

	public static void main(String[] args) {
		
		System.out.println("\nDivided by 3: ");
		for(int i=1; i<100; i++) {
		if (i%3==0)
			System.out.print(i+",");
		
	}
	System.out.println("\n");
	System.out.println("\nDivided by 5: ");
	for(int i=1; i<100; i++)
	if(i%5==0)
		System.out.print(i+",");
	
	System.out.println("\n");
	System.out.println("\nDivided by 3 and 5: ");
	for(int i=1; i<100; i++) 
		if(i%3==0)
			if(i%5==0)
				//or if(i%5==0 && i%3==0)
			System.out.print(i+",");
			
	}
	
}

