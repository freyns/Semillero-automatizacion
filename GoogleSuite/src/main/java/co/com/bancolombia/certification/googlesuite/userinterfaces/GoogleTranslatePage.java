package co.com.bancolombia.certification.googlesuite.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("source language button").located(By.id("gt-sl-gms"));
	public static final Target TARGET_LANGUAGE_OPTION= Target.the("target language button").located(By.id("gt-tl-gms"));
	public static final Target SOURCE_LANGUAGE = Target.the("source language").locatedBy("//div[@id='gt-sl-gms']");
	public static final Target TARGET_LANGUAGE = Target.the("target language").locatedBy("//*[@id=\":3w\"]/div");
	public static final Target SOURCE_LANGUAGE_TEXTAREA = Target.the("Source language textarea").located(By.id("source"));
	public static final Target TARGET_LENGUAGE_RESULT = Target.the("Target language result area").located(By.id("gt-res-dir-ctr"));
	public static final Target TRANSLATE_BUTTON = Target.the("Translate button").located(By.id("gt-submit"));	
}
