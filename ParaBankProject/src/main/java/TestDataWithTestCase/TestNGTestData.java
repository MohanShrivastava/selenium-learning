package TestDataWithTestCase;

import Utility.TestDataReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utility.Browser;
import pageObject.LoginPage;

import java.util.Properties;


public class TestNGTestData {
    LoginPage login;
    WebDriver driver;
    Browser br;
    Properties browser;
    Properties testCase;

    @BeforeMethod
    //read browser named .properties
    public void readTestData(){
        browser= TestDataReader.readProperties("Browser.properties");
        br =new Browser(browser.getProperty("browser"));
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        login = new LoginPage(br.getDriver());

    }
    @Test
    public void TC_001(){
        testCase=TestDataReader.readProperties("TC_001.properties");
        br.navigateUrl(browser.getProperty("url"));
        login.enterUsername(testCase.getProperty("username"));
        login.enterPassword(testCase.getProperty("password"));
        login.loginButton();
        Assert.assertEquals(login.getErrorElement().getText(),testCase.getProperty("errorMsg"));

    }

}
