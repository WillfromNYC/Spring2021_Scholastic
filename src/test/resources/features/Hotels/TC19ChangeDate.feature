Feature: hotels bora change date

  Scenario: User will go to hotel website enter bora, select dates, then see if can change date
    Given I am on hotels homepage
    When I close hotels main website popup
    And I click on the type search box on hotel website
    And I enter 'bora' on the search location box
    And I select ' Bora, French Polynesia' on the search location box
    And I click check In to change the date
    And I click next month button 4 times to get to October
    And I click Oct 10
    And I click Oct 31
    And I click on the apply button for the selected calendar dates
    And I click on search button for the selected information

    When I enter '1000' pixel down the Hotel website
    And I enter '1000' pixel down the Hotel website
    And I enter '1000' pixel down the Hotel website
    And I enter '1000' pixel down the Hotel website
    And I enter '1000' pixel down the Hotel website
    And I enter '1000' pixel down the Hotel website
    And I enter '1000' pixel down the Hotel website


    And I enter '900' pixel up the website

    Then I verify the change date button is present



