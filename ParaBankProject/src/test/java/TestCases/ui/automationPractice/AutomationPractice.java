package TestCases.ui.automationPractice;

import Utility.Browser;
import Utility.TestDataReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.AutomationPracticePage;

import java.util.Properties;

public class AutomationPractice {
    Browser br;
    WebDriver driver;
    Properties browser;
    AutomationPracticePage techlistic;

    @BeforeMethod
    public void readBrowser() {
        browser = TestDataReader.readProperties("Browser.properties");
        br = new Browser(browser.getProperty("browser"));
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        // login = new LoginPage(br.getDriver());
        techlistic = new AutomationPracticePage(br.getDriver());
    }
    @Test
    public void tc_001TechlisticCases(){
        br.navigateUrl(browser.getProperty("url"));
        techlistic.clickUsernameBox();
        techlistic.clickPasswordBox();
        techlistic.clickSubmitButton();
        techlistic.LoginSUccessMessage();
        Assert.assertEquals("Logged In Successfully","Logged In Successfully");
        techlistic.CongratsMessage();
        Assert.assertEquals("Congratulations student. You successfully logged in!","Congratulations student. You successfully logged in!");
        driver.navigate().refresh();
        driver.navigate().back();
        techlistic.LoginButtonVerification();

    }
}
