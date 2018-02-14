package MouseActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoHomePage {
	
	@FindBy(css = "#menu-item-141 > a")
	private WebElement droppableLink;
	
	@FindBy(css = "#menu-item-151 > a")
	private WebElement sortableLink;
	
	@FindBy(css = "#menu-item-99")
	private WebElement tooltipLink;
	
	public void clickDroppable() {
		droppableLink.click();
	}
	
	public void clickSortable() {
		sortableLink.click();
	}
	
	public void clickTolltip() {
		tooltipLink.click();
	}

}
