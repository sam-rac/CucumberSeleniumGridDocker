package PractiseAutomation.ElementUtils;

import PractiseAutomation.Base.PageObjectBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class ElementUtil extends PageObjectBase {

    public void enterTextBox(By txtBx, String text){
        getBaseDriver().findElement(txtBx).clear();
        getBaseDriver().findElement(txtBx).sendKeys(text);
    }

    public void selectRadioBtnChkBx(By RdBtChkBx){
        getBaseDriver().findElement(RdBtChkBx).click();
    }

   public void selectDropdown(By drpdwn,String visibleTxt){
       Select selectTag = new Select(getBaseDriver().findElement(drpdwn));
       selectTag.selectByVisibleText(visibleTxt);
   }

   public String randomEmail(){
       Random randomGenerator = new Random();
       int randomInt = randomGenerator.nextInt(1000);
       String randomEmail = "username"+ randomInt +"@gmail.com";
       return randomEmail;
   }

    @Override
    public void navigateHere() {

    }
}
