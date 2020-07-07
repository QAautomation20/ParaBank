package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		//bridge to connect browser factory to the login page
		//this declares to use the driver from global 
		//to be the driver locally to get all the functions of it
	}
	//Elements by Find by
	@FindBy(how = How.ID, using = "username")
	WebElement UserName;

	@FindBy(how = How.ID, using = "password")
	WebElement Password;

	@FindBy(how = How.NAME, using = "login")
	WebElement SignInButton;
	
	//Methods
	public void login() {
		UserName.sendKeys("techfiosdemo@gmail.com");
		Password.sendKeys("abc123");
		SignInButton.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

}
