package TestCases.ui.login;

import Utility.Browser;
import pageObject.TestData;

public class TestCase001_Login {
    public static void main(String[] args) {
        Browser br = new Browser(TestData.browser);
        br.launchBrowser();
        br.maximize();
        br.navigateUrl(TestData.url);
        //login object
       /* LoginPage login = new LoginPage(br.getDriver());
        login.enterUsername(TestData.username);
        login.enterPassword(TestData.password);
        login.loginButton();
        login.adminPageButton();
        login.ddLoanProvider();
        login.ddLoanProviderLocal()*/;
       // login.ddLoanProviderM2();
      //  login.ddloanprocessor();

       // LoginPage dd = new LoginPage(br.getDriver());
        //Select select=new Select(dd)



     /* //  AdminPage adminPage=new AdminPage();
        //login.adminPageButton();

       // RailwayLogin rl=new RailwayLogin()*/


       //login.ddLoanProcessorMethod();
       // login.enterThreshold("85");








    }
}
