package Providers;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Ops {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String first, String second) throws InterruptedException {
	  
	  Thread.sleep(5000);
	  driver.findElement(By.id("email")).sendKeys(first);
	  driver.findElement(By.id("pass")).sendKeys(second);
	  driver.findElement(By.xpath("//*[@aria-label='Log In']")).click();
	  Thread.sleep(3000);
	  driver.navigate().back();
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("pass")).clear();
	  Thread.sleep(3000);
  
  } 
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "sabzzz@gmail.com", 	"a" },
      new Object[] { "ahmad@hotmail.com", 	"b" },
      new Object[] { "omid@outlook.com", 	"c" },
      new Object[] { "18042545345", 		"d" },
      
    };
  }
  @BeforeClass
  public void beforeClass() {
	  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\geckodriver.exe");
	//  driver = new FirefoxDriver();
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

}
