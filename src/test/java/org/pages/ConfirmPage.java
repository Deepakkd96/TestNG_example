package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPage  extends BaseClass{

	public ConfirmPage () {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="order_no")
	private WebElement pnr;
	public WebElement getPnr() {
		return pnr;
	}
	
	

}
