package com.indeed.co.certification.runners;

//Import requeridos por la clase
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//Nos indica que se correra el feature de search_job.feature
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/feature/search_job.feature",
		glue = "com.indeed.co.certification.stepdefinitions", 
		plugin = { "pretty", "html:target/cucumber-reports"},
		snippets = SnippetType.CAMELCASE
)

public class SearchJobInIndeedRunner {

}
