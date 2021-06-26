package StepDefinition.Hotels;

import Pages.Hotels.TC18Guest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC18GuestSD {

    TC18Guest guest = new TC18Guest();

    @And("I click on the guest element")
    public void goClickGuests(){
        guest.clickGuests();
    }
    @And("I click on plus sign to add adults 2 times to add a total of 4 adults")
    public void goClickAdultPlusButton(){
        guest.clickAdultPlusButton();
    }
    @And("I click on plus sign to add children 2 times")
    public void goClickChildrenPlusButton(){
        guest.clickChildrenPlusButton();
    }
    @And("I select '(.*)' for the child 1's age")
    public void enterDropdownChild1Age(String age){
        guest.dropdownChild1Age(age);
    }
    @And("I select '(.*)' for the child 2's age")
    public void enterDropdownChild2Age(String age){
        guest.dropdownChild2Age(age);    }
    @And("I click on Guest Apply Button")
    public void goClickGuestApplyButton(){
        guest.clickGuestApplyButton();
    }

    @Then("I verify guest total is 6")
    public void goVerifyGuestTotal(){
        guest.verifyGuestTotal();
    }

}
