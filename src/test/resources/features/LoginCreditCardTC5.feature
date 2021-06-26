Feature: login

  Scenario: User shall login into account to later add 3 credit cards and see if system stops at 4
    Given I am on Scholastic QA website homepage
    When I click sign in

    #Ajustment codes: Use when site is down
    #When I scroll down a few clicks down the website
    #When I c lick on under maintenance Update now button


    #And I enter 'jdiazCambren2@gmail.com' in the email
    And I enter 'jSmithNonTaxState2@gmail.com' in the email
    #started at jSmithNonTaxState4

    And I click on the login continue button
    And I enter 'password123' in the pass login screen
    And I click on password sign in button

    #Need to close advertisement, click my account and profile
    When I will close advertisement popup if it appears
    When I click my account and profile tab


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
    And I enter '10012' in the zip billing
    And I enter '718-123-4567' in the phone number billing
    And I click save CC button

    #CC #2
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
    And I click save CC button

    #CC #3
    When I enter '300' pixel down the website
    And I click add a card
    And I enter '4000060000000006' in the card #
    And I click 03 in the month
    And I click 2030 in the year
    And I enter '737' in the security code section
    And I enter 'John' in the first Name billing
    And I enter 'Smith' in the last name billing
    And I enter '568 Broadway # 2' in the address billing
    And I enter '10012' in the zip billing
    And I enter '718-123-4567' in the phone number billing
    And I click save CC button

  #CC #4
    When I enter '300' pixel down the website
    And I click add a CC for the 4th time
    Then I verify credit Card Flyer Jumper appears to warn 3 credit card is the limit