package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Three_Iframes {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Exercises\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https:www.google.com");
		driver.navigate().to("https:www.amazon.com");
			
		driver.switchTo().frame(driver.findElement(By.id("abc")));
		driver.switchTo().frame(0);//we can use the index value of the frame which is starting from 0.
	}

}
