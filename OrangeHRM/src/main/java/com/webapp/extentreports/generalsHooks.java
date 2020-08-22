
package com.webapp.extentreports;

import com.webdriver.


import cucumber.api.Scenario;
import io.cucumber.java.Before;

public class generalsHooks {

	
	private DriverService services;
	
	
	private static Reports reports;
	private static boolean isReporterRunning;
	
	
	
	@Before
	public void beforeScenario(Scenario scenario) {
		if(!isReporterRunning) {
			reports=new Reports("c:\\Data\\log\\TestReport.html");
			isReporterRunning=true;
			
		}
	}
	
	public void afterScenario(Scenario scenario) {
		String screenShotFileName
if(scenario.isFailed()) {
	
}
	}
}
