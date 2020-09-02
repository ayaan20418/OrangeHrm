package com.webapp.extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.webapp.utility.FunctionLibrary;

public class ExtentReportListener  {

	
	public static ExtentHtmlReporter report=null;
	public static ExtentReports extent=null;
	public static ExtentTest test=null;
	
	
	public static ExtentReports setup() {
		String reportLocation="./Reports/Extent_Report.html";
		report=new ExtentHtmlReporter(reportLocation);
		report.config().setDocumentTitle("Orange Hrm");
		report.config().setReportName("Orange_hrm");
		report.config().setTheme(Theme.STANDARD);
		System.out.println("Extent Report location initialiized............");
		report.start();
		
		
		extent= new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Application", "OrangeHRM");
		extent.setSystemInfo("operating System",  System.getenv("os.name"));
		extent.setSystemInfo("User Name",  System.getenv("user.name"));
		System.out.println("system Info. set in Extent Reports  ");
		return extent;
	}
	
	
	public static  void teststepHandle(String teststatus,WebDriver driver,ExtentTest extenttest,Throwable throwable) {

		switch(teststatus) {
		case "FAIL":
			extenttest.fail(MarkupHelper.createLabel("Test case is failed : ", ExtentColor.RED));
			extenttest.error(throwable.fillInStackTrace());		
			
			
			if(driver!=null) {
				driver.quit();
			}
			break;
			
		case"PASS":
			extenttest.pass(MarkupHelper.createLabel("Test case is passed : ", ExtentColor.GREEN));
			break;
			
			default:
				break;
		}
		
	}
	
	//template
	
/*	ExtentTest logInfo=null;
	
	try {
		test=extent.createTest(Feature.class,"feaature name");
		test=test.createNode(Scenario.class,"scenario name");
		logInfo=test.createNode(new Gherkinkeyword("Given"),"");
	}
	
	catch(AssertionError | Exception e){
	teststepHandle("FAIL",driver,logInfo,e);
	}*/
}
