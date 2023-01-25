package dev.josiane.automationpractice.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {
	
	private WebDriver driver;

	@BeforeEach
	void abrirAPaginaDeNavegacaoEMaximizar() throws Exception {
		System.getProperty("webdriver.chrome.driver", "driver/chromedriver");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://demo.automationtesting.in/");
	}

	@AfterEach
	void fecharNavegador() throws Exception {
		driver.quit();
	}

	@Test
	void test() {
		WebElement emailAddressElement = driver.findElement(By.id("email"));
		emailAddressElement.sendKeys("isabellaemelybatistasimoessimo@gmail.com");
		
		WebElement submitBtnElement = driver.findElement(By.xpath("//*[@id=\"enterimg\"]"));
		submitBtnElement.click();
		
		WebElement tagMyAcccountElement = driver.findElement(By.tagName("h1"));
		String textTagH1 = tagMyAcccountElement.getText();
		
		Assertions.assertTrue(textTagH1.equals("Automation Demo Site"));
	}

}
