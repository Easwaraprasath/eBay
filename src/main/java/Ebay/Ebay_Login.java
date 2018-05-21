package Ebay;

import PageFactory.LoginScreen;

import org.testng.annotations.Test;
import PageFactory.LoginScreen;

@Test (priority=0)

public class Ebay_Login extends Ebay_Launch {
	public void login() {
		// to check valid login
			
			driver.findElement(LoginScreen.hamburgerMenu).click();
			driver.findElement(LoginScreen.signoutstatus).click();
			driver.findElement(LoginScreen.username).click();
			driver.findElement(LoginScreen.username).sendKeys("easwaraprasath@gmail.com");
			driver.findElement(LoginScreen.password).click();
			driver.findElement(LoginScreen.password).sendKeys("eaprasath12");
			driver.findElement(LoginScreen.SignIn).click();
		}   
		@Test 
		 
		public void invalid_EmptyPassword() throws Exception {
		   //to check invalid login
			
			driver.findElement(LoginScreen.hamburgerMenu).click();
			driver.findElement(LoginScreen.signoutstatus).click();
			driver.findElement(LoginScreen.username).click();
			driver.findElement(LoginScreen.username).sendKeys("sjhb@gma.com");
			driver.findElement(LoginScreen.password).click();
			driver.findElement(LoginScreen.password).sendKeys("empty");
			driver.findElement(LoginScreen.SignIn).click();
		}

}
