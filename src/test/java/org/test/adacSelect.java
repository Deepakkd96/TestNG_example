package org.test;

import org.base.BaseClass;
import org.pages.SearchHotel;
import org.testng.annotations.Test;

public class adacSelect extends BaseClass{

	@Test(priority=3)
	private void test3() {
		SearchHotel sh = new SearchHotel();
		buttonClick(sh.getRadioBtn());
		buttonClick(sh.getOk());
	}	
}
