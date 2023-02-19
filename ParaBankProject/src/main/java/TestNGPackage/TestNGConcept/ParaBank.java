package TestNGPackage.TestNGConcept;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaBank {
    /*Browser br;
    LoginPage Login;
    WebDriver driver;*/
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("It will run before start of every method");
       Reporter.log("Method Reports");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("here browser will open & maximize");
       Reporter.log("Successfull");
    }
    @Test (priority = 1)
    public void enterUsername() {
        System.out.println("We entered Mohan");
    Reporter.log("name has been entered");
    }
    @Parameters({"Password"})
    @Test
    public void enterPassword() {
        System.out.println("We entered Password");
      Reporter.log("name has been entered");
    }
}
