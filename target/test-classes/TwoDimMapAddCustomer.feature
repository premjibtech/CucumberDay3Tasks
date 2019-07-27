Feature: Add cust feature with two dimensional map
  I want to use this template for my feature file

  Scenario: To check add customer functionality
    Given User to telecom Homepage
    And user to click on Add Customer button
    When user to fill all personal details
      | Fname | Lname | Email          | Address  | Mobile    |
      | prem  | kumar | prem@gmail.com | chennai  | 866222931 |
      | ajith | Kumar | aji@gmail.com  | banglore |  56865948 |
      | rajan | singh | raj@gmail.com  | delhi    | 858585896 |
    And user to click on submit button
    Then user to see the customer ID is generated
