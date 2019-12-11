package Executionforebay;

import org.testng.annotations.Test;



import Ebay.Home;
import Ebay.Signup;
import Ebay.signin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;


public class Ebi {
	public WebDriver driver;
	@Test
  public void f() {
	  Reporter.log("this is goood to");
	  
	  Home home = new Home(driver);
	  signin sign = new signin(driver);
	  Signup sup = new Signup(driver);
	  
	 
	  home.signinlinkclick();
	  sign.creataccount();
	  sup.Firstnameoption("Sbazzzzz");
	  sup.lastname("sleem");
	  sup.email("sleem.sbazzz@outlook.com");
	  sup.psswd("piiiiiit");
	  sup.signupbutton();
	    
	  
	  
  }
  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  
	 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
	WebDriver  driver = new ChromeDriver();
	  driver.navigate().to("https://www.ebay.com");
	  }
	  else if(browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\geckodriver.exe");
		  	WebDriver driver = new FirefoxDriver();
		  	driver.navigate().to("www.ebay.com");
		  	
	  }else {
		  System.out.println("Set up browser again");
	  }
  }
  

  @AfterClass
  public void afterClass() throws InterruptedException {
	  
	  Thread.sleep(6000);
	  driver.close();
  }

}
