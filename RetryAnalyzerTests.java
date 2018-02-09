package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerTests {
	
//	@Test(retryAnalyzer = testNG.RetryAnalyzer.class)
	@Test
	@RetryCountIfFailed(10)				// Retries the test 10 times 
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
}
