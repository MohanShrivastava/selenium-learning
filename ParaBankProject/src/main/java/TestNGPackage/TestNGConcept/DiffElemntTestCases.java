package TestNGPackage.TestNGConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utility.Browser;
import pageObject.Guru99NGlobalSQA;

public class DiffElemntTestCases {
    Browser br;
    WebDriver driver;
    Guru99NGlobalSQA globalPage;

    @BeforeMethod
    public void beforeMethod() {
        br = new Browser("chrome");
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        //to automate class Guru99NGlobalSQA with help of globalPage
        globalPage = new Guru99NGlobalSQA(driver);
    }

    @Test
    public void selectDate() {
        //  br.navigateUrl("https://www.globalsqa.com/demo-site/datepicker/");
        br.navigateUrl("https://seleniumpractise.blogspot.com/search?q=calendar");
        Actions ac = new Actions(driver);
        ac.click(globalPage.labelDate).build().perform();

        ac.click(globalPage.labelBackwardButton).build().perform();
         ac.click(globalPage.LabelExactDateno).build().perform();



    }
}
