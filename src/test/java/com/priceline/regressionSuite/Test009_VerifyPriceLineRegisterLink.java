package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test009_VerifyPriceLineRegisterLink extends WebDriverActivity{
	private String testName="Test009_VerifyPriceLineRegisterLink";
	private String testType="Regression Test";
	
	@Test(description="Verify Header Links")
	public void verifySignInLink() {
		startTest(testName, testType);
		
		landPage().clickOnregister();
		landPage().navigateBack();
		
		endTestWithPassStatus("Test009_VerifyPriceLineRegisterLink");
	}
	
}
