import java.io.console;
public class Program15Password {

	public static void main(String[] args)
	{
		
		
		Console cons;
		
		if ((cons = System.console()) !=null)
		{
			
		char[] pass_ward = null;
		try
		{
			pass_ward = cons.readPassword("input your password:");
			System.out.println("Your Password was:" +new String(pass_ward));
			
			finally 
			{
				if (pass_ward !=null)
				{
					java.util.Arrays.fill(pass_ward, '');
				}
			}
		}
		else
		{
throw new RuntimeException("Cant get password...no Console")
		}
	}
	}

