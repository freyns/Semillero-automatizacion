package com.indeed.co.certification.task;

//import requeridas por el script
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.indeed.co.certification.models.IndeedUserModel;
import com.indeed.co.certification.userinterfaces.IndeedLoginPage;

public class EnterThe implements Task{

	// creamos una variable privada de tipo lista
	private List<IndeedUserModel> userData;
	
	// metodo constructor que inicializa la variable
	public EnterThe(List<IndeedUserModel> userData) {
		this.userData = userData;
	}
	
	// Metodo sobreescrito de la clase Task
	@Override
	@Step("{0} open the Browser on Indeed Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(userData.get(0).getEmail()).into(IndeedLoginPage.INPUT_EMAIL),
				Enter.theValue(userData.get(0).getPassword()).into(IndeedLoginPage.INPUT_PASSWORD),
				Click.on(IndeedLoginPage.SUBMIT_BUTTON));
	}

	// Instrumented por debajo llama al constructor de la clase que se ajuste a los parametros
	public static EnterThe credentials(List<IndeedUserModel> userData) {
		return instrumented(EnterThe.class, userData);
	}

}
