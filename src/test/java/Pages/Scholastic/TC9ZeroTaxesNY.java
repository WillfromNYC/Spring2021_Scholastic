package Pages.Scholastic;

import Pages.Commands;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TC9ZeroTaxesNY extends Commands {

    //By locators
    By verifyTaxes = By.xpath("//*[@class='tooltip-salestax-help hide']/following-sibling::*[@class='or-inner-data']");

    /*
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");
    By a = By.xpath("");*/

    public void verifyTaxes(){
        fluentWaitMethod(verifyTaxes,20);

        Assert.assertEquals("- -",getElementText(verifyTaxes),"item price is not equal ");
    }

}


