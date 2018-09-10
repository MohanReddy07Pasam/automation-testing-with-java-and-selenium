package com.in28minutes.pageobjects.updatetodo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	//Name Text Box
	@FindBy(id="name")
	WebElement name;
	
	//Password Text Box
	@FindBy(id="password")
	WebElement password;
	
	//Submit Button
	@FindBy(id="submit")
	WebElement submitButton;
	
	//enterName
	public void enterName(String name) {
		
	}

	//enterPassword
	public void enterPassword(String password) {
		
	}

	//submit
	public void submit() {
		
	}
}
