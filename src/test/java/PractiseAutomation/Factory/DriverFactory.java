package PractiseAutomation.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    //private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static WebDriver initializeDriver(String browser){
        WebDriver driver;
        switch (browser.trim().toLowerCase()) {
            case "chrome" -> driver = new ChromeDriver();
            case "firefox" -> driver = new FirefoxDriver();
            default -> throw new IllegalStateException("INVALID BROWSER " + browser);
        }

        driver.manage().window().maximize();
        //DriverFactory.driver.set(driver);
        return driver;
    }

/*    public static WebDriver getDriver(){
        return driver.get();
    }*/
}
