package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
<<<<<<< HEAD
	static WebDriver driver;
	static Properties prop;

	public static void waitForElement(WebElement element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public static void getpropertyfile() throws IOException{
		try{
		prop = new Properties();
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"./bank/src/main/java/pages/data.properties");
		prop.load(fi);
		}
		catch (FileNotFoundException e){
		e.printStackTrace();
		}
	}

		public static void intialization(){
			String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./bank/Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("URL");
			}

		}

=======
public static WebDriver driver;
public static Properties prop;

	public static void waitForElement(WebElement element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public BasePage() throws Exception {
		try {
			prop = new Properties();
			FileInputStream fi = new FileInputStream(
					"C:/Users/Hamro/Selenium/bank/src/main/java/pages/data.properties");
			prop.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	/*
	 * public static void getpropertyfile() throws IOException { try { prop = new
	 * Properties(); FileInputStream fi = new FileInputStream(
	 * "C:/Users/Hamro/Selenium/bank/src/main/java/pages/data.properties");
	 * prop.load(fi); } catch (FileNotFoundException e) { e.printStackTrace(); } }
	 */

	public static void intialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/Hamro/Selenium/bank/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (browserName.equals("FF")) {
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("URL"));
		}
		}
>>>>>>> refs/remotes/origin/Sumitra
