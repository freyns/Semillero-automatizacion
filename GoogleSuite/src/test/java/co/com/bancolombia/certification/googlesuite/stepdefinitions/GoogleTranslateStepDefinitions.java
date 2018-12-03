package co.com.bancolombia.certification.googlesuite.stepdefinitions;

import org.openqa.selenium.WebDriver;
import co.com.bancolombia.certification.googlesuite.tasks.GoTo;
import co.com.bancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.googlesuite.tasks.Translate;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	private GoogleHomePage googleHomePage;
	
	private Actor susan = Actor.named("Susan");
	
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^That susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() throws Exception {
		// Precondiciones: Estar en Google Translate
		// susan.wasAbleTo(new OpenTheBrowser());		// -> se le esta pasando una clase
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage),
						GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
	}
	
	@When("^She translates the word cheese from English to Spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() throws Exception {
		// Condiciones: Traducir una palabra de Ingles a Español
		susan.wasAbleTo(Translate.the());
	}
	
	@Then("^She should see the word queso in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() throws Exception {
		// Postcondiciones: Aparece la palabra Traducida -> Verificarlo
	}


}
