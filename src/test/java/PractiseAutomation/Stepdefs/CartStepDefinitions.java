package PractiseAutomation.Stepdefs;

import PractiseAutomation.Objects.Product;
import PractiseAutomation.Pages.Cart_AskOMDCH_Page;
import PractiseAutomation.Pages.PageFactoryManager;
import PractiseAutomation.context.TestContext;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartStepDefinitions {
    //private WebDriver driver;
    private final Cart_AskOMDCH_Page cartAskOMDCHPage;
    public CartStepDefinitions(TestContext context){
       // driver= context.driver;
        cartAskOMDCHPage = PageFactoryManager.getCartPage(context.driver);
    }
    @Then("I see the {product} in the cart")
    public void i_see_the_in_the_cart(Product product) {
        //Cart_AskOMDCH_Page cartAskOMDCHPage = new Cart_AskOMDCH_Page(driver);
        System.out.println(cartAskOMDCHPage.getProductName());
        Assert.assertTrue(product.getName().contains(cartAskOMDCHPage.getProductName()));
        System.out.println("Product in the cart =" + product.getName());
    }
    @Then("I see {int} product in cart")
    public void i_see_product_in_cart(int qunty) {
       // Cart_AskOMDCH_Page cartAskOMDCHPage = new Cart_AskOMDCH_Page(driver);
        Assert.assertEquals(qunty, cartAskOMDCHPage.getProdQuantity());
    }
}
