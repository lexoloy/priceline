package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test008_VerifyPriceLineSignInLinkClick extends WebDriverActivity{
	private String testName="Tc008_VerifyPriceLineSignInLinkClick";
	private String testType="Regression Test";
	
	@Test(description="Verify Header Links")
	public void verifySignInLink() {
		//driver().get("https://www.priceline.com");
		startTest(testName, testType);
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		landPage().clickOnSignInHover();
		landPage().clickOnSignIn();
		landPage().navigateBack();
		
		endTestWithPassStatus("Tc008_VerifyPriceLineSignInLinkClick");
	}
	
}
