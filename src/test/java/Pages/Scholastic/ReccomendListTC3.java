package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ReccomendListTC3 extends Commands {

    Actions act = new Actions(Web.getDriver());

    //By locators
    By searchBookType = By.xpath("//*[contains(@class, 'custom-placeholder')]");

    By clickSearchButton = By.xpath("//*[starts-with(@class, 'fa fa-search')]");
    //*[contains(@class, 'custom-placeholder')]/following-sibling::button
    By close2ndPopup = By.xpath("//*[starts-with(@class, 'tooltipster-close')]");

    By clickHarryPotterGoFQuickView = By.xpath("//*[@href='/harry-potter-and-the-prisoner-of-azkaban/9781338299168-rco-us.html?cgid=6_1' and @class='thumb-link']");

    //*[@href='/harry-potter-and-the-prisoner-of-azkaban/9781338299168-rco-us.html?cgid=6_1' and @class='quickview']

    //*[contains(@title, 'Harry Potter and the Goblet of Fire') and @class='thumb-link']/following::a[@href='/harry-potter-and-the-prisoner-of-azkaban/9781338299168-rco-us.html?cgid=6_1' and @class='quickview']
    By clickRecommendButton = By.xpath("//*[contains(text(),'Recommend') and contains(@class, 'icon-button-text')]");
    By clickStudentCheckBox = By.xpath("//*[contains(@class, 'wishlist-dialog-checkbox recommended')]");
    By clickCloseListButton = By.xpath("//*[contains(@class, 'tooltipster-close ')]");
    By clickCloseQuickView = By.xpath("//*[contains(@class, 'ui-button-icon ui-icon ui-icon-closethick')]");
    By clickMyListHeader = By.xpath("//*[contains(@class, 'toggle-item')]//*[contains(text(),'My Lists')]");
    By clickRecommForStudents = By.xpath("//*[contains(text(),'Recommendations for Students ')]");
    By verifyHarryPGOF = By.xpath("//*[contains(text(),'Harry Potter and the Goblet of Fire')]");


    /*

   //*[contains(@title, 'Harry Potter and the Goblet of Fire') and @class='thumb-link']/following::a[@href='/harry-potter-and-the-prisoner-of-azkaban/9781338299168-rco-us.html?cgid=6_1']
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    */



    public void searchBookType(String bookInfo){
        try { Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();}
        fluentWaitMethod(searchBookType,20);
        type(searchBookType,bookInfo); }

    public void clickSearchButton(){
        if (getElement(close2ndPopup).isDisplayed()) {
            clickThis(close2ndPopup);
        } else {
            System.out.println("close element not present");
        }
        clickThis(clickSearchButton);
    }
    public void clickHarryPotterGoFQuickView(){
        try { Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickHarryPotterGoFQuickView,20);
        act.doubleClick(getElement(clickHarryPotterGoFQuickView)).build().perform();
        try { Thread.sleep(4000);
        } catch (InterruptedException e){
            e.printStackTrace(); }

        //clickThis(clickHarryPotterGoFQuickView);
    }
    public void clickRecommendButton(){
        try { Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickRecommendButton,20);
        act.doubleClick(getElement(clickRecommendButton)).build().perform();
        //clickThis(clickRecommendButton);
    }
    public void clickCloseListButton(){

        fluentWaitMethod(clickCloseListButton,20);
        try {
            act.doubleClick(getElement(clickCloseListButton)).build().perform();
        } catch (NoSuchElementException e) {
            System.out.println("no close element found");
        }

        //clickThis(clickCloseListButton);
    }
    public void clickStudentCheckBox(){
        try { Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickStudentCheckBox,20);
        clickThis(clickStudentCheckBox);
    }
    public void clickCloseQuickView(){
        try { Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickCloseQuickView,20);
        clickThis(clickCloseQuickView);
    }
    //Now check My List for the recommendation
    public void clickMyListHeader() {
        try { Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();        }
        fluentWaitMethod(clickMyListHeader, 20);
        clickThis(clickMyListHeader);
        try { Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();        }
        fluentWaitMethod(clickRecommForStudents, 20);
        clickThis(clickRecommForStudents);
    }
    public void verifyHarryPGOF(String fullName){
        try { Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        String nameStoredString = getElementText(verifyHarryPGOF);
        Assert.assertEquals(nameStoredString,fullName,"Are not equal");
    }

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
