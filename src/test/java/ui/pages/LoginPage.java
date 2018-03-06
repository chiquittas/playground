package ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Created by yulia on 3/1/18.
 */
public class LoginPage {

    public SelenideElement userNameField = $(By.id("login-email"));

    public SelenideElement passwordField = $(By.id("login-password"));

    public SelenideElement signInButton = $(By.xpath("//form[@name=\"loginForm\"]//button"));

    public SelenideElement forgotPassword = $(By.linkText("Forgot password?"));

    public LoginPage() {
        System.out.println("--- Created");
    }



    public void appendUserName(String userName) {

        userNameField.shouldBe(visible).sendKeys(userName);
    }

    public void setUserName(String userName) {

       userNameField.shouldBe(visible).clear();
        userNameField.sendKeys(userName);
    }

    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }


    public void clickSignIn() {
        signInButton.click();
    }

    public SelenideElement getErrorMessage(){
       return $(By.xpath("//form[@name=\"loginForm\"]//div[contains(@class, \"alert\")]"));
    }

}
