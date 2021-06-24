package StepDefinition.Scholastic;

import Pages.Scholastic.TC10DeleteItems;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC10DeleteItemsSD {

    TC10DeleteItems DI = new TC10DeleteItems();

    @And("I click on Enter Order button")
    public void goClickEnterOrders(){
        DI.clickEnterOrders();    }
    @And("I click the click Student Flyer Order")
    public void goClickStudentFlyerOrder(){
        DI.clickStudentFlyerOrder();
    }

    @And("I enter '(.*)' in the student name box")
    public void goStudentNameType(String sName){
        DI.studentNameType(sName);
    }
    @And("I enter '(.*)' in the item name box")
    public void goItemNumType(String item){
        DI.itemNumType(item);
    }
    @And("I click the click Add Button")
    public void goClickAddButton(){
        DI.clickAddButton();
    }

    @And("I enter '(.*)' in the quantity item box")
    public void goQuantityType(String quantityNum){
        DI.QuantityType(quantityNum);
    }
    //Review order
    @And("I click review cart button")
    public void goClickReviewCart( ){
        DI.clickReviewCart();
    }
    @When("I click delete X button")
    public void goClickXDeleteButton( ){
        DI.clickXDeleteButton();
    }
    @And("I click yes to delete")
    public void goclickYesDelete( ){
        DI.clickYesDelete();
    }








   /* @And("I click the recommendation button")
    public void goClickRecommendButton(){
        DI.clickRecommendButton();
    }
    @And("I click student check box")
    public void goClickCloseListButton(){
        DI.clickCloseListButton();
    }
    @And("I click Close List Button")
    public void goClickStudentCheckBox(){
        DI.clickStudentCheckBox();
    }

    @And("I click Close Quick View")
    public void goClickCloseQuickView(){
        DI.clickCloseQuickView();
    }
    @And("I click MyList Header link")
    public void goClickMyListHeader(){
        DI.clickMyListHeader();
    }
    @And("I click Recommended For Students")
    public void goclickSearchButton(){
        DI.clickSearchButton();
    }
    @And("I verify '(.*)' is in the recommended student list")
    public void goVerifyHarryPGOF(String fullName){
        DI.verifyHarryPGOF(fullName);
    }*/

}
