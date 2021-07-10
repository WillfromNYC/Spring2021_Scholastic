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

public class LoginCCTc5 extends Commands {

    //By locators
    //By signIn = By.xpath("//a[@href='https://clubs3qa1.scholastic.com/on/demandware.store/Sites-rco-us-Site/default/Parent-MyScholasticLoginModal']/ancestor::ul[@class='mobile-device']");
    By signIn = By.xpath("//div[@class='subheader-top parents-subheader-top parent']/following::li[@class='mylists'][1]/a[@href='https://clubs3qa1.scholastic.com/on/demandware.store/Sites-rco-us-Site/default/Parent-MyScholasticLoginModal']");


    //TRIED: creating new acct By signIn = By.xpath("//ul[@class='mobile-device']/descendant::li[@class='mylists']/descendant::a[@class='create-account-trigger' and contains(text(),'Create an Account')]");
    //FOR IFRAME Sign in a[@class='siginlink signin pureguest dialog-close disable-autoplay signin-myscholastic']
    // a[@href='https://clubs3qa1.scholastic.com/on/demandware.store/Sites-rco-us-Site/default/Parent-MyScholasticLoginModal']/ancestor::ul[@class='mobile-device']
    //By.className("signin pureguest dialog-close disable-autoplay signin-myscholastic");
    //div[@class='subheader-top parents-subheader-top parent']/following::li[@class='mylists'][1]/a[@href='https://clubs3qa1.scholastic.com/on/demandware.store/Sites-rco-us-Site/default/Parent-MyScholasticLoginModal']

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

    By iFrameLocator = By.xpath("//iframe[@id='iframeMyScholastic']");
    //By clickLoginCont = By.id("signin-email-submit-button");
    //By clickLoginCont = By.className("SubmitButton_button__3B3av SubmitButton_purple__30j66");
    By clickLoginCont = By.xpath("//button[contains(text(),'continue')]");
    By passLogin = By.id("password-text-field");
    By clickPassSignInButton = By.id("password");
    ////*[contains(text(),'sign in')]

    //#Need to close advertisement, click my account and profile
    By clickCloseNotif = By.xpath("//*[@class='notification-close']");

    //#Scenario: User shall add 3 credit cards then see if you can add a 4th
    By clickAddACard = By.xpath("//a[@class='reading-club add-creditcardtoaccount']");
    //reading-club add-creditcardtoaccount

    By typeCCNum = By.xpath("//input[starts-with(@class, 'input-text numericonly positivenumber')]");
    //** the locator name changes on the selenium Chrome version:
    // my comp: input-text numericonly positivenumber no-mouseflow required
    // selenium: input-text numericonly positivenumber no-mouseflow required error tooltipstered
    //ID locator's end of the number seems to change//dwfrm_paymentinstruments_creditcards_newcreditcard_number_d0kbcipmwxiv
    //By clickMonthCC = By.xpath("//div[starts-with(@class,'selected-option input-select')]/following::label[starts-with(@for,'dwfrm_paymentinstruments_creditcards_newcreditcard_month')]");
    //div[starts-with(@class,'selected-option input-select')]
    //label[starts-with(@for,'dwfrm_paymentinstruments_creditcards_newcreditcard_month')]
    //div[starts-with(@class,'selected-option input-select')]/following::label[starts-with(@for,'dwfrm_paymentinstruments_creditcards_newcreditcard_month')]
    By clickMonthCC = By.xpath("//label[@for='dwfrm_paymentinstruments_creditcards_newcreditcard_month']/following::div[@class='custom-select'][1]/*[starts-with(@class, 'selected-option input-select exp-date no-mouseflow')]");
    //can't interact: //select[@name='dwfrm_paymentinstruments_creditcards_newcreditcard_month']

