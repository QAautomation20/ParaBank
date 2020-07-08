package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.LoginPage;
import util.BrowserFactory;


public class LoginTest extends BasePage{
	WebDriver driver;

@Test
public void ParaBankLogin() throws IOException {
	intialization();
	LoginPage LogintoBankAccount = PageFactory.initElements(driver, LoginPage.class);
	LogintoBankAccount.logintobank();
	driver.close();
	driver.quit();
	}
}
