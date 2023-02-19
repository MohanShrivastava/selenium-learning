package TestCases.ui.admin;

import Utility.Browser;
import Utility.TestDataReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.AdminPage;
import pageObject.LoginPage;

import java.util.Properties;

public class AdminValidCases {
    Browser br;
    LoginPage login;
    WebDriver driver;
    Properties browser;
    Properties testCase;
    AdminPage admin;


    @BeforeMethod
    public void readBrowser() {
        browser = TestDataReader.readProperties("Browser.properties");
        br = new Browser(browser.getProperty("browser"));
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
       // login = new LoginPage(br.getDriver());
        admin=new AdminPage(br.getDriver());
    }

    @Test
    public void tc002_parabank_adminPage() {
        br.navigateUrl(browser.getProperty("url"));
        admin.clickAdminPageButton();
        admin.clickInitializeButton();
        admin.clickCleanButton();
        admin.clickShutdownButton();
        admin.clickSoapButton();
        admin.clickRestXMLButton();
        admin.clickRestJSONButton();
        admin.clickJDBCButton();


    }
}
