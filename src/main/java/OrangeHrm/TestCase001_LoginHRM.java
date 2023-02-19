package OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase001_LoginHRM {
    public static void TestCase001_ValidateLoginPage(WebDriver driver) {

        boolean found=driver.getTitle().contains("OrangeHRM");
        if (!found){
            System.out.println("test case is failed for para bank");
        }

           // WebElement eleUserName = driver.findElement(By.name("txtUsername"));
          //  eleUserName.sendKeys("Mohan");

           WebElement eleUserUsername2 = driver.findElement(By.xpath("//*[@id='txtUsername']"));
            eleUserUsername2.sendKeys("Mohan");

            WebElement eleUserPassword2 = driver.findElement(By.xpath("//*[@id='txtPassword']"));
            eleUserPassword2.sendKeys("Mohan");

            WebElement eleLoginButton2 = driver.findElement(By.xpath("//*[@id='btnLogin']") );
            eleLoginButton2.click();


        }
    }
