package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DroppablePage {
	
	Actions builder2;
			
	@FindBy(css = "#ui-id-1")
	private WebElement link1;
	
	@FindBy(css = "#ui-id-2")
	private WebElement link2;
	
	@FindBy(css = "#ui-id-3")
	private WebElement link3;
	
	@FindBy(css = "#ui-id-4")
	private WebElement link4;
	
	@FindBy(css = "#ui-id-5")
	private WebElement link5;
	
	
	// first link
	@FindBy(css = "#draggableview > p")
	private WebElement dragBox;
	
	@FindBy(css = "#droppableview")
	private WebElement dropBox;
	
	
	// second link
	@FindBy(css = "#draggable-nonvalid > p")
	private WebElement dragNotDropBox;
	
	@FindBy(css = "#draggableaccept > p")
	private WebElement dragBox2;
	
	@FindBy(css = "#droppableaccept > p")
	private WebElement dropBox2;
	
	// third link	
	@FindBy(css = "#draggableprop > p")
	private WebElement dragBox3;
	
	@FindBy(css = "#droppable-inner > p")
	private WebElement innerDrop;
	
	@FindBy(css = "#droppableprop2 > p")
	private WebElement outerDrop;
	
	// fourth link
	@FindBy(css = "#draggablerevert > p")
	private WebElement revertOnDrop;
	
	@FindBy(css = "#draggablerevert2 > p")
	private WebElement revertOnDragNotDrop;
	
	@FindBy(css = "#droppablerevert")
	private WebElement dropBox4;
	
	// fifth link
	@FindBy(css = "#ui-id-6 > a")
	private WebElement tShirt;
	
	@FindBy(css = "#ui-id-8")
	private WebElement bags;
	
	@FindBy(css = "#ui-id-10 > a")
	private WebElement gadgets;
	
	@FindBy(css = "#ui-id-7 > ul > li:nth-child(1)")
	private WebElement tShirtChoice;
	
	@FindBy(css = "#ui-id-9 > ul > li:nth-child(2)")
	private WebElement bagsChoice;
	
	@FindBy(css = "#ui-id-11 > ul > li:nth-child(3)")
	private WebElement gadgetsChoice;
	
	@FindBy(css = "#cart > div > ol")
	private WebElement shoppingCart;
	
	public void linkOne(WebDriver driver) {
		link1.click();
		Actions builder = new Actions(driver);
		builder.clickAndHold(dragBox).release(dropBox).perform();
	}
	
	public void linkTwo(WebDriver driver) {
		link2.click();
		Actions builder = new Actions(driver);
		builder.clickAndHold(dragNotDropBox).release(dropBox2).perform();
		builder.clickAndHold(dragBox2).release(dropBox2).perform();
	}
	
	public void linkThree(WebDriver driver) {
		link3.click();
		Actions builder = new Actions(driver);
		builder.clickAndHold(dragBox3).release(innerDrop).perform();
		builder.clickAndHold(dragBox3).release(outerDrop).perform();
	}
	
	public void linkFour(WebDriver driver) {
		link4.click();
		Actions builder = new Actions(driver);
		builder.clickAndHold(revertOnDrop).release(dropBox4).perform();
		builder.clickAndHold(revertOnDragNotDrop).release(dropBox4).perform();
	}
	
	public void linkFive(WebDriver driver) throws InterruptedException {
		link5.click();
		tShirt.click();
		builder2 = new Actions(driver);
		builder2.clickAndHold(tShirtChoice).release(shoppingCart).perform();
		bags.click();
		builder2.clickAndHold(bagsChoice).release(shoppingCart).perform();
		gadgets.click();
		builder2.clickAndHold(gadgetsChoice).release(shoppingCart).perform();
	}

}
