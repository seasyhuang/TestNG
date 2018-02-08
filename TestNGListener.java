package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {	}

	@Override
	public void onStart(ITestContext result) {	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) { }

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed: " + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped: " + result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started: " + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) { 
		System.out.println("Nice");
	}
	
}
