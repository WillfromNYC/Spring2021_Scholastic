package StepDefinition.Scholastic;

import Pages.Scholastic.TC11FlyerJumper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC11FlyerJumperSD {

    TC11FlyerJumper FJ = new TC11FlyerJumper();

    @And("I click on Teacher Order")
    public void goClickTeacherOrder(){
        FJ.clickTeacherOrder();    }
    @And("I click the Price Quantity Box")
    public void goClickPriceQtyBox(){
        FJ.clickPriceQtyBox();
    }

    @Then("I verify if Flyer Jumper is displayed")
    public void visibleFlyerJumper(){
        FJ.visibleFlyerJumper();
    }
    @And("I click on X to Close Fly Jumper")
    public void goClickCloseFlyJumper(){
        FJ.clickCloseFlyJumper();
    }
    @Then("I click the 2nd Price Quantity Box")
    public void goClickSecondPriceQtyBox(){
        FJ.clickSecondPriceQtyBox();
    }







}
