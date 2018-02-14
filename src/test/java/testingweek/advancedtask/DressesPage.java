package testingweek.advancedtask;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesPage {
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
	private WebElement dressesBtn;
	
	@FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
	private WebElement addToCartBtn;
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
	private WebElement continueBtn;
	
	@FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.quick-view > span")
	private WebElement quickViewBtn;
	
	public void clickDresses() {
		dressesBtn.click();
	}
	
	public void clickAddToCart() {
		addToCartBtn.click();
	}
	
	public void clickContinue() {
		continueBtn.click();
	}
	
	public void clickQuickView() {
		quickViewBtn.click();
	}

}
