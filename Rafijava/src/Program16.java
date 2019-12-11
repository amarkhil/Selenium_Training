import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Program16 {

	
	public static void main(String args [])
	{
		
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("EST")));
		
		System.out.println("\nNow:" +cdt.format(System.currentTimeMillis()));
		
	}
}
