package com.webapp.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.webapp.utility.FunctionLibrary;

public class LoginPage extends FunctionLibrary {

	public LoginPage() {

		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(id = "txtUsername")
	WebElement user_input;

	@FindBy(id = "txtPassword")
	WebElement pwd_input;

	@FindBy(name = "Submit")
	WebElement login_input;
	
	@FindBy(xpath="//button[@type='button']")
	 WebElement button1click;

	@FindBy(xpath="//*[@class='dropdown-menu']//li//a[@class='login-as']")
	 List<WebElement> diff_role1;
	
	@FindBy(xpath="//*[@class='dropdown-menu']//li//a[@class='login-as']")
	 List<WebElement> diff_role2;
	
	@FindBy(xpath="//*[@class='dropdown-menu']//li//a[@class='login-as']")
	 List<WebElement> diff_role3;
	
	@FindBy(xpath="//*[@class='dropdown-menu']//li//a[@class='login-as']")
	 List<WebElement> diff_role4;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public void getbutton1click() {
button1click.click();
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
public  void getdiff_role1() {	
for(int i=0;i<diff_role1.size();i++) {
	diff_role1.get(0).click();
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public  void getdiff_role2() {	
for(int i=0;i<diff_role2.size();i++) {
	diff_role2.get(1).click();
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public  void getdiff_role3() {	
for(int i=0;i<diff_role3.size();i++) {
	diff_role3.get(2).click();
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public  void getdiff_role4() {	
for(int i=0;i<diff_role4.size();i++) {
	diff_role4.get(3).click();
	}
}
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////