package finals;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="final/final.feature",plugin="json:target\\jsonreport.json")



public class finalrunner {

}
