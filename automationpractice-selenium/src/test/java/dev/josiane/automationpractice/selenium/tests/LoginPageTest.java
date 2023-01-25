package dev.josiane.automationpractice.selenium.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.josiane.automationpractice.selenium.pages.LoginPage;

class LoginPageTest {

	private LoginPage loginpage;
	private final String URL = "https://demo.automationtesting.in/";

	@BeforeEach
	void setUp() throws Exception {
		this.loginpage = new LoginPage();
		this.loginpage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.loginpage.quitWebdriver();
	}

	@Test
	void test() {
		// when quand
		this.loginpage.emailIdForSignUp();

		// then logo
		Assertions.assertTrue(this.loginpage.getMyAccountMessage().equals("Automation Demo Site"));
		//Assertions.assertFalse(this.loginpage.getCurrentUrl().equals(URL));
	}

}
