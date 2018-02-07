package testNG;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGAssertions {
	
	WebDriver driver;
	
	@BeforeTest
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\huangti1\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window(); // maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // synchronize the lines of code + page --
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // wait for the page to load
		driver.get("https://www.gmail.com/");
		
	}

	@Test
	public void testEquality() {
		Assert.assertEquals(true, isEqual(10, 0));
		System.out.println("Assertion");
	}
	
	public boolean isEqual(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}
	
	@Test
	public void getTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Gmail");
		System.out.println("getTitle");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
