package Pages.Hotels;

import DriverWrapper.Web;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TC17HotelsCalender extends Commands {

    Web web = new Web();
    Date currentDate = new Date();
    SimpleDateFormat fMonth = new SimpleDateFormat("MMM");
    SimpleDateFormat fDay = new SimpleDateFormat("dd");
    SimpleDateFormat fYear = new SimpleDateFormat("yyyy");

    SimpleDateFormat fMonthYear = new SimpleDateFormat("MMM yyyy");

    String fMonthString = fMonth.format(currentDate);
    String fDayString = fDay.format(currentDate);
    String fYearString = fYear.format(currentDate);

    String fDayAdjusted = "";
    String fMDY = "";
    String fDay28 = "28";

    int fMonthInt = Integer.valueOf(fDayString);
    int fDayInt = Integer.valueOf(fDayString);
    int fYearInt = Integer.valueOf(fDayString);

    String fMonthYearString = fMonthYear.format(currentDate);

    //By locators
    By clickClosePopup = By.xpath("//*[@class='modal-button modal-button-close']");
    By clickCheckIn = By.xpath("//*[contains(text(),'Where to?')]/following::*[contains(text(),'Check in')][1]");
    //*[contains(text(),'Destination')]/following::*[contains(text(),'Check in')][2]
    By clickPreviousButton = By.xpath("//*[@aria-label='Previous']");

    String yesterdayDateString = "//button[contains(@name,'" + checkDaysBefore() +"')]";
    By yesterdayDate = By.xpath(yesterdayDateString);
    By clickPreviousMonthCal = By.xpath("//*[contains(@aria-label, 'Previous')]");

    /*

    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");*/

    public void openHotels() {
        web.openUrl("https://www.hotels.com/");
        Web.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickClosePopup() {
        fluentWaitMethod(clickClosePopup, 20);
        clickThis(clickClosePopup);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickCheckIn() {
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(getElement(clickCheckIn)).build().perform();
        fluentWaitMethod(clickCheckIn, 20);
        clickThis(clickCheckIn);
    }

    public String checkDaysBefore(){
        //System.out.println(fDayInt);

        if ((fMonthInt==1) && (fDayInt==1)){//if month is Jan then need to change date to Dec, 28, and (year - 1)
            fYearInt = fYearInt - 1;
            fYearString = String.valueOf(fYearInt);
            fMDY = "12"+ " " + fDay28 + " " + fYearString;

        } else if((fMonthInt>=2) && (fDayInt==1)) {//if day = 1 then need to lower month, but also is Feb or above
            fMonthInt = fMonthInt - 1;
            fMonthString = String.valueOf(fMonthInt);
            fMDY = fMonthInt+" " + fDay28 + " " + fYearString;

        } else { //if(fDayInt>=2)
            fDayInt = fDayInt - 1;
            fDayAdjusted = String.valueOf(fDayInt);
            fMDY = fMonthString+" " + fDayAdjusted + " " + fYearString;
        }
        //System.out.println("fMDY's current value is: " + fMDY);
        return fMDY;
    }

    public void yesterdayDate() {
        //fluentWaitMethod(yesterdayDate, 10);
        Assert.assertFalse(isElementDisplayed(yesterdayDate));
    }

    public void clickPreviousMonthCal(){

        try { Thread.sleep(3000);
            getCleanElement(clickPreviousMonthCal);
        } catch (InterruptedException e){
            System.out.println("previous month element does not exist");
        }



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
    }*/

}
