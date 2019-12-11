package Coding;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		
		//driver.navigate().to("https://jqueryui.com/droppable/");
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(5000);
		
		String currentwindow = driver.getWindowHandle();
		System.out.println(currentwindow);
		
		// we use actions to take control of keyboard and mouse.
		Actions point = new Actions(driver);
		
		//WebElement Variable use..storing you webelement into a variable
	WebElement forgot = driver.findElement(By.linkText("Forgot account?"));
		
		//forgot.click();
		
		point.keyDown(Keys.SHIFT).click(forgot).build().perform();
		
		Set <String> ids = driver.getWindowHandles();
		System.out.println(ids);
		System.out.println(ids.size());
		
		
		for(String windowbrowser:ids) {
			if(windowbrowser != currentwindow) {
				
			
			driver.switchTo().window(windowbrowser);
			}
		}
		
			//driver.findElement(By.name("did_submit")).click();
			
		
		
	/*	driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
		point.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
		
		*/
		
			
			
}
}