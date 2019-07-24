
Feature: Title of your feature
  I want to use this template for my feature file

 Scenario: check Add Tariff functionality
    Given click add tariff butTon
    When fill all the detaills
   | 600 | 80 | 55 | 100 | 1 | 9 | 1 |
    And click submit buttton
    Then user should see the succcessfully compeletion page

