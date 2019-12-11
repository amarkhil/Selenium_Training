package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.navigate().to("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame(driver.findElement(By.name("SingleFrame")));
		driver.findElement(By.xpath("//*[contains(@class,'col-xs-6 col-xs-offset-5')]/input")).sendKeys("piitttt");
	
	}

}
