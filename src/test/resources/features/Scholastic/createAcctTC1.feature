Feature: Create Account

  Scenario: User clicks on create an account link
    Given I am on Scholastic QA website homepage
    #When I click on create Account link
    When I click on bottom scroll create Account link

    #And I click on Select Teacher
    #And I click on next button

  #Scenario: User will fill in new account information
    When I click title and click 'Mr.' as title
    And I enter 'John' in first name
    And I enter 'Smith' in last name
    And I enter 'jdiazCambren2@gmail.com' in email
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

    #Scenario: User shall check the created information matches the user's inputted data
    Then I verify the class code text is displayed
    When I click my account and profile tab
    Then I verify the stored name matches entered name Mr. John Smith
    Then I verify the stored address matches entered address 568 Broadway # 2