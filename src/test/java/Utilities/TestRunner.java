package Utilities;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\features"},

        glue = {"StepDefinition","DriverWrapper"},//was not working before bc incorrect location it seems
        //"src\\test\\java\\StepDefinition" = not correct

        tags = {"@TC9"},


        plugin = {"pretty", "html:Reports/Default/"}

)



public class TestRunner {

}
