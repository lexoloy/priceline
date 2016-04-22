package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test0020_VerifyPriceLineHelpHoverAndClickOnContactUs extends WebDriverActivity{
	private String testName="Test0020_VerifyPriceLineHelpHoverAndClickOnContactUs";
	private String testType="Regression Test";
	
	@Test(description="Verify Header Links")
	public void verifySignInLink() {
		startTest(testName, testType);
		
		
		landPage().clickOnContactUs();
		landPage().navigateBack();
		
		endTestWithPassStatus("Test0020_VerifyPriceLineHelpHoverAndClickOnContactUs");
	}
	
}
