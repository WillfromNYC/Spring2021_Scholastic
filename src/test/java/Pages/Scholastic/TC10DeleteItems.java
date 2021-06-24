package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC10DeleteItems extends Commands {

    Actions act = new Actions(Web.getDriver());

    //By locators
    By clickEnterOrders = By.xpath("//div[contains(@class, 'sidecarmenu-overlay')]/following::*[contains(@class, 'wrapper-content')]/following::*[contains(@class, 'hide-mobile desktop_nav_menu')]//a[@id='enter-orders']");
    //div[contains(@class, 'sidecarmenu-overlay')]/following::*[contains(@class, 'wrapper-content')]/following::*[contains(@class, 'hide-mobile desktop_nav_menu')]//a[@id='enter-orders']
    //*[contains(@class, 'sidecarmenu-overlay')]/descendant::*[contains(@id, 'enter-orders')]

    // *[contains(@class, 'header-authenticated-top sidecarmenu')]//ul/li/a[@id='enter-orders']
    //div[@class='header-authenticated-top sidecarmenu']/div/div/div/div/div/div/div/div/div/div/div/ul/li/*[contains(@id, 'enter-orders')]
    //absolute path works:  /html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]
    //*[contains(@class,'header-authenticated-top sidecarmenu')]//*[contains(@class, 'subheader-menu')]//li[contains(@class, 'topcategory')]/descendant::*[contains(@id, 'enter-orders')]

    By clickStudentFlyerOrder = By.xpath("//div[contains(@class, 'sidecarmenu-overlay')]/following::*[contains(@class, 'wrapper-content')]/following::a[@href= 'https://clubs3qa1.scholastic.com/sfoshow']");

    //needs editing //div[contains(@class, 'sidecarmenu-overlay')]/following::*[contains(@class, 'wrapper-content')]/following::*[contains(text(), ' Student Flyer Orders')]
    //*[contains(@id, 'student-flyer-orders')][1]
    By studentNameType = By.xpath("//*[contains(@id, 'student-name')]");
    By itemNumType = By.xpath("//*[contains(@id, 'item-number')]");
    By clickAddButton = By.xpath("//*[contains(@id, 'btn-add')]");
    By QuantityType = By.xpath("//*[contains(@class, 'input-qty numericenteronly')]");
    By clickCloseNotification = By.xpath("//*[@class='tooltipster-close ']");
    By clickReviewCart = By.xpath("//*[@class='tertiary']");


    By clickXDeleteButton = By.xpath("//*[contains(text(),'11S8')]/following::*[contains(@class, 'fa fa-times-circle remove')][1]");
    By clickYesDelete = By.xpath("//*[contains(text(),'11S8')]/following::*[contains(@class, 'fa fa-times-circle remove')][1]/following::*[contains(text(),'Yes')][1]");


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
    By a = By.xpath("");*/


    public void clickEnterOrders(){
        try { Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickEnterOrders,20);
        act.moveToElement(getElement(clickEnterOrders)).build().perform();
        try { Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace(); }

        clickThis(clickEnterOrders);
        //clickFromMultipleLocators(clickEnterOrders,"Enter Orders");

    }

    public void clickStudentFlyerOrder(){
        try { Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickStudentFlyerOrder,20);
        clickThis(clickStudentFlyerOrder);
    }

    public void studentNameType(String sName){
        try { Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();}
        fluentWaitMethod(studentNameType,20);
        type(studentNameType,sName); }

    public void itemNumType(String item){
        try { Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();}
        fluentWaitMethod(itemNumType,20);
        type(itemNumType,item);
        try { Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();}}


    public void clickAddButton(){
        try { Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickAddButton,20);
        clickThis(clickAddButton);
    }
    public void QuantityType(String quantityNum){
        try { Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();}
        fluentWaitMethod(QuantityType,20);
        type(QuantityType,quantityNum); }

    public void clickReviewCart(){
        try { Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickReviewCart,20);
        clickThis(clickReviewCart);
    }

    public void clickXDeleteButton(){
        try { Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickXDeleteButton,20);
        clickThis(clickXDeleteButton);
    }

    public void clickYesDelete(){
        try { Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace(); }
        fluentWaitMethod(clickYesDelete,20);
        clickThis(clickYesDelete);
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
