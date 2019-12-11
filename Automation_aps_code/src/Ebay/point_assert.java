package Ebay;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class point_assert {
	
	public WebDriver driver;
	
  @Test(priority = 2)
  public void f() {
	  
	  int a =10;
	  int b =80;
	  int c = a+b;
	  System.out.println(c);
	  
	  SoftAssert ui = new SoftAssert();
	  ui.assertEquals(c, 900);
	//  Assert.assertEquals(c, 900);
	  System.out.println("This is after assertion");
	  ui.assertAll();
  }  
  @Test(priority = 1)
  public void ui() {
	  System.out.println("this is second method");
	  
  }
	  
  @Test(priority = 0)
  public void update() {
	  System.out.println("this is third method");
	  
  }

}
