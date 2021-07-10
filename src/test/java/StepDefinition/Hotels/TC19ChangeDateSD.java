package StepDefinition.Hotels;

import Pages.Hotels.TC19ChangeDate;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class TC19ChangeDateSD {

    TC19ChangeDate CD = new TC19ChangeDate();

    @And("I click on the type search box on hotel website")
    public void goClickSearchBox(){
        CD.clickSearchBox(); }

    @And("I enter '(.*)' on the search location box")
    public void goTypeSearch(String location){
        CD.typeSearch(location);
    }
    @And("I select '(.*)' on the search location box")
    public void autosuggestBora(String location){
        CD.autosuggestBora(location);
    }

    @And("I click check In to change the date")
    public void goClickCheckIn(){
        CD.clickCheckIn();    }


    @And("I click next month button 4 times to get to October")
    public void goClickCalNextButton() {
        CD.clickCalNextButton();    }

    @And("I click Oct 10")
    public void goClickOct10Button(){
        CD.clickOct10Button();    }
    @And("I click Oct 31")
    public void goClickOct31Button(){
        CD.clickOct31Button();    }
    @And("I click on the apply button for the selected calendar dates")
    public void goClickApplyButton(){
        CD.clickApplyButton();    }
    @And("I click on search button for the selected information")
    public void goClickSearchButton(){
        CD.clickSearchButton();    }

    @And("I enter '(.*)' pixel down the Hotel website")
    public void goScrollDOwn(int num){
        CD.scrollDown(num);
    }

    @And("I enter '(.*)' pixel up the website")
    public void goScrollUp(int num){
        CD.scrollUp(num);
    }

    @And("I verify the change date button is present")
    public void goVerifyChangeDatesButton(){
        CD.verifyChangeDatesButton();    }



    /*




    @And("I click on plus sign to add children 2 times")
    public void goClickChildrenPlusButton(){
        CD.clickChildrenPlusButton();
    }
    @And("I select '(.*)' for the child 1's age")
    public void enterDropdownChild1Age(String age){
        CD.dropdownChild1Age(age);
    }
    @And("I select '(.*)' for the child 2's age")
    public void enterDropdownChild2Age(String age){
        CD.dropdownChild2Age(age);    }
    @And("I click on Guest Apply Button")
    public void goClickGuestApplyButton(){
        CD.clickGuestApplyButton();
    }

    @Then("I verify guest total is 6")
    public void goVerifyGuestTotal(){
        CD.verifyGuestTotal();
    }
*/
}
