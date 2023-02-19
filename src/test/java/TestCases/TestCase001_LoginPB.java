package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class TestCase001_LoginPB {
    public static void TestCase001_ValidateLoginPage(WebDriver driver){
        boolean found=driver.getTitle().contains("ParaBank");
        if (!found){
            System.out.println("test case is failed for para bank");
        }

        //By.tagName
        //tagname is a part of DOM structure evrythng defind by input tag,op tag,button tag
        //driver is used to automate.
        //Webelement is anything that is present on web page
        WebElement eleLableCustomerLogin = driver.findElement(By.tagName("h2"));
        String title = eleLableCustomerLogin.getText();
        if(!title.equals("Customer Login")) {
            System.out.println("test case is failed for customer login");
        }
        //by tag for username

        WebElement eleLableUsername= driver.findElement(By.tagName("b"));
        String  subtitle = eleLableUsername.getText();
        if(!title.equals("Username")) {
            System.out.println("test case is failed username");
        }


        // By.name
        //inserting data in username and password
        //sendkeys method is used to type content automatically in editable field
        //find element
        WebElement eleUserName = driver.findElement(By.name("txtUsername"));
        eleUserName.sendKeys("Mohan");

        //password
        WebElement eleUserPassword = driver.findElement(By.name("password"));
        eleUserPassword.sendKeys("Mohan");

        //login Button
        WebElement eleLoginButton = driver.findElement(By.id("loginPanel")).findElement(By.className("button") );
        eleLoginButton.click();
    }

}
