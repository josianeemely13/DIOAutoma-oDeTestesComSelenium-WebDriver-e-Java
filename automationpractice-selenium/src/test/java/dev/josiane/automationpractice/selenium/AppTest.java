package dev.josiane.automationpractice.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

	private WebDriver driver;
	
    @Test
    public void helloSelenium() {
    	System.getProperty("webdriver.chrome.driver", "driver/chromedriver");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://demo.automationtesting.in/");
    	
    	String currentUrl = driver.getCurrentUrl();
    	String expected = "https://demo.automationtesting.in/";
    	assertEquals(expected, currentUrl);
    	
    	//driver.quit();
    }

}
