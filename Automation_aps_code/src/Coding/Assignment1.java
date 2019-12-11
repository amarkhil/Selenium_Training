package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hotmail.com");
		
		driver.findElement(By.xpath("html/body/header/div/div/div/div/div/div/a/span")).click();
		driver.findElement(By.id("MemberName")).sendKeys("ahmad.rafi.amarkhil");
		Thread.sleep(3000);
		driver.findElement(By.id("iSignupAction")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("form-control")).sendKeys("ahmad1234");
		Thread.sleep(3000);
		driver.findElement(By.id("iSignupAction")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("FirstName")).sendKeys("ahmad");
		//driver.quit();
		//driver.close();
	}
	

}
