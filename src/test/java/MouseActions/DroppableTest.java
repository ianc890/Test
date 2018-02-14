package MouseActions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testingweek.advancedtask.LandingPage;

public class DroppableTest {
	
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
	public void droppableTestOne() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		DemoHomePage homePage = PageFactory.initElements(webDriver, DemoHomePage.class);
		homePage.clickDroppable();
		
		DroppablePage dropPage = PageFactory.initElements(webDriver, DroppablePage.class);
		dropPage.linkOne(webDriver);
		TimeUnit.SECONDS.sleep(5);
	}
	
	@Test
	public void droppableTestTwo() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		DemoHomePage homePage = PageFactory.initElements(webDriver, DemoHomePage.class);
		homePage.clickDroppable();
		
		DroppablePage dropPage = PageFactory.initElements(webDriver, DroppablePage.class);
		dropPage.linkTwo(webDriver);
		TimeUnit.SECONDS.sleep(5);
	}
	
	@Test
	public void droppableTestThree() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		DemoHomePage homePage = PageFactory.initElements(webDriver, DemoHomePage.class);
		homePage.clickDroppable();
		
		DroppablePage dropPage = PageFactory.initElements(webDriver, DroppablePage.class);
		dropPage.linkThree(webDriver);
		TimeUnit.SECONDS.sleep(5);
	}
	
	@Test
	public void droppableTestFour() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		DemoHomePage homePage = PageFactory.initElements(webDriver, DemoHomePage.class);
		homePage.clickDroppable();
		
		DroppablePage dropPage = PageFactory.initElements(webDriver, DroppablePage.class);
		dropPage.linkFour(webDriver);
		TimeUnit.SECONDS.sleep(5);
	}
	
	@Test
	public void droppableTestFive() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		DemoHomePage homePage = PageFactory.initElements(webDriver, DemoHomePage.class);
		homePage.clickDroppable();
		
		DroppablePage dropPage = PageFactory.initElements(webDriver, DroppablePage.class);
		dropPage.linkFive(webDriver);
		TimeUnit.SECONDS.sleep(5);
	}
	
	
	@After
	public void tearDown() {
		webDriver.quit();
	}
	
	@AfterClass 
	public static void cleanUp() { 
		report.flush(); 
	} 

}
