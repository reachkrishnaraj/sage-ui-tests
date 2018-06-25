package com.sage.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.paypal.selion.annotations.WebTest;
import com.paypal.selion.platform.grid.Grid;
import com.paypal.selion.platform.html.TextField;
import com.paypal.selion.platform.utilities.WebDriverWaitUtils;

public class LoginTest {

	@Test
	@WebTest
	public void TestLoginSuccess() throws InterruptedException {

		// Launch the google URL in the browser
		Grid.driver().get("****url here***");

		TextField emailField = new TextField("id=email");
		WebDriverWaitUtils.waitUntilElementIsPresent(emailField.getLocator());
		emailField.type("******");

		TextField pwdField = new TextField("id=password");
		WebDriverWaitUtils.waitUntilElementIsPresent(pwdField.getLocator());
		pwdField.type("*****");

		WebElement letsGoButton = Grid.driver().findElementByXPath("//button[@type='submit']");
		letsGoButton.click();

		WebDriverWaitUtils.waitUntilElementIsPresent("//form[@id='logout-form']");
		Grid.driver().close();
		Grid.driver().quit();
	}

}
