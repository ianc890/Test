package testingweek.advancedtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DetailsPage {
	
	@FindBy(css = "#id_gender1")
	private WebElement maleField;
	
	@FindBy(css = "#id_gender2")
	private WebElement femaleField;
	
	@FindBy(css = "#customer_firstname")
	private WebElement firstName;
	
	@FindBy(css = "#customer_lastname")
	private WebElement lastName;
	
	@FindBy(css = "#email")
	private WebElement emailField;
	
	@FindBy(css = "#passwd")
	private WebElement passwordField;
	
	@FindBy(css = "#days")
	private WebElement daysField;
	
	@FindBy(css = "#months")
	private WebElement monthsField;
	
	@FindBy(css = "#years")
	private WebElement yearsField;
	
	@FindBy(css = "#firstname")
	private WebElement firstName2;
	
	@FindBy(css = "#lastname")
	private WebElement lastName2;
	
	@FindBy(css = "#address1")
	private WebElement address;
	
	@FindBy(css = "#address2")
	private WebElement address2;
	
	@FindBy(css = "#city")
	private WebElement cityField;
	
	@FindBy(css = "#id_state")
	private WebElement stateField;
	
	@FindBy(css = "#postcode")
	private WebElement postalCodeField;
	
	@FindBy(css = "#id_country")
	private WebElement countryField;
	
	@FindBy(css = "#phone_mobile")
	private WebElement mobilePhone;
	
	@FindBy(css = "#alias")
	private WebElement addressAlias;
	
	@FindBy(css = "#submitAccount > span")
	private WebElement registerBtn;
	
	public void selectMaleTitle() {
		maleField.click();
	}
	
	public void selectFemaleTitle() {
		femaleField.click();
	}
	
	public void enterFirstName(String first) {
		firstName.sendKeys(first);
	}
	
	public void enterLastName(String last) {
		lastName.sendKeys(last);
	}
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String pass) {
		passwordField.sendKeys(pass);
	}
	
	public void enterDay(String day) {
		Select dropdown = new Select(daysField);
		dropdown.selectByValue(day);
	}
	
	public void enterMonth(String month) {
		Select dropdown = new Select(monthsField);
		dropdown.selectByValue(month);
	}
	
	public void enterYear(String year) {
		Select dropdown = new Select(yearsField);
		dropdown.selectByValue(year);
	}
	
	public void enterFirstNameTwo(String first) {
		firstName2.sendKeys(first);
	}
	
	public void enterLastNameTwo(String last) {
		lastName2.sendKeys(last);
	}
	
	public void enterAddress(String adr) {
		address.sendKeys(adr);
	}
	
	public void enterCity(String city) {
		cityField.sendKeys(city);
	}
	
	public void enterState(String state) {
		Select dropdown = new Select(stateField);
		dropdown.selectByVisibleText(state);
	}
	
	public void enterPostCode(String postcode) {
		postalCodeField.sendKeys(postcode);
	}
	
	public void enterCountry(String country) {
		Select dropdown = new Select(countryField);
		dropdown.selectByVisibleText(country);
	}
	
	public void enterAddressTwo(String adr2) {
		address2.sendKeys(adr2);
	}
	
	public void enterMobile(String phone) {
		mobilePhone.sendKeys(phone);
	}
	
	public void enterAddressAlias(String alias) {
		addressAlias.sendKeys(alias);
	}
	
	public void register() {
		registerBtn.click();
	}

}
