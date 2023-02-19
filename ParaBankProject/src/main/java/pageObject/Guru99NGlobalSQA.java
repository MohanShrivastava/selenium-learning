package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99NGlobalSQA {
    public WebDriver driver;
   // @FindBy(xpath = "//*[@id='datepicker']")
   @FindBy(xpath = "//*[@id='datepicker']")
    public WebElement labelDate;

   @FindBy(linkText = "8")
   public WebElement LabelExactDateno;


   @FindBy(xpath ="//span[@class='ui-icon ui-icon-circle-triangle-w']")
   public WebElement labelBackwardButton;

   @FindBy(className = "ui-datepicker-calendar")
   public WebElement labelTable;

    //globalSQA

    public Guru99NGlobalSQA(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}