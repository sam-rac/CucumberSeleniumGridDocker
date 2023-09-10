package PractiseAutomation.Stepdefs;

import PractiseAutomation.Objects.Customer;
import PractiseAutomation.Objects.LoginCredentials;
import PractiseAutomation.Pages.AccntCreated_AE_Page;
import PractiseAutomation.Pages.Home_AE_Page;
import PractiseAutomation.Pages.Login_AE_Page;
import PractiseAutomation.Pages.Signup_AE_Page;
import PractiseAutomation.context.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.junit.Assert;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class AutomationExerciseRegistrationSteps {
    Home_AE_Page homeAEPage = new Home_AE_Page();
    Login_AE_Page loginAEPage = new Login_AE_Page();
    Signup_AE_Page signupAEPage = new Signup_AE_Page();
    AccntCreated_AE_Page accntCreatedAEPage = new AccntCreated_AE_Page();
    //private Customer customer;
    public AutomationExerciseRegistrationSteps(TestContext context){
        //System.out.println("AutomationExerciseRegistrationSteps StepDef : DI : scenarioName = "+context.scenarioName);
    }
    @DataTableType
    public LoginCredentials loginCredentials(List<String> crentials){
        return new LoginCredentials(crentials.get(0),crentials.get(0));
    }

    @DataTableType
    public Customer customerDetailsEntry(Map<String,String> entry) {
        return new Customer(entry.get("Name"),entry.get("Email"),entry.get("Password"),
                entry.get("First Name"),entry.get("Last Name"),entry.get("Address"),entry.get("State"),
                entry.get("City"),entry.get("Zipcode"),entry.get("MobileNumber"));
    }

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
         homeAEPage.navigateHere();
    }
    @Given("I click the {string} button")
    public void i_click_the_button(String string) {
       if (string.equals("SignupOrLogin")){
           homeAEPage.clickSignupLink();
       } else if (string.equals("Signup")) {
           loginAEPage.clickSignupBtn();
       }
    }
    @When("I fill in the following information:")
    public void i_fill_in_the_following_information(List<Map<String,String>> user) {
        //List<Map<String,String>> user =   usr.asList();
        //Map<String,String> user = usr.asMap();
        System.out.println("Username = "+user.get(0).get("Email"));
         loginAEPage.enterEmail(user.get(0).get("Email"));
        System.out.println("Password = "+user.get(0).get("Password"));
        loginAEPage.enterPswd(user.get(0).get("Password"));
    }

    @When("I enter AccountAndAddress information")
    public void i_enter_account_and_address_information(DataTable dataTable) {//Customer custmr
        //this.customer = custmr;
        Map<String,String> entry = dataTable.asMap();
        signupAEPage.selectTitle();
        signupAEPage.setCustomerDetails(entry.get("Name"),entry.get("Email"),entry.get("Password"),
                entry.get("First Name"),entry.get("Last Name"),entry.get("Address"),entry.get("State"),
                entry.get("City"),entry.get("Zipcode"),entry.get("MobileNumber"));
        signupAEPage.clickCreateAcntBtn();
    }
    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
       Assert.assertTrue(accntCreatedAEPage.successMessageVerification());
             accntCreatedAEPage.clickContinueBtn();
    }
    @Then("I should be logged in as {string}")
    public void i_should_be_logged_in_as(String string) {
        Assert.assertTrue(homeAEPage.signedInUserVerification(string));
    }
}
