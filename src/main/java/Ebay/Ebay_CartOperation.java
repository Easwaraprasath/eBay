package Ebay;


import org.apache.poi.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import PageFactory.PurchaseProduct;


	public class Ebay_CartOperation extends Ebay_Login {	 
		 //Object reference of AndroidDriver.
		public void addtocart()throws IOException
		{
		 InputStream ExcelRead=new FileInputStream("testdata/testdata.xlsx");
		 XSSFWorkbook wbk=new XSSFWorkbook(ExcelRead); 
		 String item = wbk.getSheetAt(0).getRow(8).getCell(2).toString();
		    	// to click search field
		    	 driver.findElement(PurchaseProduct.Searchicon).click();
		        //to enter item in search field
		    	 driver.findElement(PurchaseProduct.Searchfield).click();
		        // to purchase product
		    	 driver.findElement(PurchaseProduct.product).sendKeys(item);
		        //to click buyitnow
		    	 driver.findElement(PurchaseProduct.Buyitnow).click();   
		        
		    }
		@AfterMethod

		public void tearDown() throws Exception {
		 
		driver.quit();
		 
		}
		
		
		
		
	}





