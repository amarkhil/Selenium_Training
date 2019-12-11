package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rafi\\eclipse-workspace\\Automation_Exercise\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https//www.facebook.com");

	}

}
