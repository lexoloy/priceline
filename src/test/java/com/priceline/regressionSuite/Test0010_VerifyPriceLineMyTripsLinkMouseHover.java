package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test0010_VerifyPriceLineMyTripsLinkMouseHover extends WebDriverActivity{
	private String testName="Test0010_VerifyPriceLineMyTripsLinkMouseHover";
	private String testType="Regression Test";
	
	@Test(description="Verify Header Links")
	public void verifySignInLink() {
		startTest(testName, testType);
		
		
		landPage().clickOnMydTripHover();
		landPage().navigateBack();
		
		endTestWithPassStatus("Test0010_VerifyPriceLineMyTripsLinkMouseHover");
	}
	
}
