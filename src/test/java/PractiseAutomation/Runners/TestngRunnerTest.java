package PractiseAutomation.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;


import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;

@CucumberOptions(plugin = {"pretty", "html:target/cucumber/cucumber.html"},
        /*plugin={"html:target/cucumber/cucumber.html"},*/
        tags = "@scenario1",// @LoginTest or
        snippets = CAMELCASE,
        //monochrome = true,
        // dryRun = true,
        glue = {"PractiseAutomation"},
        features = "src/test/resources/features"
)



public class TestngRunnerTest extends AbstractTestNGCucumberTests {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("inside testng before-class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("inside testng after-class");
    }

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
