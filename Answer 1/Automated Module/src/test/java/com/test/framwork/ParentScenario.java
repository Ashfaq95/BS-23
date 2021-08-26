package com.test.framwork;

import org.openqa.selenium.WebDriver;

import com.test.pageObject.Checkout;
import com.test.pageObject.LcLogin;



public class ParentScenario extends DriverFactory {

	public WebDriver driver = getDriver();

	public LcLogin lclogin;
	public Checkout checkout;
	


	public void startBrowser() {
		lclogin = new LcLogin(driver);
		checkout = new Checkout(driver);
		
	}

	public void navigate() {
		driver.navigate().to("http://automationpractice.com/index.php");
		;
	}

}
