package StepDefinition.Hotels;

import Pages.Hotels.TC17HotelsCalender;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC17HotelsCalenderSD {

    TC17HotelsCalender cal = new TC17HotelsCalender();

    @Given("^I am on hotels homepage$")
    public void goOpenHotels(){
        cal.openHotels();
    }

    @When("I close hotels main website popup")
    public void clickClosePopup(){
        cal.clickClosePopup();
    }

    @And("I click calendar CheckIn link")
    public void goClickCheckIn() {
        cal.clickCheckIn(); }

    @And("I get the day for yesterday date")
    public void goCheckDaysBefore(){
        cal.checkDaysBefore();
    }

    @Then("I click the element for yesterday's date which should fail")
    public void verifyYesterdayDate(){
        cal.yesterdayDate();
    }

    @Then("I click the back button for the previous month which should fail")
    public void verifyClickPreviousMonthCal(){
        cal.clickPreviousMonthCal();
    }




    //Pasted material

   /* @Then("I verify the back button is disabled which should not be a interactable object")
    public void verifyYesterdayDate(){
        cal.yesterdayDate();
    }


    @And("I click on password sign in button")
    public void goClickPassSignInButton(){
        cal.clickPassSignInButton();
    }

    //#Need to close advertisement, click my account and profile
    @When("I will close advertisement popup if it appears")
    public void clickCloseNotif(){
        cal.clickCloseNotif();
    }
*/
}
