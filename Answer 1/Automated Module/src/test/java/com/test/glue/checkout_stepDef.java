package com.test.glue;

import com.test.framwork.ParentScenario;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class checkout_stepDef extends ParentScenario {
	
	@Given("^User clicks dresses button$")
	public void user_clicks_dresses_button() throws Throwable {
		Thread.sleep(2000);
		checkout.clickOnDresses();
	}

	@Then("^user clicks on Add to the cart for dress one$")
	public void user_clicks_on_Add_to_the_cart_for_dress_one() throws Throwable {
	    
		Thread.sleep(1000);
		checkout.clickOnDresses();
	}

	@Then("^user click on continue shopping$")
	public void user_click_on_continue_shopping() throws Throwable {
	   
		Thread.sleep(1000);
		checkout.clickOnContinueOnShopping();
	}

	@Then("^user clicks on Add to the cart for dress Two$")
	public void user_clicks_on_Add_to_the_cart_for_dress_Two() throws Throwable {
	   
		Thread.sleep(1000);
		checkout.clickOnContinueOnShopping();
	}

	@Then("^User clicks on Proceed to checkout button$")
	public void user_clicks_on_Proceed_to_checkout_button() throws Throwable {
	    
		Thread.sleep(1000);
		checkout.clickOnContinueOnShopping();
	}
	
	@Then("^user verify dress title with \"([^\"]*)\"$")
	public void user_verify_dress_title_with(String arg1) throws Throwable {
	  
		Thread.sleep(1000);
		checkout.VerifyDressName(arg1);
	}
	
	@Then("^user verify dress Price with \"([^\"]*)\"$")
	public void user_verify_dress_Price_with(String arg1) throws Throwable {
	   
		Thread.sleep(1000);
		checkout.VerifyDressPrice(arg1);
	}




}


		
