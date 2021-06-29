Feature: Create account, go to teacher order and see enter invalid item number

  Scenario: go to teacher order and see if the flyer jumper display on 2nd price quantity box
    Given I am on Scholastic QA website homepage
    When I click sign in

    And I enter 'jdiazTC6Execution@gmail.com' in the email
    And I click on the login continue button
    And I enter 'Heatwavefan4861' in the pass login screen
    And I click on password sign in button
    When I will close advertisement popup if it appears


    #####################################################################
    #Scenario: User will try to add invalid item
    When I click on Enter Order button
    And I click the click Student Flyer Order
    And I enter 'Harry' in the student name box
    And I enter '111' in the item name box
    And I click the click Add Button
    Then I verify that the error message: Please enter valid item number pops up