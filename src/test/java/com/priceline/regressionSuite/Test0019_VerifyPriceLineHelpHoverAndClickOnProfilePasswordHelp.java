package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test0019_VerifyPriceLineHelpHoverAndClickOnProfilePasswordHelp extends WebDriverActivity{
	private String testName="Test0019_VerifyPriceLineHelpHoverAndClickOnProfilePasswordHelp ";
	private String testType="Regression Test";
	
	@Test(description="Verify Header Links")
	public void verifySignInLink() {
		startTest(testName, testType);
		
		
		landPage().clickOnProfilePasswordHelp();
		landPage().navigateBack();
		
		endTestWithPassStatus("Test0019_VerifyPriceLineHelpHoverAndClickOnProfilePasswordHelp");
	}
	
}
