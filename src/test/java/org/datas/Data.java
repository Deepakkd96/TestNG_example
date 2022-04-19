package org.datas;

import org.testng.annotations.DataProvider;

public class Data {

	@DataProvider(name="login")
	private Object [][] login() {
		
		Object [][] obj = new Object[][] {
			
			{"deepak","deepak123"},
			{"deepak1996","deepak96"},
			{"deepak","deepak@1996"},
			{"deepak1996","deepak@1996"},
		};
		return obj;
	}
	@DataProvider(name="book")
	private Object [][] Booking() {
	
		Object [][] obj = new Object[][] {
			
			{"Deepak","Kannan","Chenai,Tamilnadu,India","1234567890123654","123"}
			
		};
		return obj;
	}

	
}
