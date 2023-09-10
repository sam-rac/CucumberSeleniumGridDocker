package PractiseAutomation.Pages;

import PractiseAutomation.Base.PageObjectBase;
import PractiseAutomation.ElementUtils.ElementUtil;
import org.openqa.selenium.By;

import java.util.Random;

public class Login_AE_Page extends PageObjectBase {
    private String usrEmail;
    private String usrPsw;
    ElementUtil elementUtil = new ElementUtil();
    private By EmailTxtBx = By.xpath("//input[@placeholder='Name']");
    private By PswdTxBx = By.xpath("//input[@data-qa='signup-email']");
    private By signupBtn = By.xpath("//button[normalize-space()='Signup']");
    @Override
    public void navigateHere() {

    }
    public void enterEmail(String email){
        String randEmal = elementUtil.randomEmail();
       elementUtil.enterTextBox(EmailTxtBx,randEmal);
        this.usrEmail = randEmal;
    }
    public void enterPswd(String pswd){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        String randPsw= "username@"+randomInt;
        elementUtil.enterTextBox(PswdTxBx,randPsw);
        this.usrPsw=randPsw;
    }
    public void clickSignupBtn(){
        getBaseDriver().findElement(signupBtn).click();
    }
    public String getEmail() {
        return usrEmail;
    }
}
