package PractiseAutomation.Pages;

import PractiseAutomation.Base.BasePage;
import PractiseAutomation.Base.PageObjectBase;
import PractiseAutomation.context.TestContext;
import PractiseAutomation.utils.ConfigLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_AE_Page extends PageObjectBase {
    private WebDriver driver;
    private By SingUp_Login_Link = By.xpath("//a[normalize-space()='Signup / Login']");
    private By loggedInUser = By.xpath("//a/b");

    @Override
    public void navigateHere() {
        getBaseDriver().get(ConfigLoader.getInstance().getBaseUrl("automationexercise"));
    }

    public void clickSignupLink(){
        getBaseDriver().findElement(SingUp_Login_Link).click();
    }
    public boolean signedInUserVerification(String email){
        String userEmail =  getBaseDriver().findElement(loggedInUser).getText();
        System.out.println(userEmail);
        System.out.println(email);
        //Login_AE_Page loginPage = new Login_AE_Page();
        //String email = loginPage.getEmail();
        if (userEmail.equalsIgnoreCase(email)) return true;
        else return false;
    }
}
