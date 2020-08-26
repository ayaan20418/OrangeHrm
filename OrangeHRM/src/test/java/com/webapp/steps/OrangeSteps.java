package com.webapp.steps;

import java.util.concurrent.TimeUnit;

import com.webapp.pages.HomePage;
import com.webapp.pages.LoginPage;
import com.webapp.utility.FunctionLibrary;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.webapp.listeners.ExtentReportListener;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeSteps extends FunctionLibrary   {

	LoginPage login;

	static HomePage home;

	@Given("the user launches the url")
	public void the_user_launches_the_url() {
		
		FunctionLibrary.browserFactory();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
	@When("User click login option")
	public void User_click_login_option() {
		login = new LoginPage();
		login.getbutton1click();

	}
	
	@Then("login with differrent user1")
	public void login_with_differrent_user1() {
		login = new LoginPage();
		login.getdiff_role1();
	}
	@Then("login with differrent user2")
	public void login_with_differrent_user2() {
		login = new LoginPage();
		login.getdiff_role2();
	}
	@Then("login with differrent user3")
	public void login_with_differrent_user3() {
		login = new LoginPage();
		login.getdiff_role3();
	}
	@Then("login with differrent user4")
	public void login_with_differrent_user4() {
		login = new LoginPage();
		login.getdiff_role4();
	}

	@And("Enter the system admin")
	public void Enter_the_system_admin() {
		home =new HomePage();
		home.getsystemAdmin();

	}
	  @ Then("click logout")
	   public void Then_click_logout() {
		  home =new HomePage();
			home.getlogout();
			
	}
	  @Then("Enter the PIM Option")
	  public void Enter_the_PIM_Option() {
		  home =new HomePage();
		  home.getselectPIM();

	}
	   @And ("Click the Employee List")
	   public void And_Click_the_Employee_List() {
			  home =new HomePage();
			  home.getselectEmployeeList();

	}
	  @ Then("Get particular Employee Details")
	   public void Get_particular_Employee_Details() {
		  home =new HomePage();
		  home.getDetails();


	}





}
