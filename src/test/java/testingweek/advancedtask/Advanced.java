package testingweek.advancedtask;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testingweek.HomePage;
import testingweek.ScreenShot;

public class Advanced {
	
	 	private static ExtentReports report;
		private WebDriver webDriver;
		private static final String BASE_URL = "http://automationpractice.com/index.php";
		
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
		public void createAccountTest() throws InterruptedException {
			ExtentTest test = report.createTest("Create Account Test"); 
			test.log(Status.INFO, "Create Account Test is Starting ");
			
			TimeUnit.SECONDS.sleep(1);
			LandingPage homePage = PageFactory.initElements(webDriver, LandingPage.class);
			homePage.clickAddUser();
			test.log(Status.DEBUG, "The link to add a user was clicked");
			
			TimeUnit.SECONDS.sleep(2);
			CreateAccountPage createPage = PageFactory.initElements(webDriver, CreateAccountPage.class);
			createPage.enterEmail("iiiii@ccccc.com");
			test.log(Status.DEBUG, "An email was entered");
			createPage.create();
			test.log(Status.DEBUG, "Email accepted");
			
			TimeUnit.SECONDS.sleep(3);
			DetailsPage detailsPage = PageFactory.initElements(webDriver, DetailsPage.class);
			detailsPage.selectMaleTitle();
			test.log(Status.DEBUG, "Mr title selected");
			detailsPage.enterFirstName("John");
			test.log(Status.DEBUG, "First name entered");
			detailsPage.enterLastName("Doe");
			test.log(Status.DEBUG, "Second name entered");
			detailsPage.enterPassword("password");
			test.log(Status.DEBUG, "Password entered");

			detailsPage.enterDay("22");
			test.log(Status.DEBUG, "Day entered");
			detailsPage.enterMonth("1");
			test.log(Status.DEBUG, "Month entered");
			detailsPage.enterYear("1980");
			test.log(Status.DEBUG, "Year entered");
			detailsPage.enterFirstNameTwo("John");
			detailsPage.enterLastNameTwo("Doe");
			detailsPage.enterAddress("2 Main road");
			detailsPage.enterAddressTwo("Crumlin");
			detailsPage.enterCity("Arizona");
			detailsPage.enterState("Arizona");
			detailsPage.enterPostCode("12345");
			detailsPage.enterCountry("United States");
			detailsPage.enterMobile("0851234567");
			detailsPage.enterAddressAlias("2MainRd");
			detailsPage.register();
			
			TimeUnit.SECONDS.sleep(5);
			
			test.pass("Create Account Test Passed");
			
			try {
				 String imagePath = ScreenShot.take(webDriver, "CreateAccountSuccess");
				 test.addScreenCaptureFromPath(imagePath);
			 } catch (IOException e) {
				 e.printStackTrace();
			 }
		}
		
		@Test
		public void loginTest() throws InterruptedException {
			ExtentTest test = report.createTest("Login Test"); 
			test.log(Status.INFO, "Login Test is Starting ");
			
			TimeUnit.SECONDS.sleep(1);
			LandingPage homePage = PageFactory.initElements(webDriver, LandingPage.class);
			homePage.clickAddUser();
			test.log(Status.DEBUG, "The link to sign in was clicked");
			
			TimeUnit.SECONDS.sleep(2);
			CreateAccountPage createPage = PageFactory.initElements(webDriver, CreateAccountPage.class);
			createPage.enterEmail2("iiiii@ccccc.com");
			test.log(Status.DEBUG, "An email was entered");
			createPage.enterPassword("password");
			test.log(Status.DEBUG, "A password was entered");
			createPage.login();
			test.log(Status.DEBUG, "Login button clicked");
			
			TimeUnit.SECONDS.sleep(10);
			
			test.pass("Login Test Passed");
			
			try {
				 String imagePath = ScreenShot.take(webDriver, "CreateAccountSuccess");
				 test.addScreenCaptureFromPath(imagePath);
			 } catch (IOException e) {
				 e.printStackTrace();
			 }
			
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
