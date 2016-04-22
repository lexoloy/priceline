package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test0016_VerifyPriceLineHelpHoverAndClickOnSelfServiceLink extends WebDriverActivity{
	private String testName="Test0016_VerifyPriceLineHelpHoverAndClickOnSelfServiceLink";
	private String testType="Regression Test";
	
	@Test(description="Verify Header Links")
	public void verifySignInLink() {
		startTest(testName, testType);
		
		
		landPage().clickOnSelfService();
		landPage().navigateBack();
		
		endTestWithPassStatus("Test0016_VerifyPriceLineHelpHoverAndClickOnSelfServiceLink");
	}
	
}
