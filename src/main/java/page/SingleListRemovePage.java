package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SingleListRemovePage extends BasePage {
WebDriver driver;
	
	public SingleListRemovePage(WebDriver driver) {
		
		this.driver=driver;
	}
	@FindBy(name="data") WebElement ADD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/input[2]") WebElement ADD_BUTTON;
	
	@FindBy(name="todo[0]") WebElement SINGLE_LIST;
	@FindBy(name="submit") WebElement REMOVE_BUTTON;
	
	public void insertElement(String insert) {
		ADD_ELEMENT.sendKeys(insert + generateRandomNo(9999));
	}
	public void clickOnAddButton( ) {
		ADD_BUTTON.click();
	}
	
	public void clickOnSingleCheckBox() {
		SINGLE_LIST.click();
	}
	public void removeButton( ) {
		REMOVE_BUTTON.click();
	}
}



