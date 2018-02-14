package testingweek.advancedtask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement signInBtn;
	
	@FindBy(css = "#newsletter-input")
	private WebElement emailField;
	
	@FindBy(css = "#newsletter_block_left > div > form > div > button")
	private WebElement goBtn;
	
	public void clickAddUser() {
		signInBtn.click();
	}
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void subscribe() {
		goBtn.click();
	}
}
