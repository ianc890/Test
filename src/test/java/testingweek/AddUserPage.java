package testingweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage {
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input")
	private WebElement username;
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]")
	private WebElement password;
	
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]\r\n" + "")
	private WebElement saveBtn;
	
	@FindBy(css = "body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)")
	private WebElement loginBtn;
	
	public void enterUsername(String user) {
		username.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickSave() {
		saveBtn.click();
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
}
