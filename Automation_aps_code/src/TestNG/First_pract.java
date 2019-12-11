package TestNG;

import org.testng.annotations.Test;

//import Browser.openbrowser;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class First_pract {
	static WebDriver driver;
  @Test
  public void f() {
	  
  }
  @BeforeClass
  public void beforeClass() {
	//  openbrowser open = openbrowser(driver);
  }

  @AfterClass
  public void afterClass() {
  }

}

//Assignment:
//creat a testNG class and click on forgot link 