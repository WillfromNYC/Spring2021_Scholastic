package Pages.Scholastic;

import Pages.Commands;
import org.openqa.selenium.By;

public class TC6InvalidItem extends Commands {

    //By locators

    By visibleErrorMessage = By.xpath("//*[@id='error-message-tooltip']");



    /*
    By a = By.xpath("//*[@id='error-message-tooltip']");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");*/

    public void visibleFlyerJumper(){
        fluentWaitMethod(visibleErrorMessage,20);
        isElementDisplayed(visibleErrorMessage);
    }

}
