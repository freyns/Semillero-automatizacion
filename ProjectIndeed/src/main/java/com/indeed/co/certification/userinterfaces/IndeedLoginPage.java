package com.indeed.co.certification.userinterfaces;

//import requeridas para el test
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class IndeedLoginPage {
	
	// Variables finales con el mapeo de la pagina web
	public static final Target ENTER_BUTTON = Target.the("Enter button").located(By.xpath("/html[1]/body[1]/div[1]/div[1]/nav[1]/ul[2]/li[2]/a[1]"));
	public static final Target INPUT_EMAIL = Target.the("Input email login").located(By.id("signin_email"));
	public static final Target INPUT_PASSWORD = Target.the("Input password login").located(By.id("signin_password"));
	public static final Target SUBMIT_BUTTON = Target.the("Button to send Credentials").located(By.xpath("//button[@type='submit']"));
	public static final Target USER_LOGIN = Target.the("User login succes").located(By.xpath("//span[@class='icl-DesktopGlobalHeader-toggleDropdown']"));

}
