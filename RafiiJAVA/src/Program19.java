
public class Program19 {

	public static void main(String[] args) {
		System.out.println("Dividable Numbers by 3: ");
		for(int i=1; i<100; i++) 
			if(i%3==0)
				System.out.println(i+",");
			


System.out.println("\nDividable Numbers by 5: ");
for(int i=1; i<100; i++)
	if(i%5==0)
		System.out.println(i+",");

System.out.println("\n");
System.out.println("Dividable Numbers by 3 & 5:");
for(int i=1; i<100; i++)
	if(i%3==0 && i%5==0)
		System.out.println(i+",");

System.out.println("\nDividable Numbers by 3 5 & 7:");
for(int i=1; i<1000; i++)
	if(i%3==0 && i%5==0 && i%7==0)
		System.out.println(i+",");

}
}