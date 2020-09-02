package com.webapp.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionLibrary{
	public static ExtentHtmlReporter report=null;
	public static ExtentReports extent=null;
	public static ExtentTest test=null;

	public static Properties prop;

	public static WebDriver driver;

	public FunctionLibrary() {

		prop = new Properties();

		try {
			prop.load(new FileInputStream("./src/main/java/com/webapp/config/config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void browserFactory() {

		String browser = prop.getProperty("browser");

		if (browser.toUpperCase().equals("CHROME")) {

			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		else if (browser.toUpperCase().equals("IE")) {

			WebDriverManager.iedriver().setup();

			driver = new InternetExplorerDriver();
		}

		else {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
		}

		driver.get(prop.getProperty("url"));

		driver.manage().window().maximize();

	}
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
	
	

}
