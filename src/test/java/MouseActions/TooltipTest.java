package MouseActions;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TooltipTest {
	
	private static ExtentReports report;
	private WebDriver webDriver;
	private static final String BASE_URL = "http://demoqa.com/";
	
	@BeforeClass 
	public static void init() { 
	         report = new ExtentReports(); 
	         String fileName = "TestReport" + ".html"; 
	         String filePath = System.getProperty("user.dir") 
	                 + File.separatorChar + fileName; 
	         report.attachReporter(new ExtentHtmlReporter(filePath)); 
	 } 
	
	@Before
	public void setUp() {
		webDriver = new ChromeDriver();
		webDriver.navigate().to(BASE_URL);
	}
	
	@Test
	
	
	@After
	public void tearDown() {
		webDriver.quit();
	}
	
	@AfterClass 
	public static void cleanUp() { 
		report.flush(); 
	} 

}
