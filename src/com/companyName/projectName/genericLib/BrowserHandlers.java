package com.companyName.projectName.genericLib;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
 **	 		@Author: Raushan kumar jha
 ** 		@Version: 1.0
 ** 		@Date: 20/06/2017
 ** 		This class contains methods for BrowserHandlers 
 */
public class BrowserHandlers {

	
	public static class Browsers
	{
		
		public static final int FIREFOX = 1;
		public static final int IE = 3;
		public static final int CHROME = 2;
		
	}
	
	/**
	 * 
	 * @param browserType 
	 */
	public static LogUtils log;
	public static Logger logger;
	
	static {
		log=new LogUtils();
		logger=log.logger();
    }
	
	public void invokeBrowser(int browserType, String browserDriverPath)
	{
		DesiredCapabilities capabilities;
		switch(browserType)
		{
			case Browsers.FIREFOX:
				capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				Driver.driver = new FirefoxDriver();
				logger.info("Browser launched sucessfully");
				break;
			case Browsers.CHROME:
				System.setProperty("webdriver.chrome.driver",browserDriverPath);	
				 Driver.driver = new ChromeDriver();
				 logger.info("Browser launched sucessfully");
				break;
			case Browsers.IE:
				System.setProperty("webdriver.ie.driver",browserDriverPath);
				capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				Driver.driver =  new InternetExplorerDriver(capabilities);
				logger.info("Browser launched sucessfully");
				break;
			default:
				System.setProperty("webdriver.ie.driver",browserDriverPath);
				capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				Driver.driver =  new InternetExplorerDriver(capabilities);
				logger.info("Browser launched sucessfully");
				break;
		}
		Driver.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		Driver.driver.manage().window().maximize();
		logger.info("Maximized browser.");
	}
	//****************************************************  Method Information ********************************************
	// Name of the Method : closeBrowser
	// Purpose of the Method : This Method will close the browser based on request.
	// Input : It will close current active browser.
	// Output : No Return Value
	//*********************************************************************************************************************
	public void closeBrowser()
	{
		Driver.driver.close();
	}
	
	/**
	 * 
	 * @return true if driver is alive else false
	 */
	

	
}
