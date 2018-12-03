package co.com.google.certificacion.googlesuite.features.googlesearch;

// import necesarios para las clases junit, selenium y serenity
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import co.com.google.certificacion.googlesuite.tasks.OpenTheBrowser;
import co.com.google.certificacion.googlesuite.userinterfaces.GoogleHomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;

@RunWith(SerenityRunner.class)
public class GoogleSearchTest {
	
	// Le damos un Nombre al actor
	private Actor Freyns = Actor.named("Freyns");
	
	private GoogleHomePage googleHomePage;		// variable privada de la clase GoogleHomePage
	
	@Managed(driver = "chrome")		// le indicamos que navegador usara el WebDriver
	WebDriver hisBrowser;
	
	// Acciones que se deben hacer antes de llamar a las Task
	@Before
	public void FreynsCanBrowseTheWeb() {
		Freyns.can(BrowseTheWeb.with(hisBrowser));
		//Estas son dos maneras de abrir el navegador web
		givenThat(Freyns).can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Test
	public void ActorShouldBeAbleToSearchTheWord() {
		// Busca la URL que le pasamos a GoogleHomePage por defecto
		Freyns.wasAbleTo(OpenTheBrowser.on(googleHomePage));
	}
}
