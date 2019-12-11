package AmazonExecution;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import Amazon_class_Assignment.HomeA;
import Amazon_class_Assignment.Signup;
import Amazon_class_Assignment.try_prime;


import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AExecution {
	WebDriver driver;
  @Test
  public void f() {
	  
	  HomeA home = new HomeA(driver);//object of the class.
	  try_prime amaz = new try_prime(driver);
	  Signup signup = new Signup(driver);
	  
	  home.prime();
	  amaz.amazo();
	  signup.creatacc();
	  
	  
	  
	  
  }
  @BeforeClass
  //@Parameters("browser")
  public void beforeClass(String browsers) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://www.amazon.com");
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.close();
  }

}
