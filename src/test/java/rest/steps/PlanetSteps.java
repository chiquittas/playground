package rest.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

import java.util.Map;

/**
 * Created by yulia on 3/4/18.
 */
public class PlanetSteps extends CommonStepDefinition{

    @Then("^\"([^\"]*)\" has \"([^\"]*)\" \"([^\"]*)\"$")
    public void planetHasIs(String parameterName, String parameterValue) throws Throwable {
        Object value = planetObj.getClass().getMethod(getMethodNameByParam(parameterName, planetObj))
                .invoke(planetObj);

        assert value.equals(parameterValue) : "Parameter < " + parameterName + "> actual value is <"+ value +"> while expected value is <" + parameterValue + ">";

    }


    @Then("^planet has:$")
    public void planetHas(DataTable t)  {
        Map<String, String> expectedPlanet = t.asMap(String.class, String.class);

        System.out.printf( planetObj.toString());

        expectedPlanet.entrySet()
                .forEach(entry -> invokeMethod(entry.getKey() , planetObj).toString().equals(entry.getValue())
                );
    }

}
