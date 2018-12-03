package com.indeed.co.certification.stepdefinitions;

// paquetes necesarios para trabajar con el patron de screenplay
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import org.openqa.selenium.WebDriver;

import com.indeed.co.certification.exceptions.UnableToSelect;
import com.indeed.co.certification.questions.IndeedSelectJobResult;
import com.indeed.co.certification.task.ClickOn;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SelectJobStepDefinitions {					
	
	@Managed(driver = "chrome")						// le decimos que busque en el directorio el proyecto el controlador de chrome
	public static WebDriver hisBrowser;				// Se reconoce el actor como masculino
	
	private Actor freyns = Actor.named("freyns");			// creamos un actor que hara todas las tereas en screenplay
	
	
	@Before
	public void setUp() {
		hisBrowser.manage().window().maximize();		// maximiza la ventana del navegador
		freyns.can(BrowseTheWeb.with(hisBrowser));		// Se le indica al usuario que puede abrir el navegador con el webDriver
	}

@Given("^That Freyns wants to apply to job in the web page$")
public void that_Freyns_wants_to_apply_to_job_in_the_web_page() throws Exception {
	// Freyns fue capaz de abrir en el navegador la pagina
}

@When("^He selects a job offer from the job list$")
public void he_selects_a_job_offer_from_the_job_list() throws Exception {
	when(freyns).attemptsTo(ClickOn.TheOption());
}

@Then("^He should be able to see the detail of the work he chose$")
public void he_should_be_able_to_see_the_detail_of_the_work_he_chose() throws Exception {
	then(freyns).should(seeThat(IndeedSelectJobResult.page()).orComplainWith(UnableToSelect.class,
			UnableToSelect.getUnableToSelectMessage()));
}


}
