package PractiseAutomation.Hooks;

import PractiseAutomation.Factory.DriverFactory;
import PractiseAutomation.context.TestContext;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CucumberHooks {
    private WebDriver driver;
    private final TestContext context;
    public CucumberHooks(TestContext context){
        this.context=context;
    }
    private static ThreadLocal<RemoteWebDriver> drivers = new ThreadLocal<RemoteWebDriver>();
    public static RemoteWebDriver getDriver() {
        return drivers.get();
    }
    public static void setDriver(RemoteWebDriver driver) {
        drivers.set(driver);
    }
    @BeforeAll
    public static void beforeAllClass(){
        //new CreateDriver();
        System.out.println("inside cucumber hook before-all");
    }

    @Before//before each scenario
    public  void before(Scenario scenario){
        System.out.println("Before Thread ID = "+Thread.currentThread().getId()+" Scenario name = "+scenario.getName());
        driver = DriverFactory.initializeDriver(System.getProperty("browser","chrome"));
        context.driver=driver;
        System.out.println("inside cucumber hook before ");
    }

    @After//after each scenario
    public  void after(Scenario scenario){
        System.out.println("After Thread ID = "+Thread.currentThread().getId()+" Scenario name = "+scenario.getName());
        System.out.println("inside cucumber hook after ");
        driver.quit();
    }

/*
    @Before("@scenario2")//before each scenario
    public static void beforeScenario2(Scenario scenario){
        System.out.println("inside cucumber hook before scenario2");
    }

    @After("@scenario2")//before each scenario
    public static void afterScenario2(Scenario scenario){
        System.out.println("inside cucumber hook after scenario2");
    }
*/

    @AfterAll
    public static void afterAllClass(){
        System.out.println("inside cucumber hook after-all");
        //RemoteWebDriver driver = getDriver();
        //driver.quit();
    }


}
