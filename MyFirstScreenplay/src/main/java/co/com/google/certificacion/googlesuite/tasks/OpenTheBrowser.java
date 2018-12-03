package co.com.google.certificacion.googlesuite.tasks;

//import necesarios para la clase
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task{
	
	// Creamos una variable privada
	private PageObject googleHomePage;
	
	// constructor de la clase
	public OpenTheBrowser(PageObject page) {
		this.googleHomePage = page;
	}
	
	// Metodo sobrecargado de la interface Task
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn().the(googleHomePage));
	}

	
	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);
	}
	
}
