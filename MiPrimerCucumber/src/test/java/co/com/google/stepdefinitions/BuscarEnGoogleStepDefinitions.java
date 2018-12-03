package co.com.google.stepdefinitions;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class BuscarEnGoogleStepDefinitions {
	SearchGooglePOM ejemplo;
	
	@Given("Dado que puedo Abrir el navegador")
	public void dado_que_puedo_Abrir_el_navegador() {
	    // Write code here that turns the phrase above into concrete actions
		ejemplo = new SearchGooglePOM("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	}

	@When("Voy a Google")
	public void voy_a_Google() {
	    //Abro el navehador en la pagina de Google
		ejemplo.OpenBrowser("http://www.google.com.co");
	}

	@When("Busco \\\"([^\\\"]*)\\\" en Google")
	public void busco_en_Google(String Cadena) {
	    // Se compara que el texto recibido se Igual a Google
		Assert.assertEquals(ejemplo.Assert(), "Google");
		ejemplo.Search("lst-ib", Cadena);	// realizo a busqueda con el dat del feature
		ejemplo.Click("btnK");				// clic en la tecla buscar de Google
	}
	
	@Then("Valido que el resultado sea el Esperado")
	public void valido_que_el_resultado_sea_el_Esperado() {
	    // Cierro el Navegador
		ejemplo.CloseBrowser();
	}
}
