package Pages.Scholastic;

import Pages.Commands;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ReccomendListTC3 extends Commands {

    //By locators
    By searchBookType = By.xpath("//*[contains(@class, 'custom-placeholder')]");
    By clickSearchButton = By.xpath("//*[contains(@class, 'custom-placeholder')]/following-sibling::button");

    By clickHarryPotterGoFQuickView = By.xpath("//*[contains(@title, 'Harry Potter and the Goblet of Fire') and @class='thumb-link']/following::a[@href='/harry-potter-and-the-prisoner-of-azkaban/9781338299168-rco-us.html?cgid=6_1' and @class='quickview']");
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
    By a = By.xpath("");
    */



    public void searchBookType(String bookInfo){
        try { Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();}
        fluentWaitMethod(searchBookType,20);
        type(searchBookType,bookInfo); }

    public void clickSearchButton(){
        try { Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();}
        fluentWaitMethod(clickSearchButton,20);
        clickThis(clickSearchButton);
    }
    public void clickHarryPotterGoFQuickView(){
        try { Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickHarryPotterGoFQuickView,20);
        clickThis(clickHarryPotterGoFQuickView);
    }
    public void clickRecommendButton(){
        fluentWaitMethod(clickRecommendButton,20);
        clickThis(clickRecommendButton);
    }
    public void clickCloseListButton(){
        fluentWaitMethod(clickCloseListButton,20);
        clickThis(clickCloseListButton);
    }
    public void clickStudentCheckBox(){
        fluentWaitMethod(clickStudentCheckBox,20);
        clickThis(clickStudentCheckBox);
    }
    public void clickCloseQuickView(){
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
        try { Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();        }
        fluentWaitMethod(clickRecommForStudents, 20);
        clickThis(clickRecommForStudents);
    }
    public void verifyHarryPGOF(String fullName){
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
