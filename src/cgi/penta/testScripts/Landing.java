package cgi.penta.testScripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cgi.penta.testUtills.BaseUtils;
import cgi.penta.testUtills.PropertiesReader;

public class Landing {
	BaseUtils bu = new BaseUtils();
	PropertiesReader pentaProperties = new PropertiesReader();

	@Test(description = "testing")
	private void openurl() {

		// Enter userd id
		String s[] = pentaProperties.loadProperties().getProperty("penta_login_userName").split("\\$");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bu.typeById(s[1],pentaProperties.loadProperties().getProperty("userId"));

		// wait 5 secs for userid to be entered
		
		bu.typeById(pentaProperties.loadProperties().getProperty("penta_login_password").split("\\$")[1],pentaProperties.loadProperties().getProperty("password"));


		// Enter Password
		
		// Submit button

	}
}
