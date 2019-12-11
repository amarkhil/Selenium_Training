package Exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Two {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Exercises\\Drive\\chromedriver.exe");
	driver = new ChromeDriver();
	
	//driver.get("https:www.google.com");
	driver.navigate().to("https:www.facebook.com");
	
	//this is getting the current URL.
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	//this is getting the current window session ID.
	String windows = driver.getWindowHandle();
	System.out.println(windows);
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
	//explicit wait
	WebDriverWait ui = new WebDriverWait(driver, 10);
	ui.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("packageDirectFlight-hp-package")));
	driver.findElement(By.id("packageDirectFlight-hp-package")).click();
	
	

	}

}
