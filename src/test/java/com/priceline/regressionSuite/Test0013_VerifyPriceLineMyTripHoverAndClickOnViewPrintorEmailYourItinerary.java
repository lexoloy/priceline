package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test0013_VerifyPriceLineMyTripHoverAndClickOnViewPrintorEmailYourItinerary extends WebDriverActivity{
	private String testName="Test0013_VerifyPriceLineMyTripHoverAndClickOnViewPrintorEmailYourItinerary";
	private String testType="Regression Test";
	
	@Test(description="Verify Header Links")
	public void verifySignInLink() {
		startTest(testName, testType);
		
		
		landPage().clickOnViewPrintorEmailYourItinerary();
		landPage().navigateBack();
		
		endTestWithPassStatus("Test0013_VerifyPriceLineMyTripHoverAndClickOnViewPrintorEmailYourItinerary");
	}
	
}
