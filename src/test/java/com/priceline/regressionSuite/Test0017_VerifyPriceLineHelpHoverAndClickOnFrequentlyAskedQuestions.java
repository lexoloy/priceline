package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test0017_VerifyPriceLineHelpHoverAndClickOnFrequentlyAskedQuestions extends WebDriverActivity{
	private String testName="Test0017_VerifyPriceLineHelpHoverAndClickOnFrequentlyAskedQuestions";
	private String testType="Regression Test";
	
	@Test(description="Verify Header Links")
	public void verifySignInLink() {
		startTest(testName, testType);
		
		
		landPage().clickOnFrequentlyAskedQuestions();
		landPage().navigateBack();
		
		endTestWithPassStatus("Test0017_VerifyPriceLineHelpHoverAndClickOnFrequentlyAskedQuestions");
	}
	
}
