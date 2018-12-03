package com.indeed.co.certification.interactions;

import com.indeed.co.certification.stepdefinitions.SelectJobStepDefinitions;
import com.indeed.co.certification.utils.RandomSelectionList;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;


public class ClickOnWebElement implements Interaction{
	
	private Target theWebElement;
	private RandomSelectionList select;
	
	public ClickOnWebElement(Target theWebElement) {
		this.theWebElement = theWebElement;
		select = RandomSelectionList.workWith(SelectJobStepDefinitions.hisBrowser);
	}
	
	public static ClickOnWebElement target(Target theWebElement) {
		return instrumented(ClickOnWebElement.class, theWebElement);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		select.randomSelection(theWebElement.getCssOrXPathSelector()).click();		
	}


}
