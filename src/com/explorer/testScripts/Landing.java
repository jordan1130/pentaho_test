package com.explorer.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.explorer.testUtills.BaseUtils;

public class Landing {
	BaseUtils bu = new BaseUtils();
	String browser;
	String url;

	@Test(description = "testing")
	@Parameters({ "browser", "url" })
	private void openurl() {

		bu.beforeClass(browser, url);
	}
}
