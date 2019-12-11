package Junit_Frame;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class First_Junit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is before class method");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is after class method");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This is before method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is after method");
	}

	@Test
	public void test() {	
		System.out.println("this is test method");
	}

	@Test
	public void test2() {
		System.out.println("this is test2 method");
		
	}
}
