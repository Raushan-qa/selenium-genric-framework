package com.companyName.projectName.projectgeniricLib;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.companyName.projectName.genericLib.WebPageElement;
import com.companyName.projectName.genericLib.Driver;
import com.companyName.projectName.genericLib.LogUtils;
import com.companyName.projectName.genericLib.WebDriverCommonLib;

public class Logout extends WebDriverCommonLib {
	
	public Driver commandcenter = new Driver();
	public static WebDriver driver;
	public static LogUtils log;
	public static Logger logger;
	
	static {
		log = new LogUtils();
		logger = log.logger();
    }
	
	public static void logOut() throws InterruptedException
	{
		logger.info("going to logout from application!");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)Driver.driver;
		js.executeScript("arguments[0].click();", Driver.driver.findElement(By.xpath(WebPageElement.LOGOUT_BTN)));
		Thread.sleep(7000);
	}
	

}
