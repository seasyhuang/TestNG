package testNG;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import utility.Log;

//@Listeners(testNG.TestNGListener.class)	// calls the listener class. don't need this if you're implementing on the suite level
public class MultiBrowser {

	public WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void beforeTest(String browser) {

		DOMConfigurator.configure("config/log4j.xml");
		
		if (browser.equalsIgnoreCase("firefox")) { // If the browser is Firefox, then do this
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\huangti1\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("chrome")) { // If browser is IE, then do this

			// Here I am setting up the path for my IEDriver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\huangti1\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window(); // maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // synchronize the lines of code + page --
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // wait for the page to load
		driver.get("https://sandbox.esignlive.com/");

	}

	@Parameters({ "username", "password", })
	@Test
	public void login(String username, String password) {

		WebElement emailField = driver.findElement(By.cssSelector("input[name='email']"));
		emailField.click();
		emailField.sendKeys(username);

		WebElement passwordField = driver.findElement(By.cssSelector("input[name='password']"));
		passwordField.sendKeys(password);
		passwordField.sendKeys(Keys.ENTER);
		
		Assert.assertTrue(false);
		
	}

	 @AfterClass
	 public void afterTest() {
	 driver.quit();
	 }

}