package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.junit.Assert;
import org.junit.Assert;

	public class ValidatePage {
	
		WebDriver driver;
	
	public ValidatePage(WebDriver driver) {
		this.driver = driver;
		
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"label-first\"]/b") WebElement HEADER_CONTENT_ELEMENT;


	public void validateValidatePage() {
		String expectedTitle = "NSS-TODO List v 1.1";
		String actualTitle = HEADER_CONTENT_ELEMENT.getText();
		Assert.assertEquals(expectedTitle, actualTitle);
	}


}