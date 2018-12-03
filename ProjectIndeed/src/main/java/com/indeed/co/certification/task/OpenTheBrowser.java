package com.indeed.co.certification.task;

//import requeridas por el script
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {

	// creamos una variable privada
	private PageObject page;
	
	// metodo constructor que inicializa la variable
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	
	// Metodo sobreescrito de la clase Task
	@Override
	@Step("{0} open the Browser on Indeed Home Page")
	public <T extends Actor> void performAs(T actor) {		
		actor.attemptsTo(Open.browserOn(page));			// Nos indica que el actor tiene la habilidad de abrir el navegador
		// Open, Click, Enter, Hit, ...
	}

	public static OpenTheBrowser on(PageObject page) {
	// Instrumented por debajo llama al constructor de la clase que se ajuste a los parametros
	// return new OpenBrowser(PageLoginIndeed);
		return instrumented(OpenTheBrowser.class, page);	
	}
		
}
