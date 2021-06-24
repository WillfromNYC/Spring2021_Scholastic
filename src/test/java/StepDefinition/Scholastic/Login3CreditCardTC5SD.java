package StepDefinition.Scholastic;

import DriverWrapper.Web;
import Pages.Scholastic.LoginCCTc5;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class Login3CreditCardTC5SD {
    //For down maintenance site
    LoginCCTc5 loginCCTc5 = new LoginCCTc5();
    Web web = new Web();
    @When("I scroll down a few clicks down the website")
    public void goScrollDownLittle(){
        loginCCTc5.scrollDownLittle();
    }



    @When("I click sign in")
    public void goSignIn(){
        loginCCTc5.signIn();
    }
    //For down maintenance site
    /*@When("I click on under maintenance Update now button")
    public void goUpdateNowWhenUpdating() {
        login.updateNowWhenUpdating();
    }*/

    @And("I enter '(.*)' in the email")
    public void enterEmailLogin(String email){
        loginCCTc5.emailLogin(email);
    }
    @And("I click on the login continue button")
    public void goClickLoginCont(){
        loginCCTc5.clickLoginCont();
    }

    @And("I enter '(.*)' in the pass login screen")
    public void enterPassLogin(String pass){
        loginCCTc5.passLogin(pass);
    }
    @And("I click on password sign in button")
    public void goClickPassSignInButton(){
        loginCCTc5.clickPassSignInButton();
    }

    //#Need to close advertisement, click my account and profile
    @When("I will close advertisement popup if it appears")
    public void clickCloseNotif(){
        loginCCTc5.clickCloseNotif();
    }


    //#Scenario: User shall add 3 credit cards then see if you can add a 4th
    @When("I enter '(.*)' pixel down the website")
    public void scrollDownPixel(int num){
        loginCCTc5.scrollDownPixel(num);
    }
    @And("I click add a card")
    public void goClickAddACard(){
        loginCCTc5.clickAddACard();
    }
    @And("I enter '(.*)' in the card #")
    public void enterTypeCCNum(String numCC){
        loginCCTc5.typeCCNum(numCC);
    }

    @And("I click 03 in the month")
    public void goSelectMonthCC(){
        loginCCTc5.clickMonth03CC();
    }
    @And("I click 2030 in the year")
    public void goClickYear2030CC(){
        loginCCTc5.clickYear2030CC();
    }
    @And("I enter '(.*)' in the security code section")
    public void enterSecCodeType(String numCC){
        loginCCTc5.secCodeType(numCC);
    }


    @And("I enter '(.*)' in the first Name billing")
    public void firstNameCCBill(String name){
        loginCCTc5.firstNameCCBill(name);
    }
    @And("I enter '(.*)' in the last name billing")
    public void lastNameCCBill(String name){
        loginCCTc5.lastNameCCBill(name);
    }
    @And("I enter '(.*)' in the address billing")
    public void AddressCCBill(String address){
        loginCCTc5.AddressCCBill(address);
    }
    @And("I enter '(.*)' in the zip billing")
    public void zipCodeCCBill(String zipCode){
        loginCCTc5.zipCodeCCBill(zipCode);
    }
    @And("I enter '(.*)' in the phone number billing")
    public void phoneNumCCBill(String phoneNum){
        loginCCTc5.phoneNumCCBill(phoneNum);
    }
    @And("I click save button")
    public void clickSaveCCButton(){
        loginCCTc5.clickSaveCCButton();
    }
    @And("I click 12 in the month")
    public void goclickMonth12CC(){
        loginCCTc5.clickMonth12CC();
    }
    @And("I enter 2029 in the year")
    public void goClickYear2029CC(){
        loginCCTc5.clickYear2029CC();
    }

    @And("I enter '(.*)' in the month")
    public void gocClickMonth03CC(){
        loginCCTc5.clickMonth03CC();
    }
    @And("I enter '(.*)' in the year")
    public void clickYear2030CC(){
        loginCCTc5.clickYear2030CC();
    }
    /*
    @And("")
    public void (){
        loginCCTc5.();
    }
    @And("")
    public void (){
        loginCCTc5.();
    }
    @And("")
    public void (){
        loginCCTc5.();
    }
    @And("")
    public void (){
        loginCCTc5.();
    }
    @And("")
    public void (){
        loginCCTc5.();
    }
*/


}
