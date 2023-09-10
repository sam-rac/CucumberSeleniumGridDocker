package PractiseAutomation.Base;

import PractiseAutomation.Factory.DriverFactory;
import PractiseAutomation.context.TestContext;
import org.openqa.selenium.WebDriver;

public abstract class PageObjectBase {
    private WebDriver driver;
/*    public PageObjectBase(TestContext context) {
        this.tempdriver = context.driver;//DriverFactory.getDriver();
    }*/

    public WebDriver getBaseDriver() {
        return driver;
    }

    /** implement logic needed to navigate to the page this method is present on */
    public abstract void navigateHere();
}
