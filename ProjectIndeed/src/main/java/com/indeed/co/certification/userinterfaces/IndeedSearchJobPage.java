package com.indeed.co.certification.userinterfaces;

//import requeridas para el test
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://co.indeed.com/")					// Pagina web con la que se abre el driver
public class IndeedSearchJobPage extends PageObject{
	
	// Variables finales con el mapeo de la pagina web
	public static final Target TEXT_INPUT_WHAT = Target.the("Text input for job search by title").located(By.id("text-input-what"));
	public static final Target TEXT_INPUT_WHERE = Target.the("Text entry for search by municipality").located(By.id("text-input-where"));
	public static final Target SEARCH_JOBS_BUTTON = Target.the("Search jobs button in the page web").located(By.xpath("//button[@type='submit']"));
	public static final Target RESULTS_SEARCH = Target.the("Show all jobs found in the search").located(By.id("resultsCol"));

}
