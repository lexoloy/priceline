package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Tc006_VerifyPrichLineCruisesLink extends WebDriverActivity{
	private String testName="Tc001_VerifyPriceLineCruseLink";
	private String testType="Regression Test";

	@Test(description="Verify Header Links")
	public void verifyPricelinecomLink() throws InterruptedException{
		startTest(testName, testType);
		
		landPage().clickOnCruiseLink();
		landPage().navigateBack();
		
		endTestWithPassStatus("Verify Cruses Link");
	}
}
