
Feature: Create Account

  Scenario: User create new account but through Non Tax state instead of school
    When I click sign in

    And I enter 'jSmithNonTaxState5@gmail.com' in the email
    And I click on the login continue button
    And I enter 'password123' in the pass login screen
    And I click on password sign in button
    When I will close advertisement popup if it appears


    #Scenario: User will add items to cart
    When I enter '100' pixel down the website
    When I click on Enter Order button
    And I click the click Student Flyer Order
    And I enter 'Harry' in the student name box
    And I enter '1G8  ' in the item name box
    And I click the click Add Button

    And I enter '11G8' in the item name box
    And I click the click Add Button

    And I enter '3S8' in the item name box
    And I click the click Add Button

    And I enter '4S8' in the item name box
    And I click the click Add Button

    And I click review cart button
    #Scenario: verify there is no sales taxes charged
    Then I verify Taxes are zero