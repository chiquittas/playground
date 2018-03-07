import cucumber.api.CucumberOptions;
/*changes of bob*/
/*origin/master*/

/*rebase test by ch */
/*rebase test by chick 2 */


/*rebase test by bob */

/* bob changes stuff in master */

/* one more rebase by bob in master */
/* change in branch bob rb*/


import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

/**
 * xx Edited by chiquittas on 3/1/18.
 */
@CucumberOptions(
        features = "src/test/resources/features/rest",
        glue = {"rest/steps"})
@RunWith(Cucumber.class)
public class LoginTest {

}
