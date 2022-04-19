package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {


	public SelectHotel () {
		PageFactory.initElements(driver, this);
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
