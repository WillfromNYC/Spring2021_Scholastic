package StepDefinition.Scholastic;

import Pages.Scholastic.LoginCCTc5;
import Pages.Scholastic.ReccomendListTC3;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class ReccomendListTC3SD {

    ReccomendListTC3 RL = new ReccomendListTC3();
    @When("I enter '(.*)' in the search bar")
    public void goSearchBookType(String bookInfo){
        RL.searchBookType(bookInfo);
    }

    @And("I click the search button")
    public void goClickSearchButton(){
        RL.clickSearchButton();
    }
    @And("I click Harry-Potter-and-the-prisoner-of-azkaban")
    public void goClickHarryPotterGoFQuickView(){
        RL.clickHarryPotterGoFQuickView();
    }
    @And("I click the recommendation button")
    public void goClickRecommendButton(){
        RL.clickRecommendButton();
    }
    @And("I click student check box")
    public void goClickCloseListButton(){
        RL.clickCloseListButton();
    }
    @And("I click Close List Button")
    public void goClickStudentCheckBox(){
        RL.clickStudentCheckBox();
    }

    @And("I click Close Quick View")
    public void goClickCloseQuickView(){
        RL.clickCloseQuickView();
    }
    @And("I click MyList Header link")
    public void goClickMyListHeader(){
        RL.clickMyListHeader();
    }
    @And("I click Recommended For Students")
    public void goclickSearchButton(){
        RL.clickSearchButton();
    }
    @And("I verify '(.*)' is in the recommended student list")
    public void goVerifyHarryPGOF(String fullName){
        RL.verifyHarryPGOF(fullName);
    }









}
