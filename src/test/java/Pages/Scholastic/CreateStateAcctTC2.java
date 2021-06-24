package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class CreateStateAcctTC2 extends Commands {

    //By locators
    //bottom create Account
    By createAccount = By.xpath(
            "//a[@class='create-account-trigger' and contains(text(),'Create an Account')]/ancestor::div[@id='navLinksOnly']");

    //Create Acct From Deepak
    By createAccountTop = By.xpath("((//div[@class='menu-nav']//li[@class='mylists'])[2]//a[text()='Create an Account'])[1]");

    By teacherSelect = By.xpath("//div[@class='selected-option input-select profile-title required']");

    //label[@for='acccountTeacther']
    By nextButton = By.xpath("//a[@id='linkChooseAcount']");

    //Scenario: User creates new account [doesn't request these elements with bottom new create account
    By clickSelectTitle = By.xpath("//div[@class='selected-option input-select profile-title required']");
    By clickTitleMr = By.xpath("//span[contains(text(),'Mr.')]");

    By fNameType = By.xpath("//input[@id='dwfrm_profile_customer_firstname']");
    By lNameType = By.xpath("//input[@id='dwfrm_profile_customer_lastname']");
    By emailType = By.xpath("//input[@id='dwfrm_profile_customer_email']");
    By passType = By.xpath("//input[@id='dwfrm_profile_login_password']");
    By clickTerms = By.xpath("//input[@id='dwfrm_registration_termsofuseteacher']");
    By createNextButton = By.xpath("//button[@name='dwfrm_profile_confirm']");

//*************************************************************************************
    //Scenario: User create new account but through state instead of school

    //By clickState = By.className("selected-option input-select");
    ////div[@class='selected-option input-select']
    //
    //By clickState= By.id("dwfrm_myschool_accountstates");
    //By clickState= By.className("input-select valid");////*[@class='input-select valid']
    By clickState= By.xpath("//*[@class='selected-option input-select']");
    //[//*@class='input-select valid']
    By clickStateNewYork = By.xpath("//li[@class='custom-option select-option']//span[contains(text(),'New York')]");

    By typeInCity= By.xpath("//*[@id='dwfrm_myschool_schoolcity']");

    //button[@class='button-continue']
    //By typeInCity= By.xpath("//*[@class='input-text ui-autocomplete-input valid']");



    By clickCityNewYork = By.xpath("//span[@class='auto-matches' and contains(text(),'New York')]");
    //element not found: By clickSearchStateButton = By.xpath("//button[@id='button-search' and @name='dwfrm_myschool_searchone']");
    //By clickSearchStateButton = By.name("dwfrm_myschool_search");
    By clickSearchStateButton = By.xpath("//button[@name='dwfrm_myschool_searchone']");
    //button[@id='button-search'][1]



    //Scenario: User shall search by school (with possible locator issues)
    By schoolType = By.xpath("//input[@id='dwfrm_searchschool_schoolvalue']");
    //Trying to combine By locators//
    ////input[@id='dwfrm_searchschool_schoolvalue']//span[contains(text(),'scholastic+book+clubs')]
    By scholasticBookClubLocator = By.className("ui-menu-item");
    //span[contains(text(),'scholastic+book+clubs')]
    //ul[starts-with(@class, 'ui-menu')]//span[contains(text(),'scholastic+book+clubs')]
    //span[@class='ui-menu-item-wrapper']
    //ul[starts-with(@class, 'ui-menu')]//span[contains(text(),'scholastic+book+clubs')]


    By schoolNextButton = By.xpath("//button[@class='next-button button-continue school-search']");

    //Scenario: User choose role of your teaching level and student #
    By clickSelectRole = By.xpath("//div[@class='selected-option input-select primaryrole required']");
    By clickRoleTeacher = By.xpath("//span[contains(text(),'Teacher (by Grade)')]");
    By gradeAutoSuggestion = By.xpath("//div[@class='selected-option input-select noscroll']");
    By click1stGrade = By.xpath("//span[contains(text(),'1st Grade')]");

    By studentNumType = By.xpath("//input[@id='dwfrm_myrole_students']");
    By myRoleNextButton = By.xpath("//button[@class='next-button button-continue']");

    //Scenario: User choose preferred Reading Level System
    //delete: By readingLevelClick = By.xpath("//div[@class='selected-option input-select required']");
    By clickPreferredReadingLevel = By.xpath("//div[@class='selected-option input-select required']");
    By clickGuidedReadingLevel = By.xpath("//span[contains(text(),'Guided Reading Level (GRL)')]");
    //span[contains(text(),'Guided Reading Level (GRL)')]

    By clickFirstYearTeaching = By.xpath("//span[contains(text(),'Yes')]");
    By clickContinueSiteButton = By.name("dwfrm_profileselection_confirmed");
    //dwfrm_profileselection_redirectURL
    // class  button-continue

    //Bad because Class code will keep changing for new accts: By verifyTextClassCode = By.xpath("//div[contains(text(),'322B8T')]");
    By verifyTextClassCode = By.xpath("//div[contains(text(),'Class Code')]/following::div[@class='details'][1]/descendant::div[@class='value']");

    String classCode = "";

    //By myAccount = By.className("hide-mobile user-account-name");
    By myAccount = By.xpath("//span[@class='hide-mobile user-account-name']");
    By profileInMenu = By.xpath("//div[@class='toggle-content']//a[@href='https://clubs3qa1.scholastic.com/myreadingclubaccount' and contains(text(),'Profile')]");

    By nameStored= By.xpath("//h3[contains(text(),'Name')]/following-sibling::div[@class='text-blk'][1]/span");
    By addressStored = By.xpath("//h3[contains(text(),'School')]/following-sibling::div[@class='text-blk'][1]/span[2]");

    //Scenario: User clicks on create an account link
    public void clickCreateAccount(){
        clickThis(createAccountTop);

        try { Thread.sleep(7000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    //buttomScrolltoClickCreateAcct
    public void buttomScrolltoClickCreateAcct(){
        scrollToBottom();
        clickThis(By.xpath("//a[@href='https://clubs3qa1.scholastic.com/register']"));
    }


    public void clickTeacherSelect(){
        fluentWaitMethod(teacherSelect,15);
        clickThis(teacherSelect);
    }

    public void clickNextButton(){
        fluentWaitMethod(nextButton,15);
        clickThis(nextButton);
    }


    //Scenario: User will fill in new account information
    //Dropdown not have select tag

    public void clickSelectTitleMr(){
        clickThis(clickSelectTitle);
        try { Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        clickThis(clickTitleMr);
    }


    public void firstNameType(String firstName){
        type(fNameType,firstName);
    }
    public void lastNameType(String lastName){
        type(lNameType,lastName);
    }

    public void emailType(String email){
        type(emailType,email);
    }
    public void passType(String password){
        type(passType,password);
    }
    public void clickReadTerms(){
        clickThis(clickTerms);
    }
    public void clickCreateNext(){
        clickThis(createNextButton);
    }
//**************************************************************************
    //Scenario: User choose state and city to create new account
    public void clickState(){
        fluentWaitMethod(clickState,30);
        //selectFromDropdown(clickState," New York");



        clickThis(clickState);
        fluentWaitMethod(clickStateNewYork,25);
        clickThis(clickStateNewYork);
    }

    public void clickCityType(String city){
        fluentWaitMethod(typeInCity,25);
        type(typeInCity,"city");
        fluentWaitMethod(clickCityNewYork,25);
        clickThis(clickCityNewYork);
    }

    //Used previous School next button method
    public void clickSearchStateButton(){
        fluentWaitMethod(clickSearchStateButton,20);
        clickThis(clickSearchStateButton);
    }

    public void schoolNameType(String schoolTypeText){
        type(schoolType,schoolTypeText);

        try { Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //Create List Array > store element in list + get their ID number>
    //parseInt > Next create for loop and find the lowest number > click that element

    public void clickFirstSBClubAutoSuggest(){
        ArrayList<String> schoolNameArray = new ArrayList<>();
        Actions act = new Actions(Web.getDriver());

        //act.moveToElement(getElement(scholasticBookClubLocator)).build().perform();


        List<WebElement> SBClub = getElements(scholasticBookClubLocator);

        /*ArrayList<> SBClubString = getElement(By.className("ui-menu-item-wrapper")).getAttribute("id");//.getAttribute(“id”);
        List<String> SBClubString = SBClub.getx` ("placeholder");*/

        try { Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(SBClub.toString());
        //now to click first suggestion
        for (WebElement schoolName:SBClub) {
            schoolName.click();
            break;
        /*if (schoolName.getText().equalsIgnoreCase("ui-menu-item")){
            schoolName.click();
            break;
        }*/
        }

        try { Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }




    /*for (WebElement schoolName:SBClub) {
        schoolNameArray.add(schoolName.getAttribute("id"));
        System.out.println(schoolNameArray.toString());
        } */

        //We can just try to click the first index, maybe better for simple for loop
    /*for (int i=0;i<SBClub.size();i++) {
        if (SBClub[i].e)
    }*/


    }

    ////span[@class='ui-menu-item-wrapper']
/*
    public void goClickFirstSBClubLink(){
        getElements(click1stScholasticBookClub);
    }//Scholastic+Book+Clubs*/

    public void clickSchoolNextButton(){
        clickThis(schoolNextButton);
    }


    //Scenario: User choose role of your teaching level and student #
    public void clickSelectRole(){
        clickThis(clickSelectRole);  }
    public void clickTeacherGrade(){//could have used dropdown method instead
        clickThis(clickRoleTeacher);
    }
    public void clickAutoSuggestion(){
        clickThis(gradeAutoSuggestion);
        clickThis(click1stGrade);
        try { Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public void studentNumType(String studentNum){
        type(studentNumType,studentNum);
        try { Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void myRoleNextButton(){
        clickThis(myRoleNextButton);
    }



    //Scenario:User fill in preferred Reading Level System
    public void selectGuidedReadingLevel(){
        clickThis(clickPreferredReadingLevel);
        try { Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        clickThis(clickGuidedReadingLevel);
    }
    public void clickFirstYearTeaching(){
        clickThis(clickFirstYearTeaching);
        try { Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void clickContinueSiteButton(){
        clickThis(clickContinueSiteButton);
        try { Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }



    //#Scenario: User shall check the created information matches the user's inputted data
    public void verifyTextClassCode(){
        boolean isTextCodeDisplayed = isElementDisplayed(verifyTextClassCode);
        System.out.println("is Text Code Displayed: " + isTextCodeDisplayed);
    }

    public void clickMyAccount(){

        fluentWaitMethod(myAccount,15);
        clickThis(myAccount);
        fluentWaitMethod(profileInMenu,15);
        clickThis(profileInMenu);
    }
    public void nameStored(String fullName){
        String nameStoredString = getElementText(nameStored);
        Assert.assertEquals(nameStoredString,fullName,"Are not equal");
    }

    public void addressStored(String address){
        getElementText(addressStored);
        String addressStoredString = getElementText(addressStored);
        Assert.assertEquals(addressStoredString,address,"Are not equal");
    }


    /*

    public void (){
        clickThis();
    }public void (){
        clickThis();
    }public void (){
        clickThis();
    }
    public void (){
        clickThis();
    }
    public void (){
        clickThis();
    }*/



}
