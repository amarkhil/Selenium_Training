package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Code {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
	driver =new ChromeDriver();
	
	//two ways to open the site in the browser
	driver.get("https://www.facebook.com");
	/*
	//or we can use:
	driver.navigate().to("https://dhl.com");
	// to refresh the browser
	driver.navigate().refresh();
	
	//wait in java
	Thread.sleep(6000);
	
	driver.navigate().back();
	Thread.sleep(6000);
	driver.navigate().forward();
	Thread.sleep(6000);
	driver.manage().window().maximize();
	
	//Thread.sleep(6000);
	 */
	//driver.close();		//assignment: different between close and quit.
	//driver.quit();
	
	//driver.findElement(By.id("email")).sendKeys("ahmad");
	//driver.findElement(By.id("pass")).sendKeys("Ahmad");
	//driver.findElement(By.id("loginbutton")).click();
	//driver.findElement(By.linkText("Data Policy")).click();
	//driver.findElement(By.linkText("Cookies Policy")).click();
	//driver.findElement(By.linkText("Shop the Halloween Store")).click();
	//driver.findElement(By.partialLinkText("Data")).click();
	//driver.findElement(By.partialLinkText("Save on Mountain House Breakfast")).click();
/*	 driver.findElement(By.linkText("Start here.")).click();
	driver.findElement(By.name("customerName")).sendKeys("ahmad");
	driver.findElement(By.name("email")).sendKeys("ahamd@gmail.com");
	driver.findElement(By.name("password")).sendKeys("sdfsdf");
	driver.findElement(By.className("")).sendKeys("sdfs");
*/	
//	write script which enters value for id and password fields and click login button for facebook.page
	//use so xpath locator to locate each element
	
	//driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input")).sendKeys("abc");
	//driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input")).sendKeys("ahmad");
	//driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/label/input")).click();
	
	/*driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ahmad");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@value='1']")).click();
	
	/*		//*[contains(@typr,'sub')]
	    	(//*[contains(@typr,'sub')])[1] if we have more than one
	    	*/
	
	/*driver.findElement(By.xpath("//input[contains(@aria-label,'number')]")).sendKeys("23432525");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//select[contains(@name,'birthday_month')]")).sendKeys("2");
	driver.findElement(By.xpath("(//*[starts-with(@aria-label,'N')])[2]")).sendKeys("223423");
	*/
	//driver.findElement(By.xpath("//*[text()='Sign In']")).click();

	/*Select month = new Select(driver.findElement(By.id("month")));
	month.selectByVisibleText("Jan");
	
	Select day = new Select(driver.findElement(By.id("day")));
	day.selectByValue("2");
	
	Select year = new Select(driver.findElement(By.id("year")));
	year.selectByValue("1995");
	 */
	
	// list <WebElements> links = driver.findElement(By.tagName("a"))
	
	driver.findElement(By.xpath("//a[@role='button']")).click();
	driver.findElement(By.xpath("//*[contains(@name,'firstname')]")).sendKeys("Ahmad");
	driver.findElement(By.xpath("//*[starts-with(@name,'last')]")).sendKeys("Rafi");
	driver.findElement(By.xpath("//*[starts-with(@name,'reg_')]")).sendKeys("7039892451");
	driver.findElement(By.xpath("(//*[starts-with(@type,'password')])[2]")).sendKeys("Ahmad12345");
	
	Select month = new Select(driver.findElement(By.id("month")));
	month.selectByVisibleText("Jan");
	
	Select day = new Select(driver.findElement(By.id("day")));
	day.selectByValue("25");
	Thread.sleep(3000);
	Select year = new Select(driver.findElement(By.id("year")));
	year.selectByValue("1990");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[contains(@role,'button')])[6]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='Male']")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("u_0_y")).click();
	
	
	
	}

}
