package com.demoaut.certification.test;

// Import necesarios para la clase
import org.openqa.selenium.By;							// Para que Selenium Busque por elemento (id, name; xPath)
import org.openqa.selenium.WebDriver;					// Usare la clase webDriver para manipular el navegador
import org.openqa.selenium.chrome.ChromeDriver;			// Se le dice a Java el controlador que usare

public class NewToursLoginPOM {
	// Le pongo un Nombre al WebDriver
	static WebDriver Freyns;
	
String WebPage, SendKeys, BrowserWebDriver, RouteExe;		// Creo unas variables para poder Realizar las pruebas
	
	// Creo el contructor y le paso dos valores por defecto, el WebDriver y la Ruta del .Exe
	NewToursLoginPOM (String BWD,String RE) {
		this.BrowserWebDriver = BWD;					// Le paso a la clase el parametro mandado por el Main
		this.RouteExe = RE;								// Le paso a la clase el parametro mandado por el Main
		System.setProperty(BrowserWebDriver, RouteExe);
		Freyns = new ChromeDriver();
	}

// Metodo para abrir el Navagador
public void OpenBrowser (String WP) {
	this.WebPage = WP;
	Freyns.get(WebPage);
}

// Metodo para cerrar el Navagador
public void CloseBrowser() {
	Freyns.close();
}

// Metodo para buscar en la Web pasandole dos parametros, el id del Input y la palabra a Buscar
public void Search(String BY, String SK) {
	Freyns.findElement(By.id(BY)).sendKeys(SK);
	Freyns.findElement(By.id("hplogo")).click();		// Hacemos click en la parte de afuera del Input para que se escanda el ComboBox de Busqyeda

	
}

// Metodo que ejecuta el clic en el boton de la Pagina para que realice la Busqueda
public void Click(String BY) {
	Freyns.findElement(By.name(BY)).click();
	
}

}

