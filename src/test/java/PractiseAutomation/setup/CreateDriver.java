package PractiseAutomation.setup;

import PractiseAutomation.Hooks.CucumberHooks;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateDriver {
    private String browser;
    public CreateDriver() {
        if(CucumberHooks.getDriver()==null) {
            this.browser = "chrome";
            createDriver();
        }
    }

   public void createDriver(){
      switch (browser){
          case "chrome":
              //System.setProperty("webdriver.chrome.silentOutput", "true");
              CucumberHooks.setDriver(new ChromeDriver(new ChromeOptions().addArguments("start-maximized")));
              CucumberHooks.getDriver().manage().window().maximize();
      }
   }
}
