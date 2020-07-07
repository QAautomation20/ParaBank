package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import util.BrowserFactory;

public class LoginTest{

@Test
public void ParaBankLogin() {
	WebDriver driver = BrowserFactory.startBrowser();
	LoginPage LogintoBankAccount = PageFactory.initElements(driver, LoginPage.class);
	LogintoBankAccount.logintobank();
	driver.close();
	driver.quit();
	}
}
