package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class  Browser {
    private String browserName;
    public static WebDriver driver;

    //Constructor named Browser()
    //Initializing the value of browserName
    //declared public cos we will call this constructor from outside the class
    public Browser(String browserName) {
        this.browserName = browserName;
    }

    //getter is used to return its value
    //getter is used also because we have declared it private on line no 6 & 7
    public String getBrowserName() {
        return browserName;
    }
    public WebDriver getDriver() {
        return driver;
    }


    // 3 methods will be made below for Launching Browser,Maximizing window & navigatng Url.
    public void launchBrowser() {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/mohanshrivastava/Desktop/Docs/Chrome Driver Test1/chromedriver");
            //Do not write again WebDriver below.
             driver = new ChromeDriver();
        } else {
            System.out.println("the driver provided is not avaialable");
        }
    }
    public void maximize(){
        //method is used under method for maximizing window
        driver.manage().window().maximize();
    }
    public void navigateUrl(String url){
        driver.get(url);
    }
}

