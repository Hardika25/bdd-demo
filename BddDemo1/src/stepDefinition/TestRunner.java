package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/login/features"},glue={"stepDefinition"}) //features:path of feature file  glue:stepsdefinition class
public class TestRunner {

	
}
