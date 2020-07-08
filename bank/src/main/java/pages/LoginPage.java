package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {	

	
	//Elements by Find by : for login
	@FindBy(how = How.NAME, using = "username")
	WebElement UserName;
	@FindBy(how = How.NAME, using = "password")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//input[@value='Log In']")
	WebElement LogInButton;
	
	//Elements by Find by : for login info lookup
	@FindBy(how = How.LINK_TEXT, using="Forgot login info")
	WebElement ForgotLoginInfo;
	
	@FindBy(how = How.ID, using = "firstName")
	WebElement FirstName;
	@FindBy(how = How.ID, using = "lastName")
	WebElement LastName;
	@FindBy(how = How.ID, using = "address.street")
	WebElement Address;
	@FindBy(how = How.ID, using = "address.city")
	WebElement City;
	@FindBy(how = How.ID, using = "address.state")
	WebElement State;
	@FindBy(how = How.ID, using = "address.zipCode")
	WebElement ZipCode;
	@FindBy(how = How.ID, using = "ssn")
	WebElement SSN;
	
	//Elements by Find by : for Customer Registration
	@FindBy(how = How.LINK_TEXT, using="Register")
	WebElement Registration;
	
	@FindBy(how = How.ID, using = "customer.firstName")
	WebElement regFirstName;
	@FindBy(how = How.ID, using = "customer.lastName")
	WebElement regLastName;
	@FindBy(how = How.ID, using = "customer.address.street")
	WebElement regAddress;
	@FindBy(how = How.ID, using = "customer.address.city")
	WebElement regCity;
	@FindBy(how = How.ID, using = "customer.address.state")
	WebElement regState;
	@FindBy(how = How.ID, using = "customer.address.zipCode")
	WebElement regZipCode;
	@FindBy(how = How.ID, using = "customer.ssn")
	WebElement regSSN;
	
	public LoginPage() throws Exception {
		super();
		PageFactory.initElements(driver, this);
		
		
		//bridge to connect browser factory to the login page
		//this declares to use the driver from global 
		//to be the driver locally to get all the functions of it
	}
	
	public void registration() {
	//get the parameters from your registration and put it in database before creating this	
	}
	
	//Login
	//U:Honhaar P:student 
	public void logintobank(String username, String password) {
		UserName.sendKeys(username);
		Password.sendKeys(password);
		LogInButton.click();		
		
	//	driver.get(prop.getProperty("username"));
	//	driver.get(prop.getProperty("password"));
	}
	public void ForgotLoginInfo(){
	//get the parameters from your login and put it in database before creating this
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

	
		
	}


