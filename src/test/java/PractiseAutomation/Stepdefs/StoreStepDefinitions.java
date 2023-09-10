package PractiseAutomation.Stepdefs;

import PractiseAutomation.APIs.CartApi;
import PractiseAutomation.Objects.Product;
import PractiseAutomation.Pages.PageFactoryManager;
import PractiseAutomation.Pages.Product_AskOMDCH_Page;
import PractiseAutomation.context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StoreStepDefinitions {
    //private final WebDriver driver;
    private Product_AskOMDCH_Page productAskOMDCHPage;
    private  TestContext context;

    public StoreStepDefinitions(TestContext context){
        //driver=context.driver;
        this.context = context;
        productAskOMDCHPage = PageFactoryManager.getProductPage(context.driver);
    }
    @Given("I am on the store page")
    public void i_am_on_the_store_page() {
        //new Product_AskOMDCH_Page(driver).load("askomdch");
        productAskOMDCHPage.load("askomdch");
        //System.out.println(driver.getTitle());
    }
    @When("I add a {product} to the cart")
    public void i_add_a_to_the_cart(Product product) throws InterruptedException {
        String prod = product.getName().toString().replace("\"","");
        System.out.println(prod);
        productAskOMDCHPage.selectProduct(prod);
        productAskOMDCHPage.add2CartProduct();
        //CartApi cartApi = new CartApi(context.cookies.getCookies());
        //cartApi.addToCart(1215,1);
        //context.cookies.setCookies(cartApi.getCookies());
        //context.cookies.injectCookiesToBrowser(context.driver);
        productAskOMDCHPage.viewCrt();
    }


}
