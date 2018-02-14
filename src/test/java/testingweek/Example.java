package testingweek;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	
	private WebDriver webDriver;
	private static final String BASE_URL = "https://www.qa.com";
	
	@Before
	public void setUp() {
		webDriver = new ChromeDriver();
		webDriver.navigate().to(BASE_URL);
	}
	
	@Test
	public void Internet() {
		
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement searchBar = webDriver.findElement(By.cssSelector("#select2-chosen-2"));
		searchBar.click();
		searchBar = webDriver.findElement(By.cssSelector("#s2id_autogen2_search"));
		searchBar.sendKeys("The Shafeeq");
	}
	
	@After
	public void cleanUp() {
		webDriver.quit();
	}

}
