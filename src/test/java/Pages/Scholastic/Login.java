package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.Commands;
import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login extends Commands {

    //By locators
    //By signIn = By.xpath("//a[@href='https://clubs3qa1.scholastic.com/on/demandware.store/Sites-rco-us-Site/default/Parent-MyScholasticLoginModal']/ancestor::ul[@class='mobile-device']");
    By signIn = By.xpath("//a[@class='siginlink signin pureguest dialog-close disable-autoplay signin-myscholastic']");


    //TRIED: creating new acct By signIn = By.xpath("//ul[@class='mobile-device']/descendant::li[@class='mylists']/descendant::a[@class='create-account-trigger' and contains(text(),'Create an Account')]");

    //a[@href='https://clubs3qa1.scholastic.com/on/demandware.store/Sites-rco-us-Site/default/Parent-MyScholasticLoginModal']/ancestor::ul[@class='mobile-device']
    //By.className("signin pureguest dialog-close disable-autoplay signin-myscholastic");

    //use this to login when site is under maintenance
    By updateNowWhenUpdating = By.xpath("//a[@href='https://clubs3qa1.scholastic.com/on/demandware.store/Sites-rco-us-Site/default/Parent-MyScholasticLoginModal']");
    //a[@href='https://clubs3qa1.scholastic.com/on/demandware.store/Sites-rco-us-Site/default/Parent-MyScholasticLoginModal']
    //link-registration i-am-teacher partialShingleUpdate signin pureguest dialog-close disable-autoplay signin-myscholastic

    //*********************Has iframe, need to switch it first
    //By iFrameSignIn = By.id("iframeMyScholastic");
    By iFrameSignIn = By.xpath("//iframe[@data-url='https://login-qa.scholastic.com/my-scholastic/sign-in.html?ref=clubs&chat=1']");


    //By emailLogin = By.className("EmailField_inputGrey__2-tK4 EmailField_errorField__1toXW");
    //can't find element
    By emailLogin = By.id("user-text-field");
    //By emailLogin = By.name("password");

    //EmailField_inputGrey__2-tK4
    //user-text-field

    //By clickLoginCont = By.id("signin-email-submit-button");
    //By clickLoginCont = By.className("SubmitButton_button__3B3av SubmitButton_purple__30j66");
    By clickLoginCont = By.xpath("//button[contains(text(),'continue')]");



    By passLogin = By.id("password-text-field");
    By clickSignInLogin = By.id("password");

    //#Scenario: User shall add 3 credit cards then see if you can add a 4th
    By clickAddACard = By.className("reading-club add-creditcardtoaccount");
    By typeCCNum = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_number_d0kbcipmwxiv");

    By clickMonthCC = By.xpath("//div[starts-with(@class,'selected-option input-select')]/following::label[starts-with(@for,'dwfrm_paymentinstruments_creditcards_newcreditcard_month')]");
    //div[starts-with(@class,'selected-option input-select')]
    //label[starts-with(@for,'dwfrm_paymentinstruments_creditcards_newcreditcard_month')]
    //div[starts-with(@class,'selected-option input-select')]/following::label[starts-with(@for,'dwfrm_paymentinstruments_creditcards_newcreditcard_month')]
    By clickThreeMonth = By.xpath("");


    By clickYearCC = By.xpath("//div[starts-with(@class,'selected-option input-select')]/following::label[starts-with(@for,'dwfrm_paymentinstruments_creditcards_newcreditcard_year')]");
    By click2030CC = By.xpath("");

    By secCodeType = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_cvn");
    By firstNameCCBill = By.xpath("dwfrm_paymentinstruments_creditcards_address_firstname");
    By lastNameCCBill = By.xpath("");
    By AddressCCBill = By.xpath("");
    By b = By.xpath("");
    By zipCodeCCBill = By.xpath("");
    By clickCityPrince = By.xpath("");
    By phoneNumCCBill = By.id("dwfrm_paymentinstruments_creditcards_address_phone");
    By clickmakedefaultcard = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_defaultCard");
    By a = By.id("applyBtn");

    By clickSaveButtonCC = By.className("button-continue");


    /*
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
        */




    //Scenario: User shall login into account
    public void signIn(){
        new WebDriverWait(Web.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(signIn)).click();

        /*Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(90))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Elements are not found within 90 seconds");

        *//*List<WebElement> elements = (List<WebElement>) fWait.until(new Function<WebDriver, List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) {
                return driver.findElements(signIn);
            }
        })*//*
        fWait.until(ExpectedConditions.elementToBeClickable(signIn));*/

        //First
        /*WebDriverWait eWait = new WebDriverWait(Web.getDriver(), 20);
        eWait.until(ExpectedConditions.elementToBeClickable(signIn));*/
        /*try { Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }*/
        //Second
        /*Actions act = new Actions(Web.getDriver());
        WebElement signInWeb = Web.getDriver().findElement(signIn);
        act.doubleClick(signInWeb).build().perform();*/

        /*try { Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }*/

        //4th
        /*JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        WebElement signInWeb = Web.getDriver().findElement(signIn);
        js.executeScript("arguments[0].click();",signInWeb);*/

        /*clickThis(signIn);
        try { Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }*/
    }

    //Use these methods when site switched to under maintenance
    public void scrollDownLittle(){
        scrollDownByPixel(100);
    }
    public void updateNowWhenUpdating(){
        clickThis(updateNowWhenUpdating);
    }


    public void emailLogin(String email){//switch to iFrame > then find and interact with email locator
        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is not found within 20 seconds");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(iFrameSignIn);
            }
        });
        Web.getDriver().switchTo().frame("iframeMyScholastic");

        type(emailLogin,email);

        //****No need for now that FluentWait works:
        /*WebDriverWait eWait = new WebDriverWait(Web.getDriver(), 20);
        eWait.until(ExpectedConditions.elementToBeClickable());*/

        // Web.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void clickLoginCont(){
        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is not found within 20 seconds");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(clickLoginCont);
            }
        });
        clickThis(clickLoginCont);
        Web.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    public void passLogin(String pass){
        type(passLogin,pass);
    }

    public void clickSignInLogin(){
        clickThis(clickSignInLogin);
        Web.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    //#Scenario: User shall add 3 credit cards then see if you can add a 4th
    public void scrollDownPixel(int num) {
        scrollDownByPixel(num);
    }
    public void clickAddACard(){
        clickThis(clickAddACard);
    }
    public void typeCCNum(String numCC){
        type(typeCCNum,numCC);

    }
    /*public void clickMonthCC(){
        clickThis();
        clickThis()
    }
    public void (){
        clickThis();
    }
    public void (){
        clickThis();
    }
    public void (){
        clickThis();
    }
    public void (){
        clickThis();
    }
    public void (){
        clickThis();
    }
    public void (){
        clickThis();
    }
    public void (){
        clickThis();
    }
    public void (){
        clickThis();
    }
    public void (){
        clickThis();
    }
    public void (){
        clickThis();
    }
*/







}
