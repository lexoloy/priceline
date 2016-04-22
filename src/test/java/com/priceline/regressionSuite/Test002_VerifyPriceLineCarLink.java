package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test002_VerifyPriceLineCarLink extends WebDriverActivity{
	private String testName="Tc002_VerifyPriceLineCarLink";
	private String testType="Regression Test";

	@Test(description="Verify Car Link")
	public void verifyPricelinecomLink() throws InterruptedException{
		startTest(testName, testType);
		
		landPage().clickOnCarsLink();
		landPage().navigateBack();
		
		endTestWithPassStatus("Verify Car Links");
	}
}
