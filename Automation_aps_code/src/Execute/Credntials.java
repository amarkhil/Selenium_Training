package Execute;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Home;

public class Credntials {
	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		Thread.sleep(5000);
		driver.close();
	}

	@Test
	public void test() {
		Home homepage = new Home(driver);
		
		homepage.enteremail("hello@gmail.com");
		homepage.enterpasswd("assdf");
		homepage.clicklonginbutton();
		
	}

}
