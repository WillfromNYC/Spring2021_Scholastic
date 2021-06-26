package Pages.Hotels;

import Pages.Commands;
import org.openqa.selenium.By;

public class TC19ChangeDate extends Commands {

    //By locators
    By clickSearchBox = By.xpath("//*[contains(text(),'Where to?')]//following::*[contains(text(),'e.g. Las Vegas')]");
    By typeSearch = By.xpath("//*[@class='modal-hd-content']//*[@placeholder= 'e.g. Las Vegas']");
    //*[contains(text(),'Where to?')]//following::*[contains(text(),'e.g. Las Vegas') or @placeholder= 'e.g. Las Vegas' and @type='text'][2]
    //*[contains(text(),'Where to?')]//following::*[contains(text(),'e.g. Las Vegas') or @placeholder= 'e.g. Las Vegas' and @type='text'][2]    //*[@class='modal-hd-content']//*[@placeholder= 'e.g. Las Vegas' and @type='text']
    By autosuggestBora = By.xpath("//*[contains(@class,'in-viewport-root')]//span");
    By clickCheckIn = By.xpath("//*[contains(text(),'Check in')]/following-sibling::span");
    By clickCalNextButton = By.xpath("//*[contains(@aria-label, 'Next')]");


    By clickOct10Button = By.xpath("//*[contains(text(),'October 2021')]/following::button[contains(@name,'Sun Oct 10 2021')]");
    By clickOct31Button = By.xpath("//*[contains(text(),'October 2021')]/following::button[contains(@name,'Sun Oct 31 2021')]");
    By clickApplyButton = By.xpath("//*[contains(@aria-label, 'Apply')]");
    By clickSearchButton = By.xpath("//*[contains(@aria-label, 'Search')]");
    By verifyChangeDatesButton = By.xpath("//*[@aria-label='Change dates']");

    /*

    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");*/

    public void clickSearchBox(){
        clickThis(clickSearchBox);
    }

    public void typeSearch(String location){
        fluentWaitMethod(typeSearch,20);
        type(typeSearch,location);
    }
    public void autosuggestBora(String location){
        try { Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(autosuggestBora,20);
        selectFromAutoSuggestion(autosuggestBora,location);
    }
    public void clickCheckIn(){
        try { Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        clickThis(clickCheckIn);
    }
    public void clickCalNextButton(){
        try { Thread.sleep(4000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        clickThis(clickCalNextButton);
        try { Thread.sleep(4000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        clickThis(clickCalNextButton);
        try { Thread.sleep(4000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        clickThis(clickCalNextButton);
        try { Thread.sleep(4000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        clickThis(clickCalNextButton);
    }

    public void clickOct10Button() {
        try { Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        clickThis(clickOct10Button);
    }
    public void clickOct31Button() {
        clickThis(clickOct31Button);
    }
    public void clickApplyButton() {
        clickThis(clickApplyButton);
    }
    public void clickSearchButton(){
        clickThis(clickSearchButton);
    }
    public void scrollDown(int num) {
        try { Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        scrollDownByPixel(num);
    }


    public void scrollUp(int num) {
        scrollUpByPixel(num);
    }
    public void verifyChangeDatesButton(){
        isElementDisplayed(verifyChangeDatesButton);
    }



    /*

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

    /*}
    public void clickCheckIn(){
        try { Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        clickThis(clickCheckIn);
    }
    public void (){
        fluentWaitMethod(,20);
        clickThis();
    }

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
