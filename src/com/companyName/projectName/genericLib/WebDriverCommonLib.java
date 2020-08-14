package com.companyName.projectName.genericLib;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.companyName.projectName.projectgeniricLib.Login;
import com.companyName.projectName.projectgeniricLib.Logout;

import bsh.org.objectweb.asm.Constants;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;


/*
 **	 		@Author: Raushan kumar jha
 ** 		@Version: 1.0
 ** 		@Date: 20/06/2017
 ** 		This class contains methods for WebDriver Common methods
 */

public class WebDriverCommonLib {
	
	static Logger logger;
	static double cessFee;
	static LogUtils log;
	
	static{
		log = new LogUtils();
		logger = log.logger();
	}
	
	public static void waitForPageToLoad() throws InterruptedException{
		Driver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public static void waitForElementPresent(String wbXpath){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath(wbXpath)));
		
	}
	public static void waitForLinkPresent(String linkName){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated
				(By.linkText(linkName)));
		
	}
	
	public static void select(WebElement selWb , String value){
		Select sel = new Select(selWb);
		sel.selectByVisibleText(value);
		
	}
	
	public static void select(WebElement selWb , int index){
		Select sel = new Select(selWb);
		sel.selectByIndex(index);
	}
	
	public void aceptAlert(){
		Alert alt = Driver.driver.switchTo().alert();
		alt.accept();
	}
	
	public void cancelAlert(){
		Alert alt = Driver.driver.switchTo().alert();
		alt.dismiss();
	}

	public static double round(double number, int precision, RoundingMode roundingMode) {
		BigDecimal bd = null;
		try {
			bd = BigDecimal.valueOf(number);
		} catch (NumberFormatException e) {
			// input is probably a NaN or infinity
			return number;
		}
		bd = bd.setScale(precision, roundingMode);
		return bd.doubleValue();
	}

	public static double cessCalculate(double tax, int anual) {
		tax = tax * anual;
		cessFee = (tax * 10) / 100;
		if (cessFee > 1500) {
			cessFee = 1500;
		}
		return cessFee;
	}

	public static boolean isElementPresent(WebDriver driver, By by) {  
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	    try {  
	       driver.findElement(by);  
	        return true;  
	    } catch (NoSuchElementException e) { 

	        return false;  
	    } finally {  
	        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);  
	    }  
	}
//	
//	public static boolean isElementPresent(By by)
//	{
//		try
//		{
//			Driver.driver.findElement(by);
//
//			return true;
//		}
//		catch (NoSuchElementException e)
//		{
//
//			return false;
//		}
//	}
	

	public static void getScreenShot(String screenShotName){
		File src= ((TakesScreenshot)Driver.driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("D:/DL-TestAutomation/screenshot/"+screenShotName+".png"));
		}
		
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
	}

	public static void waitForBrowserStatusToComplete() throws IOException, InterruptedException{
		
		while(!(((JavascriptExecutor) Driver.driver).executeScript("return document.readyState")).equals("complete")){
			Thread.sleep(6000);
			logger.info((((JavascriptExecutor) Driver.driver).executeScript("return document.readyState"))+ " we are waiting to browser to load");
		}
	}
	
	
	static int waitTime = 250;
	public static void waitForSyncElement(String element) throws InterruptedException{
		int sec = 1;
		try{
			
			while(Driver.driver.findElement(By.xpath(element)).isDisplayed() && sec<=waitTime ){
				Thread.sleep(1000);
				logger.info(" we are waiting for sync element to close");
				sec++;
				if(sec>=250)
					break;
			}
		}	catch(Exception e){
			logger.info(e.getMessage());
		}
	}
	
	public static void ScrollDown(){
	JavascriptExecutor jse = (JavascriptExecutor)Driver.driver;
//	jse.executeScript("window.scrollBy(0,250)", "");
	jse.executeScript("scroll(0, 250);");
	logger.info(" Scrolling Down..");
	}
	
	public static void waitForElementToBeVisible(String webElementXpath) throws InterruptedException{
		boolean flag = true;
		while(flag){
			try{
				 flag = Driver.driver.findElement(By.xpath(webElementXpath)).isDisplayed();
				 if(flag)
						break;
			}catch(Exception cardEx){
				Thread.sleep(1000);
				
			}
		}
	}
	
	public static void moushHover(){
		Actions actions = new Actions(Driver.driver);
		WebElement mainMenu = Driver.driver.findElement(By.linkText("menulink"));
		actions.moveToElement(mainMenu);

		WebElement subMenu = Driver.driver.findElement(By.cssSelector("subLinklocator"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();
	}
}
