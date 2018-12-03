package com.google;

//import necesarios
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class SearchGoogle {

	// Creamos un objeto de la clase y le pasamos los datos al constructor
	SearchGooglePOM ejemplo = new SearchGooglePOM("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	
	@Before
	public void setUp() throws Exception {
		ejemplo.OpenBrowser("http://www.google.com.co");		// abri el navegador en la URL que le pasamos

	}

	@After
	public void tearDown() throws Exception {
		ejemplo.CloseBrowser();			// cerrar el navegador
	}

	@Test
	public void test() {
		try {
			Thread.sleep(1000);				// Esperar que la pagina cargue
			Assert.assertEquals(ejemplo.Assert(), "Google");		// este linea me indica si se encontro el titulo de la pagina web
			ejemplo.Search("lst-ib", "Netflix");					// Buscamos Netflix en google por parametro
			ejemplo.Click("btnK");									// Click boton Buscar
			// Assert.assertEquals(ejemplo.Assert(), "Google");
		} catch (InterruptedException e) {
			e.printStackTrace();									// imprimir error en consola, si hay
		}

	}

}
