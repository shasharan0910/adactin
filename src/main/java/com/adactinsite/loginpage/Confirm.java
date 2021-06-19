package com.adactinsite.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm {
	

	public WebDriver driver;

	@FindBy(id = "logout")
	private WebElement logout;
	
	public Confirm(WebDriver ddriver) {
		this.driver = ddriver;
		PageFactory.initElements(ddriver, this);
	}

	public WebElement getLogout() {
		return logout;
	}

}
