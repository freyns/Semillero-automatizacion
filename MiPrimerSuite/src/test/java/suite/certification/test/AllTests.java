package suite.certification.test;

//import necesarios para Junit y selenium
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)					// clase generica de Suite para que pueda correr los Test
@SuiteClasses({ PruebaWebDriverChrome.class, PruebaWebDriverIE.class })		// Llama a las clases que ejecutara para realizar el test agrupados
public class AllTests {

}
