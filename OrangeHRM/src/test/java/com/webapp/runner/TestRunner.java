package com.webapp.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(cucumber.class)

import io.cucumber.testng.CucumberOptions;
@CucumberOptions(

		features = "./src/main/java/com/webapp/features/",

		glue = { "com/webapp/steps" },

		dryRun = false,

		plugin = { "pretty", "html:target/Html-output", "junit:target/Junit-output/index.xml",
				"json:target/cucumber/cucumber.json" },
		monochrome = true,
		strict = true,
		tags= "@Smoke"


		//tags="@Regression"

)

public class TestRunner extends AbstractTestNGCucumberTests {
	 
}
