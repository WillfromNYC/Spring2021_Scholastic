Feature: Create and add recommendation books for students

  Scenario: User create accounts search Harry then add recommendation list to studuent list
    Given I am on Scholastic QA website homepage
    #When I click on create Account link
    When I click on bottom scroll create Account link

    #And I click on Select Teacher
    #And I click on next button

  #Scenario: User will fill in new account information
    When I click title and click 'Mr.' as title
    And I enter 'John' in first name
    And I enter 'Smith' in last name
    And I enter 'jdiazTC3Cambrena2@gmail.com' in email
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



    #Scenario: User search for Harry and adds recommendation
    When I enter 'Harry' in the search bar
    And I click the search button
    And I click Harry-Potter-and-the-prisoner-of-azkaban
    And I click the recommendation button
    And I click student check box
    And I click Close List Button
    And I click Close Quick View
    And I click MyList Header link
    And I click Recommended For Students
    Then I verify 'Harry Potter and the Prisoner of Azkaban' is in the recommended student list


