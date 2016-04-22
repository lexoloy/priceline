package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test007_VerifyPriceLineSignInLinkMouseHover extends WebDriverActivity{
	private String testName="Tc007_VerifyPriceLineSignInLink";
	private String testType="Regression Test";
	
	@Test(description="Verify Header Links")
	public void verifySignInLink() {
		startTest(testName, testType);
		landPage().clickOnSignInHover();
		landPage().navigateBack();
		
		endTestWithPassStatus("Tc007_VerifyHeaderLinks");
	}
	
}
