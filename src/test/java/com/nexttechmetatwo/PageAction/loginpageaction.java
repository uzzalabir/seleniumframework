package com.nexttechmetatwo.PageAction;

import com.nexttechmetatwo.PageLocator.loginpagelocator;

import Utility.base_parent;

public class loginpageaction extends base_parent {
	
	loginpagelocator Loginpagelocator=new loginpagelocator();
	
	public void metalogincard(String u, String p) {
		
		Loginpagelocator.username.sendKeys(u);
		Loginpagelocator.password.sendKeys(p);
		Loginpagelocator.loginbutton.click();
		
		 
	}

}
