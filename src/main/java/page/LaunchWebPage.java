package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LaunchWebPage extends BasePage {
	
WebDriver driver;
	
	
	
	public  LaunchWebPage(WebDriver driver) {
		
		this.driver = driver;

	}
	@FindBy(name="data") WebElement ADD_ELEMENT;
//	@FindBy(name="submit") WebElement ADD_BUTTON;
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/input[2]") WebElement ADD_BUTTON;
	@FindBy(name="data") WebElement ADD_ELEMENT1;
//	@FindBy(name="submit") WebElement ADD_BUTTON1;
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/input[2]") WebElement ADD_BUTTON1;
	@FindBy(name="allbox") WebElement TOGGLE_ALL_ELEMENT;

	
	public void insertElement(String insert) {
		ADD_ELEMENT.sendKeys(insert + generateRandomNo(9999));
	}
	public void clickOnAddButton( ) {
		ADD_BUTTON.click();
	}
	public void insertElement1(String insert1) {
		ADD_ELEMENT1.sendKeys(insert1 + generateRandomNo(9999));
	}
	public void clickOnAddButton1() {
		ADD_BUTTON1.click();
	}
	public void clickOnToggleALL() {
		TOGGLE_ALL_ELEMENT.click();
	}
	
}
