package co.com.bancolombia.certification.googlesuite.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task{

	private PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	
	@Override
	@Step("{0} opens the Browser on Google Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		// Open, Click, Enter, Hit, ...
		
	}

	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);
		// Instrumented por debajo llama al constructor de la clase que se ajuste a los parametros
		// return new OpenBrowser(page);
	}


}
