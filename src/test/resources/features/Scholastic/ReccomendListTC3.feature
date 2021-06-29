Feature: Create and add recommendation books for students

  Scenario: User create accounts search Harry then add recommendation list to studuent list
    Given I am on Scholastic QA website homepage
    When I click sign in

    And I enter 'jSmithNonTaxState2@gmail.com' in the email
    And I click on the login continue button
    And I enter 'password123' in the pass login screen
    And I click on password sign in button
    When I will close advertisement popup if it appears

    #Scenario: User search for Harry and adds recommendation
    When I enter 'Harry' in the search bar
    And I click the search button
    And I click Harry-Potter-and-the-prisoner-of-azkaban
    And I click the recommendation button
    And I click student check box
    #And I click Close List Button
    And I click Close Quick View
    And I click MyList Header link
    And I click Recommended For Students
    Then I verify 'Harry Potter and the Prisoner of Azkaban' is in the recommended student list


