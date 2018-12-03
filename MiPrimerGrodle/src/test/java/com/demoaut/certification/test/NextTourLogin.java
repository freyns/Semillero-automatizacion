package com.demoaut.certification.test;

//Paso 1 Importar los JAR
import static org.junit.Assert.*; 						// sirve para hacer las validaciones
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;							// Para que Selenium Busque por elemento (id, name; xPath)
import org.openqa.selenium.WebDriver;					// Usare la clase webDriver para manipular el navegador
import org.openqa.selenium.chrome.ChromeDriver;			// Se le dice a Java el controlador que usare

public class NextTourLogin {
	WebDriver Daniel;			// Instancia el webDriver de modo Global
	
	@Before						// anotaciones, etiquetas o tag: Sirven para la inyeccion de codigo
	public void setUp() throws Exception {
		// Paso 2: Ubicar el controlador  
		// El controlador para Chrome se encuentra en la direción especificada
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		Daniel = new ChromeDriver();		// Se inicializa el WebDriver con el nombre Daniel
		
		// Paso 3: Poner el protocolo URL
		Daniel.get("http://www.google.com");		// Abrimos el sitio web por Java
				
	}

	@After						// anotaciones, etiquetas o tag: Sirven para la inyeccion de codigo
	public void tearDown() throws Exception {
		Daniel.close();
	}

	@Test						// anotaciones, etiquetas o tag: Sirven para la inyeccion de codigo
	public void test() {
		// Paso 4: Realizar Busqueda por el id del elemento 
		Daniel.findElement(By.id("lst-ib")).sendKeys("suso");
		// findElement es para indicarle al Navegador que realizara una busqueda por elemento
		// By.(XXX) se especifica que filtro del elemento usaremos para realizar la busqueda 
		Daniel.findElement(By.name("btnK")).click();
		fail("Not yet implemented");
	}

}
