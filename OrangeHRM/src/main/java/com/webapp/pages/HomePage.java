package com.webapp.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.webapp.utility.FunctionLibrary;

public class HomePage extends FunctionLibrary {

	public HomePage() {

		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@id='user-dropdown']")
	WebElement systemAdmin;
	
@FindBy(xpath="//a[@id='logoutLink']")
WebElement logout;
@FindBy(xpath="//li[@id='menu_pim_viewPimModule']")
WebElement selectPIM;
@FindBy(xpath="//*[@href='#/pim/employees']")
WebElement selectEmployeeList;
@FindBy(xpath="//table[@id='employeeListTable']/tbody/tr")
List<WebElement> Details;


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void getsystemAdmin() {
	
	systemAdmin.click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void getlogout() {
	WebDriverWait wait = new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.elementToBeClickable(logout)).click();
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void getselectPIM() {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(selectPIM)).click();
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void getselectEmployeeList() {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(selectEmployeeList)).click();
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void getDetails() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("The Employee Details");
for(int i=0;i<Details.size();i++) {
		System.out.println(Details.get(5).getText());
		break;
	}

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

	}

	


