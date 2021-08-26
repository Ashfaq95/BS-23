#Author: ashfaq95.af@gmail.com
#Keywords Summary :
Feature: User Registration

  Scenario: User Navigate to the given URL
    Given User is on given URL
    And validate if the user is in right URL or not

  Scenario: Register two unique user
    Given User click on SignIn Button
    Then User clicks on Email Address text Field Under Create An Account
    And User Enters "ashfaq95.af@gmail.com" on the text field
    Then User clicks on Create an account button
    Then user checks the MR. chekbox
    And User Enters "Alen" in the First Name
    Then User Enters "Walker" in the Last Name
    Then User Enters "12345" in Password Field
    And user Enters Date of Birth
    Then User clicks on Sign up for our newsletter checkbox
     Then User clicks on Receive special offers from our partners checkbox
    And User Enters "Alen" in the First NamE
    Then User Enters "Walker" in the Last NamE
    Then User Enters "TATA" in the Company
    Then user Enters "House:04, Road: 08, Dhaka" in the Address
    Then user Enters "House:01, Road: 09, chittagong" in the Address line two
    And user Enters "New York" inthe city
    And user clicks Florida
    And user Enters "10001" in postal Zip code
    Then user Enters "test001" in the Additional Information
    Then user Enters "01700000000" in the Home Phone
    Then user Enters "01700000001" in the Mobile Number
    Then user Enters "test" in the Aaddress
    Then user clicks register Button
