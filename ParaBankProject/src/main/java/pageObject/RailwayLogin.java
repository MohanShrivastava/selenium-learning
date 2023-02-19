package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RailwayLogin {
    private String txtFrom = "//*[@class='form-group ng-tns-c57-8 ng-invalid ng-touched ng-dirty']";
    private String txtTo = "//*[@class='form-group ng-tns-c57-9 ng-pristine ng-invalid ng-touched']";
    private WebDriver driver;

    public RailwayLogin(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFrom(String txtFrom) {
        WebElement e = driver.findElement(By.xpath("//*[@class='form-group ng-tns-c57-8 ng-invalid ng-touched ng-dirty']"));
        e.sendKeys(txtFrom);
    }
}
