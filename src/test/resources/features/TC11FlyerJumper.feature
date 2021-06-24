Feature: Create account, go to teacher order and see if the flyer jumper display on 2nd price quantity box


Scenario: go to teacher order and see if the flyer jumper display on 2nd price quantity box
Given I am on Scholastic QA website homepage
When I click on bottom scroll create Account link

  #Scenario: User will fill in new account information
When I click title and click 'Mr.' as title
And I enter 'John' in first name
And I enter 'Smith' in last name
And I enter 'jdiazTC11Execution@gmail.com' in email
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
    #Scenario: User will click on 2 Price Quantity Box
When I enter '400' pixel down the website
When I click on Enter Order button
And I click on Teacher Order
And I click the Price Quantity Box
Then I verify if Flyer Jumper is displayed
And I click on X to Close Fly Jumper


And I click the 2nd Price Quantity Box
Then I verify if Flyer Jumper is displayed

