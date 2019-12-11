package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Assign2 {
	
	public WebDriver driver;
	

@Test
  public void f() {
	  
	  Asign2 hello = new Asign2(driver);
	  hello.ball();
	  hello.search();
	  hello.elect();
	  hello.addc();
	  
	
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
	  driver.close();
	  
  }

}
