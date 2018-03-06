package ui;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by yulia on 3/1/18.
 */
public class BrowserFactory {

    public static WebDriver getBrowser(String browserName) {
        browserName = browserName.toLowerCase();
        WebDriver driver = null;

        if (browserName.equalsIgnoreCase("chrome"))
            driver = getChromeInstance();
        else if (browserName.equalsIgnoreCase("htmlunit"))
            driver = getHtmlUnitInstance();
        else
        driver = getFFInstance();

        WebDriverRunner.setWebDriver(driver);
        return driver;
    }

     private static FirefoxDriver getFFInstance() {
        return new FirefoxDriver();
    }

    private static ChromeDriver getChromeInstance() {
        String chromeDriverPath = BrowserFactory.class.getClassLoader().getResource("drivers/chromedriver").getPath();
        System.out.println("== " + chromeDriverPath);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        return new ChromeDriver();
    }

     private static HtmlUnitDriver getHtmlUnitInstance() {
        return new HtmlUnitDriver();
    }
}
