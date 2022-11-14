package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
	}

	public void preencher(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public void acessar(By elemento) {
		driver.findElement(elemento).click();
	}
		
	public void clicar (By elemento) {
		driver.findElement(elemento).click();
	}

	public void esperar () {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	public void fecharNavegador() {
		driver.quit();
	}

}
