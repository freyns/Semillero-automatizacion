package suite.certification.test;

//import necesarios para Junit y selenium
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;		// Se le dice a Java el controlador que usare

public class PruebaWebDriverIE {
	WebDriver Daniel;			// Instancia el webDriver de modo Global
	
	@Before
	public void setUp() throws Exception {
		// Paso 2: Ubicar el controlador  
		// El controlador para Chrome se encuentra en la direción especificada
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IE32\\IEDriverServer.exe");
		Daniel = new InternetExplorerDriver();		// Se inicializa el WebDriver con el nombre Daniel
		
		// Paso 3: Poner el protocolo URL
		Daniel.get("http://www.google.com");		// Abrimos el sitio web por Java
	}

	@After
	public void tearDown() throws Exception {
		Daniel.close();					// Cerramos el navegador
	}

	@Test
	public void testTrue() {
		// Paso 4: Realizar Busqueda por el id del elemento 
		Daniel.findElement(By.id("lst-ib")).sendKeys("Netflix");
		// findElement es para indicarle al Navegador que realizara una busqueda por elemento
		// By.(XXX) se especifica que filtro del elemento usaremos para realizar la busqueda 
		Daniel.findElement(By.name("btnK")).click();	// clic en el boton Buscar de Gooogle		
	}

}
