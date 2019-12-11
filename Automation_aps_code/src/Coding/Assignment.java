package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
	driver= new ChromeDriver();
	
	driver.get("https://www.amazon.com");
	Thread.sleep(300);

	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	Thread.sleep(300);
	driver.findElement(By.className("nav-input")).click();
	Thread.sleep(300);
	driver.findElement(By.id("pdagDesktopSparkleHeadline")).click();
	
	//AutoIt: will help you to upload photo.
/*local repository
central repository
remote repository
*/
	
//	SVN/GitHub is a central repository.
			

	}

}
