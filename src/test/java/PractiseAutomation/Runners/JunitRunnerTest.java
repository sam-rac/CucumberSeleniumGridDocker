/*
package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"},tags="@scenario1 or @LoginTest",
                 snippets = CAMELCASE  ,
                 //monochrome = true,
                // dryRun = true,
                 glue = {"Stepdefs", "Hooks", "Objects","CustomType","Pages","Base"},
                 features = "src/test/resources/features")
public class JunitRunnerTest {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("inside junit before-class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("inside junit after-class");
    }
}



*/
