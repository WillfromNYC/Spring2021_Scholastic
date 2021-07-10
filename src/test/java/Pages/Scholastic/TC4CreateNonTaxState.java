package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.Commands;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class TC4CreateNonTaxState extends Commands {

    //By locators

    By clickState= By.xpath("//*[contains(@class,'selected-option input-select')]");
    //*[@class='selected-option input-select']
    By clickStateNewYork = By.xpath("//li[@class='custom-option select-option']//span[contains(text(),'New York')]");
    By clickStateArkansas = By.xpath("//*[@class='input-select valid']//option[contains(text(),'Arkansas')]");
    By typeInCity= By.xpath("//*[@id='dwfrm_myschool_schoolcity']");
    By clickCityNewYork = By.xpath("//span[@class='auto-matches' and contains(text(),'New York')]");
    By clickSearchStateButton = By.xpath("//button[@name='dwfrm_myschool_searchone']");



    By zipcodeType = By.xpath("//input[@id='dwfrm_myschool_schoolzip']");
    By zipSearchButton = By.xpath("//button[@name='dwfrm_myschool_search']");

    By schoolType = By.xpath("//input[@id='dwfrm_searchschool_schoolvalue']");

    By schoolTypeAutoContain = By.xpath("//*[@class='ui-menu-item-wrapper']");

    By schoolNextButton = By.xpath("//button[@class='next-button button-continue school-search']");






    /*public void clickState(){
        fluentWaitMethod(clickState,30);


        clickThis(clickState);
        fluentWaitMethod(clickStateNewYork,25);
        clickThis(clickStateNewYork);
    }


    public void clickCityType(String city){
        fluentWaitMethod(typeInCity,25);
        type(typeInCity,"city");
        fluentWaitMethod(clickCityNewYork,25);
        clickThis(clickCityNewYork);
    }*/

   /* public void zipcodeTypeNonTax(String zipcode){
        fluentWaitMethod(zipcodeType,15);
        type(zipcodeType,zipcode);
    }

    public void clickZipcodeButton(){
        clickThis(zipSearchButton);
    }*/

    @When("I click on school state and enter New York for state")
    public void clickElement(){
        try { Thread.sleep(4000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        clickThis(schoolType);
    }

    public void clickSchoolAutoContain(){
        try { Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        fluentWaitMethod(schoolTypeAutoContain,25);

        clickThis(schoolTypeAutoContain);
    }
    public void clickSchoolNextButton(){
        fluentWaitMethod(schoolNextButton,25);
        clickThis(schoolNextButton);
    }

}
