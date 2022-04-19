package org.listeners;

import java.io.IOException;

import org.base.BaseClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is going to execute");	
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			screenShot("failed");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skipped");
	}
	@Override
	public void onStart(ITestContext context) {
		System.out.println("before everything");
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("After everything");
	}
	
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

}
