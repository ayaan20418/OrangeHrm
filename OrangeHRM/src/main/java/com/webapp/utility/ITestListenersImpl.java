package com.webapp.utility;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class ITestListenersImpl extends FunctionLibrary implements ITestListener {
	
	private static ExtentReports extent;
	
	
	@Override
	public void onTestStart(ITestResult result) {

	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("PASS");

	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAIL");

	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("SKIP");

	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution started on UAT env...........");
		extent=setup();
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution completed on UAT env...........");
		extent.flush();
		System.out.println("Generated Reports.............");

	}

}
