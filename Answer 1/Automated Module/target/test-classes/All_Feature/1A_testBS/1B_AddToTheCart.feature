#Author: ashfaq95.af@gmail.com
#Keywords Summary :
Feature: User Add to the cart

Scenario: select dresses and Add to the cart

Given User clicks dresses button
Then user clicks on Add to the cart for dress one
Then user click on continue shopping
Then user clicks on Add to the cart for dress Two
Then User clicks on Proceed to checkout button

And user verify dress title with "Printed Dress"
And user verify dress Price with "$26.00"