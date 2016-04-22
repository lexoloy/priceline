package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test0018_VerifyPriceLineHelpHoverAndClickOnFindYourRequestNumber extends WebDriverActivity{
	private String testName="Test0018_VerifyPriceLineHelpHoverAndClickOnFindYourRequestNumber ";
	private String testType="Regression Test";
	
	@Test(description="Verify Header Links")
	public void verifySignInLink() {
		startTest(testName, testType);
		
		
		landPage().clickOnFindYourRequestNumber();
		landPage().navigateBack();
		
		endTestWithPassStatus("Test0018_VerifyPriceLineHelpHoverAndClickOnFindYourRequestNumber ");
	}
	
}
