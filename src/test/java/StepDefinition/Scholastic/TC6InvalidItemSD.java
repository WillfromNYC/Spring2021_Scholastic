package StepDefinition.Scholastic;

import Pages.Scholastic.TC6InvalidItem;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class TC6InvalidItemSD {
    TC6InvalidItem II = new TC6InvalidItem();


    @Then("I verify that the error message: Please enter valid item number pops up")
    public void visibleFlyerJumper(){
        II.visibleFlyerJumper();
    }

}
