package rest.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by yulia on 3/4/18.
 */
public class FilmSteps extends CommonStepDefinition{

    @When("^user gets info about planet movie \"([^\"]*)\"$")
    public void userGetsInfoAboutPlanetMovie(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^film has \"([^\"]*)\" \"([^\"]*)\"$")
    public void filmHas(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
