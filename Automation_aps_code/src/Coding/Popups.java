package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		
		
		
		//below codes are dealing with different types of popups or alerts.
		
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	
		
	/*	driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	*/
		
	/*	driver.findElement(By.linkText("Alert with Textbox")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("ahmad");
		driver.switchTo().alert().accept();
	*/
		
		
		
	}

}
