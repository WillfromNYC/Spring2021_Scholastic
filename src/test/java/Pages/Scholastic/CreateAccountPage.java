package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateAccountPage extends Commands {
    Web web = new Web();

    public void openScholasticSite() {web.openUrl("https://clubs3qa1.scholastic.com/home");}

    //By locators
    By createAccount = By.xpath("//div[@id='navLinksOnly']/descendant::a[@class='create-account-trigger' and contains(text(),'Create an Account')]");
    ////a[@class='create-account-trigger' and contains(text(),'Create an Account')]/ancestor::div[@id='navLinksOnly']
    ////li[@class='mylists']/a[contains(text(),'Create an Account')]
    //has weird link
    ////ancestor::div[@class='hide-desktop mobile_nav_menu']
    //a[@href='https://clubs3qa1.scholastic.com/on/demandware.store/Sites-rco-us-Site/default/Parent-MyScholasticLoginModal']/following::a[@class='create-account-trigger' and contains(text(),'Create an Account')]

    By teacherSelect = By.xpath("//label[@for='acccountTeacther']");
    By nextButton = By.xpath("//a[@id='linkChooseAcount']");

    //Scenario: User creates new account
    By selectTitle = By.xpath("//div[@class='selected-option input-select profile-title required']");
    By selectMr = By.xpath("//span[contains(text(),'Mr.')]");
    By fNameType = By.xpath("//input[@id='dwfrm_profile_customer_firstname']");
    By lNameType = By.xpath("//input[@id='dwfrm_profile_customer_lastname']");
    By emailType = By.xpath("//input[@id='dwfrm_profile_customer_email']");
    By passType = By.xpath("//input[@id='dwfrm_profile_login_password']");
    By clickTerms = By.xpath("//input[@id='dwfrm_registration_termsofuseteacher']");
    By createNextButton = By.xpath("//button[@name='dwfrm_profile_confirm']");

    //Scenario: User choose zip code and search for the school
    By zipcodeType = By.xpath("//input[@id='dwfrm_myschool_schoolzip']");
    By zipSearchButton = By.xpath("//button[@name='dwfrm_myschool_search']");

    //Scenario: User shall search by school (with possible locator issues)
    By schoolType = By.xpath("//input[@id='dwfrm_searchschool_schoolvalue']");
    By select568Broadway2 = By.xpath("//span[@id='ui-id-10358']");
    By schoolNextButton = By.xpath("//button[@class='next-button button-continue school-search']");

    //Scenario: User choose role of your teaching level and student #
    By clickSelectRole = By.xpath("//div[@class='selected-option input-select primaryrole required']");
    By clickRoleTeacher = By.xpath("//span[contains(text(),'Teacher (by Grade)')]");
    By gradeAutoSuggestion1stG = By.xpath("//span[contains(text(),'1st Grade')]");
    By studentNumType = By.xpath("//input[@id='dwfrm_myrole_students']");
    By myRoleNextButton = By.xpath("//button[@class='next-button button-continue']");

    //Scenario: User choose preferred Reading Level System
    //By readingLevelClick = By.xpath("//div[@class='selected-option input-select required']");
    By selectGuidedReadingLevel = By.xpath("//div[@class='selected-option input-select required']");
    By clickFirstYearTeaching = By.xpath("//span[contains(text(),'Yes')]");
    By clickContinueSiteButton = By.xpath("//button[@class='button-continue']");


    /*By clickTerms = By.xpath("");
    By clickTerms = By.xpath("");
    By clickTerms = By.xpath("");
    By clickTerms = By.xpath("");
    By clickTerms = By.xpath("");
    By clickTerms = By.xpath("");
    By clickTerms = By.xpath("");
    By clickTerms = By.xpath("");
    By clickTerms = By.xpath("");*/


    //Scenario: User clicks on create an account link
    public void clickCreateAccount() {
        clickThis(createAccount);
    }

    public void clickTeacherSelect(){
        clickThis(teacherSelect);
    }

    public void clickNextButton(){
        clickThis(nextButton);
    }


    //Scenario: User will fill in new account information
    public void selectTitleClick(String title){
        selectFromDropdown(selectTitle,title);
    }

    public void firstNameType(String firstName){
        type(selectMr,firstName);
    }
    public void lastNameType(String lastName){
        type(fNameType,lastName);
    }

    public void emailType(String email){
        type(lNameType,email);
    }
    public void passType(String password){
        type(By.xpath("//input[@id='dwfrm_profile_login_password']"),password);
    }
    public void clickReadTerms(){
        clickThis(By.xpath("//input[@id='dwfrm_registration_termsofuseteacher']"));
    }
    public void clickCreateNext(){
        clickThis(By.xpath("//button[@name='dwfrm_profile_confirm']"));
    }

    //Scenario: User choose zip code and search for the school
    public void zipcodeType(String zipcode){
        type(By.xpath("//input[@id='dwfrm_myschool_schoolzip']"),zipcode);
    }

    public void clickZipcodeButton(){
        clickThis(By.xpath("//button[@name='dwfrm_myschool_search']"));
    }

    //not sure what this code is
    public void schoolType(String schoolType){
        type(By.xpath("//input[@id='dwfrm_searchschool_schoolvalue']"),schoolType);
    }

    public void schoolNameAutoSuggestion(String schoolLookup){
    selectFromDropdown(By.xpath("//span[@class='ui-menu-item-wrapper']"),schoolLookup);
    }

    public void clickSchoolNextButton(){
        clickThis(By.xpath("//button[@class='next-button button-continue school-search']"));
    }


    //Scenario: User choose role of your teaching level and student #
    public void clickSelectRole(){
        clickThis(By.xpath("//div[@class='selected-option input-select primaryrole required']"));  }
    public void clickTeacherGrade(){
        clickThis(By.xpath("//span[contains(text(),'Teacher (by Grade)')]"));
    }
    public void selectTeacherGrade(){
        clickThis(By.xpath("//div[@class='selected-option input-select noscroll']"));
    }
    public void gradeAutoSuggestion(){
        selectFromDropdown(By.xpath("//span[contains(text(),'1st Grade')]"),"1st Grade"); }
    public void studentNumType(){
        type(By.xpath("//input[@id='dwfrm_myrole_students']"),"1");
    }
    public void myRoleNextButton(){
        clickThis(By.xpath("//button[@class='next-button button-continue']"));
    }



    //Scenario:User fill in preferred Reading Level System
    public void selectGuidedReadingLevel(){
        selectFromDropdown(By.xpath("//div[@class='selected-option input-select required']"),"Guided Reading Level (GRL)");
    }
    public void clickFirstYearTeaching(){
        clickThis(By.xpath("//span[contains(text(),'Yes')]"));
    }
    public void clickContinueSiteButton(){
        clickThis(By.xpath("//button[@class='button-continue']"));
    }
    /*public void clickSelectRole(){
        clickThis(By.xpath("//div[@class='selected-option input-select primaryrole required']"));
    }public void clickSelectRole(){
        clickThis(By.xpath("//div[@class='selected-option input-select primaryrole required']"));
    }
    public void clickSelectRole(){
        clickThis(By.xpath("//div[@class='selected-option input-select primaryrole required']"));
    }*/




}
