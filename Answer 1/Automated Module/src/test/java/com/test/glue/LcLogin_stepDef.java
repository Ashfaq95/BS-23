package com.test.glue;

import com.test.framwork.ParentScenario;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class LcLogin_stepDef extends ParentScenario {
	
	@Before
	public void beforeScenario() throws Throwable {
		startBrowser();
	}
	
	@Given("^User is on given URL$")
	public void user_is_on_given_URL() throws Throwable {
		 navigate();
	   
	}

	@Given("^validate if the user is in right URL or not$")
	public void validate_if_the_user_is_in_right_URL_or_not() throws Throwable {
		Thread.sleep(2000);
		lclogin.loginSuccess();
	}
	

@Given("^User click on SignIn Button$")
public void user_click_on_SignIn_Button() throws Throwable {
	Thread.sleep(1000);
	lclogin.clickSignInBtn();
	
}

@Then("^User clicks on Email Address text Field Under Create An Account$")
public void user_clicks_on_Email_Address_text_Field_Under_Create_An_Account() throws Throwable {
	Thread.sleep(1000);
	lclogin.clickEmail();
}

@Then("^User Enters \"([^\"]*)\" on the text field$")
public void user_Enters_on_the_text_field(String arg1) throws Throwable {
	Thread.sleep(1000);
	lclogin.enterEmail(arg1);
}

@Then("^User clicks on Create an account button$")
public void user_clicks_on_Create_an_account_button() throws Throwable {
	Thread.sleep(1000);
	lclogin.clickCreateAnAccountBtn();
}

@Then("^user checks the MR\\. chekbox$")
public void user_checks_the_MR_chekbox() throws Throwable {
	Thread.sleep(1000);
	lclogin.clickOnCheckBox();
}

@Then("^User Enters \"([^\"]*)\" in the First Name$")
public void user_Enters_in_the_First_Name(String arg1) throws Throwable {
   
	Thread.sleep(1000);
	lclogin.enterFirstName(arg1);
}

@Then("^User Enters \"([^\"]*)\" in the Last Name$")
public void user_Enters_in_the_Last_Name(String arg1) throws Throwable {

	Thread.sleep(1000);
	lclogin.enterLastName(arg1);
}

@Then("^User Enters \"([^\"]*)\" in Password Field$")
public void user_Enters_in_Password_Field(String arg1) throws Throwable {
   
	Thread.sleep(1000);
	lclogin.enterPassword(arg1);
}

@Then("^user Enters Date of Birth$")
public void user_Enters_Date_of_Birth() throws Throwable {
   
	Thread.sleep(1000);
	lclogin.enterDateOfBirth();
}

@Then("^User clicks on Sign up for our newsletter checkbox$")
public void user_clicks_on_Sign_up_for_our_newsletter_checkbox() throws Throwable {
  
	Thread.sleep(1000);
	lclogin.clickCheckBoxOne();
}

@Then("^User clicks on Receive special offers from our partners checkbox$")
public void user_clicks_on_Receive_special_offers_from_our_partners_checkbox() throws Throwable {
   
	Thread.sleep(1000);
	lclogin.clickCheckBoxTwo();
}

@Then("^User Enters \"([^\"]*)\" in the First NamE$")
public void user_Enters_in_the_First_NamE(String arg1) throws Throwable {
   
	Thread.sleep(1000);
	lclogin.enterFirstNamE(arg1);
}

@Then("^User Enters \"([^\"]*)\" in the Last NamE$")
public void user_Enters_in_the_Last_NamE(String arg1) throws Throwable {

	Thread.sleep(1000);
	lclogin.enterLastNamE(arg1);
}

@Then("^User Enters \"([^\"]*)\" in the Company$")
public void user_Enters_in_the_Company(String arg1) throws Throwable {
   
	Thread.sleep(1000);
	lclogin.enterCompany(arg1);
}

@Then("^user Enters \"([^\"]*)\" in the Address$")
public void user_Enters_in_the_Address(String arg1) throws Throwable {
 
	Thread.sleep(1000);
	lclogin.EnterAddress(arg1);
}

@Then("^user Enters \"([^\"]*)\" in the Address line two$")
public void user_Enters_in_the_Address_line_two(String arg1) throws Throwable {
    
	Thread.sleep(1000);
	lclogin.EnterAddressLineTwo(arg1);
}

@Then("^user Enters \"([^\"]*)\" inthe city$")
public void user_Enters_inthe_city(String arg1) throws Throwable {
  
	Thread.sleep(1000);
	lclogin.EnterCity(arg1);
}

@Then("^user clicks Florida$")
public void user_clicks_Florida() throws Throwable {
 
	Thread.sleep(1000);
	lclogin.clickState();
}

@Then("^user Enters \"([^\"]*)\" in postal Zip code$")
public void user_Enters_in_the_city(String arg1) throws Throwable {
    
	Thread.sleep(1000);
	lclogin.EnterPostalCode(arg1);
}

@Then("^user Enters \"([^\"]*)\" in the Additional Information$")
public void user_Enters_in_the_Additional_Information(String arg1) throws Throwable {
	Thread.sleep(1000);
	lclogin.EnterAdditionalInformation(arg1);
}

@Then("^user Enters \"([^\"]*)\" in the Home Phone$")
public void user_Enters_in_the_Home_Phone(String arg1) throws Throwable {
	Thread.sleep(1000);
	lclogin.EnterHomePhone(arg1);
}

@Then("^user Enters \"([^\"]*)\" in the Mobile Number$")
public void user_Enters_in_the_Mobile_Number(String arg1) throws Throwable {
	Thread.sleep(1000);
	lclogin.EnterMobileNumber(arg1);
}

@Then("^user Enters \"([^\"]*)\" in the Aaddress$")
public void user_Enters_in_the_Aaddress(String arg1) throws Throwable {
 
	Thread.sleep(1000);
	lclogin.EnterAddresss(arg1);
}

@Then("^user clicks register Button$")
public void user_clicks_register_Button() throws Throwable {
	Thread.sleep(1000);
	lclogin.clickRegisterButton();
}

}


		
