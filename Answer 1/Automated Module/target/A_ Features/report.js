$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("1A_registration.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: ashfaq95.af@gmail.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    }
  ],
  "line": 3,
  "name": "User Registration",
  "description": "",
  "id": "user-registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5537268100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User Navigate to the given URL",
  "description": "",
  "id": "user-registration;user-navigate-to-the-given-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on given URL",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "validate if the user is in right URL or not",
  "keyword": "And "
});
formatter.match({
  "location": "LcLogin_stepDef.user_is_on_given_URL()"
});
formatter.result({
  "duration": 12634217200,
  "status": "passed"
});
formatter.match({
  "location": "LcLogin_stepDef.validate_if_the_user_is_in_right_URL_or_not()"
});
formatter.result({
  "duration": 2047413300,
  "status": "passed"
});
formatter.before({
  "duration": 43100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Register two unique user",
  "description": "",
  "id": "user-registration;register-two-unique-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User click on SignIn Button",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User clicks on Email Address text Field Under Create An Account",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User Enters \"ashfaq95.af@gmail.com\" on the text field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User clicks on Create an account button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user checks the MR. chekbox",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User Enters \"Alen\" in the First Name",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Enters \"Walker\" in the Last Name",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User Enters \"12345\" in Password Field",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user Enters Date of Birth",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User clicks on Sign up for our newsletter checkbox",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User clicks on Receive special offers from our partners checkbox",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User Enters \"Alen\" in the First NamE",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User Enters \"Walker\" in the Last NamE",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User Enters \"TATA\" in the Company",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user Enters \"House:04, Road: 08, Dhaka\" in the Address",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user Enters \"House:01, Road: 09, chittagong\" in the Address line two",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user Enters \"New York\" inthe city",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user clicks Florida",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Enters \"10001\" in postal Zip code",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Enters \"test001\" in the Additional Information",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user Enters \"01700000000\" in the Home Phone",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user Enters \"01700000001\" in the Mobile Number",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "user Enters \"test\" in the Aaddress",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user clicks register Button",
  "keyword": "Then "
});
formatter.match({
  "location": "LcLogin_stepDef.user_click_on_SignIn_Button()"
});
formatter.result({
  "duration": 5849943600,
  "status": "passed"
});
formatter.match({
  "location": "LcLogin_stepDef.user_clicks_on_Email_Address_text_Field_Under_Create_An_Account()"
});
formatter.result({
  "duration": 1063733700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ashfaq95.af@gmail.com",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_on_the_text_field(String)"
});
formatter.result({
  "duration": 1087293400,
  "status": "passed"
});
formatter.match({
  "location": "LcLogin_stepDef.user_clicks_on_Create_an_account_button()"
});
formatter.result({
  "duration": 1074576800,
  "status": "passed"
});
formatter.match({
  "location": "LcLogin_stepDef.user_checks_the_MR_chekbox()"
});
formatter.result({
  "duration": 1883746200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Alen",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_in_the_First_Name(String)"
});
formatter.result({
  "duration": 1119293000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Walker",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_in_the_Last_Name(String)"
});
formatter.result({
  "duration": 1071050900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_in_Password_Field(String)"
});
formatter.result({
  "duration": 1065220900,
  "status": "passed"
});
formatter.match({
  "location": "LcLogin_stepDef.user_Enters_Date_of_Birth()"
});
formatter.result({
  "duration": 1407813700,
  "status": "passed"
});
formatter.match({
  "location": "LcLogin_stepDef.user_clicks_on_Sign_up_for_our_newsletter_checkbox()"
});
formatter.result({
  "duration": 1075778800,
  "status": "passed"
});
formatter.match({
  "location": "LcLogin_stepDef.user_clicks_on_Receive_special_offers_from_our_partners_checkbox()"
});
formatter.result({
  "duration": 1065848300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Alen",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_in_the_First_NamE(String)"
});
formatter.result({
  "duration": 1079088800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Walker",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_in_the_Last_NamE(String)"
});
formatter.result({
  "duration": 1077295400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TATA",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_in_the_Company(String)"
});
formatter.result({
  "duration": 1069851100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "House:04, Road: 08, Dhaka",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_in_the_Address(String)"
});
formatter.result({
  "duration": 1120063200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "House:01, Road: 09, chittagong",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_in_the_Address_line_two(String)"
});
formatter.result({
  "duration": 1133968700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_inthe_city(String)"
});
formatter.result({
  "duration": 1080440400,
  "status": "passed"
});
formatter.match({
  "location": "LcLogin_stepDef.user_clicks_Florida()"
});
formatter.result({
  "duration": 1129423100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10001",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_in_the_city(String)"
});
formatter.result({
  "duration": 1077666400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test001",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_in_the_Additional_Information(String)"
});
formatter.result({
  "duration": 1070189900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01700000000",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_in_the_Home_Phone(String)"
});
formatter.result({
  "duration": 1098681100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01700000001",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_in_the_Mobile_Number(String)"
});
formatter.result({
  "duration": 1084064500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 13
    }
  ],
  "location": "LcLogin_stepDef.user_Enters_in_the_Aaddress(String)"
});
formatter.result({
  "duration": 1072989900,
  "status": "passed"
});
formatter.match({
  "location": "LcLogin_stepDef.user_clicks_register_Button()"
});
formatter.result({
  "duration": 3726669900,
  "status": "passed"
});
});