package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Photon_Testing\\MVCTesting1\\feature\\TestMVC.feature",
glue = { "StepDefination" },
dryRun = false
)
public class Runner {

}
