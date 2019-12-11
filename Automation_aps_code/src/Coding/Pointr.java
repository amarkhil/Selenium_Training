package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pointr {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.navigate().to("https://www.walmart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[@class='g_a g_h'])[1]")).click();
		Actions hovr = new Actions(driver);
		
		WebElement sign = driver.findElement(By.xpath("(//*[@class='f_a n_a ab_c'])[6]"));
		hovr.moveToElement(sign).build().perform();
		Thread.sleep(5000);
		hovr.moveToElement(driver.findElement(By.linkText("Kitchen"))).click().build().perform();
		
		
		
	}

}
