package com.indeed.co.certification.questions;

import com.indeed.co.certification.userinterfaces.IndeedLoginPage;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class IndeedLoginResult implements Question<Boolean>{
	
	// variable privada que mostrara el error en consola
	private static String errorMessage = "wrong credentials";

	// Metodo sobreescrito de la interface
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(IndeedLoginPage.USER_LOGIN).answeredBy(actor).isCurrentlyVisible();
	}
	
	// Constructor de la clase que lo asignamos como estatico y lo renombramos como page
	public static IndeedLoginResult page() {
		return new IndeedLoginResult();
	}
	
	// Metodo para acceder a la variable privada errorMessage
	public static String getErrorMessage() {
		return errorMessage;
	}

}
