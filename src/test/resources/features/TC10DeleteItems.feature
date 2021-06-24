Feature: Create and add items then delete

  Scenario: User create accounts add items then delete
    Given I am on Scholastic QA website homepage
    When I click on bottom scroll create Account link

  #Scenario: User will fill in new account information
    When I click title and click 'Mr.' as title
    And I enter 'John' in first name
    And I enter 'Smith' in last name
    And I enter 'jdiazTC10Cambren15@gmail.com' in email
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

