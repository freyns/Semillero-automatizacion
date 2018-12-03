// Paso 1 Importar los JAR
import org.openqa.selenium.ie.InternetExplorerDriver;		// Se le dice a Java el controlador que usare
import org.openqa.selenium.WebDriver;						// Usare la clase webDriver para manipular el navegador
import org.openqa.selenium.By;								// Para que Selenium Busque por elemento (id, name; xPath)
import org.openqa.selenium.NoSuchElementException;

public class ClaseSeleniumIE {
	
	public static void main(String[] args) {
		
		// Paso 2: Ubicar el controlador
		// El controlador para InternetExplorer se encuentra en la direción especificada
		//System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");
		 System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IE32\\\\IEDriverServer.exe");
		WebDriver Alexander = new InternetExplorerDriver();		// Se inicializa el WebDriver con el nombre Alexander
		
		// Paso 3: Poner el protocolo URL
		Alexander.get("http://www.google.com");		// Abrimos el sitio web por Java
		try {
		// Paso 4: Realizar Busqueda por el id del elemento 
		Alexander.findElement(By.id("lst-ib")).sendKeys("netflix");
		Alexander.findElement(By.name("btnK")).click();
		// findElement es para indicarle al Navegador que realizara una busqueda por elemento
		// By.(XXX) se especifica que filtro del elemento usaremos para realizar la busqueda 
		}
		catch (NoSuchElementException e) {		// Capturar las excepciones en caso de error
			
			System.out.println("Not found");
			System.out.println(e);
		}
	}

}
