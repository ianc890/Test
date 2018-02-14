package testingweek.advancedtask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {
	
	@FindBy(css = "#email_create")
	private WebElement emailField;
	
	@FindBy(css = "#SubmitCreate > span")
	private WebElement createBtn;
	
	@FindBy(css = "#email")
	private WebElement emailField2;
	
	@FindBy(css = "#passwd")
	private WebElement passwordField;
	
	@FindBy(css = "#SubmitLogin > span")
	private WebElement signInBtn;
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void create() {
		createBtn.click();
	}
	
	public void enterEmail2(String email) {
		emailField2.sendKeys(email);
	}
	
	public void enterPassword(String pass) {
		passwordField.sendKeys(pass);
	}
	
	public void login() {
		signInBtn.click();
	}
}
