package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.SingleListRemovePage;
import util.BrowserFactory;

public class SingleListItemRemoveTest {
	
	WebDriver driver;
	@Test
	public void ValidateCickOnSingleListItem() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		SingleListRemovePage singlelist = PageFactory.initElements(driver, SingleListRemovePage.class);
		singlelist.insertElement("xyz");
		singlelist.clickOnAddButton();
		singlelist.clickOnSingleCheckBox();
		Thread.sleep(3000);
		singlelist.removeButton();
		
		Thread.sleep(2000);
		BrowserFactory.tearDown();
	}
		

}
