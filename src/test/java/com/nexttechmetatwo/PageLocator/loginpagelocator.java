package com.nexttechmetatwo.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.base_parent;

public class loginpagelocator extends base_parent {
	
	public loginpagelocator() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="loginusername")
	public WebElement username;
	
	@FindBy(id="loginpassword")
	public WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	public WebElement loginbutton;
	

}
