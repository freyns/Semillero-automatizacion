package com.indeed.co.certification.runners;

// Import requeridos por la clase
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

// 
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/feature/login.feature",
		glue = "com.indeed.co.certification.stepdefinitions", 
		plugin = { "pretty", "html:target/cucumber-reports"},
		snippets = SnippetType.CAMELCASE,
		tags = "@successful"
)

public class LoginInIndeedRunner {

}
