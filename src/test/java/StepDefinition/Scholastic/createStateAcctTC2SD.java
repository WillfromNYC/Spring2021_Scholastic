package StepDefinition.Scholastic;

import Pages.Scholastic.CreateAccountPage;
import Pages.Scholastic.CreateStateAcctTC2;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createStateAcctTC2SD {

    CreateStateAcctTC2 CreateStateAcctTC2 = new CreateStateAcctTC2();

   /* @Given("I am on Scholastic QA website homepage")
    //Scenario: User clicks on create an account link
    *//*public void goClickScholasticSite(){
        CreateStateAcctTC2.open();
    }*//*

    @When("I click on create Account link")
    public void goClickCreateAccount(){
        CreateStateAcctTC2.clickCreateAccount();
    }
    @When("I click on bottom scroll create Account link")
    public void goButtomScrolltoClickCreateAcct(){
        CreateStateAcctTC2.buttomScrolltoClickCreateAcct();
    }
*/

    /*@And("I click on Select Teacher")
    public void goClickTeacherSelect(){
        CreateStateAcctTC2.clickTeacherSelect();
    }

    @And("I click on next button")
    public void goClickNextButton(){
        CreateStateAcctTC2.clickNextButton();
    }
*/
    //Filling in new account information
    /*@When("I select '(.*)' as title")
    public void goSelectTitleClick(String title){
        CreateAcctPage.selectTitleClick(title);}*/

    /*@When("I click title and click 'Mr.' as title")
    public void goClickSelectTitleMr (){
        CreateStateAcctTC2.clickSelectTitleMr();
    }


    @And("I enter '(.*)' in first name")
    public void enterFirstNameType(String firstName){
        CreateStateAcctTC2.firstNameType(firstName);
    }
    @And("I enter '(.*)' in last name")
    public void enterLastNameType(String lastName){
        CreateStateAcctTC2.lastNameType(lastName);
    }
    @And("I enter '(.*)' in email")
    public void enterEmailType(String email){
        CreateStateAcctTC2.emailType(email);
    }
    @And("I enter '(.*)' in password")
    public void enterPassType(String password){
        CreateStateAcctTC2.passType(password);
    }
    @And("I click on read terms checkbox")
    public void goClickReadTerms(){
        CreateStateAcctTC2.clickReadTerms();
    }
    @And("I click on create next button")
    public void goClickCreateNext(){
        CreateStateAcctTC2.clickCreateNext();
    }*/

//------------------------------------------------------
    //Scenario: User choose state and city to create new account

    @When("I click on school state and click New York for state")
    public void goClickState(){
        CreateStateAcctTC2.clickState();
    }
    @And("I click on city and click New York for city")
    public void clickCity(){
        CreateStateAcctTC2.clickCity();
    }

    @And("I click on stateCity School search Button")
    public void clickSearchStateButton(){
        CreateStateAcctTC2.clickSearchStateButton();
    }


    /*@And("I click 1st Scholastic Book Club link")
    public void goClickFirstSBClubLink(){
        CreateStateAcctTC2.clickFirstSBClubAutoSuggest();
    }


    @And("I click on School Next Button")
    public void goClickSchoolNextButton(){
        CreateStateAcctTC2.clickSchoolNextButton();
    }



    //Scenario: User choose role of your teaching level and student #
    @When("I click on select role")
    public void goClickSelectRole(){
        CreateStateAcctTC2.clickSelectRole();
    }
    @And("I click on the Teacher Grade")
    public void goClickTeacherGrade(){
        CreateStateAcctTC2.clickTeacherGrade();
    }

    //need to edit
    @And("I click the 1st Grade as the grade")
    public void goClickGradeAutoSuggestion(){
        CreateStateAcctTC2.clickAutoSuggestion();
    }


    @And("I enter '(.*)' in the number of student in the class")
    public void enterStudentNumType(String studentNum){
        CreateStateAcctTC2.studentNumType(studentNum);
    }
    @And("I click on the my role next button")
    public void clickMyRoleNextButton() {
        CreateStateAcctTC2.myRoleNextButton();
    }

    //Scenario:User fill in preferred Reading Level System
    @When("I click Guided Reading Level on the Preferred reading level system")
    public void goSelectGuidedReadingLevel(){
        CreateStateAcctTC2.selectGuidedReadingLevel();
    }
    @And("I click yes for first teaching year question")
    public void goClickFirstYearTeaching(){
        CreateStateAcctTC2.clickFirstYearTeaching();
    }
    @And("I click continue to site")
    public void goClickContinueSiteButton(){
        CreateStateAcctTC2.clickContinueSiteButton();
    }

    @Then("I verify the class code text is displayed")
    public void goVerifyTextClassCode(){
        CreateStateAcctTC2.verifyTextClassCode();
    }

    @When("I click my account and profile tab")
    public void goClickMyAccount(){
        CreateStateAcctTC2.clickMyAccount();
    }
    @Then("I verify the stored name matches entered name (.*)")
    public void verifyNameStored(String fullName) {
        CreateStateAcctTC2.nameStored(fullName);
    }
    @Then("I verify the stored address matches entered address (.*)")
    public void verifyAddressStored(String address){
        CreateStateAcctTC2.addressStored(address);
    }
*/
    /*
    public void (){
        CreateAcctPage.();
    }
    public void (){
        CreateAcctPage.();
    }
    public void (){
        CreateAcctPage.();
    }
    public void (){
        CreateAcctPage.();
    }*/




}
