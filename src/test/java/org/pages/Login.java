package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {

	public Login () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement Password;
	@FindBy(id="login")
	private WebElement button;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getButton() {
		return button;
	}
}