    By clickmonthScroll = By.xpath("//*[contains(@class, 'custom-scrollbar ps-container ps-active-y')]//*[@style='top: 11px; height: 231px;']");
    //Shouldn't use exact style measurements because it can change
    By clickMonth03CC = By.xpath("//*[contains(@class, 'select-option') and @data-label='03']/span");
    //I had the wrong attribute for '03'
    //select[@name='dwfrm_paymentinstruments_creditcards_newcreditcard_month']//*[contains(@class, 'select-option') and @class='03']
    //span[contains(text(),'03')]

    By clickYearCC = By.xpath("//label[@for='dwfrm_paymentinstruments_creditcards_newcreditcard_year']/following::*[contains(@class,'custom-select')]//*[starts-with(@class, 'selected-option input-select exp-date no-mouseflow')]");
    //NOTE: the word active wasn't appearing on Selenium in 'custom-select active': div[@class='custom-select active']//*[starts-with(@class, 'selected-option input-select exp-date no-mouseflow')]
    ////label[@for='dwfrm_paymentinstruments_creditcards_newcreditcard_year']/div[@class='custom-select active']//*[starts-with(@class, 'selected-option input-select exp-date no-mouseflow')]
    //div[starts-with(@class,'selected-option input-select')]/following::label[starts-with(@for,'dwfrm_paymentinstruments_creditcards_newcreditcard_year')]
    By clickYear2030CC = By.xpath("//*[contains(@class, 'select-option') and @data-label='2030']/span");
    //*[contains(@class, 'select-option') and @data-label='2024']/span
    //*[@data-label='2032']/following::div[@class='ps-scrollbar-y-rail']//*[@style='top: 66px; height: 231px;']

    By secCodeType = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_cvn");
    By firstNameCCBill = By.id("dwfrm_paymentinstruments_creditcards_address_firstname");
    By lastNameCCBill = By.id("dwfrm_paymentinstruments_creditcards_address_lastname");
    By AddressCCBill = By.id("dwfrm_paymentinstruments_creditcards_address_address1");
    By b = By.xpath("");
    By zipCodeCCBill = By.id("dwfrm_paymentinstruments_creditcards_address_postal");
    //By clickCityBill = By.id("selected-option input-select no-mouseflow billingcity required");
    By phoneNumCCBill = By.id("dwfrm_paymentinstruments_creditcards_address_phone");
    //Not needed: By clickmakedefaultcard = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_defaultCard");
    By clickSaveCCButton = By.id("applyBtn");

    //    #Scenario: User will add 2nd credit card
    //can't interact: //select[@name='dwfrm_paymentinstruments_creditcards_newcreditcard_month']
    By clickMonth12CC = By.xpath("//*[contains(@class, 'select-option') and @data-label='12']/span");
    By clickYear2029CC = By.xpath("//*[contains(@class, 'select-option') and @data-label='2029']/span");

    By click4thAddCC = By.xpath("//*[contains(@data-tooltip-option, 'creditcarderror')]");
    By creditCardFlyerJumper = By.xpath("//*[starts-with(@class, 'tooltipster-body')]");


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
        */




