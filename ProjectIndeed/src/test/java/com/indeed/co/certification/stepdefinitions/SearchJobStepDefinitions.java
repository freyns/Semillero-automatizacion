package com.indeed.co.certification.stepdefinitions;

//paquetes necesarios para trabajar con el patron de screenplay
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;			// nos permite darle mas claridad al Metodo Given
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;				// permite hacer las preguntas de validadcion de manera mas natural
import static net.serenitybdd.screenplay.GivenWhenThen.then;				// Nos permite darle mucha mayor claridad en el metodo then
import static net.serenitybdd.screenplay.GivenWhenThen.when;				// Nos permite darle mas claridad al metodo when
import java.util.List;														// Permite hacer uso de las listas de Java
import org.openqa.selenium.WebDriver;										// Usare la clase webDriver para manipular el navegador
import com.indeed.co.certification.exceptions.UnableToSearch;
import com.indeed.co.certification.models.SearchJobModel;
import com.indeed.co.certification.questions.IndeedSearchJobResult;
import com.indeed.co.certification.task.EnterTheWord;
import com.indeed.co.certification.task.OpenTheBrowser;
import com.indeed.co.certification.userinterfaces.IndeedSearchJobPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SearchJobStepDefinitions {
	
	@Managed(driver = "chrome")								// le decimos que busque en el directorio el proyecto el controlador de chrome
	private WebDriver hisBrowser;							// // Se reconoce el actor como masculino
	private IndeedSearchJobPage IndeedSearchJobPage;		// Nos permite el mapeo de la pagina web
	
	private Actor freyns = Actor.named("freyns");			// creamos un actor que hara todas las tereas en screenplay
	
	@Before
	public void setUp() {
		hisBrowser.manage().window().maximize();			// Maximizar la pantalla abierta por webDriver
		freyns.can(BrowseTheWeb.with(hisBrowser));
	}

@Given("^That Freyns wants to search job in the web page$")
public void that_Freyns_wants_to_search_job_in_the_web_page() throws Exception {
	givenThat(freyns).wasAbleTo(OpenTheBrowser.on(IndeedSearchJobPage));
}

@When("^He enters in the input the work he wants search$")
public void he_enters_in_the_input_the_work_he_wants_search(List<SearchJobModel> jobData) throws Exception {
	when(freyns).attemptsTo(EnterTheWord.toSearch(jobData));					// pasamos parametros desde el feature por medio del model
}

@Then("^He should see the search result$")
public void he_should_see_the_search_result() throws Exception {
	then(freyns).should(seeThat(IndeedSearchJobResult.page()).orComplainWith(UnableToSearch.class, 	// Validamos que el usuario pueda obtener los resultados esperados
			UnableToSearch.getUnableToSearchMessage()));											// Haciendo uso de la clase question y la clase util 
}


}
