package org.test;

import org.base.BaseClass;
import org.pages.Login;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdacLogin extends BaseClass{

	@Parameters({"username","password"})
	@Test(priority=1)
	public void test1(String name,String pass) {
		browserLaunch("chrome");
		launchUrl("https://adactinhotelapp.com/");
		Login l = new Login();
		sendkeys(l.getUsername(), name);
		sendkeys(l.getPassword(), pass);
		buttonClick(l.getButton());
	}
	
}
