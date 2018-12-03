package com.indeed.co.certification.task;

// Import requeridos por la clase
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.indeed.co.certification.userinterfaces.IndeedLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Clase Question para verificar la conexion de internet, comparando con un elemento del menu de newtours
 */

public class IndeedPageVisible implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return the(IndeedLoginPage.ENTER_BUTTON).answeredBy(actor).isCurrentlyVisible();
	}
	
	public static Question<Boolean> isVisible() {
		return new IndeedPageVisible();
	}


}
