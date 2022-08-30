package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LaunchWebPage;
import page.ValidatePage;
import util.BrowserFactory;

public class LaunchWebPageTest {
	
	WebDriver driver;
	
	@Test
	public void ValidLandOnWebPage() throws InterruptedException {
		
		 driver = BrowserFactory.init();
		 
		 Thread.sleep(3000);
		 		
		 LaunchWebPage launchPage = PageFactory.initElements(driver, LaunchWebPage.class);
		 launchPage.clickOnToggleALL();
		 
		 ValidatePage validatePage = PageFactory.initElements(driver, ValidatePage.class);
		 validatePage.validateValidatePage("NSS");
		 
		 Thread.sleep(3000);
		 BrowserFactory.tearDown();
	}

}
