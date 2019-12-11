package Exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rafi\\eclipse-workspace\\Exercises\\Drive\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com");
	}

}
