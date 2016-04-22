package com.priceline.utilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.priceline.pricelinePages.LandingPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebDriverActivity {
	/*
	public static final String USERNAME = "lexoloy";
	  public static final String ACCESS_KEY = "154d16f7-1729-46e9-8011-e004c36e0866";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
*/
	
	public static WebDriver driver=null;
	private static String url1= "https://www.priceline.com";
	public static ExtentReports extentReport = null;
	public static ExtentTest extentTest = null;
	//public static workingDirectory = System.getProperty("user.dir");
	public static String testName = "Sample Regression Test";
	public static String browserName = null;
	public static String sauceURL = "http://lexoloy:154d16f7-1729-46e9-8011-e004c36e0866@ondemand.saucelabs.com:80/wd/hub";
	private File locaFilePath = new File("screenshot").getAbsoluteFile();
	
	
@BeforeSuite()
	public void setUp() throws MalformedURLException{
		getInstance();
	
//-----------------------------------------------------------
	
	
	/*
	ReadConfigFile file = new ReadConfigFile();
	
		
	if("firefox".equalsIgnoreCase(file.getBrowser())){
		driver = new FirefoxDriver();	
	}
	
	else if("chrome".equalsIgnoreCase(file.getBrowser())) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\desktop\\jvedio\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
		else if("ie".equalsIgnoreCase(file.getBrowser())) {	
			System.setProperty("webdriver.ie.driver", new File("ie").getAbsolutePath()+"/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
	}
	
	else if("safari".equalsIgnoreCase(file.getBrowser())) {
		driver = new SafariDriver();
	}
		
		else {
		driver = new HtmlUnitDriver();
	} */
	//driver = new FirefoxDriver();      //Creating an instance of webdriver.
		//driver = new SafariDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhi\\desktop\\jar\\chromedriver.exe"); // This line of code specifies the path of the chromedriver. 
		//driver=new ChromeDriver();
 //System.setProperty("webdriver.chrome.driver", new File("chrome").getAbsolutePath()+"/chromedriver.exe");
//driver=new ChromeDriver();
/*	// for IE driver
			System.setProperty("webdriver.ie.driver", new File("ie").getAbsolutePath()+"/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
*/
//--------------------------
		
		/*
		DesiredCapabilities caps = DesiredCapabilities.chrome();
	caps.setCapability("platform", "Windows 10");
	caps.setCapability("version", "37.0");
		WebDriver driver = new RemoteWebDriver(
            
		new URL("http://lexoloy:154d16f7-1729-46e9-8011-e004c36e0866@ondemand.saucelabs.com:80/wd/hub"),
		caps);
						
		DesiredCapabilities caps = DesiredCapabilities.firefox();
	    caps.setCapability("platform", "Windows XP");
	    caps.setCapability("version", "43.0");

	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
*/

//driver.navigate().to(url1);
//System.out.println(driver.getTitle());


//System.out.println(driver.getTitle());
//driver.quit();
//------------------
	//driver.get(prop.getProperty("URL"));
         //landing on priceline.com.
	//driver.navigate().to(arg0);
//===================
	/*driver.manage().window().maximize();           //maximizes the browser
		
		//If it don't find the element the execution will hold 10 seconds before it throws an error.
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS); 
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
		*/
		
	}

//@Parameters("browser")
@BeforeClass
	
	public static void getDriver(String browser) throws MalformedURLException{
		//browser.equalsIgnoreCase("chrome_windows");
		DesiredCapabilities caps= DesiredCapabilities.firefox();
		caps.setCapability("version", "5");
		caps.setCapability("platform", "XP");
		caps.setCapability("name", testName);
		caps.setCapability("time_zone", "New_York");
		caps.setCapability("build", 001);
		
		driver =new RemoteWebDriver(new URL(sauceURL),caps);
		//browserName = browser;
		driver.get("https://www.priceline.com");
	}


@AfterMethod(enabled = true)

public void handleScreenShot(ITestResult result) {

	if (result.getStatus() == ITestResult.FAILURE) {
		String screenShot_path = captureScreenShot(driver, result.getName());
		String image = extentTest.addScreenCapture(screenShot_path);
		extentTest.log(LogStatus.FAIL,
				"Failed Method name : " + result.getName(), image);
		extentReport.endTest(extentTest);
	}

	extentReport.flush();
}
	// This method gets executed after the suite regardless.

	@AfterSuite(alwaysRun = true) 
	public void teardown(){
		
			//extentReport.close();
			
		//driver.close();
		driver.quit();	
			//Report.flush();
			//Report.testSuiteCleanup();
	}
	
	private ExtentReports getInstance() {

		extentReport = new ExtentReports("Extent_Reports/textExtent.html", true);
		extentReport.config().documentTitle("Automation Report")
				.reportName("Regression Result")
				.reportHeadline("Report for built #001");
		return extentReport;
	}

public static ExtentTest startTest(String testName, String testGroup){
	extentTest = extentReport.startTest(testName).assignCategory(testGroup);
	return extentTest;
}

public static void endTestWithPassStatus(String message){
	extentTest.log(LogStatus.PASS, message);
	extentReport.endTest(extentTest);
}

public static void getPass(String message){
	extentTest.log(LogStatus.PASS, message);
}

public static void getWarning(String message){
	extentTest.log(LogStatus.WARNING, message);
}

public static void getFail(String message){
	extentTest.log(LogStatus.FAIL, message);
}

public static void getInfo(String info){
	extentTest.log(LogStatus.INFO, info);
}

	public String captureScreenShot(WebDriver driver, String screenShotName) {

		try {
			TakesScreenshot screenShot = (TakesScreenshot) driver;
			File source = screenShot.getScreenshotAs(OutputType.FILE);
			String dest = locaFilePath + "/" + screenShotName + ".png";
			File destination = new File(dest);
			FileUtils.copyFile(source, destination);
			System.out.println("Screenshot Taken");
			return dest;
		} catch (IOException e) {
			System.out.println("Exception while taking Screenshot "
					+ e.getMessage());
			return e.getMessage();
		}
	}

	
	
	
	//Following  method is going to return the webelement based on the locator and the attribute of the locator. 
	public static WebElement getElement(String locator,String attributeOfLocator){
		if(locator.equalsIgnoreCase("id")){
			return driver.findElement(By.id(attributeOfLocator));
			
		}else if(locator.equalsIgnoreCase("name")){
			return driver.findElement(By.name(attributeOfLocator));
			
		}else if(locator.equalsIgnoreCase("className")){
			return driver.findElement(By.className(attributeOfLocator));
			
		}else if(locator.equalsIgnoreCase("xpath")){
			return driver.findElement(By.xpath(attributeOfLocator));
			
		}else if(locator.equalsIgnoreCase("css")){
			return driver.findElement(By.cssSelector(attributeOfLocator));
		}else if(locator.equalsIgnoreCase("linkText")){
			return driver.findElement(By.linkText(attributeOfLocator));
		}else 
				throw new NoSuchElementException("no element");
			
	}
	 
	
	public LandingPage landPage(){
	LandingPage landp= new LandingPage(driver);
	return landp;
	}

	public void pricelineHome(){
		driver.navigate().to(url1);
	}



}
