package dev.josiane.automationpractice.selenium.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BasePage {
	
	private WebDriver driver;
	
	public void basePage() {
		System.getProperty("webdriver.chrome.driver", "driver/chromedriver");
    	
		this.driver = new ChromeDriver();
    	this.driver.manage().window().maximize();
	}
	
	public void visit(String url) {
		this.driver.get(url);
	}
	
	public String getCurrentUrl() {
		return this.driver.getCurrentUrl();
	}
	
	public void quitWebdriver() {
		this.driver.quit();
	}
	
	public WebElement findElement(By locator) {
		return this.driver.findElement(locator);
	}
	
	public void type(String input, By locator) {
		this.driver.findElement(locator).sendKeys(input);
	}
	
	public boolean isDisplayed(By locator) {
		try {
			return this.driver.findElement(locator).isDisplayed();
		} catch(NoSuchElementException erro) {
			return false;
		}
	}
	
	public void click(By locator) {
		this.driver.findElement(locator).click();
	}
	
	public String getText(By locator) {
		return this.driver.findElement(locator).getText();
	}

}
