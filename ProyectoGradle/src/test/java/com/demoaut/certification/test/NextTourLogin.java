package com.demoaut.certification.test;

//Import necesarios para la clase
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NextTourLogin {
	
	// Creamos un metodo de la clase y le pasamos los datos al constructor
	NewToursLoginPOM ejemplo = new NewToursLoginPOM("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
	
	@Before
	public void setUp() throws Exception {
		ejemplo.OpenBrowser("http://www.google.com.co");		// la pasamos la URL que abrira
	}

	@After
	public void tearDown() throws Exception {
		ejemplo.CloseBrowser();			// cerrar el navegador
	}


	// Metodo para buscar en la Web pasandole dos parametros, el id del Input y la palabra a Buscar
	@Test
	public void test() {
		ejemplo.Search("lst-ib", "netflix");
		ejemplo.Click("btnK");
		// fail("Not yet implemented");
	}

}
