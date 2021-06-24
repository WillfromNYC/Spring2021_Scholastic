Feature: Create and add items then delete

  Scenario: User create accounts add items then verify there is no tax charged
    Given I am on Scholastic QA website homepage
    When I click on bottom scroll create Account link

  #Scenario: User will fill in new account information
    When I click title and click 'Mr.' as title
    And I enter 'John' in first name
    And I enter 'Smith' in last name
    And I enter 'jdiazTC9Execution1@gmail.com' in email
    And I enter 'Heatwavefan4861' in password
    And I click on read terms checkbox
    And I click on create next button

  #Scenario: User choose zip code and search for the school
    When I enter '10012' in zipcode
    And I click on zip code button
    And I enter 'Scholastic+Book+Club' in school Type
    And I click 1st Scholastic Book Club link
    And I click on School Next Button

  #Scenario: User choose role of your teaching level and student #
    When I click on select role
    And I click on the Teacher Grade
    And I click the 1st Grade as the grade
    And I enter '1' in the number of student in the class
    And I click on the my role next button

    #Scenario: User fill in preferred Reading Level System
    When I click Guided Reading Level on the Preferred reading level system
    And I click yes for first teaching year question
    And I click continue to site

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

