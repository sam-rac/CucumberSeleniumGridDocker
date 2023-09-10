package PractiseAutomation.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
    private static Product_AskOMDCH_Page productAskOMDCHPage;
    private static Cart_AskOMDCH_Page cartAskOMDCHPage;

    public static Product_AskOMDCH_Page getProductPage(WebDriver driver){
        return productAskOMDCHPage == null ? new Product_AskOMDCH_Page(driver) : productAskOMDCHPage;
    }

    public static Cart_AskOMDCH_Page getCartPage(WebDriver driver){
        return cartAskOMDCHPage == null ? new Cart_AskOMDCH_Page(driver) : cartAskOMDCHPage;
    }

}
