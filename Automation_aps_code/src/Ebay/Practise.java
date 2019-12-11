package Ebay;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Practise {
	
  @Test(priority = 1)
  public void f() {
	  
	  int A = 10;
	  int B = 20;
	  int C = A+B;
	  
	// Assert.assertEquals(C, 300);
	  SoftAssert water = new SoftAssert();
	  water.assertEquals(C, 300);
	  System.out.println(C);
	 
	 water.assertAll();
	  
	
  }
  @Test(priority = 0, dependsOnMethods = "f")
  public void hello() {
	  System.out.println("this is hello method");
  }
  @Test(priority = 2)
  public void ali() {
	  System.out.println("this ali method");
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
