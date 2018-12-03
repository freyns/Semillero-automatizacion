package com.indeed.co.certification.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/feature/validate_selection.feature",
		glue = "com.indeed.co.certification.stepdefinitions", 
		plugin = { "pretty", "html:target/cucumber-reports"},
		snippets = SnippetType.CAMELCASE,
		tags = "@SmokeTest"
)

public class ValidateSelectionRunner {

}
