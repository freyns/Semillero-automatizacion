package com.indeed.co.certification.task;

//import requeridas por el script
import java.util.List;
import com.indeed.co.certification.models.SearchJobModel;
import com.indeed.co.certification.userinterfaces.IndeedSearchJobPage;	
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class EnterTheWord implements Task{
	
	// creamos una variable privada de tipo lista
	private List<SearchJobModel> jobData;
	
	// metodo constructor que inicializa la variable
	public EnterTheWord(List<SearchJobModel> jobData) {
		this.jobData = jobData;
	}

	// Metodo sobreescrito de la clase Task
	@Override
	@Step("{0} open the Browser on Indeed Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(jobData.get(0).getWhat()).into(IndeedSearchJobPage.TEXT_INPUT_WHAT),
				Enter.theValue(jobData.get(0).getWhere()).into(IndeedSearchJobPage.TEXT_INPUT_WHERE),
				Click.on(IndeedSearchJobPage.SEARCH_JOBS_BUTTON));
	}

	// Instrumented por debajo llama al constructor de la clase que se ajuste a los parametros
	public static EnterTheWord toSearch(List<SearchJobModel> jobData) {
		return instrumented(EnterTheWord.class, jobData);
	}

}
