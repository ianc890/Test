package testingweek;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitExample {
	
	@BeforeClass
	public static void init() {
		System.out.println("Before Class");
	}

	@Before
	public void setUp() {
		System.out.println("Before");
	}
	
	@Test
	public void printTest() {
		System.out.println("Test");
	}
	
	@After
	public void cleanUp() {
		System.out.println("After");
	}
	
	@AfterClass
	public static void tearDown() {
		System.out.println("After Class");
	}
}
