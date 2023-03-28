package com.nexttechmetatwo.PageAction;

import org.testng.Assert;

import com.nexttechmetatwo.PageLocator.cartpagelocator;

import Utility.base_parent;

public class cartpageaction extends base_parent {
	
	cartpagelocator Cartpagelocator=new cartpagelocator();
	
	public void Verifyitemaddedincart() throws Exception {
		
		Thread.sleep(4000);
		
	boolean VerifyCart=	Cartpagelocator.verifycart.isDisplayed();
	Assert.assertTrue(VerifyCart);
		
	}

}
