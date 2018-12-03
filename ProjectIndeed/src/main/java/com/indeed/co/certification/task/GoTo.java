package com.indeed.co.certification.task;

//import requeridas por el script
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.indeed.co.certification.userinterfaces.IndeedLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class GoTo implements Task{

	// Metodo sobreescrito de la clase Task
	@Override
	@Step("{0} open the Browser on Indeed Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(IndeedLoginPage.ENTER_BUTTON));
	}

	// Instrumented por debajo llama al constructor de la clase que se ajuste a los parametros
	public static GoTo theButton() {
		return instrumented(GoTo.class);
	}


}
