package com.indeed.co.certification.task;

import static com.indeed.co.certification.userinterfaces.IndeedSelectJobpage.OPTION_JOB;
//import requeridas por el script
import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.indeed.co.certification.userinterfaces.IndeedSelectJobpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ClickOn implements Task{

	// Metodo sobreescrito de la clase Task
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(OPTION_JOB));
	}
	
	// Instrumented por debajo llama al constructor de la clase que se ajuste a los parametros
	public static ClickOn TheOption() {
		return instrumented(ClickOn.class);
	}

}

