 package com.test.runner;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/All_Feature/1A_testBS", glue = "com.test.glue", plugin = {
		"html:target/selenium-reports", "com.cucumber.listener.ExtentCucumberFormatter:output/report.html" }, format = {
				"json:target/cucumber.json", "html:target/A_ Features" })

public class Runner extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void extenReporter() throws IOException {
		Reporter.loadXMLConfig(new File("src/test/resources/extentreports/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + " (" + "64 Bit" + ")");
		Reporter.setSystemInfo("Selenium", "3.0.1");
		Reporter.setSystemInfo("Maven", "3.5.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_121");
		Reporter.setTestRunnerOutput("Max Requisition Managment Testing");

	}
}
