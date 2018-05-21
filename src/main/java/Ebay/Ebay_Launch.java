package Ebay;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay_Launch {	 
	 //Object reference of AndroidDriver.
	 AndroidDriver<WebElement> driver;

	 @BeforeSuite	 
	 
	 public void setUp() throws MalformedURLException {
	  
	  File appDir = new File(System.getProperty("user.dir"));
	  File app = new File(appDir, "C:\\Users\\EA\\workspace\\Mobile\\src\\main\\resources\\com.ebay.mobile_v5.17.1.1-118_Android-5.0.apk");  
	              
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "ZX1B32FFXF");
	  capabilities.setCapability("browserName", "Android");
	  capabilities.setCapability("platformVersion", "4.4.2");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("app", app.getAbsolutePath());
	  capabilities.setCapability("appPackage", "com.ebay.mobile");
	  capabilities.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");

	  // Created object of AndroidDriver and set capabilities.
	  
	  driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 }

	/* @Test
	 public void login() {
		 
		//sample code
	  //Tap on Basic usage Playground.
	  //driver.findElementByName("Basic usage playground").click();
	  //Locate 3rd element(Chick Corea) from list to drag.
	  //WebElement ele1 = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(2);
	  //Locate 6th element to drop dragged element.
	  //WebElement ele2 = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(5);
	  //Perform drag and drop operation using TouchAction class.
	  //Created object of TouchAction class.
	  //TouchAction action = new TouchAction((MobileDriver) driver);
	  //System.out.println("It Is dragging element.");
	  //It will hold tap on 3rd element and move to 6th position and then release tap.
	  //action.longPress(ele1).moveTo(ele2).release().perform();  
	  //System.out.println("Element has been droped at destination successfully.");
	 }
	
	 @AfterTest
	 public void End() {
	  // Quit
	  driver.quit();
	 }
	 */
	
	
	
	
}
