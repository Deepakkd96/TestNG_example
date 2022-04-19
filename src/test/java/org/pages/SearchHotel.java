package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {

	public SearchHotel () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	@FindBy(id="datepick_in")
	private WebElement datein;
	@FindBy(id="datepick_out")
	private WebElement dateout;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="Submit")
	private WebElement Submit;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	public WebElement getDatein() {
		return datein;
	}
	public WebElement getDateout() {
		return dateout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	
	
	
	@FindBy(id="radiobutton_4")
	private WebElement radioBtn;
	public WebElement getRadioBtn() {
		return radioBtn;
	}
	@FindBy(id="continue")
	private WebElement ok;
	public WebElement getOk() {
		return ok;
	}
}
