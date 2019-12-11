package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rough_practise {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Exercises\\Drive\\chromedriver.exe");
		
		driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.emirates.com");

	//	WebElement ahmad = driver.findElement(By.id("u_0_f"));
	//	ahmad.sendKeys("hi");
	/*	driver.manage().window().maximize();

		driver.findElement(By.name("Arrival Airport")).sendKeys("Dubai (DXB)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"js-label cta__text\"])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@for=\"search-flight-date-picker--depart\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"ek-datepicker__button ek-datepicker__button--next icon-arrow-right\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@data-date=\"7\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@data-date=\"7\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("toggle Passengers")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@aria-disabled=\"false\"])[62]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"js-increment-increase increment-field__button increment-field__increase\"])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Arrival Airport")).sendKeys("Washington, DC (DCA)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class=\"cta cta--large cta--primary js-widget-submit \"]")).click();
		
		
		Select hello = new Select(driver.findElement(By.id("abc")));
		hello.selectByValue("Jan");
		
		WebElement hi = driver.findElement(By.id("abc"));
		hi.click();
		
		//*[contains(@locator,'value of locator')]
		//*[starts-with(locator,'starting word or letter')]
		//*[@locator='value of locator']
		//*[text()='word']
		 * 
		 */
		driver.getCurrentUrl();
	    String hi = driver.getWindowHandle();
	    System.out.println(hi);
		
		
		
		
		
	//	Thread.sleep(5000);
		//driver.close();
		
		
		
	}

}
