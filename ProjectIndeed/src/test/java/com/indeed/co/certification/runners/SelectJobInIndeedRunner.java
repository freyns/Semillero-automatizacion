package com.indeed.co.certification.runners;

// Import reuqeridos por la clase
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//  Nos indica que se correra el feature de apply_to_job.feature
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/feature/apply_to_job.feature",
		glue = "com.indeed.co.certification.stepdefinitions", 
		plugin = { "pretty", "html:target/cucumber-reports"},
		snippets = SnippetType.CAMELCASE
)

public class SelectJobInIndeedRunner {

}
