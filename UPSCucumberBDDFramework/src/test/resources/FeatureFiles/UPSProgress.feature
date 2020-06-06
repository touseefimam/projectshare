@ups @FunctionalTest
Feature: Look for shipment progress and proof of delivery

Description: As a user I want to get shipment progress and proof of delivery

Scenario Outline: Positive

Given User open browser

When The user navigate to the UPS home page "https://www.ups.com/us/en/Home.page"

Then User track item with valid tracking number "<Trackingnumber>"

And Submit search

Then User click on shipment progress 

And User click on Detailed View tab

Then User click on proof of delivery to verify then exit out 

Then Validate logout page and user close the browser

Examples:

|Userid      |Password     |Trackingnumber    |
|touseefimam |Texas29121983|1ZW494600328764231|