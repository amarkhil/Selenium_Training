package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_1_bestbuy {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Exercises\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.navigate().to("https:www.bestbuy.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"close\"]")).click();
		//driver.findElement(By.xpath("(//*[@aria-hidden='true'])[29]")).click();
		
	/*	driver.findElement(By.id("emailId")).sendKeys("rafi.amarkhil@gmail.com");
		driver.findElement(By.xpath("(//*[@type='submit'])[3]")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("gh-search-input")).sendKeys("TV");
		driver.findElement(By.xpath("//*[@class='header-search-icon']/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='flex-link'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@style='padding:0 8px'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"names-short\"])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"v-fw-regular\"])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class=\"cart-nav-text\"]")).click();
		driver.findElement(By.xpath("(//*[@class=\"btn btn-lg btn-block btn-primary\"])[1]")).click();
		*/
	}

}
