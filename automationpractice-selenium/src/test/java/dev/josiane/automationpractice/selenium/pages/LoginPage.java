package dev.josiane.automationpractice.selenium.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
//Locators
	private By emailAddressLocator = By.id("email");
	private By submitBtnLocator = By.xpath("//*[@id=\"enterimg\"]");
	private By tagMyAccoountLocator = By.tagName("h1");
	
	public void emailIdForSignUp() {
		if(super.isDisplayed(emailAddressLocator)) {
			super.type("isabellaemelybatistasimoessimo@gmail.com", emailAddressLocator);
			super.click(submitBtnLocator);
		} else {
			System.out.println("email textbox was not present");
		}
	}
	
	public String getMyAccountMessage() {
		return super.getText(tagMyAccoountLocator);
	}
}
