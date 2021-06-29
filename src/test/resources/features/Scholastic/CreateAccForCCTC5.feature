Feature: Create Account and try to add 4 CC

  Scenario: User create accounts to later add 3 credit card
    Given I am on Scholastic QA website homepage
    #When I click on create Account link
    When I click on bottom scroll create Account link

    #And I click on Select Teacher
    #And I click on next button

  #Scenario: User will fill in new account information
    When I click title and click 'Mr.' as title
    And I enter 'John' in first name
    And I enter 'Smith' in last name
    And I enter 'jdiazCambrena12@gmail.com' in email
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

    #Scenario: will then go to account to create new credit card info and save it
    When I click my account and profile tab
    When I enter '300' pixel down the website
    And I click add a card
    And I enter '6011601160116611' in the card #
    And I click 03 in the month
    And I click 2030 in the year
    And I enter '737' in the security code section

    And I enter 'John' in the first Name billing
    And I enter 'Smith' in the last name billing
    And I enter '568 Broadway # 2' in the address billing

    And I enter '10012' in the zip billing
    #And I click Prince in the city
    And I enter '718-123-4567' in the phone number billing
    And I click save button

    #Scenario: User will add 2nd credit card
    When I enter '300' pixel down the website
    And I click add a card
    And I enter '4988438843884305' in the card #
    And I click 03 in the month
    And I click 2030 in the year
    And I enter '737' in the security code section

    And I enter 'John' in the first Name billing
    And I enter 'Smith' in the last name billing
    And I enter '568 Broadway # 2' in the address billing

    And I enter '10012' in the zip billing
    And I enter '718-123-4567' in the phone number billing
    And I click save button

    #Scenario: User will add 3rd credit card

    When I enter '300' pixel down the website
    And I click add a card
    And I enter '4000620000000007' in the card #
    And I click 03 in the month
    And I click 2030 in the year
    And I enter '737' in the security code section

    And I enter 'John' in the first Name billing
    And I enter 'Smith' in the last name billing
    And I enter '568 Broadway # 2' in the address billing

    And I enter '10012' in the zip billing
    And I enter '718-123-4567' in the phone number billing
    And I click save button

    #Scenario: User will add 4rd credit card
    When I enter '300' pixel down the website
    And I click add a card
    And I enter '4000620000000006' in the card #
    And I click 03 in the month
    And I click 2030 in the year
    And I enter '737' in the security code section

    And I enter 'John' in the first Name billing
    And I enter 'Smith' in the last name billing
    And I enter '568 Broadway # 2' in the address billing

    And I enter '10012' in the zip billing
    And I enter '718-123-4567' in the phone number billing
    And I click save button

