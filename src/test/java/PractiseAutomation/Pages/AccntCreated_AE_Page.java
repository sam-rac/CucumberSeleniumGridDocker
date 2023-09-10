package PractiseAutomation.Pages;

import PractiseAutomation.Base.PageObjectBase;
import org.openqa.selenium.By;

public class AccntCreated_AE_Page extends PageObjectBase {
    private By succMsg = By.xpath("//b[normalize-space()='Account Created!']");
    private By continueBtn = By.className("btn-primary");

    @Override
    public void navigateHere() {

    }
    public boolean successMessageVerification(){
        String successMsg = getBaseDriver().findElement(succMsg).getText();
        System.out.println(successMsg);
        if(successMsg.equalsIgnoreCase("Account Created!")) return true;
        else return false;
    }
    public void clickContinueBtn(){
        getBaseDriver().findElement(continueBtn).click();
    }
}
