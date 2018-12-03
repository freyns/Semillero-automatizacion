package suite.certification.test;

// import necesarios para Junit y selenium
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaWebDriverChrome {
	WebDriver Daniel;			// Instancia el webDriver de modo Global

	@Before
	public void setUp() throws Exception {
		// Paso 2: Ubicar el controlador  
		// El controlador para Chrome se encuentra en la direción especificada
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		Daniel = new ChromeDriver();		// Se inicializa el WebDriver con el nombre Daniel
		
		// Paso 3: Poner el protocolo URL
		Daniel.get("http://www.google.com");		// Abrimos el sitio web por Java
	}

	@After
	public void tearDown() throws Exception {
		Daniel.close();
	}

	@Test
	public void test() {
		// Paso 4: Realizar Busqueda por el id del elemento 
		Daniel.findElement(By.id("lst-ib")).sendKeys("suso");
		// findElement es para indicarle al Navegador que realizara una busqueda por elemento
		// By.(XXX) se especifica que filtro del elemento usaremos para realizar la busqueda 
		Daniel.findElement(By.name("btnK")).click();

	}

}
