package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test0012_VerifyPriceLineMyTripHoverAndClickOnCheckYourFlightStatus extends WebDriverActivity{
	private String testName="Test0012_VerifyPriceLineMyTripHoverAndClickOnCheckYourFlightStatus";
	private String testType="Regression Test";
	
	@Test(description="Verify Header Links")
	public void verifySignInLink() {
		startTest(testName, testType);
		
		
		landPage().clickOnCheckYourFlightStatus();
		landPage().navigateBack();
		
		endTestWithPassStatus("Test0012_VerifyPriceLineMyTripHoverAndClickOnCheckYourFlightStatus");
	}
	
}
