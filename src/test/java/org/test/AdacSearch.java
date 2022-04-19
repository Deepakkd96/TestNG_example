package org.test;

import org.base.BaseClass;
import org.pages.SearchHotel;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdacSearch extends BaseClass{
	@Parameters({"checkin","checkout"})
	@Test(priority=2)
	private void test2(String datein, String dateout) {
		
		SearchHotel sh = new SearchHotel();
		selectByVisibleText(sh.getLocation(), "Adelaide");
		selectByValue(sh.getNoOfRooms(), "3");
		clear(sh.getDatein());
		sendkeys(sh.getDatein(), datein);
		clear(sh.getDateout());
		sendkeys(sh.getDateout(), dateout);
		selectByValue(sh.getAdult(), "2");
		buttonClick(sh.getSubmit());
	
	}
}
