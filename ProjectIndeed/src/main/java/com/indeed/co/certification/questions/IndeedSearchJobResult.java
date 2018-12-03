package com.indeed.co.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import com.indeed.co.certification.userinterfaces.IndeedSearchJobPage;

public class IndeedSearchJobResult implements Question<Boolean>{
	
	// variable privada que mostrara el error en consola
	private static String errorMessage = "Wrong search";

	// Metodo sobreescrito de la interface
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(IndeedSearchJobPage.RESULTS_SEARCH).answeredBy(actor).isCurrentlyVisible();
	}
	
	// Constructor de la clase que lo asignamos como estatico y lo renombramos como page
	public static IndeedSearchJobResult page() {
		return new IndeedSearchJobResult();
	}
	
	// Metodo para acceder a la variable privada errorMessage
	public static String getErrorMessage() {
		return errorMessage;
	}

}
