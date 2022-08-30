package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingleListRemovePage {
WebDriver driver;
	
	public SingleListRemovePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@FindBy(name="todo[2]") WebElement SINGLE_LIST;
	@FindBy(name="submit") WebElement REMOVE_BUTTON;
	
	public void clickOnSingleCheckBox() {
		SINGLE_LIST.click();
	}
	public void removeButton( ) {
		REMOVE_BUTTON.click();
	}
}



