package StepDefinition.Scholastic;

import DriverWrapper.Web;
import Pages.Scholastic.CreateAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateAcctSD {
    CreateAccountPage  CreateAcctPage = new CreateAccountPage();

    @Given("I am on Scholastic QA website homepage")
    //Scenario: User clicks on create an account link
    public void goClickScholasticSite(){
        CreateAcctPage.openScholasticSite();
    }
    @When("I click on create Account link")
    public void goClickCreateAccount(){
        CreateAcctPage.clickCreateAccount();
    }

    @And("I click on Select Teacher")
    public void goClickTeacherSelect(){
        CreateAcctPage.clickTeacherSelect();
    }

    @And("I click on next button")
    public void goClickNextButton(){
        CreateAcctPage.clickNextButton();
    }

    //Filling in new account information
    @When("I select '(.*)' as title")
    public void goSelectTitleClick(String title){
        CreateAcctPage.selectTitleClick(title);
    }
    @And("I enter '(.*)' in first name")
    public void enterFirstNameType(String firstName){
        CreateAcctPage.firstNameType(firstName);
    }
    @And("I enter '(.*)' in last name")
    public void enterLastNameType(String lastName){
        CreateAcctPage.lastNameType(lastName);
    }
    @And("I enter '(.*)' in email")
    public void enterEmailType(String email){
        CreateAcctPage.emailType(email);
    }
    @And("I enter '(.*)' in password")
    public void enterPassType(String password){
        CreateAcctPage.passType(password);
    }
    @And("I click on read terms checkbox")
    public void goClickReadTerms(){
        CreateAcctPage.clickReadTerms();
    }
    @And("I click on create next button")
    public void goClickCreateNext(){
        CreateAcctPage.clickCreateNext();
    }


    //Scenario: User choose zip code and search for the school

    @When("I enter '(.*)' in zipcode")
    public void enterZipcodeType(String zipcode){
        CreateAcctPage.zipcodeType(zipcode);
    }
    @And("I click on zip code button")
    public void goClickZipcodeButton(){
        CreateAcctPage.clickZipcodeButton();
    }
    @And("I enter '(.*)' in school Type")
    public void enterSchoolNameAutoSuggestion(String schoolLookup){
        CreateAcctPage.schoolNameAutoSuggestion(schoolLookup);
    }
    @And("I click on School Next Button")
    public void goClickSchoolNextButton(){
        CreateAcctPage.clickSchoolNextButton();
    }



    //Scenario: User choose role of your teaching level and student #
    @When("I click on select role")
    public void goClickSelectRole(){
        CreateAcctPage.clickSelectRole();
    }
    @And("I click on click the Teacher Grade")
    public void goClickTeacherGrade(){
        CreateAcctPage.clickTeacherGrade();
    }
    @And("I select '(.*)' as the grade")
    public void goSelectTeacherGrade(){
        CreateAcctPage.selectTeacherGrade();
    }
    /*@And("I enter '(.*)' in the number of student in the class")
    public void (){
        CreateAcctPage.();
    }
    @And("I click on the my role next button b")
    public void (){
        CreateAcctPage.();
    }

    //Scenario:User fill in preferred Reading Level System
    public void (){
        CreateAcctPage.();
    }public void (){
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
    }
    public void (){
        CreateAcctPage.();
    }public void (){
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
    }
    public void (){
        CreateAcctPage.();
    }*/




}
