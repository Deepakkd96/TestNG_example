package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass{

	public BookHotel () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement name;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement card;
	@FindBy(xpath="//*[@id='cc_type']")
	private WebElement cctype;
	@FindBy(id="cc_exp_month")
	private WebElement month;
	@FindBy(id="cc_exp_year")
	private WebElement year;
	@FindBy(id="cc_cvv")
	private WebElement ccv;
	@FindBy(id="book_now")
	private WebElement book;
	public WebElement getName() {
		return name;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCard() {
		return card;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCcv() {
		return ccv;
	}
	public WebElement getBook() {
		return book;
	}
}