package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        
		features = {"src\\main\\java\\Features\\"},
        glue = {"StepDefinitions"},
        plugin = {"pretty", "json:target/Destination/cucumber.json", "html:target/Destination"}
)


public class TestRunnerNHS extends AbstractTestNGCucumberTests{

}
