package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
//made class
public class AutomationPracticePage {
    //used @find by for xpath
    @FindBy(xpath = "//*[@id='username']")
    public WebElement txtUsername;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement txtPassword;


    @FindBy(xpath = "//*[@id='submit']")
    public WebElement btnSubmit;

    @FindBy(xpath = "//*[@class='post-title']")
    public WebElement successMessage;


    @FindBy(xpath = "//*[text()='Congratulations student. You successfully logged in!']")
    public WebElement congratsMessage;

    //for log out button is displayed

    @FindBy(xpath = "//*[text()='Log out']")
    public WebElement logOutButtonDisplayed;




   


    public WebDriver driver;
    public WebDriverWait wait;

    public AutomationPracticePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
        this.wait = new WebDriverWait(driver, 30);
    }
    public void clickUsernameBox(){
        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(txtUsername));
        ele.sendKeys("student");
        Reporter.log("Name Entered");
    }


    public void clickPasswordBox(){
        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(txtPassword));
        ele.sendKeys("Password123");
        Reporter.log("Name Entered");
    }


    public void clickSubmitButton(){
        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
        ele.click();
        Reporter.log("Name Entered");
    }
    public void LoginSUccessMessage() {

        WebElement msg = wait.until(ExpectedConditions.elementToBeClickable(successMessage));
        msg.getText();
        System.out.println("Successwala msg");
        Reporter.log("Name Entered");
    }


    public void CongratsMessage() {

        WebElement msg = wait.until(ExpectedConditions.elementToBeClickable(congratsMessage));
        msg.getText();
        System.out.println("Congratswala msg");
        Reporter.log("Mssg displayed of Congrats");
    }
    public void LoginButtonVerification(){
        WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(logOutButtonDisplayed));

        ele.isDisplayed();
        System.out.println("Button Displayed wala");
        Reporter.log("Mssg displayed of log in button verification");
    }
}
