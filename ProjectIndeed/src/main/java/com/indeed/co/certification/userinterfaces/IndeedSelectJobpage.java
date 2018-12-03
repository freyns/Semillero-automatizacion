package com.indeed.co.certification.userinterfaces;

//import requeridas para el test
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class IndeedSelectJobpage extends PageObject{
	
	// Variables finales con el mapeo de la pagina web
	public static final Target OPTION_JOB = Target.the("Job option from the list").located(By.xpath("//td[@id='resultsCol']/div[3]"));
	public static final Target JOB_DETAIL = Target.the("Information about the job detail").located(By.id("vjs-header"));
}
