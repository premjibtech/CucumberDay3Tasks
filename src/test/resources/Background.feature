Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given User in teleecom Homepage
    And user click on Addd Customer button

  Scenario: OneDimMap
    When user need to filll all personal details
      | Fname   | prem           |
      | Lname   | K              |
      | Email   | prem@gmail.com |
      | Address | Perungudi      |
      | Mobile  |      098368996 |
    And user neeed to click on submit button
    Then user should seee the customer ID is generated

  Scenario: TwoDimMap
    When user to filll all personal details
      | Fname | Lname | Email          | Address  | Mobile     |
      | prem  | kumar | prem@gmail.com | chennai  |  866222931 |
      | ajith | Kumar | aji@gmail.com  | banglore | 9956865948 |
      | rajan | singh | raj@gmail.com  | delhi    |  858585896 |
    And user neeed to click on submit button
    Then user should seee the customer ID is generated
