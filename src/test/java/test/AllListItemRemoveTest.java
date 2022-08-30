package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AllListItemRemovePage;
import util.BrowserFactory;

public class AllListItemRemoveTest {
	WebDriver driver;
	@Test
	public void ValidateToggleAllRemove() throws InterruptedException {
	
	driver = BrowserFactory.init();
		
	AllListItemRemovePage alllist = PageFactory.initElements(driver, AllListItemRemovePage.class);
		alllist.clickOnToggle();
		Thread.sleep(2000);
		alllist.clickOnRemove();
		
		BrowserFactory.tearDown();
			
}
}