package co.com.google.stepdefinitions;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginGmailStepDefinitions {
	LoginGmailPOM Login;
	
	@Given("Abrimos el navegador y vamos al sitio web de Login")
	public void abrimos_el_navegador_y_vamos_al_sitio_web_de_Login() {
	    // Write code here that turns the phrase above into concrete actions
		Login = new LoginGmailPOM("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		Login.OpenBrowser("https://co.indeed.com/");
	}

	@When("El usuario ingresa el username \\\"([^\\\"]*)\\\" y el password \\\"([^\\\"]*)\\\"")
	public void el_usuario_ingresa_el_username_y_el_password(String Username, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(Username);
		System.out.println(Password);
		Assert.assertEquals(Login.Assert(), "Iniciar sesión | Cuentas Indeed");		// valida si cargo la pagina
		Login.Search("signin_email", Username);
		Login.Search("signin_password", Password);
	}

	@When("El usuario presiona click en el boton ingresar")
	public void el_usuario_presiona_click_en_el_boton_ingresar() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Login.Click("//*[@id=\"loginform\"]/button");
		Thread.sleep(2000);
	}

	@Then("El Usuario debera ver el Mensaje \\\"([^\\\"]*)\\\"")
	public void el_Usuario_debera_ver_el_Mensaje(String Mensaje) {
	    // Write code here that turns the phrase above into concrete actions
		Login.CloseBrowser();
		if(true) {
		Assert.assertEquals(Login.ConfirmatationYes(), Mensaje);
		}
	}
}
