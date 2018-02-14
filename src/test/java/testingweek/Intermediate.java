package testingweek;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class Intermediate {
	
    private static ExtentReports report;
	private WebDriver webDriver;
	private static final String BASE_URL = "http://thedemosite.co.uk ";
	
	
	@BeforeClass 
	public static void init() { 
	         report = new ExtentReports(); 
	         String fileName = "MyReport" + ".html"; 
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
	public void loginTest() {
		
		SpreadSheetReader sheetReader = new SpreadSheetReader(System.getProperty("user.dir") + "/src/main/resources/Example_Spreadsheet.xlsx"); 
		List<String> row = sheetReader.readRow(1, "Input Data"); 
		List<String> expRow = sheetReader.readRow(1, "Expected Results"); 
		
		ExtentTest test = report.createTest("MyFirstTest"); 
		test.log(Status.INFO, "My First Test is Starting ");

		HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
		homePage.clickAddUser();
		test.log(Status.DEBUG, "The link to add a user was clicked");  
		
		AddUserPage addUserPage = PageFactory.initElements(webDriver, AddUserPage.class);
		addUserPage.enterUsername(row.get(2));
		test.log(Status.DEBUG, "A username was entered");  

		addUserPage.enterPassword(row.get(3));
		test.log(Status.DEBUG, "A password was entered");  

		addUserPage.clickSave();
		test.log(Status.DEBUG, "The save button was clicked which creates the user account");  

		addUserPage.clickLogin();
		test.log(Status.DEBUG, "The login link was clicked which redirects the user to the login page");  
		
		LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
		loginPage.enterUsername(row.get(4));
		test.log(Status.DEBUG, "A username was entered");  

		loginPage.enterPassword(row.get(5));
		test.log(Status.DEBUG, "A password was entered");  

		loginPage.login();
		test.log(Status.DEBUG, "The login button was clicked by the user");  

		String success = loginPage.getStatus();
		
		test.pass(success);
		
		 try {
			 String imagePath = ScreenShot.take(webDriver, "SuccessImage");
			 test.addScreenCaptureFromPath(imagePath);
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}
	
	@Test
	public void loginTestFail() throws IOException {
		
		SpreadSheetReader sheetReader = new SpreadSheetReader(System.getProperty("user.dir") + "/src/main/resources/Example_Spreadsheet.xlsx"); 
		List<String> row = sheetReader.readRow(2, "Input Data");
		List<String> expRow = sheetReader.readRow(2, "Expected Results"); 
		
		ExtentTest test = report.createTest("MySecondTest"); 
        test.log(Status.WARNING,"Used to report an issue that may cause problems within a system");
        test.log(Status.FATAL,"Used to report an issue that will fail/break the system"); 

		HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
		homePage.clickAddUser();
		
		AddUserPage addUserPage = PageFactory.initElements(webDriver, AddUserPage.class);
		addUserPage.enterUsername(row.get(2));
		addUserPage.enterPassword(row.get(3));
		addUserPage.clickSave();
		addUserPage.clickLogin();
		
		LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
		loginPage.enterUsername(row.get(4));
		loginPage.enterPassword(row.get(5));
		loginPage.login();
        test.log(Status.ERROR,"Username does not exist"); 
		String success = loginPage.getStatus();
		
		try{
			String imagePath = ScreenShot.take(webDriver, "FailureImage");
			test.addScreenCaptureFromPath(imagePath);
			Assert.assertTrue("Unsuccessful Test", success.equals(expRow.get(1))); 
			test.pass("Passed"); 
		} catch (AssertionError e) { 
			test.fail(success); 
			throw e;
		} 
	}
	
	/*@Test
	public void loginTestFail() {
		WebElement addUserBtn = webDriver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)"));
		addUserBtn.click();
		
		WebElement username = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input"));
		username.sendKeys("ianc");
		
		WebElement password = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]"));
		password.sendKeys("password");
		
		WebElement saveBtn = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]\r\n" + ""));
		saveBtn.click();	
		
		WebElement loginBtn = webDriver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)"));
		loginBtn.click();
		
		WebElement username2 = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input"));
		username2.sendKeys("ianc3");
		
		WebElement password2 = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]"));
		password2.sendKeys("password");
		
		WebElement testLoginBtn = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]"));
		testLoginBtn.click();
		
		WebElement statusMessage = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b"));
		String status = statusMessage.getText();
		
		Assert.assertEquals("**Login Failed**", "**Successful Login**", status);
	}*/

	
	@After
	public void tearDown() {
		webDriver.quit();
	}
	
	@AfterClass 
	public static void cleanUp() { 
		report.flush(); 
	} 

}
