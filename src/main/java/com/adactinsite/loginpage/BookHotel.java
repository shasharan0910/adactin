package com.adactinsite.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	public WebDriver driver;
	
	

	@FindBy(id = "first_name")
	private WebElement firstname;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cardno;

	@FindBy(id = "select_combobox")
	private WebElement selectcard;

	@FindBy(id = "cc_exp_month")
	private WebElement expmonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expyear;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(id = "book_now")
	private WebElement booknow;

	public BookHotel(WebDriver edriver) {
		this.driver = edriver;
		PageFactory.initElements(edriver, this);
	}
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getSelectcard() {
		return selectcard;
	}

	public WebElement getexpmonth() {
		return expmonth;
	}

	public WebElement getexpyear() {
		return expyear;
	}

	public WebElement cvv() {
		return cvv;
	}
	

	public WebElement booknow() {
		return booknow;
	}



}
