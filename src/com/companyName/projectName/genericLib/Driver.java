package com.companyName.projectName.genericLib;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.companyName.projectName.projectgeniricLib.Login;

/*
 **	 		@Author: Raushan kumar jha
 ** 		@Version: 1.0
 ** 		@Date: 20/06/2017
 ** 		This class contains methods for WebDriver Objects
 */

public class Driver {
	
	public static class Browsers
	{
		
		public static final int FIREFOX = 1;
		public static final int IE = 3;
		public static final int CHROME = 2;
		
	}
	
	
	public static WebDriver driver;
	static String browserDriverPath="resources"+File.separator;
	static ExcelLib excel=new ExcelLib();
	
	public static LogUtils log;
	public static Logger logger;
	
	static {
		log=new LogUtils();
		logger=log.logger();
    }
	
	
	public static boolean launchApplication(String BrowserType, String URL, String userName, String passWord)
	{
		boolean flag = false;
		try{
			BrowserHandlers b = new BrowserHandlers();
				switch(BrowserType)
				{
					case "IE":
						try{
						b.invokeBrowser(Browsers.IE, browserDriverPath+"MicrosoftWebDriver.exe");
						
						}catch (Exception e)
						{
							
						}
						break;
					case "CHROME":
						try{
							b.invokeBrowser(Browsers.CHROME, browserDriverPath+"chromedriver.exe");
							
							}catch (Exception e)
							{
								
							}						
						break;
					case "FIREFOX":
						try{
							b.invokeBrowser(Browsers.FIREFOX, browserDriverPath);
							
							}catch (Exception e)
							{
							
							}						
						break;
					default:
						break;	
				}
		}
		catch (NoSuchElementException e) {
			// do nothing
		}
		
		try {
			logger.info("invoking application ...");
			Login.invokeApplication(URL,userName,passWord);
		} catch (Exception e) {
			logger.error("failed to invoke application ...");
			
		}	
		return flag;
	}
	
	
	public static void initializeApplication() throws IOException{	
		Driver.launchApplication(excel.getData(0,2,2),excel.getData(0,2,3),excel.getData(0,2,4),excel.getData(0,2,5));
		}


 }
