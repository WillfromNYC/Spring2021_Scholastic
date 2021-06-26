Feature: hotels guest entering

  Scenario: User will go to hotel website checking and enter guest
    Given I am on hotels homepage
    When I close hotels main website popup

    And I click on the guest element
    And I click on plus sign to add adults 2 times to add a total of 4 adults
    And I click on plus sign to add children 2 times

    And I select '2' for the child 1's age
    And I select '<1' for the child 2's age
    And I click on Guest Apply Button
    Then I verify guest total is 6




