
@tag
Feature: Telecom Website
  I want to use this template for my feature file

  @tag1
  Scenario: Adding new customer
     Given user in telecom home page
    And user to click add customer button
    When filling the personal details
    And press submit button
    Then user should see the customer id

