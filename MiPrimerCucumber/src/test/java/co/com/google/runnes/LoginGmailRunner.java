package co.com.google.runnes;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/Login.feature", glue= {"co.com.google.stepdefinitions"}, 
plugin = { "pretty", "html:target/cucumber-reports"},
monochrome = true
)

public class LoginGmailRunner {

}
