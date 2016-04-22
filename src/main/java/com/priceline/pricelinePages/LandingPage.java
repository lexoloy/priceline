package com.priceline.pricelinePages;

//import static org.junit.Assert.*;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.priceline.utilities.Base;
public class LandingPage extends Base{

	public static WebDriver driver=null;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	private String xpathPricelinecomLink ="Priceline.com";//".//*[@id='global-header']/nav/a/i";
			//private String xpathPricelinecomLink =".//*[@id='global-header']/nav/ul[2]/li[1]/a/span.//*[@id='global-header']/nav/ul[2]/li[1]/a/span.//*[@id='global-header']/nav/ul[2]/li[1]/a/span";
	private String linkTextPricelinecomLink ="Priceline.com";	
															
		private String linkTextHotelLink ="Hotels";
			//private String xpathHotelLink =".//*[@id='global-header']/nav/ul[1]/li[1]/a";
			private String linkTextCarlLink ="Cars";
			private String linkTextFlightslLink ="Flights";
			private String linkTextCruiseLink ="Cruises";
			private String linkTextPackagesLink ="Packages";
			private String linkSignInLink ="Sign in";
			private String linkTextMyTripsLink ="My Trips";
			private String linkTextHelpLink ="Help";
			//private String xpathSignInHover =".//*[@id='global-header']/nav/ul[2]/li[1]";
			private String  xpathSignInHover=".//*[@class='global-header__nav-secondary__list']/li[1]/ul/li[1]";
			private String xpathSignInHover2 =".//*[@class='global-header__nav-secondary__list']/li[1]/ul/li[2]";
			//.//*[@class='global-header__nav-secondary__list']/li[1]/ul/li[2]
			
		//********	
			public void clickOnPricelinecomLink() throws InterruptedException{
				//clickOnElement(getLinkTest(),xpathPricelinecomLink);
				driver.findElement(By.linkText("Priceline.com")).click();
				
				//clickOnElement(), attributeOfLocator);
				
			}
			
			public void ClickOnPrice(){
				clickOnElement (getLinkText(),linkTextPricelinecomLink);
			}

			public void clickOnHotelLink() {
				//clickOnElement(getXpath(),xpathHotelLink);
				//clickOnElement (getLinkText(),linkTextHotelLink);
				//driver.findElement(By.linkText("Hotel")).click();
				Actions act= new Actions(driver);
				act.moveToElement(driver.findElement(By.linkText("Hotels"))).click().perform();
			}
			public void clickOnCarsLink() {
				driver.findElement(By.linkText("Cars")).click();
				
			}
			public void clickOnFlightsLink() {
				driver.findElement(By.linkText("Flights")).click();
				
			}
			public void clickOnPackagesLink() {
				driver.findElement(By.linkText("Packages")).click();
		     }
			
				public void clickOnCruiseLink() {
					driver.findElement(By.linkText("Cruises")).click();
			  }
				public void clickOnSignInHover() {
					Actions act= new Actions(driver);
					act.moveToElement(driver.findElement(By.linkText("Sign in"))).perform();
					System.out.println(driver.getTitle());
				}
				public void clickOnSignIn(){
					Actions act= new Actions(driver);
					act.moveToElement(driver.findElement(By.xpath(xpathSignInHover))).click().perform();
				}
			
				
		
			public void clickOnregister(){
				//clickOnElement(getXpath(), xpathSignInHover2);
				Actions act= new Actions(driver);
				act.moveToElement(driver.findElement(By.linkText("Sign in"))).perform();
				act.moveToElement(driver.findElement(By.linkText("Register"))).click().perform();
			}
				
				
				public void clickOnMydTripHover() {
					Actions act= new Actions(driver);
					act.moveToElement(driver.findElement(By.linkText("My Trips"))).perform();
					
					
					//clickOnElement(getXpath(), ".//*[@id='secondary-nav']/ul/li[2]/ul/li[1]");			
				
			}
				
				public void clickOnMyProfile(){
					
					Actions act= new Actions(driver);
					act.moveToElement(driver.findElement(By.linkText("My Trips"))).perform();
					act.moveToElement(driver.findElement(By.linkText("My Profile"))).click().perform();
				}
				
				public void clickOnCheckYourFlightStatus(){
					
					Actions act= new Actions(driver);
					act.moveToElement(driver.findElement(By.linkText("My Trips"))).perform();
					act.moveToElement(driver.findElement(By.linkText("Check Your Flight Status"))).click().perform();
				}
				
				public void clickOnViewPrintorEmailYourItinerary(){
					
					Actions act= new Actions(driver);
					act.moveToElement(driver.findElement(By.linkText("My Trips"))).perform();
					act.moveToElement(driver.findElement(By.linkText("View, Print or Email Your Itinerary"))).click().perform();
				}
				public void clickOnCheckYourRequestStatus(){
					
					Actions act= new Actions(driver);
					act.moveToElement(driver.findElement(By.linkText("My Trips"))).perform();
					act.moveToElement(driver.findElement(By.linkText("Check Your Request Status"))).click().perform();
				}
				
				public void clickOnHelpHover() {
					Actions act= new Actions(driver);
					act.moveToElement(driver.findElement(By.linkText("Help"))).perform();	
					
			}
				public void clickOnSelfService() {
					Actions act= new Actions(driver);
					act.moveToElement(driver.findElement(By.linkText("Help"))).perform();	
					act.moveToElement(driver.findElement(By.linkText("Self Service"))).click().perform();
			
			}
				public void clickOnFrequentlyAskedQuestions() {
					Actions act= new Actions(driver);
					act.moveToElement(driver.findElement(By.linkText("Help"))).perform();	
					act.moveToElement(driver.findElement(By.linkText("Frequently Asked Questions"))).click().perform();
			
			}
				public void clickOnFindYourRequestNumber() {
					Actions act= new Actions(driver);
					act.moveToElement(driver.findElement(By.linkText("Help"))).perform();	
					act.moveToElement(driver.findElement(By.linkText("Find your request number"))).click().perform();
			
			}
				public void clickOnProfilePasswordHelp() {
					Actions act= new Actions(driver);
					act.moveToElement(driver.findElement(By.linkText("Help"))).perform();	
					act.moveToElement(driver.findElement(By.linkText("Profile Password Help"))).click().perform();
			
			}
				public void clickOnContactUs() {
					Actions act= new Actions(driver);
					act.moveToElement(driver.findElement(By.linkText("Help"))).perform();	
					act.moveToElement(driver.findElement(By.linkText("Contact Us"))).click().perform();
			
			}
				 public void navigateBack(){
					 pricelineHome();
					   getPass("Navigate to home page");
					   
				   }
}
