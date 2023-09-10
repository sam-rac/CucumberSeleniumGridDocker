package PractiseAutomation.Pages;

import PractiseAutomation.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Product_AskOMDCH_Page extends BasePage {
    @FindBy(xpath = "//button[@name='add-to-cart']")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//div[@role='alert']//a[@class='button wc-forward'][normalize-space()='View cart']")
    private WebElement viewCrtBtn;



    public Product_AskOMDCH_Page(WebDriver driver) {
        super(driver);
    }

    public void selectProduct(String ProductName){
        System.out.println("Selecting Product = "+ProductName.replace("\"",""));
        By product = By.xpath("//h2[normalize-space()='"+ProductName.replace("\"","")+"']");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement prdct = wait.until(ExpectedConditions.visibilityOfElementLocated(product));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", prdct);
        prdct.click();
    }
    public void add2CartProduct(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
        //return this;
    }
    public void viewCrt(){
        wait.until(ExpectedConditions.elementToBeClickable(viewCrtBtn)).click();
        //return this;
    }

}
