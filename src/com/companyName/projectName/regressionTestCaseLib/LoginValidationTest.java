package com.companyName.projectName.regressionTestCaseLib;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.companyName.projectName.genericLib.Driver;
import com.companyName.projectName.genericLib.ExcelLib;
import com.companyName.projectName.genericLib.ExtendReportManager;
import com.companyName.projectName.genericLib.LogUtils;

public class LoginValidationTest extends ExtendReportManager {
	
	public static LogUtils log;
	public static Logger logger;
	static ExcelLib eLib;
	
	static {
		log = new LogUtils();
		logger = log.logger();
		eLib = new ExcelLib();
	}
	
	@Test(priority = 1)
	public void loginTest() throws InterruptedException, IOException, AWTException {
		test = extent.createTest("Retest after second and upto 5 times (application covert to normal application)");
		try {
			logger.info("Test Started!!");
			Driver.initializeApplication();
			
	}catch (IOException e) {
		e.printStackTrace();
		logger.error("Test failed!!");
		Assert.fail("Test failed!!");
	}
	}

}
