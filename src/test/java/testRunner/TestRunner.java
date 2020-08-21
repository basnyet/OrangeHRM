package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"Features"},
    glue = {"stepdefinations"},

        dryRun = true,
        monochrome = true,

//   plugin = {"pretty","junit:target/JunitReport/report.xml","json:JsonReport",
//           "html:test-output/site/cucumber-pretty"}

   plugin= {"pretty","html:test-output/site/cucumber-pretty",
        "junit:target/cucumber.xml"}



)
public class TestRunner {


}
