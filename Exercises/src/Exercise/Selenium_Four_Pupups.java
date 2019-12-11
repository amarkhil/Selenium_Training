package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Four_Pupups {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Exercises\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:www.google.com");
		
		//below codes are dealing with different types of alert and popups.
		
		driver.findElement(By.id("abc")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("abc")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("abc")).click();
		driver.switchTo().alert().sendKeys("bca");
		driver.switchTo().alert().accept();
		
		//unit testing done by developer before the submit it to QA test.
		//tester test as real time  user.
	}

}