    //Scenario: User shall login into account
    public void signIn(){
        //new WebDriverWait(Web.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(signIn)).click();
        fluentWaitMethod(signIn,25);
        clickThis(signIn);
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
        try { Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

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
        String currentHandle = Web.getDriver().getWindowHandle();
        System.out.println("Current window handle is: " + currentHandle);
    }

    public void clickLoginCont(){
        try { Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        fluentWaitMethod(clickLoginCont,20);
        clickThis(clickLoginCont);
        //Web.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try { Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void passLogin(String pass){
        fluentWaitMethod(passLogin,20);
        type(passLogin,pass);
        try { Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void clickPassSignInButton(){
        try { Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        fluentWaitMethod(clickPassSignInButton,20);

        clickThis(clickPassSignInButton);
        Web.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
    //#Need to close advertisement, click my account and profile
    public void clickCloseNotif(){

        fluentWaitMethod(clickCloseNotif,20);
        try {
            clickThis(clickCloseNotif);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }




    //#Scenario: User shall add 3 credit cards then see if you can add a 4th
    public void scrollDownPixel(int num) {
        try { Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        scrollDownByPixel(num);
    }
    public void clickAddACard(){
        fluentWaitMethod(clickAddACard,20);
        clickThis(clickAddACard);
    }

    //FIRST CREDIT CARD
    public void typeCCNum(String numCC){
        try { Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();}
        fluentWaitMethod(typeCCNum,20);
        type(typeCCNum,numCC); }

    public void clickMonth03CC() {
        fluentWaitMethod(clickMonthCC,20);
        clickThis(clickMonthCC);
        try { Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        /*fluentWaitMethod(clickmonthScroll,20);
        clickThis(clickmonthScroll);*/


        fluentWaitMethod(clickMonth03CC,20);
        clickThis(clickMonth03CC);
    }

    public void clickYear2030CC() {
        try { Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        fluentWaitMethod(clickYearCC,20);
        clickThis(clickYearCC);
        try { Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        fluentWaitMethod(clickYear2030CC,20);
        clickThis(clickYear2030CC);
    }

    public void secCodeType(String numCC){
        fluentWaitMethod(secCodeType,20);
        type(secCodeType,numCC);
    }
    public void firstNameCCBill(String name){
        fluentWaitMethod(firstNameCCBill,20);
        type(firstNameCCBill,name);
    }
    public void lastNameCCBill(String name){
        fluentWaitMethod(lastNameCCBill,20);
        type(lastNameCCBill,name);
    }
    public void AddressCCBill(String address){
        fluentWaitMethod(AddressCCBill,20);
        type(AddressCCBill,address);
    }
    public void zipCodeCCBill(String zipCode){
        try { Thread.sleep(2000);        }
        catch (InterruptedException e){
            e.printStackTrace();}
        fluentWaitMethod(zipCodeCCBill,20);
        type(zipCodeCCBill,zipCode);
    }


    public void phoneNumCCBill(String phoneNum){
        fluentWaitMethod(phoneNumCCBill,20);
        type(phoneNumCCBill,phoneNum);
    }

    public void clickSaveCCButton(){
        try { Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        fluentWaitMethod(clickSaveCCButton,20);
        clickThis(clickSaveCCButton);
    }
    //    #Scenario: User will add 2nd credit card
    public void clickMonth12CC() {

        fluentWaitMethod(clickMonthCC,20);
        clickThis(clickMonthCC);
        try { Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickmonthScroll,20);
        clickThis(clickmonthScroll);

        fluentWaitMethod(clickMonth12CC,20);
        clickThis(clickMonth12CC);
    }

    public void clickYear2029CC() {
        try { Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickYearCC,20);
        clickThis(clickYearCC);
        try { Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        fluentWaitMethod(clickYear2029CC,20);
        clickThis(clickYear2029CC);
    }

    public void clickMonth03CC(String month) {

        fluentWaitMethod(clickMonthCC,20);
        clickThis(clickMonthCC);
        try { Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        fluentWaitMethod(By.xpath("//*[contains(@class, 'select-option') and @data-label='03']/span"),20);
        clickThis(By.xpath("//*[contains(@class, 'select-option') and @data-label='03']/span"));
    }

    public void clickYear2030CC(String year) {
        try { Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        fluentWaitMethod(clickYearCC,20);
        clickThis(clickYearCC);
        try { Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        fluentWaitMethod(By.xpath("//*[contains(@class, 'select-option') and @data-label='30']/span"),20);
        clickThis(By.xpath("//*[contains(@class, 'select-option') and @data-label='30']/span"));
    }

    public void click4thAddCC() {

        fluentWaitMethod(click4thAddCC, 20);
        clickThis(click4thAddCC);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void creditCardFlyerJumper(){
        isElementDisplayed(creditCardFlyerJumper);
    }
    /*

    public void (){
        type();
    }
    try { Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace(); }

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
