package PractiseAutomation.context;

import PractiseAutomation.Objects.Cookies;
import org.openqa.selenium.WebDriver;

public class TestContext {
    public WebDriver driver;
    public Cookies cookies;

    public TestContext(){
        cookies = new Cookies();
        cookies.setCookies(new io.restassured.http.Cookies());
    }
}
