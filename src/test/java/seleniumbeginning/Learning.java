package seleniumbeginning;

import Utility.Browser;
import org.openqa.selenium.WebDriver;

//import TestCases.TestCase002_AdminPage;

    public class Learning {
    public static void main(String[] args) {

        Browser br = new Browser("chrome");
       br.launchBrowser();
        br.maximize();
        br.navigateUrl("https://parabank.parasoft.com/parabank/index.htm");

    //  br.navigateUrl("https://parabank.parasoft.com/parabank/index.htm");
        WebDriver driver = br.getDriver();




       //TestCase001_Login.TestCase001_ValidateLoginPage(driver);
      //  TestCase002_AdminPage.TestCase002_ValidateAdmin(driver);
      //  TestCase001_LoginHRM.TestCase001_ValidateLoginPage(driver);
       // TestCase001_Login.TestCase001_ValidateLoginPage(driver);


    }
}
