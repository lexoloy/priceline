package com.priceline.regressionSuite;

import org.testng.annotations.Test;

import com.priceline.utilities.WebDriverActivity;

public class Test003_VerifyPriceLineHotelLink extends WebDriverActivity{
	private String testName="Tc003_VerifyPriceLineHotelLink";
	private String testType="Regression Test";
	
	@Test(description="Verify Header Links")
	
	
	public void verifyPricelinecomLink() throws InterruptedException{
		startTest(testName, testType);
		
		landPage().clickOnHotelLink();
		landPage().navigateBack();
	    
		endTestWithPassStatus("Tc003_VerifyPriceLineHotelLink");
		
	}
}
