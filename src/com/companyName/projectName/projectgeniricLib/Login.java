package com.companyName.projectName.projectgeniricLib;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.companyName.projectName.genericLib.DLWebElement;
import com.companyName.projectName.genericLib.Driver;
import com.companyName.projectName.genericLib.LogUtils;
import com.companyName.projectName.genericLib.WebDriverCommonLib;




public class Login extends WebDriverCommonLib {
	

	public static WebDriver driver;
	public static LogUtils log;
	public static Logger logger;
	
	static {
		log=new LogUtils();
		logger=log.logger();
    }
	
	/**
	//****************************************************  Method Information ********************************************
	// Name of the Method : invokeBrowser
	// Purpose of the Method : This Method will invoke the browser based on request.
	// Input : call this method by passing argument as "common.Browser.{BrowserName}"
	// Output : No Return Value
	//*********************************************************************************************************************	 
	 * @throws InterruptedException 
	 */
	private static  boolean setLoginCredentials(String UserName, String Password) throws InterruptedException
	{
		boolean flag = false;
		if((Driver.driver.findElement(By.id(DLWebElement.LOGIN_USERNAME)).isDisplayed()) ==  true)
		{
			Driver.driver.findElement(By.id(DLWebElement.LOGIN_USERNAME)).sendKeys(UserName);
			logger.info("Entered Username.");
			Driver.driver.findElement(By.id(DLWebElement.LOGIN_PASSWORD)).sendKeys(Password);
			logger.info("Entered Password.");
			Thread.sleep(13000);
			Driver.driver.findElement(By.xpath(DLWebElement.LOGIN_BTN)).click();
			logger.info("Clicked on login button.");
			flag = true;
		}
		else{
			flag = false;
			logger.error("Application login failed.");
		}
		
		if(!flag){
			logger.error("application login failed.");
			Assert.fail("Application login failed!!");
		}
		return flag;
	}
	/**
	//****************************************************  Method Information ********************************************
	// Name of the Method : invokeApplication
	// Purpose of the Method : This Method will invoke the Command Center Application based on request.
	// Input : call this method by passing argument as "String URL, String userName, String passWord"
	// Output : boolean Return Value - if application launched successfully then "TRUE" else "FALSE"
	//*********************************************************************************************************************	 
	 * @throws InterruptedException 
	 */	
	public static boolean invokeApplication(String URL, String userName, String passWord) throws InterruptedException
	{
		boolean flag = false;
		logger.info("hitting URL:"+URL);
		Driver.driver.get(URL);
		//logger.info("failed  here");
		if(setLoginCredentials(userName,passWord)== true)
		{
			String pageTitle = Driver.driver.getTitle();
			logger.info("Sucessfully Launched the Web Application with home Page title : " +pageTitle);			
			flag = true;
		}
		else
		{
			logger.error("Looks like Application is Down, Please verify and try again....");
		}
		return flag;
	}
	
	
	public void setDefaultBaseState()
	{
		
		Driver.driver.quit();		
		
	}
	
	
}
