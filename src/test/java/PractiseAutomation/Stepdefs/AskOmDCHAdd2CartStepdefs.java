package PractiseAutomation.Stepdefs;

//import automationexercise.objects.Product;

import PractiseAutomation.Factory.DriverFactory;
import PractiseAutomation.Objects.Product;
import PractiseAutomation.Pages.Cart_AskOMDCH_Page;
import PractiseAutomation.Pages.Product_AskOMDCH_Page;
import PractiseAutomation.context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.automationexercise.ElementUtil;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AskOmDCHAdd2CartStepdefs {
    private final WebDriver driver;//= DriverFactory.getDriver();
    public AskOmDCHAdd2CartStepdefs (TestContext context){
        //System.out.println("AskOMDCH StepDef : DI : scenarioName = "+context.scenarioName);
        driver= context.driver;
    }
/*    @ParameterType(".*")
    public Product product(String name){
        return new Product(name);
    }*/



}
