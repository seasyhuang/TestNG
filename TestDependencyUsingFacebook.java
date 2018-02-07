package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestDependencyUsingFacebook {

	WebDriver driver;

	@Test
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\huangti1\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window(); // maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // synchronize the lines of code + page --
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // wait for the page to load
		driver.get("https://www.facebook.com/");

	}

	@Test(dependsOnMethods = { "openBrowser" })
	public void loginToFacebook() {
		
		driver.findElement(By.id("email")).sendKeys("somename");
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.id("loginbutton")).submit();
		
	}

}
