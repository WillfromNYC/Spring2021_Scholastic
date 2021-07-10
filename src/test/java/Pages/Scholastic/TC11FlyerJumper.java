package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC11FlyerJumper extends Commands {


    Actions act = new Actions(Web.getDriver());

    //By locators
    By clickTeacherOrder = By.xpath("//div[contains(@class,'sidecarmenu-overlay')]/following::*[contains(@class, 'wrapper-content')]/following::a[@href= 'https://clubs3qa1.scholastic.com/ytoflyerentry']");
    By clickPriceQtyBox = By.xpath("//*[contains(@data-isbn13, '9781338364750') and starts-with(@class, 'itm-qty-usd input-qty ')]");
    By visibleFlyerJumper = By.xpath("//*[contains(@class, 'info-modal-content')]");
    By clickCloseFlyJumper = By.xpath("//*[contains(@class, 'fa fa-times info-modal-close')]");

    By clickSecondPriceQtyBox = By.xpath("//*[contains(@data-isbn13, '9781338785944') and starts-with(@class, 'itm-qty-usd input-qty ')]");


    /*
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");*/









    public void clickTeacherOrder(){
        try { Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickTeacherOrder,20);
        clickThis(clickTeacherOrder);
    }
    public void clickPriceQtyBox(){
        try { Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickPriceQtyBox,20);
        clickThis(clickPriceQtyBox);
    }
    public void visibleFlyerJumper(){
        fluentWaitMethod(visibleFlyerJumper,20);
        isElementDisplayed(visibleFlyerJumper);
    }
    public void clickCloseFlyJumper(){
        try { Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickCloseFlyJumper,20);
        clickThis(clickCloseFlyJumper);
    }
    public void clickSecondPriceQtyBox(){
        try { Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickSecondPriceQtyBox,20);
        clickThis(clickSecondPriceQtyBox);
    }

   /* public void (){
        try { Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickAddButton,20);
        clickThis(clickAddButton);
    }
*/

    /*public void typeCCNum(String numCC){
        try { Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();}
        fluentWaitMethod(typeCCNum,20);
        type(typeCCNum,numCC); }
*/

/*
    public void (){
        fluentWaitMethod(,20);
        clickThis();
    }
    public void (){
        fluentWaitMethod(,20);
        type();
    }
    try { Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace(); }

    public void (){
        fluentWaitMethod(,20);
        clickThis();
    }
    public void (){
        fluentWaitMethod(,20);
        clickThis();
    }
    public void (){
        fluentWaitMethod(,20);
        clickThis();
    }
    public void (){
        fluentWaitMethod(,20);
        clickThis();
    }
    public void (){
        fluentWaitMethod(,20);
        clickThis();
    }
    public void (){
        fluentWaitMethod(,20);
        clickThis();
    }
*/






}
