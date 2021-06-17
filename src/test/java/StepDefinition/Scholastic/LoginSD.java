package StepDefinition.Scholastic;

import DriverWrapper.Web;
import Pages.Scholastic.CreateAccountPage;
import Pages.Scholastic.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class LoginSD {
    //For down maintenance site
    Login login = new Login();
    Web web = new Web();
    @When("I scroll down a few clicks down the website")
    public void goScrollDownLittle(){
        login.scrollDownLittle();
    }



    @When("I click sign in")
    public void goSignIn(){
        login.signIn();
    }
    //For down maintenance site
    @When("I click on under maintenance Update now button")
    public void goUpdateNowWhenUpdating() {
        login.updateNowWhenUpdating();
    }
    @And("I enter '(.*)' in the email")
    public void enterEmailLogin(String email){
        login.emailLogin(email);
    }
    @And("I click on the login continue button")
    public void goClickLoginCont(){
        login.clickLoginCont();
    }
    @And("I enter '(.*)' in the pass login screen")
    public void enterPassLogin(String pass){
        login.passLogin(pass);
    }
    @And("I click on sign in login interface")
    public void goClickSignInLogin(){
        login.clickSignInLogin();
    }
//#Scenario: User shall add 3 credit cards then see if you can add a 4th

    @When("I enter '(.*)' pixel down the website")
    public void scrollDownPixel(int num){
        login.scrollDownPixel(num);
    }
    @And("I click add a card")
    public void goClickAddACard(){
        login.clickAddACard();
    }
    @And("I enter '(.*)' in the card #")
    public void enterTypeCCNum(String numCC){
        login.typeCCNum(numCC);
    }
    /*@And("")
    public void (){
        login.();
    }
    @And("")
    public void (){
        login.();
    }
    @And("")
    public void (){
        login.();
    }
    @And("")
    public void (){
        login.();
    }
    @And("")
    public void (){
        login.();
    }
    @And("")
    public void (){
        login.();
    }
*/


}
