package org.test;

import org.base.BaseClass;
import org.pages.ConfirmPage;
import org.testng.annotations.Test;

public class AdacConfirm extends BaseClass{

	@Test(priority=5,enabled=true)
	private void test5() throws InterruptedException {
		
		Thread.sleep(6000);
		ConfirmPage c = new ConfirmPage();
		String pnr = getAttribute(c.getPnr());
		System.out.println("======================");
		System.out.println("PNR NO : "+ pnr);
		System.out.println("======================");
	}	

}
