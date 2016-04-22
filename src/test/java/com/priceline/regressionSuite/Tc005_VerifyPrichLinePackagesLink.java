package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Tc005_VerifyPrichLinePackagesLink extends WebDriverActivity{
	private String testName="Tc001_VerifyPriceLinePackagesLink";
	private String testType="Regression Test";

	@Test(description="Verify Header Links")
	public void verifyPricelinecomLink() throws InterruptedException{
		startTest(testName, testType);
		
		landPage().clickOnPackagesLink();
		landPage().navigateBack();
		
		endTestWithPassStatus("Verify Packages Link");
	}
}
