package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test0015_VerifyPriceLineHelpLinkMouseHover extends WebDriverActivity{
	private String testName=" Test0015_VerifyPriceLineHelpLinkMouseHover";
	private String testType="Regression Test";
	
	@Test(description="Verify Header Links")
	public void verifySignInLink() {
		startTest(testName, testType);
		
		
		landPage().clickOnHelpHover();
		landPage().navigateBack();
		
		endTestWithPassStatus(" Test0015_VerifyPriceLineHelpLinkMouseHover");
	}
	
}
