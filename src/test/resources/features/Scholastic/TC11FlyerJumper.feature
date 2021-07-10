Feature: Create account, go to teacher order and see if the flyer jumper display on 2nd price quantity box


Scenario: go to teacher order and see if the flyer jumper display on 2nd price quantity box
  Given I am on Scholastic QA website homepage
  When I click sign in

  And I enter 'jdiazTC11Execution@gmail.com' in the email
  And I click on the login continue button
  And I enter 'Heatwavefan4861' in the pass login screen
  And I click on password sign in button
  When I will close advertisement popup if it appears

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

