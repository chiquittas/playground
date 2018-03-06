package ui.steps; /**
 * Created by yulia on 3/3/18.
 */
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
        Configuration.browser = "chrome";
    }

    @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
        WebDriverRunner.closeWebDriver();
    }
}