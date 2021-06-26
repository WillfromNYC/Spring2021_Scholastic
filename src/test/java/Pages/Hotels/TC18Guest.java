package Pages.Hotels;

import DriverWrapper.Web;
import Pages.Commands;
import org.openqa.selenium.By;

public class TC18Guest extends Commands {

    Web web = new Web();

    //By locators
    By clickGuests = By.xpath("//*[contains(text(),'Where to?')]/following::*[contains(text(),'1 room, 2 guests')]");
    By clickAdultPlusButton = By.xpath("//*[contains(text(),'Adults:')]/following::*[@aria-label='plus'][1]");
    By clickChildrenPlusButton = By.xpath("//*[contains(text(),'Children:')]/following::*[@aria-label='plus'][1]");
    By dropdownChild1Age = By.xpath("//*[@name='q-room-0-child-0-age']");
    By dropdownChild2Age = By.xpath("//*[@name='q-room-0-child-1-age']");
    By clickGuestApplyButton = By.xpath("//*[contains(text(),'Apply')]");
    By verifyGuestTotal = By.xpath("//*[contains(text(),'1 room, 6 guests')]");

     /*

    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");*/

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
    public void clickGuests(){
        fluentWaitMethod(clickGuests,20);
        clickThis(clickGuests);
    }

    public void clickAdultPlusButton(){
        fluentWaitMethod(clickAdultPlusButton,20);
        clickThis(clickAdultPlusButton);
        try { Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();}
        fluentWaitMethod(clickAdultPlusButton,20);
        clickThis(clickAdultPlusButton);
    }

    public void clickChildrenPlusButton(){
        fluentWaitMethod(clickChildrenPlusButton,20);
        clickThis(clickChildrenPlusButton);
        try { Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();}
        fluentWaitMethod(clickChildrenPlusButton,20);
        clickThis(clickChildrenPlusButton);
    }

    public void dropdownChild1Age(String age){
        selectFromDropdown(dropdownChild1Age,age);
    }
    public void dropdownChild2Age(String age){
        selectFromDropdown(dropdownChild2Age,age);
    }
    public void clickGuestApplyButton(){
        clickThis(clickGuestApplyButton);
    }
    public void verifyGuestTotal(){
        getElement(verifyGuestTotal);
    }




/*

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
