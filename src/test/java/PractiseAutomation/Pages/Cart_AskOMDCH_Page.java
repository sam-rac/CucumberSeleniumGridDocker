package PractiseAutomation.Pages;

import PractiseAutomation.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cart_AskOMDCH_Page extends BasePage {
    @FindBy(css = "td[class='product-name']>a")
    private WebElement productName;

    @FindBy(xpath = "//input[@title='Qty']")
    private WebElement quantityAdded;
    public Cart_AskOMDCH_Page(WebDriver driver) {
        super(driver);
    }

    public String getProductName(){
        return  wait.until(ExpectedConditions.visibilityOf(productName)).getText();
    }
    public int getProdQuantity(){
        return Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(quantityAdded)).getAttribute("value"));
    }

}
