package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class  LoginPage {

    //saving all paths & Object here inside diffrent variables.
    /*private String txtUsername = "//*[@name='username']";
    private String txtPassword = "//*[@name='password']";
    private String btnLogin = "//*[@value='Log In']";
    private String txtLoanProcessor ="//select[@id='loanProcessor']";*/
    private String txtThreshold ="//*[@id='loanProcessorThreshold']";
    private String labelError = "p.error";

    public WebDriver driver;

    //constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //making method
    //making web element e in which we will store searched below element
    // in that searched element we will send value through send keyys function
    public void enterUsername(String username) {
        WebElement e = driver.findElement(By.xpath("//*[@name='username']"));
        e.sendKeys(username);
        Reporter.log("Entering username:" +username);

    }
    public void enterPassword(String password) {
        WebElement e = driver.findElement(By.xpath("//*[@name='password']"));
        e.sendKeys(password);
        Reporter.log("Entering password:" +password);
    }

    public void loginButton() {
        driver.findElement(By.xpath("//*[@value='Log In']")).click();
        Reporter.log("Clicking login button");
    }


   //Admin page button

    public void adminPageButton() {
        driver.findElement(By.linkText("Admin Page")).click();
    }

    //ddloanProvider

    public void ddLoanProvider(){
        driver.findElement(By.id("loanProvider")).click();
    }
    //dd loan provider local option
    public void ddLoanProviderLocal(){
        driver.findElement(By.xpath("//*[@value='local']")).click();
    }


   //dd loan processor 2nd method by select
    public  void ddLoanProcessorMethod() {
       // WebElement ele = driver.findElement(By.xpath("//select[@id='loanProcessor']"));
        //by css selector
        WebElement ele =  driver.findElement(By.cssSelector("select#loanProcessor"));
        Select ddLoanProcessor = new Select(ele);
      // ddLoanProcessor.deselectByIndex(1);
        ddLoanProcessor.selectByValue("combined");// which ultimately will select - Available// Funds

    }
    //used .clear

    public void enterThreshold(String percentage) {

        driver.findElement(By.xpath("//*[@id='loanProcessorThreshold']")).clear();


        WebElement e = driver.findElement(By.xpath("//*[@id='loanProcessorThreshold']"));
        e.sendKeys(percentage);

    }
    public WebElement getErrorElement(){
        return driver.findElement(By.cssSelector(labelError));
    }
}