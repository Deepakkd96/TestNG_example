package org.test;

import java.util.Date;

import org.base.BaseClass;
import org.datas.Data;
import org.pages.BookHotel;
import org.pages.ConfirmPage;
import org.pages.Login;
import org.pages.SearchHotel;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProvider extends BaseClass{


	@BeforeClass
	private void BeforeClass() {
		browserLaunch("chrome");
		implicityWait(10);
	}
	@AfterClass
	private void AfterClass() {
		driver.quit();
		System.out.println("done");
	}
	@BeforeMethod
	private void BeforeMethod() {
		Date d= new Date();
		System.out.println("Test start time : "+d);
	}
	@org.testng.annotations.AfterMethod
	private void AfterMethod() {
		Date d= new Date();
		System.out.println("Test end time : "+d);
	}
	@Test(priority=1,dataProvider = "login",dataProviderClass = Data.class)
	private void test1(String user,String pass) {
		SoftAssert s= new SoftAssert();
		launchUrl("https://adactinhotelapp.com/");
		String url = getCurrentUrl();
		boolean con = url.contains("adactinhotelapp");
		s.assertTrue(con, "Verify url ");
		Login l = new Login();
		sendkeys(l.getUsername(), user);
		String username = getAttribute(l.getUsername());
		s.assertEquals(username,"deepak1996","Verify  username");
		sendkeys(l.getPassword(),pass );
		String password = getAttribute(l.getPassword());
		s.assertEquals(password,"deepak@1996","Verify passsword");
		buttonClick(l.getButton());
		s.assertAll();
	}
	@Test(priority=2)
	private void test2() {
		SoftAssert s= new SoftAssert();
		SearchHotel sh = new SearchHotel();
		String url1 = getCurrentUrl();
		boolean con1 = url1.contains("SearchHotel");
		s.assertTrue(con1 ,"Verify select page url ");
		selectByVisibleText(sh.getLocation(), "Adelaide");
		String attribute = getAttribute(sh.getLocation());
		s.assertEquals(attribute, "Adelaide","Verify hotel location ");
		selectByValue(sh.getNoOfRooms(), "3");
		clear(sh.getDatein());
		sendkeys(sh.getDatein(), "04/05/2022");
		clear(sh.getDateout());
		sendkeys(sh.getDateout(), "10/05/2022");
		selectByValue(sh.getAdult(), "2");
		buttonClick(sh.getSubmit());
		s.assertAll();
	}
	@Test(priority=3)
	private void test3() throws InterruptedException {
		SoftAssert s= new SoftAssert();
		SearchHotel sh = new SearchHotel();
		String url1 = getCurrentUrl();
		boolean con1 = url1.contains("SelectHotel");
		s.assertTrue(con1, "Verify search page url ");
		buttonClick(sh.getRadioBtn());
		buttonClick(sh.getOk());
		s.assertAll();
	}
	@Test(priority=4,dataProvider = "book",dataProviderClass = Data.class)
	private void test4(String First,String Second,String Address,String Cardno,String ccv) throws InterruptedException {
		SoftAssert s= new SoftAssert();
		BookHotel bh = new BookHotel();
		String url1 = getCurrentUrl();
		boolean con1 = url1.contains("BookHotel");
		s.assertTrue(con1, "Verify book page url ");
		sendkeys(bh.getName(), First);
		sendkeys(bh.getLastname(), Second);
		String attribute = getAttribute(bh.getLastname());
		s.assertEquals(attribute, "Kannan","verify second name ");
		sendkeys(bh.getAddress(), Address);
		sendkeys(bh.getCard(), Cardno);
		selectByVisibleText(bh.getCctype(), "VISA");
		selectByVisibleText(bh.getMonth(), "November");
		selectByValue(bh.getYear(),"2022");
		sendkeys(bh.getCcv(), ccv);
		buttonClick(bh.getBook());
		s.assertAll();
	}
	@Test(priority=5,enabled=true)
	private void test5() throws InterruptedException {
		SoftAssert s= new SoftAssert();
		Thread.sleep(6000);
		String currentUrl = getCurrentUrl();
		boolean contains =currentUrl.contains("BookingConfirm");
		s.assertTrue(contains,"Verify confirm page ");
		ConfirmPage c = new ConfirmPage();
		String pnr = getAttribute(c.getPnr());
		s.assertAll();
		System.out.println("======================");
		System.out.println("PNR NO : "+ pnr);
		System.out.println("======================");
	}	


}
