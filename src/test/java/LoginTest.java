import cucumber.api.CucumberOptions;
/*changes of bob*/


import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by yulia on 3/1/18.
 */
@CucumberOptions(
        features = "src/test/resources/features/rest",
        glue = {"rest/steps"})
@RunWith(Cucumber.class)
public class LoginTest {

}
