import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrimeraPruebaWikipedia {
	
	@Test(description = "Validar el articulo del caso oliveira")
	public void ValidarArticuloOliveira() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Testing Automatizado\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://wikipedia.org");
		WebElement linkIdiomaEspañol = driver.findElement(By.id("js-link-box-es"));
		linkIdiomaEspañol.click();
		
		WebElement linkLeerMas = driver.findElement(By.xpath("//*[@id=\"main-tfa\"]/div[4]/div[1]/ul/li[1]/a"));
		linkLeerMas.click();
		
		
		
		
		driver.close();
	}

}

/*div.sbox5-floating-tooltip-opened div.calendar-container div.-today
//div[@class=‘sbox5-floating-tooltip-opened’]//div[@class=’calendar-container’]//div[@class=‘-today’]
*/
