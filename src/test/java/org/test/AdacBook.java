package org.test;

import org.base.BaseClass;
import org.pages.BookHotel;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdacBook extends BaseClass {
	
	@Parameters({"fstname","scndname","address","cc","ccv"})
	@Test(priority=4)
	public void test4(String firstname,String secondname,String address,String ccno,String ccv) throws InterruptedException {
		BookHotel bh = new BookHotel();
		sendkeys(bh.getName(), firstname);
		sendkeys(bh.getLastname(), secondname);
		sendkeys(bh.getAddress(), address);
		sendkeys(bh.getCard(), ccno);
		selectByVisibleText(bh.getCctype(), "VISA");
		selectByVisibleText(bh.getMonth(), "November");
		selectByValue(bh.getYear(),"2022");
		sendkeys(bh.getCcv(), ccv);
		buttonClick(bh.getBook());	
	}

}
