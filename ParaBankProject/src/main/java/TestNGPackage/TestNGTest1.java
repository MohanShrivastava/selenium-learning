package TestNGPackage;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Utility.Browser;
import pageObject.LoginPage;
import pageObject.TestData;


public class TestNGTest1 {
    LoginPage login;
    WebDriver driver;
    Browser br;

    @BeforeSuite
    public void beforeSuit() {
        br = new Browser(TestData.browser);
    }

    @BeforeTest
    public void beforeTest() {
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        login = new LoginPage(br.getDriver());
    }

   // @BeforeMethod
    @Test(testName = "My Bank")
    public void loginToParaBank() {
        br.navigateUrl(TestData.url);
        login.enterUsername(TestData.username);
        login.enterPassword(TestData.password);
        login.loginButton();
        Assert.assertEquals(login.getErrorElement().getText(), TestData.errormessage);
        System.out.println("We are in Login Parank Module");

    }

    @Test
    public void reTest1() {
        Reporter.log("Retest Report");
        System.out.println("reTest1");

    }
}
