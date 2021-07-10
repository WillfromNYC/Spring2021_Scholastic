package StepDefinition.Scholastic;

import Pages.Scholastic.TC9ZeroTaxesNY;
import cucumber.api.java.en.Then;

public class TC9ZeroTaxesNYSD {
    TC9ZeroTaxesNY ZT = new TC9ZeroTaxesNY();

    @Then("I verify Taxes are zero")
    public void verifyTaxes(){
        ZT.verifyTaxes();
    }



}
