package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Tc001_VerifyPriceLineDotcomLink extends WebDriverActivity{
	private String testName="Tc001_VerifyPriceLine.comLink";
	private String testType="Regression Test";

	@Test(description="Verify Header Links")
	public void verifyPricelinecomLink() throws InterruptedException{
		startTest(testName, testType);
		landPage().clickOnPricelinecomLink();
		
		//landPage().clickOnMydTripHover();
		//landPage().clickOnHotelLink();
		//landPage().clickOnCarsLink();
		//landPage().clickOnSignInHover();
		//landPage().clickOnlogInregister();
		//landPage().ClickOnPrice();
      landPage().navigateBack();
		
		endTestWithPassStatus("VerifyHeaderLinks");
	}
}
