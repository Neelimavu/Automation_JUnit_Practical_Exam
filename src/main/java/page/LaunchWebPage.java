package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LaunchWebPage {
	
WebDriver driver;
	
	
	
	public  LaunchWebPage(WebDriver driver) {
		
		this.driver = driver;

	}
	
	@FindBy(name="allbox") WebElement TOGGLE_ALL_ELEMENT;
	
	public void clickOnToggleALL() {
		TOGGLE_ALL_ELEMENT.click();
	}
}
