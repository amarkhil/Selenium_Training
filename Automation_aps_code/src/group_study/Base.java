package group_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	static WebDriver driver;
	
	public static void intialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
	
	}
}
