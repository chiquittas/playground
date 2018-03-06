package rest.steps;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import rest.model.Films;
import rest.model.People;
import rest.model.Blanet;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

/**
 * Created by yulia on 3/4/18.
 */
public class CommonStepDefinition {
    public RequestSpecification request;
    public Response response;
    public final String baseUrl = "https://swapi.co/api"; // should be in config
    Logger log = Logger.getLogger(CommonStepDefinition.class.getName());
    Headers headerList = new Headers(new Header("Content-Type","application/json"),
            new Header("Accept", "application/json"));
    Gson gson = new Gson();
    Films filmObj = new Films();
    People peopleObj = new People();
    Blanet planetObj = new Blanet();



    private  <T> Object mapper(Response response, T cl){


        Type collectionType = new TypeToken<People>(){}.getType();
        People responseObj = null;

        try {
            System.out.printf(response.body().asString());
            responseObj =  gson.fromJson(response.body().asString(), collectionType);
        }
        catch(Exception e){
            System.out.println(" Failed" );
            e.printStackTrace();
        }


        return responseObj;


    }

    @When("^\"([^\"]*)\" is requested$")
    public void isRequested(String arg0) throws Throwable {
        String homeUrl = peopleObj.getHomeworld();
        request = given().headers(headerList);
        response = (Response) request
                .when().get(homeUrl);

        response.then().statusCode(200);
        planetObj = gson.fromJson(response.body().asString(), Blanet.class);


    }



//    public void planetHasIs(String parameterName, String parameterValue) throws Throwable {
//    }



     String getMethodNameByParam(String parameterName, Object obj){
        List<Method> n = Arrays.stream(obj.getClass() .getMethods())
                .filter(e -> e.getName().toLowerCase()
                        .startsWith("get"+parameterName.toLowerCase())
                ).collect(Collectors.toList());

        System.out.println("getMethodNameByParam " + parameterName + " size " + n.size());

        return n.get(0).getName();
    }
     Object invokeMethod(String key, Object obj){
        try {
            return obj.getClass()
                    .getMethod(getMethodNameByParam(key, planetObj)).invoke(planetObj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return new Blanet();
    }

 }
