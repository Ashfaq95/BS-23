package com.test.pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.test.framwork.DriverFactory;

public class Checkout extends DriverFactory {
	
	WebDriver driver = getDriver();
	
	public Checkout(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnDresses() {
		
		driver.findElement(By.xpath("(//a[contains(.,'Dresses')])[5]")).click();
	}
	
	public void scrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)", "");
	}

public void clickOnAddtoCart() {
		
		driver.findElement(By.xpath("(//span[contains(.,'Add to cart')])[1]")).click();
	}

public void clickOnContinueOnShopping() {
	
	driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]")).click();
}

public void clickOnAddtoCart2() {
	
	driver.findElement(By.xpath("(//span[contains(.,'Add to cart')])[2]")).click();
}

public void clickOnproceedToCheckout() {
	
	driver.findElement(By.xpath("//span[contains(.,'Proceed to checkout')]")).click();
}

public void  VerifyDressName(String arg1) {
	
		String A = driver.findElement(By.xpath("(//a[contains(.,'Printed Dress')])[4]")).getText();
	
		String B = ": "+ arg1;
	
		Assert.assertEquals(B, A);
	
}

public void  VerifyDressPrice(String arg1) {
	
	String A = driver.findElement(By.xpath("(//span[contains(.,'$26.00')])[1]")).getText();

	String B = ": "+ arg1;

	Assert.assertEquals(B, A);

}


	

}	

