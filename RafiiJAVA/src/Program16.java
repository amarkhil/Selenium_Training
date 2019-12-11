import java.text.SimpleDateFormat;



public class Program16 {

	public static void main(String args []) 
	{
		
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.sss");
	 
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("EST")));
		
		System.out.println("\nNow:" +cdt.format(System.currentTimeMillis()));
		
	}
}
