package com.indeed.co.certification.task;

//Import requeridos por la clase
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.indeed.co.certification.exceptions.WithoutConnectionToTheNetwork;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {

	// variable privada de la clase
	private PageObject page;
	
	// constructor
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	
	// Metodo sobreescrito de la Interface
	@Override
	@Step("{0} open the Browser on Indeed Home Page")
	public <T extends Actor> void performAs(T actor) {		
		actor.attemptsTo(Open.browserOn(page));
		// Open, Click, Enter, Hit, ...
		actor.should(seeThat(IndeedPageVisible.isVisible()).orComplainWith(WithoutConnectionToTheNetwork.class,
				getNoInternetConectionMessage()));
	}
	
	// Metodo que accede al metodo de la clase getErrorNetworkMessage de WithoutConnectionToTheNetwork
	public String getNoInternetConectionMessage() {
		return String.format(WithoutConnectionToTheNetwork.getErrorNetworkMessage());

	}

	// Instrumented por debajo llama al constructor de la clase que se ajuste a los parametros
	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);	
	}
		
}
