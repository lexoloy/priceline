package com.priceline.utilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.google.common.base.Function;

public class Base extends WebDriverActivity{
	private static Select dropdown = null;
	private final static String xpath="xpath";
	private final static String id ="id";
	private final static String cssSelector="css";
	private final static String linkText = "linlText";
	private final static String name="name";
	public static FluentWait<WebDriver> wait = null;
	public static Function<WebDriver, WebElement> fwait = null;
	
	
	
	
	public static String getXpath() {
		return xpath;
	}
	
	public static String getID(){
		return id;
	}
	
	
	
	public static String getCssSelector(){
		return cssSelector;
	}
	public static String getLinkText(){
		return linkText;
	}
	
	public static String getName(){
		return name;
	}
	
	public WebElement findDynamicElement(By by, int timeOut) {
	    WebDriverWait wait = new WebDriverWait(driver, timeOut);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    return element;
	}

	
	
	//**************************************blockerHandling*******************************
	private void getShowStopperStatus(String blocker, String errorMessage) {

		String showStopper = blocker;

		if (showStopper.equalsIgnoreCase("yes")) {
			pricelineHome();
			getWarning("Exception : "
					+ new NoSuchElementException(errorMessage));
			throw new NoSuchElementException(errorMessage);
		} else if (showStopper.equalsIgnoreCase("no")) {
			getWarning("Exception : "
					+ new NoSuchElementException(errorMessage));
			Reporter.log(errorMessage);
		}
	
	}
	//Fluent Wait
			public void fluentWait(By locator){
				
				wait = new FluentWait<WebDriver>(driver);
				wait.withTimeout(30, TimeUnit.SECONDS);
				wait.pollingEvery(3, TimeUnit.SECONDS);
				wait.ignoring(NoSuchElementException.class);
				
				fwait = new Function<WebDriver, WebElement>() {

					@Override
					public WebElement apply(WebDriver arg0) {
						return arg0.findElement(locator);
					}

					
				};
			}
	//*************************************Click ********************************
	public static void clickOnElement(String locator, String attributeOfLocator) {
		WebElement click = getElement(locator, attributeOfLocator);
		click.click();
	}
	public void clickOnButton(String locator, String attributeOfLocator,
			String passMessage, String blocker, String errorMessage) {
		try {
			WebElement ele = getElement(locator, attributeOfLocator);
			ele.click();
			getPass(passMessage);
		} catch (NoSuchElementException | TimeoutException e) {
			getShowStopperStatus(blocker, errorMessage);
		}
	}
	//*************************************sendKeys ********************************
	public static void sendKeys(String locator, String attributeOfColor, String text) {
		WebElement sendText = getElement(locator, attributeOfColor);
		sendText.sendKeys(text);
	}
	//*************************************clearField  ********************************
	public static void clearField(String locator, String attributeOfColor) {
		WebElement sendText = getElement(locator, attributeOfColor);
		sendText.clear();
	}
	
		
	

	//*************************************hoverOver   ********************************
	public static void hoverOnElementAndClick(WebDriver driver,WebElement elementToHover, WebElement elementToClick) {
		Actions hoverAndClick = new Actions(driver);
		hoverAndClick.moveToElement(elementToHover).click(elementToClick).build().perform();
	}
	
	// This method is used to click button with hover
			public void clickButtonWithHover(String parentLocator,
					String parentAttribute, String childLocator, String childAttribute,
					String passMessage, String blocker, String errorMessage) {
				try {
					WebElement parent = getElement(parentLocator, parentAttribute);
					WebElement child = getElement(childLocator, childAttribute);

					Actions action = new Actions(driver);
					action.moveToElement(parent).moveToElement(child).click().build()
							.perform();
					getPass(passMessage);
				} catch (NoSuchElementException | TimeoutException e) {
					getShowStopperStatus(blocker, errorMessage);
				}
			}
	//******************* dropdown selectByValue             **********************
	public static void selectByValue(String locator,String value, String attribute){
		dropdown = new Select(getElement (locator, attribute));
		dropdown.selectByValue(value);
	}
	//*************************************  Calendar ********************************
	
	public static void dateWidget(String datepicker, String locator, String attributeOfLocator, String text) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(datepicker)).click();
		WebElement dateWidget = getElement(locator, attributeOfLocator);
		List<WebElement> rows = dateWidget.findElements(By.tagName("tr"));
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
		for(WebElement cell:columns) {
			if(cell.getText().equals(text)) {
				cell.findElement(By.linkText(text)).click();
				break;
			}
		}
	}
	//*************************************autoComplete   ********************************
	public static void autoComplete(String locator,String attribute,String selectText) throws InterruptedException{
		WebElement autoText = getElement(locator, attribute);
		List<WebElement>results =autoText.findElements(By.tagName("li"));
		Thread.sleep(2000);
		for(WebElement result:results){
			if(result.getText().equalsIgnoreCase(selectText));
			result.click();
			break;
			
		}
	}
	//******************* drop down selectByIndex            **********************
		public static void dropDown(String locator, String attributeOfLocator, int index) {
			Select dropdown = new Select(getElement(locator, attributeOfLocator));
			dropdown.selectByIndex(index);
			
		}
		
		public void selectValueByIndex(String enterXpath, int enterValue,
				String enterInfo, String blocker, String errorMessage,String passMessage) {
			try {
				Select option = new Select(driver.findElement(By.xpath(enterXpath)));
				option.selectByIndex(enterValue);
				getPass(passMessage);
				//getTestStepName(enterInfo);
			} catch (NoSuchElementException | AssertionError e) {
				e.printStackTrace();
				getShowStopperStatus(blocker, errorMessage);
			}
		}
	

}
