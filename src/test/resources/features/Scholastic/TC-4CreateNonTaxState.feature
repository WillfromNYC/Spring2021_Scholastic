Feature: Create Account
  @TC4
  Scenario: User create new account but through Non Tax state instead of school
    Given I am on Scholastic QA website homepage
    When I click on bottom scroll create Account link
    #When I click on create Account link


    #And I click on Select Teacher
    #And I click on next button

  #Scenario: User will fill in new account information
    When I click title and click 'Mr.' as title
    And I enter 'John' in first name
    And I enter 'Smith' in last name
    And I enter 'jSmithNonTaxState5@gmail.com' in email
    And I enter 'password123' in password
    And I click on read terms checkbox
    And I click on create next button
#------------------------------------------------------
  #Scenario: User choose state and city to create new account
    When I enter '99518' in zipcode
    And I click on zip code button

    And I enter 'ADAK' in school Type
    And I click original search box
    #And I previously enter 'ADAK' TC3 within school Type non tax and click
    And I click on Autosuggestion school name result
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

    @TC4
    Scenario: User shall check the created information matches the user's inputted data
    Then I verify the class code text is displayed
    When I click my account and profile tab
    Then I verify the stored name matches entered name Mr. John Smith
    Then I verify the stored address matches entered address 118 E INTL AIRPORT RD


    Scenario: User will add items to cart
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