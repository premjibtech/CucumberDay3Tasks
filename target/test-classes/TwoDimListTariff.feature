Feature: Add tariff page in Two Dimensional list
  I want to use this template for my feature file

  Scenario: To check add tariff page
    Given user in telecom homeepage
    And need to click add Tarifff button
    When need to fill all the deetails
      | 400 | 300 | 200 | 300 | 12 | 5 | 6 |
      | 600 | 200 | 100 | 200 | 15 | 1 | 7 |
      | 500 | 100 | 150 | 300 |  8 | 5 | 6 |
      | 300 | 200 | 100 | 150 | 15 | 1 | 7 |
    And need to clickk submit Button
    Then user should seee the successfully compeletion Page
