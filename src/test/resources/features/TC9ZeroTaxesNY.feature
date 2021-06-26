Feature: Create and add items then delete
  @TC9
  Scenario: User create accounts add items then verify there is no tax charged
    Given I am on Scholastic QA website homepage
    When I click sign in

    And I enter 'jdiazTC9Execution1@gmail.com' in the email
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
    And I enter '1G8  ' in the item name box
    And I click the click Add Button
    And I enter '5' in the quantity item box

    And I enter '4G8 ' in the item name box
    And I click the click Add Button
    And I enter '1' in the quantity item box

    When I enter 'John' in the student name box
    And I enter '3S8' in the item name box
    And I click the click Add Button
    And I enter '2' in the quantity item box

    When I enter 'Michael' in the student name box
    And I enter '11S8' in the item name box
    And I click the click Add Button
    And I enter '4' in the quantity item box
    And I enter '2G8' in the item name box
    And I click the click Add Button
    And I enter '10' in the quantity item box
    And I click review cart button
    #Scenario: verify there is no sales taxes charged
    Then I verify Taxes are zero

