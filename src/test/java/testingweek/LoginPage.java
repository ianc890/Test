package testingweek;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input")
	private WebElement username;
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]")
	private WebElement password;
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]")
	private WebElement testLoginBtn;
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b")
	private WebElement statusMessage;
	
	public void enterUsername(String user) {
		username.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void login() {
		testLoginBtn.click();
	}
	
	public String getStatus() {
		String status = statusMessage.getText();
		
		// Assert.assertEquals("**Login Failed**", "**Successful Login**", status);
		
		return status;
	}

}
