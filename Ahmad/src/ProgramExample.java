
public class ProgramExample {



	   int myVariable;
	   static int data = 30;
	   
	   public static void main(String args[]){
	      int a = 100;
	      ProgramExample obj = new ProgramExample();
	      
	      System.out.println("Value of instance variable myVariable: "+obj.myVariable);
	      System.out.println("Value of static variable data: "+ProgramExample.data);
	      System.out.println("Value of local variable a: "+a);
	   }
	}