package testingweek;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomExample {

	private WebDriver webDriver;
	
	@Before
	public void setUp() {
		webDriver = new ChromeDriver();
		webDriver.navigate().to("");
	}
	
	@Test
	public void pomEx() {
		
	}
	
	@After
	public void cleanUp() {
		webDriver.quit();
	}
}
