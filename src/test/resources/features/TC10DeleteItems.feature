Feature: Create and add items then delete

  Scenario: User create accounts add items then delete
    Given I am on Scholastic QA website homepage
    When I click sign in

    And I enter 'jdiazTC10Cambren16@gmail.com' in the email
    And I click on the login continue button
    And I enter 'Heatwavefan4861' in the pass login screen
    And I click on password sign in button
    When I will close advertisement popup if it appears

    #####################################################################
    #Scenario: User will add items to cart
    When I enter '100' pixel down the website
    When I click on Enter Order button
    And I click the click Student Flyer Order
    And I enter 'Harry' in the student name box
    And I enter '2S8 ' in the item name box
    And I click the click Add Button
    And I enter '5' in the quantity item box

    And I enter '11S8' in the item name box
    And I click the click Add Button
    And I enter '1' in the quantity item box

    When I enter 'John' in the student name box
    And I enter '2G8' in the item name box
    And I click the click Add Button
    And I enter '2' in the quantity item box

    When I enter 'Michael' in the student name box
    And I enter '4G8 ' in the item name box
    And I click the click Add Button
    And I enter '4' in the quantity item box
    And I enter '1G8 ' in the item name box
    And I click the click Add Button
    And I enter '10' in the quantity item box
    And I click review cart button

    When I click delete X button
    And I click yes to delete

    #And I click Harry-Potter-and-the-prisoner-of-azkaban
    #And I click the recommendation button
    #And I click student check box
    #And I click Close List Button
    #And I click Close Quick View
    #And I click MyList Header link
    #And I click Recommended For Students
    #Then I verify 'Harry Potter and the Prisoner of Azkaban' is in the recommended student list

