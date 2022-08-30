package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

	public class ValidatePage {
	
		WebDriver driver;
	
	public ValidatePage(WebDriver driver) {
		this.driver = driver;
		
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"label-first\"]/b") WebElement HEADER_CONTENT_ELEMENT;


	public void validateValidatePage(String NSS) {
//		Assert.assertEquals(HEADER_CONTENT_ELEMENT.getText(), NSS, "!!wrong page");
}
}