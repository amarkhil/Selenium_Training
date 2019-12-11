package Coding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	WebDriverWait ui = new WebDriverWait(driver,10);
			
	
		driver.navigate().to("https://expedia.com");
		
		driver.findElement(By.id("package-departing-hp-package")).click();
		driver.findElement(By.xpath("(//*[@data-day='26'])[2]")).click();
	//	Thread.sleep(3000);
		driver.findElement(By.id("package-returning-hp-package")).click();
		driver.findElement(By.xpath("//*[@data-day='1']")).click();
		//explicit wait time
		ui.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("packageDirectFlight-hp-package")));
		
		driver.findElement(By.id("packageDirectFlight-hp-package")).click();
	}

}
