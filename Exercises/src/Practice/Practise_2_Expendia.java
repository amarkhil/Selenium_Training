package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise_2_Expendia {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Exercises\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.expedia.com");
	/*	driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com");
		driver.close();
		driver.quit();
	*/
		
		driver.findElement(By.id("package-origin-hp-package")).sendKeys("Washington, DC (IAD-Washington Dulles Intl.)");
		driver.findElement(By.id("package-destination-hp-package")).sendKeys("Dubai, United Arab Emirates (DXB-Dubai Intl.)");
		driver.findElement(By.id("package-departing-hp-package")).click();
		driver.findElement(By.xpath("//*[@data-day='20']")).click();
		driver.findElement(By.id("package-returning-hp-package")).click();
		driver.findElement(By.xpath("//*[@data-day='20']")).click();
		driver.findElement(By.xpath("//*[@data-control=\"menu\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"uitk-icon-svg uitk-step-input-icon\"]")).click();

	}

}
