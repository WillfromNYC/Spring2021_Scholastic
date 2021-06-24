package StepDefinition.Scholastic;

import Pages.Scholastic.TC4CreateNonTaxState;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class TC4CreateNonTaxStateSD {

    TC4CreateNonTaxState tc4 = new TC4CreateNonTaxState();

    /*@When("I enter '(.*)' in zipcode")
    public void zipcodeTypeNonTax(String zipcode){
        zipcodeTypeNonTax(zipcode);
    }*/
    /*@And("I click on zip code button non tax")
    public void goClickZipcodeButton(){
        clickZipcodeButton();
    }*/

    @When("I click original search box")
    public void goClickElement(){
        tc4.clickElement();
    }

    //@And("I previously enter '(.+)' TC3 within school Type non tax and click")
    @And("I click on Autosuggestion school name result")
    public void goClickSchoolAutoContain(){
        tc4.clickSchoolAutoContain();
    }

    /*@When("I click on school state and enter New York for state")
    public void goClickState(){
        CreateStateAcctTC2.clickState();
    }*/
    /*@And("I click 1st Scholastic Book Club link")
    public void goClickFirstSBClubLink(){
        CreateAcctPage.clickFirstSBClubAutoSuggest();
    }*/

    //@And("I click on School Next Button non tax")
    public void goClickSchoolNextButton(){
        tc4.clickSchoolNextButton();
    }













}
