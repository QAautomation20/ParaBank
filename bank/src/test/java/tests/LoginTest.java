package tests;

import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.google.j2objc.annotations.Property;

import pages.BasePage;
import pages.LoginPage;
import util.BrowserFactory;


public class LoginTest extends BasePage{
	
	public LoginTest() throws IOException {
		super();// called super class constructor
		
	}

	

@Test
public void ParaBankLogin() throws IOException {
	intialization();
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.logintobank(prop.getProperty("username"), prop.getProperty("password"));
//	driver.close();
//	driver.quit();
	}
}
