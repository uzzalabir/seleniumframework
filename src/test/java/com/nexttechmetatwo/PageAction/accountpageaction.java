package com.nexttechmetatwo.PageAction;

import org.testng.Assert;

import com.nexttechmetatwo.PageLocator.accountpagelocator;

import Utility.base_parent;

public class accountpageaction extends base_parent {
	
	accountpagelocator Accountpagelocator=new accountpagelocator();
	
	public void Verifyusercanloginwithvalidcard() throws Exception {
		
		Thread.sleep(5000);
		
	boolean verifyaccountprofile=	Accountpagelocator.accountprofile.isDisplayed();
	Assert.assertTrue(verifyaccountprofile);
		
		
	}

}
