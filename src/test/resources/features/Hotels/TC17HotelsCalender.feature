Feature: hotels checking in calendar feature

  Scenario: User will go to hotel website checking and see if they can click the calendar back button
    Given I am on hotels homepage
    When I close hotels main website popup

    And I click calendar CheckIn link
    And I get the day for yesterday date
    Then I click the element for yesterday's date which should fail
    Then I click the back button for the previous month which should fail

