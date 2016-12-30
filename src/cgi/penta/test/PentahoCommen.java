package cgi.penta.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cgi.penta.testBase.*;
import cgi.penta.testUtills.BaseUtils;
import cgi.penta.testUtills.PropertiesReader;

public class PentahoCommen implements PentaComman {
	BaseUtils bu = new BaseUtils();
	PropertiesReader pentaProperties = new PropertiesReader();

	@Override
	public void login() {
		// Enter userd id

		String s[] = pentaProperties.loadProperties().getProperty("penta_login_userName").split("\\$");

		bu.typeById(s[1], pentaProperties.loadProperties().getProperty("userId"));

		// enter the password

		bu.typeById(pentaProperties.loadProperties().getProperty("penta_login_password").split("\\$")[1],
				pentaProperties.loadProperties().getProperty("password"));

		// click login button

		bu.clickByXpath(pentaProperties.loadProperties().getProperty("penta_login_submitButton"));
	}

	@Override
	public void logout() {
		bu.clickByXpath(pentaProperties.loadProperties().getProperty("penta_home_userName"));
		bu.clickByXpath(pentaProperties.loadProperties().getProperty("penta_userName_logOut"));

	}

	@Override
	public void verify_login() {
		WebElement wb = bu.getWebElementByXpath(pentaProperties.loadProperties().getProperty("penta_home_userName"));
		Boolean b = wb.isDisplayed();
		if (b) {
			System.out.println("userName ::"+wb.getText()); 
			Assert.assertTrue(true, wb.getText());
		} else {
			Assert.fail("Not found ");
		}
	}

	@Override
	public void verify_logout() {

	}

	
}
