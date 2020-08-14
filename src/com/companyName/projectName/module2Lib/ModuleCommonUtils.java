package com.companyName.projectName.module2Lib;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.companyName.projectName.genericLib.DLWebElement;
import com.companyName.projectName.genericLib.Driver;
import com.companyName.projectName.genericLib.ExcelLib;
import com.companyName.projectName.genericLib.LogUtils;
import com.companyName.projectName.genericLib.WebDriverCommonLib;

public class ModuleCommonUtils {

	public static LogUtils log;
	public static Logger logger;
	static ExcelLib excel;
	static {
		log=new LogUtils();
		logger=log.logger();
		excel = new ExcelLib();
    }
	
//	@Test(priority = 1)
	public static void initializeCitizen() throws IOException, InterruptedException{	
		Driver.launchApplication(excel.getData(0,5,2),excel.getData(0,5,3),excel.getData(0,5,4),excel.getData(0,5,5), excel.getData(0,2,8));	
	}
}
