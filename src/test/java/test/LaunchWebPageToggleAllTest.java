package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LaunchWebPage;
import page.ValidatePage;
import util.BrowserFactory;

public class LaunchWebPageToggleAllTest {
	
	WebDriver driver;
	
	@Test
	public void ValidLandOnWebPage() throws InterruptedException {
		
		 driver = BrowserFactory.init();
		 
		 Thread.sleep(3000);
		 		
		 LaunchWebPage launchPage = PageFactory.initElements(driver, LaunchWebPage.class);
		 launchPage.insertElement("abc");
		 launchPage.clickOnAddButton();
		 launchPage.insertElement1("def");
		 launchPage.clickOnAddButton1();
		 Thread.sleep(2000);
		 launchPage.clickOnToggleALL();
		 
		 Thread.sleep(3000);
		 
		 ValidatePage validatePage = PageFactory.initElements(driver, ValidatePage.class);
		 validatePage.validateValidatePage();
		 
		 Thread.sleep(2000);
		 BrowserFactory.tearDown();
	}

}
