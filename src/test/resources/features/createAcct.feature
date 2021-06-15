Feature: Create Account

  Scenario: User clicks on create an account link
    Given I am on Scholastic QA website homepage
    When I click on create Account link
    And I click on Select Teacher
    And I click on next button

  Scenario: User will fill in new account information
    When I select 'Mr.' as title
    And I enter 'John' in first name
    And I enter 'Smith' in last name
    And I enter 'jSmithBestTeacher@gmail.com' in email
    And I enter 'password123' in password
    And I click on read terms checkbox
    And I click on create next button



  Scenario: User choose zip code and search for the school
    When I enter '10012' in zipcode
    And I click on zip code button
    And I enter 'Scholastic+Book+Club' in school Type
    And I click on School Next Button

  Scenario: User choose role of your teaching level and student #
    When I click on select role
    And I click on click the Teacher Grade
    And I select 'Mr.' as the grade
    And I enter '1' in the number of student in the class
    And I click on the my role next button b

    When I enter '10012' in zipcode
    And I enter 'Smith' in last name
    And I enter 'jSmithBestTeacher@gmail.com' in email
    And I enter 'password123' in password
    And I click on read terms checkbox
    And I click on create next button

  Scenario:User fill in preferred Reading Level System
    When I enter '10012' in zipcode
    And I enter 'Smith' in last name
    And I enter 'jSmithBestTeacher@gmail.com' in email
    And I enter 'password123' in password
    And I click on read terms checkbox
    And I click on create next button

  Scenario:
    When I enter '10012' in zipcode
    And I enter 'Smith' in last name
    And I enter 'jSmithBestTeacher@gmail.com' in email
    And I enter 'password123' in password
    And I click on read terms checkbox
    And I click on create next button



  Scenario:

  Scenario:
  Scenario:
  Scenario:
  Scenario:
  Scenario: