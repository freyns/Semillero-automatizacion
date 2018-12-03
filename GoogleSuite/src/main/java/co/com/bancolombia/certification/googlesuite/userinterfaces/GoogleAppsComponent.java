package co.com.bancolombia.certification.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {
	
	public static final Target GOOGLE_APPS = Target.the("Google apps button").located(By.id("gbwa"));
	public static final Target GOOGLE_TRANSLATE = Target.the("Google Translate Option").located(By.id("gb51"));
	public static final Target CLOSE_DIALOG = Target.the("Google Windows").located(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div/div/div[2]/div/a[1]"));
}
