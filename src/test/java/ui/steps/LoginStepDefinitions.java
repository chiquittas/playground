package ui.steps;
import static com.codeborne.selenide.Condition.*;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import ui.pages.LoginPage;

import java.util.Map;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by yulia on 3/2/18.
 */
public class LoginStepDefinitions {
    LoginPage loginPage;

    @Given("^user opened page \"([^\"]*)\"$")
    public void userOpenedPage(String pageUrl) throws Throwable {
        loginPage = open(pageUrl, LoginPage.class);

    }

    @And("^enters valid credentials:$")
    public void entersValidCredentials(DataTable t) throws Throwable {
        Map<String, String> credentials = t.asMap(String.class, String.class);
        entersCredentials(credentials.get("login"), credentials.get("password"));
    }

    private void entersCredentials(String userName, String password){
        loginPage.setUserName(userName);
        loginPage.setPassword(password);


    }

    @When("Sign In button is clicked$")
    public void buttonIsClicked() throws Throwable {
        loginPage.clickSignIn();
     }

    @Then("^user is logged in$")
    public void userIsLoggedIn() throws Throwable {
        loginPage.userNameField.should(disappear);
    }

    @And("^home page opens$")
    public void homePageOpens() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^enters valid login and invalid password:$")
    public void entersValidLoginAndInvalidPassword(DataTable t) throws Throwable {
        Map<String, String> credentials = t.asMap(String.class, String.class);
        entersCredentials(credentials.get("login"), credentials.get("password"));
    }

    @Then("^error message is displayed$")
    public void errorMessageIsDisplayed() throws Throwable {
        loginPage.getErrorMessage().shouldBe(visible);
    }

    @And("^user stays on the same page$")
    public void userStaysOnTheSamePage() throws Throwable {
        loginPage.userNameField.shouldBe(visible);
    }
}
