package rest.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import rest.model.People;

import static io.restassured.RestAssured.given;

/**
 * Created by yulia on 3/4/18.
 */
public class PeopleSteps extends CommonStepDefinition{

    @When("^user gets information about Luke Skywalker$")
    public void userGetsInformationAboutLukeSkywalker() throws Throwable {
        request = given().baseUri(baseUrl).headers(headerList);

        response = (Response) request
                .when().get("/people/1/");

        response.then().statusCode(200);

        peopleObj = gson.fromJson(response.body().asString(), People.class);

        System.out.println("==================== " + peopleObj.toString());
        //response.as(People.class);
        //

    }

    @Then("^parameter \"([^\"]*)\" is present$")
    public void parameterIsPresent(String arg0) throws Throwable {
        assert peopleObj != null : "Empty response parameter " + arg0;
    }

}
