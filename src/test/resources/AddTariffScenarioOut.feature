Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: To check add tariff page
    Given user in telecom homepage
    And need to click add Tariff button
    When need to fill all the details"<monRen>","<fLocalMins>","<fInterins>","<fSmsPack>","<lCharg>","<InterCharg>","<smsCharg>"
    And need to click submit Button
    Then user should see the successfully compeletion Page

    Examples: 
      | monRen | fLocalMins | fInterins | fSmsPack | lCharg | InterCharg | smsCharg |
      |    400 |        300 |       200 |      300 |     12 |          5 |        6 |
      |    600 |        200 |       100 |      200 |     15 |          1 |        7 |
      