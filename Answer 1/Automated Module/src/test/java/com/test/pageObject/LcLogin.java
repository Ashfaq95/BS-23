package com.test.pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.test.framwork.DriverFactory;

public class LcLogin extends DriverFactory {
	
	WebDriver driver = getDriver();
	
	public LcLogin(WebDriver driver) {
		this.driver = driver;
	}
	
public void clickSignInBtn() {
		
		driver.findElement(By.xpath("//a[contains(.,'Sign in')]")).click();
	}

public void clickEmail() {
	
	driver.findElement(By.xpath("//input[@id='email_create']")).click();
}

public void enterEmail(String arg1) {
	driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(arg1);
}

public void clickCreateAnAccountBtn() {
	
	driver.findElement(By.xpath("//span[contains(.,'Create an account')]")).click();
}

public void clickOnCheckBox() {
	
	driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
}

public void enterFirstName(String arg1) {
	driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(arg1);
}
public void enterLastName(String arg1) {
	driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys(arg1);
}

public void enterPassword(String arg1) {
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(arg1);
}


public void enterDateOfBirth() {
	driver.findElement(By.xpath("//select[@id='days']")).click();
	driver.findElement(By.xpath("(//option[@value='1'])[1]")).click();
	driver.findElement(By.xpath("//select[@id='months']")).click();
	driver.findElement(By.xpath("(//option[@value='1'])[2]")).click();
	driver.findElement(By.xpath("//select[@id='years']")).click();
	driver.findElement(By.xpath("//option[@value='2019']")).click();
}

public void clickCheckBoxOne() {
	
	driver.findElement(By.xpath("//input[@id='newsletter']")).click();
}

public void scrollDown() {
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,500)", "");
}


public void clickCheckBoxTwo() {
	
	driver.findElement(By.xpath("//input[@id='optin']")).click();
}

public void enterFirstNamE(String arg1) {
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(arg1);
}
public void enterLastNamE(String arg1) {
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(arg1);
}
public void enterCompany(String arg1) {
	driver.findElement(By.xpath("//input[@id='company']")).sendKeys(arg1);
}

public void EnterAddress(String arg1) {
	driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(arg1);
}

public void EnterAddressLineTwo(String arg1) {
	driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(arg1);
}

public void EnterCity(String arg1) {
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys(arg1);
}

public void clickState() {
	
	driver.findElement(By.xpath("//select[@id='id_state']")).click();
	driver.findElement(By.xpath("(//option[@value='2'])[3]")).click();
}

public void EnterPostalCode(String arg1) {
	driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys(arg1);
}

public void EnterAdditionalInformation(String arg1) {
	driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys(arg1);
}

public void EnterHomePhone(String arg1) {
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(arg1);
}

public void EnterMobileNumber(String arg1) {
	driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys(arg1);
}

public void EnterAddresss(String arg1) {
	driver.findElement(By.xpath("//input[@id='alias']")).sendKeys(arg1);
}

public void clickRegisterButton() {
	
	driver.findElement(By.xpath("//span[contains(.,'Register')]")).click();
}






    
public void loginSuccess() {
	
	String A = driver.getCurrentUrl();
	
	String B = "http://automationpractice.com/index.php";
	Assert.assertEquals(A, B);
}
}	

