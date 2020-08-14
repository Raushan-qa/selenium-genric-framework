package com.companyName.projectName.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;

import com.companyName.projectName.projectgeniricLib.Login;
import com.companyName.projectName.projectgeniricLib.Logout;

/*
 **	 		@Author: Raushan kumar jha
 ** 		@Version: 1.0
 ** 		@Date: 20/06/2017
 ** 		This class contains methods for ScreenShots Methods 
 */

public class ScreenshotLib {
	
	
	static LogUtils log;
	static Logger logger;
	
	static{
		
		log=new LogUtils();
		 logger=log.logger();

	}
	
	public void takeScreenShot(String fileName) throws IOException{
		EventFiringWebDriver eDriver = new EventFiringWebDriver(Driver.driver);
		File srcImg = eDriver.getScreenshotAs(OutputType.FILE);
		File dstFile = new File("screenshot"+File.separator+fileName+".png");
		FileUtils.copyFile(srcImg, dstFile);
	}
	
	
	public static void takeScreenshot(ITestResult t){
		/*ScreenShot*/
		boolean b = t.isSuccess();
		if(b){
			
		}else{
			ScreenshotLib sLib = new ScreenshotLib();
			String testName = t.getMethod().getMethodName();
			try {
				logger.info(testName+" method failed going to capture ScreenShot!!");
				sLib.takeScreenShot(testName);
			} catch (IOException e) {
				e.printStackTrace();
				logger.info(testName+" Capture ScreenShot failed");
			}
		}	
	}


}
