package com.indeed.co.certification.stepdefinitions;

// Import necesarios para trabajar con el patron Screenplay 
import org.openqa.selenium.WebDriver;									// Usare la clase webDriver para manipular el navegador
import com.indeed.co.certification.exceptions.UnableToLogin;			// La clase Unable to login para manejar las excepciones 
import com.indeed.co.certification.models.IndeedUserModel;				// Importamos el modelo que interactua con los datos del feature
import com.indeed.co.certification.questions.IndeedLoginResult;			// La clase de question para verificar los resultados esperados
import com.indeed.co.certification.task.GoTo;							// La clase que permite realizar acciones al actor
import com.indeed.co.certification.task.OpenTheBrowser;					// Clase de Tarea que permite abrir el navegador web
import com.indeed.co.certification.task.EnterThe;						// Clase tarea que nos permite interactuar con los elementos web
import com.indeed.co.certification.userinterfaces.IndeedHomePage;		// clase que nos guarda el mapeo de los elementos de la pagina web
import cucumber.api.java.Before;										// Clase de cucumber que indica una accion que se debe llevar a cabo antes de todo
import cucumber.api.java.en.Given;										// nos indica las precondiciones que se deben hacer antes de realizar una tarea
import cucumber.api.java.en.Then;										// Nos indica las acciones que puede realizar el actor en el momento 
import cucumber.api.java.en.When;										// Nos indica los resultados esperados por el actor para determinada actividad
import net.serenitybdd.screenplay.Actor;								// Hace uso del metodo de screenplay para que el actor pueda realizar la tarea
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;		// nos permite darle mas claridad al Metodo Given
import static net.serenitybdd.screenplay.GivenWhenThen.when;			// Nos permite darle mas claridad al metodo when
import static net.serenitybdd.screenplay.GivenWhenThen.then;			// Nos permite darle mucha mayor claridad en el metodo then
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;			// permite hacer ls preguntas de validadcion de manera mas natural
import java.util.List;													// Permite hacer uso de las listas de Java
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;				// metodo propio de la clase abilities que le da habilidades al usuario
import net.thucydides.core.annotations.Managed;							// Nos Permite abrir y cerran el controlador web webdriver

public class LoginStepDefinitions {
	
	@Managed(driver = "chrome")					// le decimos que busque en el directorio el proyecto el controlador de chrome
	private WebDriver hisBrowser;				// Se reconoce el actor como masculino
	private IndeedHomePage IndeedHomePage;		// Se crea una clase que coontinue la URL de la pagina
	
	private Actor freyns = Actor.named("freyns");		// creamos un actor que hara todas las tereas en screenplay
	
	@Before
	public void setUp() {
		hisBrowser.manage().window().maximize();
		freyns.can(BrowseTheWeb.with(hisBrowser));		// // Se le indica al usuario que puede abrir el navegador con el webDriver
	}

	@Given("^That Freyns wants to login in the page web$")
	public void thatFreynsWantsToLoginInThePage() throws Exception {
		givenThat(freyns).wasAbleTo(OpenTheBrowser.on(IndeedHomePage));		// como podemos abrir el navegador web
				
	}

	@When("^He clicks the enter button of the page of index$")
	public void heClicksTheEnterButtonOfThePageOfIndex() throws Exception {
		when(freyns).attemptsTo(GoTo.theButton());							// se da clic a un boton de ingreso para que nos redirija a la pagina de logueo
	}

	@When("^He enters the username and the password and clic in the button enter$")
	public void heEntersTheUsernameAndThePassword(List<IndeedUserModel> userData) throws Exception {
		when(freyns).attemptsTo(EnterThe.credentials(userData));						// pasamos parametros desde el feature por medio del model
	}

	@Then("^He verifies that he was logged in with the status$")
	public void heVerifiesThatHeWasLoggedInWithTheStatus() throws Exception {
		then(freyns).should(seeThat(IndeedLoginResult.page()).orComplainWith(UnableToLogin.class,	// Validamos que el usuario pueda obtener los resultados esperados 
				UnableToLogin.getUnableToLoginMessage()));											// Haciendo uso de la clase question y la clase util 
	}


}
