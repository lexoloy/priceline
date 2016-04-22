package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test0014_VerifyPriceLineMyTripHoverAndClickOnCheckYourRequestStatus extends WebDriverActivity{
	private String testName="Test0014_VerifyPriceLineMyTripHoverAndClickOnCheckYourRequestStatus";
	private String testType="Regression Test";
	
	@Test(description="Verify Header Links")
	public void verifySignInLink() {
		startTest(testName, testType);
		
		
		landPage().clickOnCheckYourRequestStatus();
		landPage().navigateBack();
		
		endTestWithPassStatus("Test0014_VerifyPriceLineMyTripHoverAndClickOnCheckYourRequestStatus");
	}
	
}
