package Pages.Hotels;

import DriverWrapper.Web;
import Pages.Commands;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class TC17HotelsCalender extends Commands {
    Web web = new Web();


    //By locators
    By clickClosePopup = By.xpath("//*[@class='modal-button modal-button-close']");


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
    By a = By.xpath("");*/

    public void openUrl(){
        web.openUrl("https://www.hotels.com/");
        Web.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
    }*/


}
