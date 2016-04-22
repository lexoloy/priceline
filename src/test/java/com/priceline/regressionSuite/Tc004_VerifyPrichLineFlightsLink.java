package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Tc004_VerifyPrichLineFlightsLink extends WebDriverActivity{
	private String testName="Tc001_VerifyPriceLineFlightsLink";
	private String testType="Regression Test";

	@Test(description="Verify Header Links")
	public void verifyPricelinecomLink() throws InterruptedException{
		startTest(testName, testType);
		
		landPage().clickOnFlightsLink();
		Thread.sleep(3000);
		landPage().fluentWait(null);
		landPage().navigateBack();
		//154d16f7-1729-46e9-8011-e004c36e0866
		endTestWithPassStatus("Verify Fligfts Link");
	}
}
