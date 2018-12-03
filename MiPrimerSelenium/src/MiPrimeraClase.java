// Paso 1 Importar los JAR
import org.openqa.selenium.chrome.ChromeDriver;		// Se le dice a Java el controlador que usare
import org.openqa.selenium.WebDriver;				// Usare la clase webDriver para manipular el navegador
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;						// Para que Selenium Busque por elemento (id, name; xPath)

public class MiPrimeraClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Paso 2: Ubicar el controlador
		// El controlador para Chrome se encuentra en la direción especificada
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver Daniel = new ChromeDriver();		// Se inicializa el WebDriver con el nombre Daniel 
		
		// Paso 3: Poner el protocolo URL
		// se cambio la URL de Busqueda
		Daniel.get("http://www.google.com.co");		// Abrimos el sitio web por Java
		WebElement elemento;
		
		// Paso 4: Realizar Busqueda por el id del elemento 
		elemento = Daniel.findElement(By.id("lst-ib"));
		elemento.sendKeys("Netflix");
		Daniel.findElement(By.id("hplogo")).click();		// Hacemos click en la parte de afuera del Input para que se escanda el ComboBox de Busqyeda
		Daniel.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
		// findElement es para indicarle al Navegador que realizara una busqueda por elemento
		// By.(XXX) se especifica que filtro del elemento usaremos para realizar la busqueda 
		
		
	}

}
