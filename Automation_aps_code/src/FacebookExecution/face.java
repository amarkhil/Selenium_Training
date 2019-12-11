package FacebookExecution;

import org.testng.annotations.Test;

import Facebook.com.Forgotf;
import Facebook.com.Homef;
import Facebook.com.Signupf;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

	
public class face {
	static WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	 Homef home = new Homef(driver);
	 Signupf signup = new Signupf(driver);
	 Forgotf forgot = new Forgotf(driver);
	 
	 Reporter.log("this is a double browser test");
	 
	 home.inputemail("ahmad.ahmad@gmail.com");
	 home.inputpass("12345");
	 home.clicklogin();
	 Thread.sleep(6000);
	 driver.navigate().back();
	 Thread.sleep(3000);
	 signup.entername("ahmad");
	 signup.enterlname("Ahmadi");
	 signup.enteremail("ahmad.ahmadi@gmail.com");
	 signup.enter2email("ahmad.ahmadi@gmail.com");
	
	 signup.enterpass("12345asdf");
	 Thread.sleep(3000);
	 forgot.forgot();
	 
	 
	 
  }
  @Parameters("browser")
  @BeforeClass
  public void beforeClass(String browsers) {
	  if(browsers.equalsIgnoreCase("firefox")) {
		  
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	//  driver.manage().window().maximize();
	  driver.navigate().to("https://www.facebook.com");

	  }else if(browsers.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
	//	  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com");
	  }else {
		  System.out.println("Setup your browsers");
	  }
	  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(6000);
	 driver.close();
  }

}
