package cgi.penta.testScripts;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import cgi.penta.test.PentahoCommen;

public class Landing {
	
	PentahoCommen pentahoCommen = new PentahoCommen();

	@Test(alwaysRun = true, priority = 1, description = "Loging to welcome page and verify it")
	private void login() {
		pentahoCommen.login();
		pentahoCommen.verify_login();
		pentahoCommen.logout();
	}
	
}
