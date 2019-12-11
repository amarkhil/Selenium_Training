package Coding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ui {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		//this is getting current url.
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//this is getting current session id.
		String windows = driver.getWindowHandle();
		System.out.println(windows);
		
	}

}
