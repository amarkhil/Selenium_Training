package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selenium_One {
		
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rafi\\eclipse-workspace\\Exercises\\Drive\\chromedriver.exe");
		driver= new ChromeDriver();
		
		//driver.get("https://www.amazon.com");
		driver.navigate().to("www.facebook.com");
		
		
		
		Thread.sleep(6000);//add wait time.
		driver.navigate().refresh();//refresh the page.
		driver.navigate().forward();
		driver.navigate().back();
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		
		driver.findElement(By.name("abc")).click();
		driver.findElement(By.className("abc")).sendKeys("cba");
		driver.findElement(By.id("abc")).click();
		driver.findElement(By.linkText("abc")).click();
		driver.findElement(By.partialLinkText("abc")).sendKeys("cba");
		
		//Absulate xpath
		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input")).click();
		
		//Relative xpath
		//syntaxes for relative xpath
		driver.findElement(By.xpath("//Tag[@locator='value of locator'"));
		driver.findElement(By.xpath("//*[contains(@locator,' a part of locator value')]"));
		driver.findElement(By.xpath("//*starts-with(@locator,'first word or letter of locator value')"));
		driver.findElement(By.xpath("//*[@locator = 'value of locator']"));
		driver.findElement(By.xpath("//*[text()='word']"));
		/*
		 when we have many selection for a relative xpath then we use the grouping concept which is as following:
		 we can use the grouping concept for all above syntaxes.
		 (//*[locator = 'value of locator'])[number of your location]
		 
		 */
		
		//we use the following code for drop down and date selection.
		
		Select month = new Select(driver.findElement(By.id("abc")));
		month.selectByValue("10");
		
		Select day = new Select(driver.findElement(By.xpath("abc")));
		day.selectByVisibleText("09");
		
		Select year = new Select(driver.findElement(By.className("abc")));
		year.selectByIndex(1990);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
