package PractiseAutomation.Base;

import PractiseAutomation.utils.ConfigLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver,this);
    }

    public void load(String app){
        String url = null;
        if(app.equalsIgnoreCase("askomdch")){
            url= ConfigLoader.getInstance().getBaseUrl("askomdch");
        } else if (app.equalsIgnoreCase("automationexercise")) {
            url = ConfigLoader.getInstance().getBaseUrl("automationexercise");
        }
        else{
            System.out.println("Wrong URL Choise");
        }
        driver.get(url);
    }

    protected WebDriver driver;//protected : so that its accessible to pageobjects
    protected WebDriverWait wait;
}
