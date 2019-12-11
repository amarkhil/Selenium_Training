package TestNG;

import org.testng.annotations.Test;

import Coding.Assignment;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class Asssignment {
	static WebDriver driver;
  @Test
  public void f() {
	  
	  Assignement assign = new Assignement(driver);
	  
	  assign.charger();
	  assign.search();
	  assign.select();
	  assign.addcart();
	  ;
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
