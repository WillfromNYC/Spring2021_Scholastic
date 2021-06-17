Feature: login

  Scenario: User shall login into account to later add 3 credit cards and see if system stops at 4
    Given I am on Scholastic QA website homepage
    When I click sign in

    #Ajustment codes: Use when site is down
    #When I scroll down a few clicks down the website
    #When I click on under maintenance Update now button

    #Both shared locators
    And I enter 'jsmithbestT@gmail.com' in the email
    And I click on the login continue button
    And I enter '123qweasd' in the pass login screen

    #Scenario: User shall add 3 credit cards then see if you can add a 4th
    When I enter '300' pixel down the website
    And I click add a card
    And I enter '6011601160116611' in the card #
    And I click 03 in the month
    And I click 2030 in the year
    And I enter '737' in the security code section

    And I enter 'John' in the first Name billing
    And I enter 'Smith' in the last name billing
    And I enter '568 Broadway # 2' in the address billing
    And I click 2028 in the year
    And I enter '10012' in the address billing
    And I click Prince in the city
    And I enter '718-123-4567' in the phone number billing




    #When I click on create Account link
   # And I enter '' in the email
    #When I click on create Account link
   # And I enter 'jsmithbestT@gmail.com' in the email
   # When I click on create Account link
   # And I enter 'jsmithbestT@gmail.com' in the email
   # When I click on create Account link
   # And I enter 'jsmithbestT@gmail.com' in the email
