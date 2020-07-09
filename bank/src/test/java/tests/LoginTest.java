package tests;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.LoginPage;
import util.BrowserFactory;

public class LoginTest extends BasePage {
	LoginPage loginpage;

	public LoginTest() throws Exception {
		super();
	}

@Test
public void ParaBankLogin() throws IOException, InterruptedException {
	
	BasePage.intialization();
	loginpage = PageFactory.initElements(driver, LoginPage.class);
	loginpage.logintobank(prop.getProperty("username"), prop.getProperty("password"));
	
	//driver.close();
	//driver.quit();

	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.logintobank(prop.getProperty("username"), prop.getProperty("password"));
//	driver.close();
//	driver.quit();

	}
}
