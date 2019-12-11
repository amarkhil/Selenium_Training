package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Assign1 {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  Asign1 din = new Asign1(driver);
	  Thread.sleep(5000);
	  din.dinningTable();
	  din.search();
	  din.choose();
	  din.addca();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Exercises\\Drive\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.com");
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
