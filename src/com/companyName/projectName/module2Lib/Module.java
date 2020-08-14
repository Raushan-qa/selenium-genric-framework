package com.companyName.projectName.module2Lib;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.apache.log4j.Logger;
import com.companyName.projectName.genericLib.Driver;
import com.companyName.projectName.genericLib.ExcelLib;
import com.companyName.projectName.genericLib.LogUtils;

public class Module {

	public static LogUtils log;
	public static Logger logger;
	static ExcelLib eLib;
	static WebDriverWait wait;

	static {
		log = new LogUtils();
		logger = log.logger();
		eLib = new ExcelLib();
		wait = new WebDriverWait(Driver.driver, 20);

	}


	public static void landingPage(int rowNum) throws InterruptedException, IOException {
	}

	
}
