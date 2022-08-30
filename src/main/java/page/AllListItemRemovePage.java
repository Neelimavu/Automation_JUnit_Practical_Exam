package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllListItemRemovePage {
	
WebDriver driver;

public AllListItemRemovePage(WebDriver driver) {
	
	this.driver=driver;
}
	@FindBy(name="allbox") WebElement TOGGLE;
	@FindBy(name="submit") WebElement REMOVE;
	
	public void clickOnToggle() {
		TOGGLE.click();
	}
	public void clickOnRemove() {
		REMOVE.click();
	}
}