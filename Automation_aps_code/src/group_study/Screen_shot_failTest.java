package group_study;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Screen_shot_failTest {
	
	
	@BeforeMethod
	
	public void setUp() {
		
		
	}
	
	@AfterMethod
	
	public void tearDown() {
		
		
	}
	@Test
	public void TakeScreen() {
		
		Assert.assertEquals(false, true);
	}

}
