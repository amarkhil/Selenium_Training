package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Five_windows_Actions {
	

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Exercises\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:www.hotmail.com");

		driver.manage().window().maximize();
		Actions shift = new Actions(driver);
		WebElement account = driver.findElement(By.xpath("(//*[text()='Create free account'])[1]"));
		
		shift.keyDown(Keys.SHIFT).click(account).build().perform();
		
		Thread.sleep(5000);
		driver.quit();
		
		
		//Selenium: collection of API which interact with the browser.
		
		
		
	}

}
